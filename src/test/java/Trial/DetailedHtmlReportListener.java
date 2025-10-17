package Trial;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.*;

public class DetailedHtmlReportListener implements ITestListener {

    private PrintWriter writer;
    private final Map<ITestResult, Long> startTimes = new HashMap<>();
    private final List<ITestResult> failedTestResults = new ArrayList<>();
    private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");

    private final Set<String> uniqueTests = new HashSet<>();
    private final Map<String, String> testStatus = new HashMap<>(); // testKey -> PASS/FAIL/SKIP
    private final Map<String, Integer> retryCount = new HashMap<>();

    public DetailedHtmlReportListener() {
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata")); // IST
    }

    @Override
    public void onStart(ITestContext context) {
        try {
            String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
            String reportDir = "./target/surefire-reports";
            String reportFileName = "detailed-test-report-" + timestamp + ".html";
            reportFilePath = reportDir + "/" + reportFileName;
            new java.io.File(reportDir).mkdirs(); // Ensure directory exists

            writer = new PrintWriter(new FileWriter(reportFilePath, false));

            // HTML Header
            writer.println("<!DOCTYPE html>");
            writer.println("<html lang='en'>");
            writer.println("<head>");
            writer.println("<meta charset='UTF-8'>");
            writer.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
            writer.println("<title>Appium Automation Automated Test Report</title>");
            writer.println("<style>");
            writer.println("body { font-family: Arial, sans-serif; margin: 20px; }");
            writer.println("h1, h2 { text-align: center; }");
            writer.println("table { width: 100%; border-collapse: collapse; margin-top: 20px; }");
            writer.println("th, td { border: 1px solid #ddd; padding: 8px; text-align: left; }");
            writer.println("th { background-color: #f2f2f2; }");
            writer.println(".pass { background-color: #d4edda; }");
            writer.println(".fail { background-color: #f8d7da; }");
            writer.println(".skip { background-color: #fff3cd; }");
            writer.println(".summary { margin-top: 30px; }");
            writer.println(".failed-details { margin-top: 20px; }");
            writer.println(".exception { color: red; font-weight: bold; }");
            writer.println("</style>");
            writer.println("</head>");
            writer.println("<body>");
            writer.println("<h1>APPIUM AUTOMATION AUTOMATED TEST EXECUTION REPORT</h1>");
            writer.println("<h2>Suite: " + context.getSuite().getName() + "</h2>");
           
            String appVersion = getAppVersionFromCapabilities();
            
            writer.println("<div style='background-color: #f8f9fa; padding: 15px; border-radius: 5px; margin: 20px 0;'>");
            writer.println("<h3 style='margin-top: 0; color: #007bff;'>Test Environment Details</h3>");
            writer.println("<p><strong>📱 App Version:</strong> <span style='color: #28a745; font-weight: bold;'>" + appVersion + "</span><br>");
            writer.println("<strong>📅 Report Generated:</strong> " + sdf.format(new Date()) + "<br>");
            writer.println("<strong>💻 OS:</strong> " + System.getProperty("os.name") + "<br>");
            writer.println("<strong>👤 User:</strong> " + System.getProperty("user.name") + "<br>");
            // writer.println("<strong>☕ Java Version:</strong> " + System.getProperty("java.version") + "<br>");
            writer.println("<strong>🧪 Android Version:</strong> 14 </p>");
            writer.println("<strong>🧪 Tester:</strong> Harshit Mishra</p>");
            writer.println("</div>");

            // Table header
            writer.println("<table>");
            writer.println("<tr>");
            writer.println("<th>Class</th>");
            writer.println("<th>Method</th>");
            writer.println("<th>Status</th>");
            writer.println("<th>Start Time</th>");
            writer.println("<th>End Time</th>");
            writer.println("<th>Duration(ms)</th>");
            writer.println("<th>Thread</th>");
            writer.println("<th>Groups</th>");
            writer.println("<th>Parameters</th>");
            writer.println("<th>Exception</th>");
            writer.println("</tr>");

            System.out.println("📄 Detailed HTML report will be saved at: " + reportFilePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestStart(ITestResult result) {
        startTimes.put(result, System.currentTimeMillis());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        String testKey = result.getTestClass().getName() + "." + result.getMethod().getMethodName();
        uniqueTests.add(testKey);
        
        if (testStatus.containsKey(testKey)) {
            retryCount.put(testKey, retryCount.getOrDefault(testKey, 0) + 1);
            System.out.println("\u001B[32m\u2713 PASS: " + result.getMethod().getMethodName() + " passed on retry\u001B[0m");
            logResult(result, "PASS (Retry)", "pass");
        } else {
            System.out.println("\u001B[32m\u2713 PASS: " + result.getMethod().getMethodName() + " completed successfully\u001B[0m");
            logResult(result, "PASS", "pass");
        }
        testStatus.put(testKey, "PASS");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        String testKey = result.getTestClass().getName() + "." + result.getMethod().getMethodName();
        uniqueTests.add(testKey);
        
        // Only set as FAIL if not already PASS (in case of retry after failure)
        if (!"PASS".equals(testStatus.get(testKey))) {
            testStatus.put(testKey, "FAIL");
        }
        failedTestResults.add(result);
        System.out.println("\u001B[31m\u2717 FAIL: " + result.getMethod().getMethodName() + " failed\u001B[0m");
        logResult(result, "FAIL", "fail");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        String testKey = result.getTestClass().getName() + "." + result.getMethod().getMethodName();
        uniqueTests.add(testKey);
        
        // Only set as SKIP if not already PASS (in case of retry after skip)
        if (!"PASS".equals(testStatus.get(testKey))) {
            testStatus.put(testKey, "SKIP");
        }
        System.out.println("\u001B[33m\u26a0 SKIP: " + result.getMethod().getMethodName() + " skipped\u001B[0m");
        logResult(result, "SKIPPED", "skip");
    }

    private void logResult(ITestResult result, String statusText, String cssClass) {
        long start = startTimes.getOrDefault(result, result.getStartMillis());
        long end = System.currentTimeMillis();
        long duration = end - start;

        String className = result.getTestClass().getName();
        String methodName = result.getMethod().getMethodName();
        String startTime = sdf.format(new Date(start));
        String endTime = sdf.format(new Date(end));
        String threadId = String.valueOf(Thread.currentThread().getId());

        String[] groups = result.getMethod().getGroups();
        String groupStr = (groups.length > 0) ? String.join(",", groups) : "-";

        Object[] params = result.getParameters();
        String paramStr = (params.length > 0) ? arrayToString(params) : "-";

        String exceptionMsg = (result.getThrowable() != null) ? result.getThrowable().toString() : "-";

        // Write to HTML table
        writer.println("<tr class='" + cssClass + "'>");
        writer.println("<td>" + className + "</td>");
        writer.println("<td>" + methodName + "</td>");
        writer.println("<td>" + statusText + "</td>");
        writer.println("<td>" + startTime + "</td>");
        writer.println("<td>" + endTime + "</td>");
        writer.println("<td>" + duration + "</td>");
        writer.println("<td>" + threadId + "</td>");
        writer.println("<td>" + groupStr + "</td>");
        writer.println("<td>" + paramStr + "</td>");
        writer.println("<td class='exception'>" + exceptionMsg + "</td>");
        writer.println("</tr>");
        writer.flush();
    }

    private String arrayToString(Object[] array) {
        StringBuilder sb = new StringBuilder();
        for (Object o : array) {
            sb.append(o.toString()).append(",");
        }
        if (sb.length() > 0) sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    private String reportFilePath;

    @Override
    public void onFinish(ITestContext context) {
        // Close table
        writer.println("</table>");

        // Calculate final counts based on unique tests
        int totalUniqueTests = uniqueTests.size();
        int passedTests = 0;
        int failedTests = 0;
        int totalRetries = 0;
        
        for (String testKey : uniqueTests) {
            String status = testStatus.get(testKey);
            if ("PASS".equals(status)) {
                passedTests++;
                totalRetries += retryCount.getOrDefault(testKey, 0);
            } else if ("FAIL".equals(status)) {
                failedTests++;
            }
        }
        
        // Summary
        writer.println("<div class='summary'>");
        writer.println("<h2>Execution Summary</h2>");
        writer.println("<p>Total Tests: " + totalUniqueTests + "<br>");
        writer.println("Passed: " + passedTests + (totalRetries > 0 ? " (including " + totalRetries + " retries)" : "") + "<br>");
        writer.println("Failed: " + failedTests + "<br>");
        writer.println(String.format("Pass %%: %.2f%%<br>", totalUniqueTests > 0 ? (100.0 * passedTests / totalUniqueTests) : 0));
        writer.println(String.format("Fail %%: %.2f%%<br>", totalUniqueTests > 0 ? (100.0 * failedTests / totalUniqueTests) : 0));
        writer.println("Execution Completed On: " + sdf.format(new Date()));
        writer.println("</p>");
        writer.println("</div>");

        // Failed test details
        writer.println("<div class='failed-details'>");
        writer.println("<h2>Failed Test Case Details</h2>");
        if (!failedTestResults.isEmpty()) {
            for (ITestResult result : failedTestResults) {
                writer.println("<hr>");
                writer.println("<p><b>Class:</b> " + result.getTestClass().getName() + "<br>");
                writer.println("<b>Method:</b> " + result.getMethod().getMethodName() + "<br>");

                Object[] params = result.getParameters();
                if (params.length > 0) {
                    writer.println("<b>Params:</b> " + arrayToString(params) + "<br>");
                }

                Throwable throwable = result.getThrowable();
                if (throwable != null) {
                    writer.println("<b>Exception:</b> <span class='exception'>" + throwable.toString() + "</span><br>");
                }
                writer.println("</p>");
            }
        } else {
            writer.println("<p>✅ No failed test cases.</p>");
        }
        writer.println("</div>");

        writer.println("</body></html>");
        
        // Ensure proper cleanup
        try {
            writer.flush();
            writer.close();
            writer = null;
        } catch (Exception e) {
            System.out.println("Error closing report file: " + e.getMessage());
        }
        
        try {
            Thread.sleep(5000); 
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        // Send via Gmail (free)
        GmailSender.sendReport(reportFilePath);
    }
    
    private String getAppVersionFromCapabilities() {
        try {
            // Try to get APK path from system property or environment
            String apkPath = System.getProperty("apk.path");
            if (apkPath == null) {
                apkPath = System.getenv("APK_PATH");
            }
            
            // Default APK path if not specified
            if (apkPath == null) {
                apkPath = "/Users/rooter/Desktop/app-release.apk";
            }
            
            System.out.println("📱 Extracting app version from: " + apkPath);
            String version = ApkVersionExtractor.getAppVersion(apkPath);
            System.out.println("📱 App version extracted: " + version);
            return version;
            
        } catch (Exception e) {
            System.out.println("❌ Could not extract app version: " + e.getMessage());
            return "8.4.10 (Error)";
        }
    }
}
