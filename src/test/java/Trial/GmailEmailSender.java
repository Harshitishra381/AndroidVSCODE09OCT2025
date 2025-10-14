package Trial;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GmailEmailSender {
    
    // Using SendGrid free API (no password required, just API key)
    private static final String SENDGRID_URL = "https://api.sendgrid.com/v3/mail/send";
    private static final String API_KEY = "SG.demo_key_replace_with_real"; // Free tier available
    
    // Alternative: Using EmailJS (completely free)
    private static final String EMAILJS_URL = "https://api.emailjs.com/api/v1.0/email/send";
    
    public static void sendEmailViaSendGrid(String reportPath) {
        try {
            String reportContent = readFileAsBase64(reportPath);
            String reportName = new File(reportPath).getName();
            String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            
            String jsonPayload = "{\n" +
                "  \"personalizations\": [{\n" +
                "    \"to\": [{\"email\": \"harshit.mishra@rooter.io\", \"name\": \"Harshit Mishra\"}],\n" +
                "    \"subject\": \"Appium Test Report - " + timestamp + "\"\n" +
                "  }],\n" +
                "  \"from\": {\"email\": \"automation@rooter.io\", \"name\": \"Automation Team\"},\n" +
                "  \"content\": [{\n" +
                "    \"type\": \"text/html\",\n" +
                "    \"value\": \"<h2>Test Execution Completed</h2><p>Please find the attached HTML report.</p><p>Report: " + reportName + "</p><p>Generated: " + timestamp + "</p>\"\n" +
                "  }],\n" +
                "  \"attachments\": [{\n" +
                "    \"content\": \"" + reportContent + "\",\n" +
                "    \"filename\": \"" + reportName + "\",\n" +
                "    \"type\": \"text/html\"\n" +
                "  }]\n" +
                "}";
            
            sendPostRequest(SENDGRID_URL, jsonPayload, "Bearer " + API_KEY);
            
        } catch (Exception e) {
            System.out.println("📧 SendGrid failed: " + e.getMessage());
            // Fallback to EmailJS
            sendEmailViaEmailJS(reportPath);
        }
    }
    
    public static void sendEmailViaEmailJS(String reportPath) {
        try {
            String reportName = new File(reportPath).getName();
            String reportLocation = new File(reportPath).getAbsolutePath();
            String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            
            // EmailJS with public template (no API key needed for basic usage)
            String jsonPayload = "{\n" +
                "  \"service_id\": \"service_rooter\",\n" +
                "  \"template_id\": \"template_report\",\n" +
                "  \"user_id\": \"user_rooter_automation\",\n" +
                "  \"template_params\": {\n" +
                "    \"to_email\": \"harshit.mishra@rooter.io\",\n" +
                "    \"to_name\": \"Harshit Mishra\",\n" +
                "    \"from_name\": \"Automation Team\",\n" +
                "    \"subject\": \"Appium Test Report - " + timestamp + "\",\n" +
                "    \"message\": \"Test execution completed successfully.\\n\\nReport: " + reportName + "\\nLocation: " + reportLocation + "\\nGenerated: " + timestamp + "\\n\\nPlease check the report file for detailed results.\",\n" +
                "    \"report_name\": \"" + reportName + "\",\n" +
                "    \"report_path\": \"" + reportLocation + "\"\n" +
                "  }\n" +
                "}";
            
            int responseCode = sendPostRequest(EMAILJS_URL, jsonPayload, null);
            
            if (responseCode == 200) {
                System.out.println("✅ Email sent successfully via EmailJS!");
                System.out.println("📧 Sent to: harshit.mishra@rooter.io");
            } else {
                System.out.println("📧 EmailJS response code: " + responseCode);
                // Try alternative method
                sendViaMailgun(reportPath);
            }
            
        } catch (Exception e) {
            System.out.println("📧 EmailJS failed: " + e.getMessage());
            sendViaMailgun(reportPath);
        }
    }
    
    public static void sendViaMailgun(String reportPath) {
        try {
            
            String mailgunUrl = "https://api.mailgun.net/v3/sandbox-123.mailgun.org/messages";
            String apiKey = "key-demo123"; // Free sandbox key
            
            String reportName = new File(reportPath).getName();
            String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            
            String postData = "from=Automation Team <automation@rooter.io>" +
                            "&to=harshit.mishra@rooter.io" +
                            "&subject=Appium Test Report - " + timestamp +
                            "&text=Test execution completed successfully.\n\nReport: " + reportName + 
                            "\nLocation: " + new File(reportPath).getAbsolutePath() +
                            "\nGenerated: " + timestamp +
                            "\n\nPlease check the report file for detailed results." +
                            "\n\nBest Regards,\nAutomation Team";
            
            URL url = new URL(mailgunUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Authorization", "Basic " + Base64.getEncoder().encodeToString(("api:" + apiKey).getBytes()));
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setDoOutput(true);
            
            try (OutputStream os = conn.getOutputStream()) {
                os.write(postData.getBytes());
            }
            
            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                System.out.println("✅ Email sent successfully via Mailgun!");
                System.out.println("📧 Sent to: harshit.mishra@rooter.io");
            } else {
                System.out.println("📧 Mailgun response: " + responseCode);
            }
            
        } catch (Exception e) {
            System.out.println("📧 Mailgun failed: " + e.getMessage());
        }
    }
    
    private static int sendPostRequest(String urlString, String jsonPayload, String authHeader) throws Exception {
        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");
        if (authHeader != null) {
            conn.setRequestProperty("Authorization", authHeader);
        }
        conn.setDoOutput(true);
        
        try (OutputStream os = conn.getOutputStream()) {
            os.write(jsonPayload.getBytes());
        }
        
        return conn.getResponseCode();
    }
    
    private static String readFileAsBase64(String filePath) throws Exception {
        byte[] fileContent = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(filePath));
        return Base64.getEncoder().encodeToString(fileContent);
    }
}