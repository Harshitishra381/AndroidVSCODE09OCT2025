package Trial;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class DeleteAccount<MobileElement, Rotatable>  extends Functions{

//	public static void clickAndWaitForElementWithXpath1(final String xpath) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
//		ExpectedCondition<Boolean> condition = new ExpectedCondition<Boolean>() {
//			@Override
//			public Boolean apply(WebDriver arg0) {
//				try {
//					WebElement element = (driver).findElement(By.xpath(xpath));
//					element.click();
//					return true;
//				} catch (Exception e) {
//					return false;
//				}
//			}
//		};
//		wait.until(condition);
//	}
//
//	public static void clickAndWaitForElementWithId(final String id) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
//		ExpectedCondition<Boolean> condition = new ExpectedCondition<Boolean>() {
//			@Override
//			public Boolean apply(WebDriver arg0) {
//				try {
//					WebElement element = (driver).findElement(By.id(id));
//
////				    	(driver).findElement(null);
//					element.click();
//					return true;
//				} catch (Exception e) {
//					return false;
//				}
//			}
//		};
//		wait.until(condition);
//	}
//
//	// Function for if else element
//
//	public static boolean isVisibleWithId(final String id) {
//		boolean isVisible;
//		isVisible = !driver.findElements(By.id(id)).isEmpty();
//		return isVisible;
//	}
//
//	public static boolean isVisibleWithXPath1(final String xPath) {
//		boolean isVisible;
//		isVisible = !driver.findElements(By.xpath(xPath)).isEmpty();
//		return isVisible;
//	}
	
	
//	 public void OpenSideNav() { 
//		    
//
//			if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ImageView"))
//			{   clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ImageView");
//			        System.out.println("TC01- open side nav from old homapage");
//			}
//			else
//			{
//			    clickAndWaitForElementWithId("com.threesixteen.app:id/layout_nav_profile");
//			    System.out.println("TC02- open side nav from New homapage");
//			}
//		    }
//	

//	static AppiumDriver driver;
//
//	private Capabilities cap;
//	private int index;
//
//	@BeforeMethod
//	public void setup2() throws MalformedURLException, InterruptedException {
//
//		DesiredCapabilities cap = new DesiredCapabilities();
//		URL url = new URL("http://127.0.0.1:4723/wd/hub/");
//		driver = new AndroidDriver(url, cap);
//
//		DesiredCapabilities cap1 = new DesiredCapabilities();
//
////	     cap1.setCapability("deviceName", "RZ8T907T67Y");
//		cap.setCapability("deviceName", "13793294180004Z");
//		cap1.setCapability("platformName", "Android");
//		cap1.setCapability("platformVersion", "14");
////	    cap.setCapability("platformVersion", "12");
//		cap1.setCapability("appPackage", "com.threesixteen.app");
////       cap.setCapability("appPackage", "com.threesixteen.app.dev");
//		cap1.setCapability("appActivity", "com.threesixteen.app.ui.activities.SplashActivity");
//		cap1.setCapability("autoGrantPermissions", true);
//		cap1.setCapability("ignoreHiddenApiPolicyError", true);
//		cap1.setCapability("noReset", true);
//
//		URL url1 = new URL("http://127.0.0.1:4723/wd/hub/");
//		driver = new AndroidDriver(url1, cap1);
//
//		System.out.println("Application started");
//		Thread.sleep(3000);
//
//		if (isVisibleWithId("android:id/button2")) {
//			clickAndWaitForElementWithId("android:id/button2");
//			System.out.println("Click on close");
//		}
//
////		 clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView");
////		    clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[1]");
////			System.out.println("Gmail Login Done");
//
//		if (isVisibleWithXPath1(
//				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button//android.")) {
//			clickAndWaitForElementWithXpath1(
//					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button");
//			clickAndWaitForElementWithId("com.threesixteen.app:id/btn_close");
////				    	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_neg");
//			System.out.println("Spinwheel rotate");
//		}
//		if (isVisibleWithId("com.android.permissioncontroller:id/permission_allow_button")) {
//			clickAndWaitForElementWithId("com.android.permissioncontroller:id/permission_allow_button");
//			System.out.println("Notification permission allowed");
//
//		}
//		 if (isVisibleWithXPath1("//*[contains(@text,'Update')]"))  {
//	         
//	           driver.navigate().back();
//	            System.out.println("Exist from Update");
//	            Thread.sleep(1000);
//	       }
////
//	}
//
//	boolean isVisibleWithXpath1(String s) {
//
//		return false;
//	}
	
	

	@Test(priority = 1)
	public void DeleteAccount() throws InterruptedException {

	
        OpenSideNav();
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Setting')]");
        System.out.println("TC02- Click on Setting");

        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(5)"));
        System.out.println("TC02- Scoll down ");
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Delete Account')]");
        System.out.println("TC02- Click on delete account");
        


	}

	
	@AfterMethod

	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
