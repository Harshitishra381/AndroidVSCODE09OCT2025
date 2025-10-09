package Utilities;

import com.google.common.io.Files;
import io.appium.java_client.AppiumDriver;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class testUltils {
	
	
	public class ScreenshotTest {

	    private AppiumDriver driver;

	    @Test
	    public void sampleTest() {
	        // Your test code here
	        // For example, driver.findElementByAccessibilityId("elementId").click();
	    }

	    @AfterMethod
	    public void afterMethod(ITestResult result) {
	        if (result.getStatus() == ITestResult.FAILURE) {
	            captureScreenshot(result.getName());
	        }
	    }

	    private void captureScreenshot(String testName) {
	        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        Path source = screenshot.toPath();
	        Path destination = Paths.get("screenshots", testName + ".png");
	        File parentDir = destination.toFile().getParentFile();
	        if (!parentDir.exists()) {
	            if (!parentDir.mkdirs()) {
	                System.err.println("Failed to create directory: " + parentDir.getAbsolutePath());
	                return;
	            }
	        }
        try {
            Files.copy(source.toFile(), destination.toFile());
            System.out.println("Screenshot saved at: " + destination.toAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
	    }

	}
	    

	    }
	