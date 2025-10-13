package Trial;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;
import java.io.File;

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
            String recipients = "harshit.mishra@rooter.io,Surya.behera@rooter.io";
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipients));
            message.setSubject("Android Automation Test Report - " + new File(reportPath).getName());
            
           
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("Hello,\n\n" +
            "The Android automation test suite has completed successfully. Please find the attached test execution report for your review.\n\n" +
        


            "If you have any questions or need further information, feel free to reach out.\n\n" +


            
            "Best regards,\n" +
            "Harshit");

            
            // Attach only surefire HTML report
            MimeBodyPart attachmentPart = new MimeBodyPart();
            String surefireReport = "./target/surefire-reports/index.html";
            attachmentPart.attachFile(surefireReport);
            
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