package Trial;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import java.util.HashMap;
import java.util.Map;



public class RetryAnalyzer implements IRetryAnalyzer {
    private int retryCount = 0;
    private static final int maxRetryCount = 1;

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true; 
        }
        return false; 
    }
}

