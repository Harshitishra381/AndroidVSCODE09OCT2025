package Trial;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class DetailedTextReportListener implements ITestListener {

    private PrintWriter writer;
    private Map<ITestResult, Long> startTimes = new HashMap<>();
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");

    private int totalTests = 0;
    private int passedTests = 0;
    private int failedTests = 0;
    private int skippedTests = 0;

    public DetailedTextReportListener() {
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata")); // IST
    }

    @Override
    public void onStart(ITestContext context) {
        try {
            writer = new PrintWriter(new FileWriter("detailed-test-report.txt", false));

            // Header and Metadata
            writer.println("===============================================================");
            writer.println("              APPIUM AUTOMATION TEST EXECUTION REPORT");
            writer.println("===============================================================");
            writer.println("Report Generated On : " + sdf.format(new Date()));
            writer.println("OS                  : " + System.getProperty("os.name"));
            writer.println("User                : " + System.getProperty("user.name"));
            writer.println("Java Version        : " + System.getProperty("java.version"));
            writer.println("TestNG Suite Name   : " + context.getSuite().getName());

            // Placeholder for Appium details (replace with real values from your tests or capabilities)
            writer.println("Device Name         : IQOO Z6 5G");
            writer.println("Platform Version    : Android 15");
            writer.println("Appium Version      : 2.0.0");
            writer.println("Tester Name         : Harshit Mishra");

            writer.println("===============================================================\n");

            // Column Headers
            writer.println("CLASS | METHOD | STATUS | START TIME | END TIME | DURATION(ms) | THREAD | GROUPS | PARAMETERS | EXCEPTION");
            writer.println("--------------------------------------------------------------------------------------------------------------------------------------------");
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
        passedTests++;
        totalTests++;
        writeResult(result, "PASS");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        failedTests++;
        totalTests++;
        writeResult(result, "FAIL");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        skippedTests++;
        totalTests++;
        writeResult(result, "SKIPPED");
    }

    private void writeResult(ITestResult result, String status) {
        long start = startTimes.getOrDefault(result, result.getStartMillis());
        long end = System.currentTimeMillis();
        String startTime = sdf.format(new Date(start));
        String endTime = sdf.format(new Date(end));
        long duration = end - start;

        String className = result.getTestClass().getName();
        String methodName = result.getMethod().getMethodName();
        String threadId = String.valueOf(Thread.currentThread().getId());

        // Groups
        String[] groups = result.getMethod().getGroups();
        String groupStr = (groups.length > 0) ? String.join(",", groups) : "-";

        // Parameters
        Object[] params = result.getParameters();
        String paramStr = (params.length > 0) ? arrayToString(params) : "-";

        // Exception
        String exceptionMsg = (result.getThrowable() != null) ? result.getThrowable().toString() : "-";

        writer.printf("%s | %s | %s | %s | %s | %d | %s | %s | %s | %s%n",
                className, methodName, status, startTime, endTime, duration,
                threadId, groupStr, paramStr, exceptionMsg);
        writer.flush();
    }

    private String arrayToString(Object[] array) {
        StringBuilder sb = new StringBuilder();
        for (Object o : array) {
            sb.append(o.toString()).append(",");
        }
        if (sb.length() > 0)
            sb.setLength(sb.length() - 1); // Remove last comma
        return sb.toString();
    }

    @Override
    public void onFinish(ITestContext context) {
        if (writer != null) {
            writer.println("\n===============================================================");
            writer.println("                   APPIUM TEST EXECUTION SUMMARY");
            writer.println("===============================================================");
            writer.println("Total Tests   : " + totalTests);
            writer.println("Passed        : " + passedTests);
            writer.println("Failed        : " + failedTests);
            writer.println("Skipped       : " + skippedTests);
            writer.printf("Pass %%         : %.2f%%\n", ((double) passedTests / totalTests) * 100);
            writer.printf("Fail %%         : %.2f%%\n", ((double) failedTests / totalTests) * 100);
            writer.printf("Skip %%         : %.2f%%\n", ((double) skippedTests / totalTests) * 100);
            writer.println("Execution Completed On : " + sdf.format(new Date()));
            writer.println("===============================================================");




            


            writer.close();

        }
    }
}
