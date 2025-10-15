package Trial;

import org.testng.ISuiteListener;
import org.testng.ISuite;

public class GlobalKeepAwakeListener implements ISuiteListener {
    
    @Override
    public void onStart(ISuite suite) {
        KeepAwakeUtil.startKeepAwake();
        System.out.println("🔋 Global keep-awake started for entire test suite");
    }
    
    @Override
    public void onFinish(ISuite suite) {
        KeepAwakeUtil.stopKeepAwake();
        ScreenKeepAliveListener.stopScreenKeepAlive();
        System.out.println("🔋 Global keep-awake stopped - test suite completed");
    }
}