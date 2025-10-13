package Trial;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.Properties;

public class EmailReportSender {
    
    private static Properties config = loadConfig();
    
    private static Properties loadConfig() {
        Properties props = new Properties();
        try (InputStream input = EmailReportSender.class.getClassLoader().getResourceAsStream("email-config.properties")) {
            if (input != null) {
                props.load(input);
            }
        } catch (Exception e) {
            System.out.println("📧 Config file not found, using defaults");
        }
        return props;
    }
    
    private static boolean isEmailEnabled() {
        return Boolean.parseBoolean(config.getProperty("email.enabled", "false"));
    }
    
    // Free EmailJS service - no password required
    private static final String EMAILJS_SERVICE_ID = "service_test123";
    private static final String EMAILJS_TEMPLATE_ID = "template_test123";
    private static final String EMAILJS_USER_ID = "user_test123";
    private static final String EMAILJS_URL = "https://api.emailjs.com/api/v1.0/email/send";
    
    public static void sendReportEmail(String reportFilePath) {
        if (!isEmailEnabled()) {
            System.out.println("📧 Email sending is DISABLED in config");
            return;
        }
        
        // Display current email configuration
        String recipientEmail = config.getProperty("recipient.email", "harshit.mishra@example.com");
        System.out.println("📧 Email sending is ENABLED - processing report...");
        System.out.println("📧 RECIPIENT EMAIL: " + recipientEmail);
        
        try {
            String reportContent = readHtmlFile(reportFilePath);
            String reportFileName = Paths.get(reportFilePath).getFileName().toString();
            
            // Create email payload
            String emailPayload = createEmailPayload(reportContent, reportFileName);
            
            // Send via free webhook service (alternative to EmailJS)
            sendViaWebhook(emailPayload, reportFilePath);
            
        } catch (Exception e) {
            System.out.println("📧 Email sending failed: " + e.getMessage());
            // Fallback: Save email content locally
            saveEmailLocally(reportFilePath);
        }
    }
    
    private static String readHtmlFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }
    
    private static String createEmailPayload(String reportContent, String fileName) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timestamp = sdf.format(new Date());
        
        String recipientEmail = config.getProperty("recipient.email", "harshit.mishra@example.com");
        String subjectPrefix = config.getProperty("email.subject.prefix", "Appium Test Report");
        
        return "{\n" +
               "  \"to_email\": \"" + recipientEmail + "\",\n" +
               "  \"subject\": \"" + subjectPrefix + " - " + timestamp + "\",\n" +
               "  \"message\": \"Test execution completed. Report attached.\",\n" +
               "  \"report_name\": \"" + fileName + "\",\n" +
               "  \"report_content\": \"" + Base64.getEncoder().encodeToString(reportContent.getBytes()) + "\"\n" +
               "}";
    }
    
    private static void sendViaWebhook(String payload, String reportPath) {
        try {
            // Using free webhook.site service (no registration required)
            String webhookUrl = config.getProperty("webhook.url", "https://webhook.site/unique-id-here");
            URL url = new URL(webhookUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);
            
            try (OutputStream os = conn.getOutputStream()) {
                os.write(payload.getBytes());
            }
            
            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                System.out.println("📧 Report sent successfully via webhook");
                System.out.println("📄 Report file: " + reportPath);
            } else {
                System.out.println("📧 Webhook response: " + responseCode);
            }
            
        } catch (Exception e) {
            System.out.println("📧 Webhook failed: " + e.getMessage());
        }
    }
    
    private static void saveEmailLocally(String reportPath) {
        try {
            String emailDir = "./target/email-reports";
            new File(emailDir).mkdirs();
            
            String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
            String emailFile = emailDir + "/email-content-" + timestamp + ".txt";
            
            try (PrintWriter writer = new PrintWriter(new FileWriter(emailFile))) {
                writer.println("=== EMAIL CONTENT ===");
                String recipientEmail = config.getProperty("recipient.email", "harshit.mishra@example.com");
                writer.println("To: " + recipientEmail);
                writer.println("Subject: Appium Automation Test Report - " + timestamp);
                writer.println("Attachment: " + reportPath);
                writer.println("\nMessage:");
                writer.println("Dear Team, Please find the attached Appium Automation test Execution report for Today.");
                writer.println("\nAppium test execution has been completed.");
                writer.println("Please find the detailed HTML report attached.");
                writer.println("\nReport Location: " + new File(reportPath).getAbsolutePath());
                writer.println("\nBest Regards,");
                writer.println("Automation Team");
                writer.println("\n=== END EMAIL ===");
            }
            
            System.out.println("📧 Email content saved locally: " + emailFile);
            System.out.println("📄 HTML Report: " + reportPath);
            
        } catch (Exception e) {
            System.out.println("📧 Failed to save email locally: " + e.getMessage());
        }
    }
    
    // Alternative: Generate mailto link for manual sending
    public static void generateMailtoLink(String reportPath) {
        try {
            String subject = "Appium Test Report - " + new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            String body = "Please find the test report at: " + new File(reportPath).getAbsolutePath();
            
            String mailtoLink = "mailto:harshit.mishra@example.com" +
                               "?subject=" + subject.replace(" ", "%20") +
                               "&body=" + body.replace(" ", "%20").replace(":", "%3A").replace("/", "%2F");
            
            System.out.println("📧 Mailto Link: " + mailtoLink);
            System.out.println("📧 Copy this link to browser to send email manually");
            
        } catch (Exception e) {
            System.out.println("📧 Failed to generate mailto link: " + e.getMessage());
        }
    }
}