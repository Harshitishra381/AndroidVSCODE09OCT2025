package Trial;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestResultCleanerListener implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestContext context = result.getTestContext();

        if (context.getFailedTests().getResults(result.getMethod()).size() > 0) {
            context.getFailedTests().removeResult(result.getMethod());
        }

        if (context.getSkippedTests().getResults(result.getMethod()).size() > 0) {
            context.getSkippedTests().removeResult(result.getMethod());
        }
    }

}
