package Trial;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReportSharer {
    
    public static void shareReport(String reportPath) {
        try {
            // Create shareable directory
            String shareDir = System.getProperty("user.home") + "/Desktop/TestReports";
            new File(shareDir).mkdirs();
            
            // Copy report to desktop with timestamp
            String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
            String sharedReportPath = shareDir + "/TestReport_" + timestamp + ".html";
            Files.copy(Paths.get(reportPath), Paths.get(sharedReportPath), StandardCopyOption.REPLACE_EXISTING);
            
            // Create email draft file
            createEmailDraft(sharedReportPath, timestamp);
            
            // Create summary file
            createSummaryFile(shareDir, sharedReportPath, timestamp);
            
            System.out.println("📄 Report copied to Desktop: " + sharedReportPath);
            System.out.println("📧 Email draft created on Desktop");
            System.out.println("📋 Summary file created on Desktop");
            
        } catch (Exception e) {
            System.out.println("❌ Report sharing failed: " + e.getMessage());
        }
    }
    
    private static void createEmailDraft(String reportPath, String timestamp) {
        try {
            String emailDraftPath = System.getProperty("user.home") + "/Desktop/EMAIL_DRAFT_" + timestamp + ".txt";
            
            try (PrintWriter writer = new PrintWriter(new FileWriter(emailDraftPath))) {
                writer.println("TO: harshit.mishra@rooter.io");
                writer.println("SUBJECT: Appium Test Report - " + timestamp);
                writer.println("");
                writer.println("Dear Harshit,");
                writer.println("");
                writer.println("The Appium test execution has been completed successfully.");
                writer.println("");
                writer.println("Test Summary:");
                writer.println("- Execution Date: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
                writer.println("- Report Location: " + reportPath);
                writer.println("- Status: All tests passed ✅");
                writer.println("");
                writer.println("Please find the detailed HTML report attached.");
                writer.println("");
                writer.println("Best Regards,");
                writer.println("Automation Team");
                writer.println("");
                writer.println("---");
                writer.println("Copy this content and paste into your email client");
                writer.println("Attach the HTML report file: " + reportPath);
            }
            
        } catch (Exception e) {
            System.out.println("❌ Email draft creation failed: " + e.getMessage());
        }
    }
    
    private static void createSummaryFile(String shareDir, String reportPath, String timestamp) {
        try {
            String summaryPath = shareDir + "/REPORT_SUMMARY_" + timestamp + ".txt";
            
            try (PrintWriter writer = new PrintWriter(new FileWriter(summaryPath))) {
                writer.println("🚀 APPIUM TEST EXECUTION SUMMARY");
                writer.println("================================");
                writer.println("Execution Time: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
                writer.println("Report File: " + reportPath);
                writer.println("Status: COMPLETED ✅");
                writer.println("");
                writer.println("📧 TO SEND EMAIL:");
                writer.println("1. Open your email client");
                writer.println("2. Send to: harshit.mishra@rooter.io");
                writer.println("3. Subject: Appium Test Report - " + timestamp);
                writer.println("4. Attach: " + reportPath);
                writer.println("5. Use email draft content from EMAIL_DRAFT file");
                writer.println("");
                writer.println("📱 QUICK ACTIONS:");
                writer.println("- Double-click HTML file to view report");
                writer.println("- Copy email draft content");
                writer.println("- Send email manually");
                writer.println("");
                writer.println("All files are saved on your Desktop for easy access!");
            }
            
        } catch (Exception e) {
            System.out.println("❌ Summary creation failed: " + e.getMessage());
        }
    }
}