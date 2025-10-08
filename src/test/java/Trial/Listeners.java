package Trial;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	public void OnTestStart(ITestResult result) {
		System.out.println("Test starting ");
		
	}
	
	public void OnTestFailure(ITestResult result) {
		System.out.println("Test Case Failed");
		captureScreenshot();
	}
	
	public void OnTestSkipped(ITestResult result) {
		System.out.println("Test Case Skipped");
		
	}

		
	private void captureScreenshot() {
		// TODO Auto-generated method stub
		
	}

		
		}
	






	
		
	
	

