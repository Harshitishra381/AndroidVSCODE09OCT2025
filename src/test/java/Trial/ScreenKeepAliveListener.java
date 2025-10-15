package Trial;

import org.testng.ITestListener;
import org.testng.ITestResult;
import java.util.Timer;
import java.util.TimerTask;
import java.io.IOException;

public class ScreenKeepAliveListener implements ITestListener {
    private static Timer keepAliveTimer;
    
    @Override
    public void onTestStart(ITestResult result) {
        startScreenKeepAlive();
    }
    
    @Override
    public void onTestSuccess(ITestResult result) {
        // Keep running for next test
    }
    
    @Override
    public void onTestFailure(ITestResult result) {
        // Keep running for next test
    }
    
    @Override
    public void onTestSkipped(ITestResult result) {
        // Keep running for next test
    }
    
    private static void startScreenKeepAlive() {
        if (keepAliveTimer == null) {
            keepAliveTimer = new Timer("ScreenKeepAlive", true);
            keepAliveTimer.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    try {
                        // Simulate user activity to prevent screen lock
                        ProcessBuilder pb = new ProcessBuilder("caffeinate", "-u", "-t", "1");
                        pb.start();
                    } catch (IOException e) {
                        // Ignore errors
                    }
                }
            }, 0, 30000); // Every 30 seconds
            
            System.out.println("🔄 Screen keep-alive timer started (every 30s)");
        }
    }
    
    public static void stopScreenKeepAlive() {
        if (keepAliveTimer != null) {
            keepAliveTimer.cancel();
            keepAliveTimer = null;
            System.out.println("🔄 Screen keep-alive timer stopped");
        }
    }
}