package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.apache.commons.io.output.AppendableOutputStream;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.google.common.io.Files;
import com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType;

import io.appium.java_client.AppiumDriver;

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
	        try (FileInputStream in = new FileInputStream(screenshot);
	             AppendableOutputStream out = new AppendableOutputStream((Appendable) destination.toFile())) {
	            byte[] buffer = new byte[1024];
	            int length;
	            while ((length = in.read(buffer)) > 0) {
	                out.write(buffer, 0, length);
	            }
	            System.out.println("Screenshot saved at: " + destination.toAbsolutePath());
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	}
	    

	    }
	