package Trial;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

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
import io.appium.java_client.remote.SupportsRotation;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class RecordedStream_Script<MobileElement, Rotatable> extends Functions  {


	
//    public static void clickAndWaitForElementWithXpath1(final String xpath) {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//        ExpectedCondition<Boolean> condition = new ExpectedCondition<Boolean>() {
//            @Override
//            public Boolean apply(WebDriver arg0) {
//                try {
//                    WebElement element = (driver).findElement(By.xpath(xpath));
//                    element.click();
//                    return true;
//                } catch (Exception e) {
//                    return false;
//                }
//            }
//        };
//        wait.until(condition);
//    }
//
//    public static void clickAndWaitForElementWithId(final String id) {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//        ExpectedCondition<Boolean> condition = new ExpectedCondition<Boolean>() {
//            @Override
//            public Boolean apply(WebDriver arg0) {
//                try {
//                    WebElement element = (driver).findElement(By.id(id));
//
////				    	(driver).findElement(null);
//                    element.click();
//                    return true;
//                } catch (Exception e) {
//                    return false;
//                }
//            }
//        };
//        wait.until(condition);
//    }
//
//    // Function for if else element
//
//    public static boolean isVisibleWithId(final String id) {
//        boolean isVisible;
//        isVisible = !driver.findElements(By.id(id)).isEmpty();
//        return isVisible;
//    }
//
//    public static boolean isVisibleWithXPath1(final String xPath) {
//        boolean isVisible;
//        isVisible = !driver.findElements(By.xpath(xPath)).isEmpty();
//        return isVisible;
//    }
//    
//    public static void MuteRecordedStream() throws InterruptedException
//    {
//    	if (isVisibleWithId("com.threesixteen.app:id/replay_tag"))
//        {
//    		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
//			System.out.println("TC06- open recorded stream");
//        Thread.sleep(3000);
//        clickAndWaitForElementWithId("com.threesixteen.app:id/video_player_view");
//        System.out.println("TC07- recorded stream is working");
//        Thread.sleep(10000);
//        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//        if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
//           clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//           System.out.println("TC08- UnMute the video");
//           Thread.sleep(3000);
//          
//
//
//       } else {
//           Thread.sleep(10000);
//           clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//           clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//           System.out.println("TC09- UnMute the video");
//           Thread.sleep(2000);
//       }
//       
//
// }
//        
//	  else 
//		
//    {
//    	driver.findElement(
//				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));	
//        Thread.sleep(1000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
// 	   	System.out.println("TC10- open recorded stream");
//        Thread.sleep(10000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/video_player_view");
//         System.out.println("TC11- recorded stream is working ");
//         Thread.sleep(1000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//         if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
//            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//            System.out.println("TC12- UnMute the video");
//            Thread.sleep(1000);
//
//        } else {
//            Thread.sleep(1000);
//            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//            System.out.println("TC13- UnMute the video");
//            Thread.sleep(1000);
//        }
//         
//         }
//        driver.navigate().back();
//        Thread.sleep(1000);
//        driver.findElement(
//				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));	
//        Thread.sleep(1000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
// 	   	System.out.println("TC14- open recorded stream");
//        Thread.sleep(10000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/video_player_view");
//         System.out.println("TC15- recorded stream is working ");
//         Thread.sleep(2000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//         if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
//            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//            System.out.println("TC16- UnMute the video");
//            Thread.sleep(1000);
//
//        } else {
//            Thread.sleep(2000);
//            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//            System.out.println("TC17- UnMute the video");
//            Thread.sleep(2000);
//        }
//         driver.navigate().back();
//         Thread.sleep(1000);
//         driver.findElement(
// 				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));	
//         Thread.sleep(1000);
//          clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
//  	   	System.out.println("TC18- open recorded stream");
//         Thread.sleep(10000);
//          clickAndWaitForElementWithId("com.threesixteen.app:id/video_player_view");
//          System.out.println("TC19- recorded stream is working ");
//          Thread.sleep(1000);
//          clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//          if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
//             clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//             System.out.println("TC20- UnMute the video");
//             Thread.sleep(1000);
//
//         } else {
//             Thread.sleep(2000);
//             clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//             clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//             System.out.println("TC21- UnMute the video");
//             Thread.sleep(2000);
//         }
//          driver.navigate().back();
//          Thread.sleep(1000);
//          driver.findElement(
//  				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));	
//          Thread.sleep(1000);
//           clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
//   	   	System.out.println("TC22- open recorded stream");
//          Thread.sleep(10000);
//           clickAndWaitForElementWithId("com.threesixteen.app:id/video_player_view");
//           System.out.println("TC23- recorded stream is working ");
//           Thread.sleep(1000);
//           clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//           if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
//              clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//              System.out.println("TC24- UnMute the video");
//              Thread.sleep(1000);
//
//          } else {
//              Thread.sleep(2000);
//              clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//              clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//              System.out.println("TC25- UnMute the video");
//              Thread.sleep(2000);
//          }
//    }
//
//    
//    public static void ExoRotate() throws InterruptedException {
//        for (int i = 1; i <= 5; i++) {
//            
//            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
//            Thread.sleep(10000);
//            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
//            System.out.println("TC" + String.format("%02d", i + 1) + "- video player screen Rotate");
//            Thread.sleep(10000);
//        }
//    }
//    
//    
//    public static void miniplayertofullplayerSwitch() throws InterruptedException {
//        int repeats = 10;
//        for (int i = 0; i < repeats; i++) {
//            Thread.sleep(2000);
//            driver.navigate().back();
//            Thread.sleep(2000);
//            clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
//        }
//        System.out.println("F--> " + repeats + " times Mini Player to Full screen done");
//        Thread.sleep(2000);
//    }
//    
//    
//    public static void PIPSwitch() throws InterruptedException {
//        for (int i = 1; i <= 10; i++) {
//            if (isVisibleWithId("com.threesixteen.app:id/tv_time_and_watching")) {
//                ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.HOME));
//                Thread.sleep(5000);
//            }
//            clickAndWaitForElementWithXpath1("//android.widget.TextView[@content-desc=\"Rooter\"]");
//            Thread.sleep(5000);
//        }
//        System.out.println("F--> PIP switch done 10 times");
//        Thread.sleep(2000);
//
//    }
//    
//    public static void  OpenVideo() {
//    
//    if (isVisibleWithXPath1("//android.widget.Button[contains(@text, 'Videos')]"))
//	{
//    clickAndWaitForElementWithXpath1("//android.widget.Button[contains(@text, 'Videos')]");
//    System.out.println("TC01- Video tab opened");
//    clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
//    System.out.println("TC02- Video Opened from videos tab");
//	}
//	else
//	{
//    driver.findElement(AppiumBy.androidUIAutomator(
//            "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));
//    if (isVisibleWithId("com.threesixteen.app:id/video_timer"))
//    {
//    clickAndWaitForElementWithId("com.threesixteen.app:id/video_timer");
//    System.out.println("TC02- Video Opened from homepage");
//	}
//    else
//    {
//    	 driver.findElement(AppiumBy.androidUIAutomator(
// 	            "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));
//    	 clickAndWaitForElementWithId("com.threesixteen.app:id/video_timer");
// 	    System.out.println("TC02- Video Opened from homepage");
//    }
//   }
//    }
//    
//    
//    public static void ExoQualityChnage() throws InterruptedException {
//
//    	 clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//         clickAndWaitForElementWithXpath1("//android.widget.FrameLayout[@content-desc=\"Show player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[2]");
//         System.out.println("TC07- Clicked on video player setting");
//         Thread.sleep(2000);
//         clickAndWaitForElementWithXpath1("//*[contains(@text,'Video Quality')]");
//         System.out.println("TC08- clicked on video quality");
//         Thread.sleep(2000);
//         if (isVisibleWithXPath1("//*[contains(@text,'1080p')]")) {
//             clickAndWaitForElementWithXpath1("//*[contains(@text,'1080p')]");
//             System.out.println("TC09- changed the video qulaity to 1080p");
//             Thread.sleep(2000);
//         }
//
//         if (isVisibleWithXPath1("//*[contains(@text,'720p')]")) {
//             clickAndWaitForElementWithXpath1("//*[contains(@text,'720p')]");
//             System.out.println("TC10- changed the Video qulaity to 720p");
//             Thread.sleep(2000);
//         }
//
//         if (isVisibleWithXPath1("//*[contains(@text,'480p')]")) {
//             clickAndWaitForElementWithXpath1("//*[contains(@text,'480p')]");
//             System.out.println("TC11- changed the Video qulaity to 480p");
//             Thread.sleep(2000);
//         }
//
//         if (isVisibleWithXPath1("//*[contains(@text,'240p')]")) {
//             clickAndWaitForElementWithXpath1("//*[contains(@text,'240p')]");
//             System.out.println("TC12- changed the video qulaity to 240p");
//             Thread.sleep(2000);
//         }
//
//         if (isVisibleWithXPath1("//*[contains(@text,'360p')]")) {
//             clickAndWaitForElementWithXpath1("//*[contains(@text,'360p')]");
//             System.out.println("TC13- changed the Video qulaity to 360p");
//             Thread.sleep(2000);
//         }
//
//     }
//    
//    
//public static void OpenSearch() throws InterruptedException {
//    	
//    	
//    	
//    	if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView"))
//    	{  
//    		clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView");
//        System.out.println("TC01- Open Search");
//        Thread.sleep(1000);
//    	}
//    	else
//    	{
//    		if (isVisibleWithId("//android.widget.FrameLayout[@content-desc=\" \"]/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView"))
//    	 {
//    			clickAndWaitForElementWithXpath1("//android.widget.FrameLayout[@content-desc=\" \"]/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView");
//        System.out.println("TC01- Open Search");
//        Thread.sleep(1000);		
//    	 }
//    		else
//    		{
//                clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]");
//                System.out.println("TC01- Open Search0111");
//
//
//    		}
//    	}
//}
//
//
//    
//    static AppiumDriver driver;
//
//    private Capabilities cap;
//    private int index;
//
//    
//    @BeforeMethod
//    public void setup2() throws MalformedURLException, InterruptedException  {
//
//        DesiredCapabilities cap = new DesiredCapabilities();
//        URL url = new URL("http://127.0.0.1:4723/wd/hub/");
//        driver = new AndroidDriver(url, cap);
//    	
//    	 DesiredCapabilities cap1 = new DesiredCapabilities();
//    	 
////		cap.setCapability("deviceName", "5SU4BEVW7H9LPZAE");
//	     cap1.setCapability("deviceName", "13793294180004Z");
////		cap.setCapability("deviceName", "13793294180004Z");
////       cap.setCapability("deviceName", "6381e3e");
//       cap1.setCapability("platformName", "Android");
//       cap1.setCapability("platformVersion", "14");
////	    cap.setCapability("platformVersion", "12");
//       cap1.setCapability("appPackage", "com.threesixteen.app");
////       cap.setCapability("appPackage", "com.threesixteen.app.dev");
//       cap1.setCapability("appActivity", "com.threesixteen.app.ui.activities.SplashActivity");
//       cap1.setCapability("autoGrantPermissions", true);
//       cap1.setCapability("ignoreHiddenApiPolicyError", true);
//       cap1.setCapability("noReset", true);
//
//       
//       URL url1 = new URL("http://127.0.0.1:4723/wd/hub/");
//		driver = new AndroidDriver(url1, cap1);
//
//       System.out.println("Application started");
//       Thread.sleep(5000);
//   
//   
//if (isVisibleWithXPath1("//*[contains(@text,'Update')]"))  {
//           
//           driver.navigate().back();
//            System.out.println("Exist from Update");
//            Thread.sleep(1000);
//       }
//
//   }

    
    

	 @Test(priority = 1)
		public void MidtierRecordedstreamNONpro1() throws InterruptedException, MalformedURLException {
			
			OpenSearch();
			Thread.sleep(2000);
			clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
			System.out.println("TC02- Click on search box");
			Thread.sleep(2000);
			(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Ultra OP");
			System.out.println("TC03- Type creator name in search");
			Thread.sleep(2000);
			 driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		   		System.out.println("TC04- Click on ENTER");
		   		Thread.sleep(2000);
			System.out.println("TC04- Click on search suggestion");
			Thread.sleep(2000);
			clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
			System.out.println("TC05- open creator's profile");
	        Thread.sleep(5000);
	        if (isVisibleWithId("com.threesixteen.app:id/replay_tag"))
	        {
	    		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
				System.out.println("TC06- open recorded stream");
	        Thread.sleep(10000);
	        SkipAd();
	        if (isVisibleWithXPath1("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ImageView")) {
	            System.out.println("TF02- AdBlocker detected");
	            Thread.sleep(2000);
	            driver.navigate().back();
	            Thread.sleep(2000);
	            driver.navigate().back();
	            Thread.sleep(2000);

	            // Scroll to end and reopen the recorded stream
	            driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
	            Thread.sleep(1000);
	            clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
	            System.out.println("TF03- open recorded stream again");
		        SkipAd();
    }
	        
			clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.TextView");
			System.out.println("TC07- Mid tier recorded stream can not play for non pro users");
	         Thread.sleep(40000);
		        SkipAd();


	        }
	        
		  else 
			
	    {
	    	driver.findElement(
					AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));	
	        Thread.sleep(2000);
	    	 if (isVisibleWithId("com.threesixteen.app:id/replay_tag"))
	         {
	         clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
	 	   	System.out.println("TC09- open recorded stream");
	        SkipAd();
	 	   if (isVisibleWithXPath1("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ImageView")) {
	            System.out.println("TF02- AdBlocker detected");
	            Thread.sleep(2000);
	            driver.navigate().back();
	            Thread.sleep(2000);
	            driver.navigate().back();
	            Thread.sleep(2000);

	            // Scroll to end and reopen the recorded stream
	            driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
	            Thread.sleep(1000);
	            clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
	            System.out.println("TF03- open recorded stream again");
   }	        SkipAd();

	 	  if (isVisibleWithXPath1("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ImageView")) {
	            System.out.println("TF02- AdBlocker detected");
	            Thread.sleep(2000);
	            driver.navigate().back();
	            Thread.sleep(2000);
	            driver.navigate().back();
	            Thread.sleep(2000);

	            // Scroll to end and reopen the recorded stream
	            driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
	            Thread.sleep(1000);
	            clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
	            System.out.println("TF03- open recorded stream again");
 }	        SkipAd();

	 	 if (isVisibleWithXPath1("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ImageView")) {
	            System.out.println("TF02- AdBlocker detected");
	            Thread.sleep(2000);
	            driver.navigate().back();
	            Thread.sleep(2000);
	            driver.navigate().back();
	            Thread.sleep(2000);

	            // Scroll to end and reopen the recorded stream
	            driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
	            Thread.sleep(1000);
	            clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
	            System.out.println("TF03- open recorded stream again");
		        SkipAd();

}
	 	 if (isVisibleWithXPath1("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ImageView")) {
	            System.out.println("TF02- AdBlocker detected");
	            Thread.sleep(2000);
	            driver.navigate().back();
	            Thread.sleep(2000);
	            driver.navigate().back();
	            Thread.sleep(2000);

	            // Scroll to end and reopen the recorded stream
	            driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
	            Thread.sleep(1000);
	            clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
	            System.out.println("TF03- open recorded stream again");
		        SkipAd();
}
	         Thread.sleep(10000);
	         clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.TextView");
				System.out.println("TC10- Mid tier recorded stream can not play for non pro users");
//		         Thread.sleep(40000);
//		         driver.navigate().back();
//		         Thread.sleep(40000);
//		         clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//		           clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//					System.out.println("TC11-  Mid tier Recorded stream unlocked for non pro users");
//			         Thread.sleep(3000);
		         driver.navigate().back();

	         }
	            Thread.sleep(2000);

	    	 if (isVisibleWithXPath1("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ImageView")) {
		            System.out.println("TF02- AdBlocker detected");
		            Thread.sleep(2000);
		            driver.navigate().back();
		            Thread.sleep(2000);
		            driver.navigate().back();
		            Thread.sleep(2000);

		            // Scroll to end and reopen the recorded stream
		            driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
		            Thread.sleep(1000);
		            clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
		            System.out.println("TF03- open recorded stream again");
			        SkipAd();
	    }
	    }
	 }


	 
	 
	 @Test(priority = 2)
		public void NormalRecordedstreamNONpro2() throws InterruptedException, MalformedURLException {
			
			OpenSearch();

			Thread.sleep(2000);
			clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
			System.out.println("TC02- Click on search box");
			Thread.sleep(2000);
			(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("KrishnaGamer");
			System.out.println("TC03- Type Krishna Gamer in search");
			Thread.sleep(2000);
			 driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		   		System.out.println("TC04- Click on ENTER");
		   		Thread.sleep(2000);	
			clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
			System.out.println("TC05- open Krishna Gamer's profile");
	        Thread.sleep(2000);
	        if (isVisibleWithId("com.threesixteen.app:id/replay_tag"))
	        {
	    		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
				System.out.println("TC06- open recorded stream");
	        Thread.sleep(10000);
	        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
	           clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
				System.out.println("TC07-  Normal Recorded stream is playing for non pro users");
		         Thread.sleep(3000);
	       

	 }
	        
		  else 
			
	    {
	    	driver.findElement(
					AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));	
	        Thread.sleep(2000);
	        Thread.sleep(2000);
	        if (isVisibleWithId("com.threesixteen.app:id/replay_tag"))
	        {
	    		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
				System.out.println("TC08- open recorded stream");
	        Thread.sleep(3000);
	        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
	           clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
				System.out.println("TC09-  Normal Recorded stream is playing for non pro users");
		         Thread.sleep(3000);
	         
	        }
	         }
	    }



	
	 @Test(priority = 3)
		public void ProRecordedstreamNONpro3() throws InterruptedException, MalformedURLException {
			
			OpenSearch();

			Thread.sleep(1000);
			clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
			System.out.println("TC02- Click on search box");
			Thread.sleep(1000);
			(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("LIDOMA ASIA");
			System.out.println("TC03- Type RA Lidoma ASIA in search");
			Thread.sleep(1000);
			 driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		   		System.out.println("TC04- Click on ENTER");
		   		Thread.sleep(1000);	
			clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
			System.out.println("TC05- open Lidoma's profile");
	        Thread.sleep(1000);
	        if (isVisibleWithId("com.threesixteen.app:id/replay_tag"))
	        {
	    		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
				System.out.println("TC06- open recorded stream");
	        Thread.sleep(10000);
	         clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.TextView");
         System.out.println("TC07- Pro Recorded Stream Can not be played for NON pro users");
         Thread.sleep(1000);
	       

	 }
	        
		  else 
			
	    {
	    	driver.findElement(
					AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));	
	        Thread.sleep(1000);
	        if (isVisibleWithId("com.threesixteen.app:id/replay_tag"))
	        {
	    		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
				System.out.println("TC08- open recorded stream");
	        Thread.sleep(3000);
	        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.TextView");
	         System.out.println("TC09- Pro Recorded Stream Can not be played for NON pro users");
	         Thread.sleep(1000);
	        }
	      }
	    }
	
	
	 
	 
	 
	
	
	@AfterMethod
	
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}



