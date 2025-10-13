package IOS;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Login_NonProUser {


    public static void clickAndWaitForElementWithXpath1(final String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        ExpectedCondition<Boolean> condition = (WebDriver arg0) -> {
            try {
                WebElement element = (driver).findElement(By.xpath(xpath));
                element.click();
                return true;
            } catch (Exception e) {
                return false;
            }
        };
        wait.until(condition);
    }

    
    
//    public static String getelementtext(final String xpath) {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));
//        final String text = "";
//        ExpectedCondition<Boolean> condition = new ExpectedCondition<Boolean>() { 
//            @Override
//            public Boolean apply(WebDriver arg0) {
//                try {
//                    WebElement element = (driver).findElement(By.xpath(xpath)); element.getText();
//                    text = element.getText();
//                    return true;
//                } catch (Exception e) {
//                    return false;
//                }
//            }
//        };
//        wait.until(condition);
//		return xpath;
//    }
    

    public static void clickAndWaitForElementWithId(final String id) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        ExpectedCondition<Boolean> condition = (WebDriver arg0) -> {
            try {
                WebElement element = (driver).findElement(By.id(id));

//				    	(driver).findElement(null);
                element.click();
                return true;
            } catch (Exception e) {
                return false;
            }
        };
        wait.until(condition);
    }


    //Function for if else element

    public static boolean isVisibleWithId(final String id) {
        boolean isVisible;
        isVisible = !driver.findElements(By.id(id)).isEmpty();
        return isVisible;
    }

    public static boolean isVisibleWithXPath1(final String xPath) {
        boolean isVisible;
        isVisible = !driver.findElements(By.xpath(xPath)).isEmpty();
        return isVisible;
    }


    static AppiumDriver driver;


    @BeforeMethod
    public void setup() throws MalformedURLException, InterruptedException {

        DesiredCapabilities cap = new DesiredCapabilities();

//		
		cap.setCapability("deviceName", "RZ8T907T67Y");
//		cap.setCapability("deviceName", "13793294180004Z");
//        cap.setCapability("deviceName", "6381e3e");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "14");
//	    cap.setCapability("platformVersion", "12");
        cap.setCapability("appPackage", "com.threesixteen.app");
//        cap.setCapability("appPackage", "com.threesixteen.app.dev");
        cap.setCapability("appActivity", "com.threesixteen.app.ui.activities.SplashActivity");
        cap.setCapability("autoGrantPermissions", true);
        cap.setCapability("ignoreHiddenApiPolicyError", true);
        cap.setCapability("noReset", false);

        URL url = new URL("http://127.0.0.1:4723/wd/hub/");
        driver = new AppiumDriver(url, cap);
        System.out.println("Application started");
        Thread.sleep(10000);
       

        if (isVisibleWithId("android:id/button2")) {
            clickAndWaitForElementWithId("android:id/button2");
            System.out.println("Click on close");
        }
        Thread.sleep(3000);
		 clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView");
		    clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[1]");
			System.out.println("Gmail Login Done");
	        Thread.sleep(10000);

//			driver.navigate().back();
//		       System.out.println("exist from update");
		       
	        Thread.sleep(5000);
	        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button//android.")) {
	            clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button");
	            clickAndWaitForElementWithId("com.threesixteen.app:id/btn_close");
//				    	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_neg");
	            System.out.println("Spinwheel rotate");
	            }
        Thread.sleep(3000);
        if (isVisibleWithId("com.android.permissioncontroller:id/permission_allow_button")) {
            clickAndWaitForElementWithId("com.android.permissioncontroller:id/permission_allow_button");
            System.out.println("Notification permission allowed");
        }

    }
        
        @Test(priority = 1)
        public void Dummytest01() throws InterruptedException {

            clickAndWaitForElementWithXpath1("//android.widget.FrameLayout[@content-desc=\"Reels\"]/android.widget.FrameLayout/android.widget.ImageView");
            System.out.println("TC01- Central Reel Tab opened");
            Thread.sleep(500);
    }




	
	

	
	
	
	

	
	
	
	
	
	
	
	
    }

