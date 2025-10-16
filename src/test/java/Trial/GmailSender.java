package Trial;

import java.io.File;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class GmailSender {
    
    public static void sendReport(String reportPath) {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        
        String username = "Harshit.mishra@rooter.io";
        String password = "yhji vkyz wqhu tnzt";
        
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            String recipients = "harshit.mishra@rooter.io,praveen.rajput@rooter.io,adhikaar.marwaha@rooter.io,balram.keshari@rooter.io,apoorv@rooter.io,anas.mirza@rooter.io,dipesh@rooter.io";
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipients));
            message.setSubject("Android Automation Automated Test Report - " + new File(reportPath).getName());
            
           
            String reportName = new File(reportPath).getName();
            String htmlBody = "<html><body>" +
                "<h2> Android Automation Automated Test Report</h2>" +
                "<p>Hello Team,</p>" +
                "<p>This is an automated email. The Android automation test suite has completed successfully. Please find the attached test execution report for your review.</p>" +
                "<h3>Report Details:</h3>" +
                "<ul>" +
                "<li><strong>Report Name:</strong> " + reportName + "</li>" +
                "<li><strong>Generated On:</strong> " + new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date()) + "</li>" +
                "<li><strong>Platform:</strong> Android</li>" +
                "<li><strong>Framework:</strong> Appium + TestNG</li>" +
                "</ul>" +
                "<p><strong>Custom HTML Report:</strong> <a href='file://" + reportPath + "'>" + reportName + "</a></p>" +
                "<p><strong>Report Path:</strong> <code>" + reportPath + "</code></p>" +
                "<p><em>Open the attached HTML file in your browser for detailed test results. Dowload Attached File and open in Browser</em></p>" +
                "<hr>" +
                "<p>Best regards,<br>Harshit</p>" +
                "</body></html>";
            
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setContent(htmlBody, "text/html");

            
            // Attach the detailed HTML report (same as generated)
            MimeBodyPart attachmentPart = new MimeBodyPart();
            attachmentPart.attachFile(reportPath);
            
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            multipart.addBodyPart(attachmentPart);
            
            message.setContent(multipart);
            
            Transport.send(message);
            System.out.println("✅ Email sent to multiple recipients via Gmail");
            
        } catch (Exception e) {
            System.out.println("❌ Gmail sending failed: " + e.getMessage());
            System.out.println("💡 Setup required: Enable 2FA and create app password in Gmail");
        }
    }
}