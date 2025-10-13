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

    private int totalTests = 0;
    private int passedTests = 0;
    private int failedTests = 0;
    private int skippedTests = 0;
    private final Map<String, Boolean> retriedTests = new HashMap<>();

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
            writer.println("<title>Appium Automation Test Report</title>");
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
            writer.println("<h1>APPIUM AUTOMATION TEST EXECUTION REPORT</h1>");
            writer.println("<h2>Suite: " + context.getSuite().getName() + "</h2>");
            writer.println("<p>Report Generated On: " + sdf.format(new Date()) + "<br>");
            writer.println("OS: " + System.getProperty("os.name") + "<br>");
            writer.println("User: " + System.getProperty("user.name") + "<br>");
            writer.println("Java Version: " + System.getProperty("java.version") + "</p>");
            writer.println("<p>Tester Name: Harshit Mishra</p>");

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
        
        // If this test was previously failed/skipped and now passes, count as retry success
        if (retriedTests.containsKey(testKey)) {
            System.out.println("\u001B[32m\u2713 PASS: " + result.getMethod().getMethodName() + " passed on retry\u001B[0m");
            logResult(result, "PASS (Retry)", "pass");
        } else {
            passedTests++;
            totalTests++;
            System.out.println("\u001B[32m\u2713 PASS: " + result.getMethod().getMethodName() + " completed successfully\u001B[0m");
            logResult(result, "PASS", "pass");
        }
    }

    @Override
    public void onTestFailure(ITestResult result) {
        String testKey = result.getTestClass().getName() + "." + result.getMethod().getMethodName();
        
        if (!retriedTests.containsKey(testKey)) {
            failedTests++;
            totalTests++;
            retriedTests.put(testKey, false);
        }
        failedTestResults.add(result);
        System.out.println("\u001B[31m\u2717 FAIL: " + result.getMethod().getMethodName() + " failed\u001B[0m");
        logResult(result, "FAIL", "fail");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        String testKey = result.getTestClass().getName() + "." + result.getMethod().getMethodName();
        
        if (!retriedTests.containsKey(testKey)) {
            skippedTests++;
            totalTests++;
            retriedTests.put(testKey, false);
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

        // Calculate final counts considering retries
        int finalPassed = context.getPassedTests().size();
        int finalFailed = context.getFailedTests().size();
        int finalSkipped = context.getSkippedTests().size();
        int finalTotal = finalPassed + finalFailed + finalSkipped;
        
        // Summary
        writer.println("<div class='summary'>");
        writer.println("<h2>Execution Summary</h2>");
        writer.println("<p>Total Tests: " + finalTotal + "<br>");
        writer.println("Passed: " + finalPassed + " (including retries)<br>");
        writer.println("Failed: " + finalFailed + "<br>");
        writer.println("Skipped: " + finalSkipped + "<br>");
        writer.println(String.format("Pass %%: %.2f%%<br>", finalTotal > 0 ? (100.0 * finalPassed / finalTotal) : 0));
        writer.println(String.format("Fail %%: %.2f%%<br>", finalTotal > 0 ? (100.0 * finalFailed / finalTotal) : 0));
        writer.println(String.format("Skip %%: %.2f%%<br>", finalTotal > 0 ? (100.0 * finalSkipped / finalTotal) : 0));
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
        writer.close();
        
        // Send via Gmail (free)
        GmailSender.sendReport(reportFilePath);
    }
}
