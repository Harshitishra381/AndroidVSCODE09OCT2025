package Trial;

import java.io.*;
import java.net.http.*;
import java.util.Base64;

public class MailgunReporter {
    
    // NO PASSWORD - Uses API Key
    // Free: 5,000 emails/month
    // Get API key from: https://app.mailgun.com/app/account/security/api_keys
    
    private static final String API_KEY = "your-mailgun-api-key";
    private static final String DOMAIN = "your-domain.mailgun.org";
    
    public static void sendReport(String reportPath) {
        try {
            String url = "https://api.mailgun.net/v3/" + DOMAIN + "/messages";
            
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                .uri(java.net.URI.create(url))
                .header("Authorization", "Basic " + Base64.getEncoder().encodeToString(("api:" + API_KEY).getBytes()))
                .header("Content-Type", "application/x-www-form-urlencoded")
                .POST(HttpRequest.BodyPublishers.ofString(
                    "from=test@" + DOMAIN +
                    "&to=recipient@email.com" +
                    "&subject=Test Report" +
                    "&text=Test completed"))
                .build();
                
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Email sent! Status: " + response.statusCode());
            
        } catch (Exception e) {
            System.out.println("Email failed: " + e.getMessage());
        }
    }
}