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
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PullsFiles;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Login_ProUser  extends Functions{


    public static void clickAndWaitForElementWithXpath1(final String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        ExpectedCondition<Boolean> condition = new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver arg0) {
                try {
                    WebElement element = (driver).findElement(By.xpath(xpath));
                    element.click();
                    return true;
                } catch (Exception e) {
                    return false;
                }
            }
        };
        wait.until(condition);
    }


    public static void clickAndWaitForElementWithId(final String id) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        ExpectedCondition<Boolean> condition = new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver arg0) {
                try {
                    WebElement element = (driver).findElement(By.id(id));
//				    	(driver).findElement(null);
                    element.click();
                    return true;
                } catch (Exception e) {
                    return false;
                }
            }
        };
        wait.until(condition);
    }    
    
    public static void MuteRecordedStream() throws InterruptedException
    {
    	if (isVisibleWithId("com.threesixteen.app:id/replay_tag"))
        {
    		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
//			System.out.println("TC06- open recorded stream");
        Thread.sleep(7000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
        if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
           clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//           System.out.println("TC08- UnMute the video");
       } else {
           Thread.sleep(7000);
           clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
           clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//           System.out.println("TC09- UnMute the video");
       }
       

 }
        
	  else 
		
    {
    	driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));	
         clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
	   	System.out.println("TC10- open recorded stream");
        Thread.sleep(7000);
         clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
         if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
            System.out.println("TC12- UnMute the video");
            Thread.sleep(1000);

        } else {
            Thread.sleep(7000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
            System.out.println("TC13- UnMute the video");
            Thread.sleep(1000);
        }
         
         }
        driver.navigate().back();
        Thread.sleep(1000);
        driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));	
        Thread.sleep(1000);
         clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
 	   	System.out.println("TC14- open recorded stream");
        Thread.sleep(7000);
         clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
         if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
            System.out.println("TC16- UnMute the video");
            Thread.sleep(1000);

        } else {
            Thread.sleep(7000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
            System.out.println("TC17- UnMute the video");
            Thread.sleep(1000);
        }
         driver.navigate().back();
         Thread.sleep(1000);
         driver.findElement(
 				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));	
          clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
  	   	System.out.println("TC18- open recorded stream");
         Thread.sleep(7000);
//          clickAndWaitForElementWithId("com.threesixteen.app:id/video_player_view");
//          System.out.println("TC19- recorded stream is working ");
//          Thread.sleep(7000);
          clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
          if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
             clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
             System.out.println("TC20- UnMute the video");
             Thread.sleep(1000);

         } else {
             Thread.sleep(7000);
             clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
             clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
            System.out.println("TC21- UnMute the video");
             Thread.sleep(1000);
         }
          driver.navigate().back();
          Thread.sleep(1000);
          driver.findElement(
  				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));	
           clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
   	   	System.out.println("TC22- open recorded stream");
          Thread.sleep(7000);
//           clickAndWaitForElementWithId("com.threesixteen.app:id/video_player_view");
//           System.out.println("TC23- recorded stream is working ");
//           Thread.sleep(7000);
           clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
           if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
              clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
              System.out.println("TC24- UnMute the video");
              Thread.sleep(1000);

          } else {
              Thread.sleep(7000);
              clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
              clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
              System.out.println("TC25- UnMute the video");
              Thread.sleep(2000);
          }

    }
    
    
    
    public static void ReelTest() throws InterruptedException {
    	
    	
    	 if (isVisibleWithId("com.threesixteen.app:id/iv_like")) {
	            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_like");
	            System.out.println("TC01- Reels Liked");
    	 }
         clickAndWaitForElementWithXpath1("//*[contains(@text,'Follow')]");
   	    System.out.println("TC02- Follow buton present");
    	  clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
  	    System.out.println("TC02A- Volume buton present");
        Thread.sleep(500);
  	    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_reel_title");
	    System.out.println("TC03- Reel keyword present");
        Thread.sleep(500);
  	    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_reels2");
	    System.out.println("TC04- Reel icon present");
        Thread.sleep(500);
	    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_post_date");
	    System.out.println("TC05- Reel views present");
        Thread.sleep(1000);
        driver.navigate().back();
	    Thread.sleep(1000);
	    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_more");
	    System.out.println("TC06- Clicked on Three dots");
	    Thread.sleep(1000);
	    if (isVisibleWithXPath1("//*[contains(@text,'Report')]")) {
        driver.findElement(By.xpath("//*[contains(@text,'Report')]")).click();
        System.out.println("TC07- Clicked on report");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.TextView");
        System.out.println("TC08- select tag inappropriate");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_submit");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_submit");
        System.out.println("TC09- Reel Reported");
        Thread.sleep(1000);
        if (isVisibleWithId("com.threesixteen.app:id/btn_submit"))
        {
        	driver.navigate().back();
            System.out.println("TC10- This reel is already Reported");
        }
    }
    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_comment");
//   clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.LinearLayout[2]/android.widget.ImageView");
    System.out.println("TC11- Opened the comment section.....");
    Thread.sleep(1000);
    if (isVisibleWithId("com.threesixteen.app:id/tv_comment")) {
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
        System.out.println("TC12- clicked comment section.....");
        Thread.sleep(1000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_comment")).sendKeys("wow");
        System.out.println("TC13- Typed wow comment section");
        Thread.sleep(500);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
        System.out.println("TC14- Comment on Reel Done");
        Thread.sleep(500);
        (driver).findElement(By.xpath(
                        "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"))
                .click();
        System.out.println("TC15- Opened the list of likes in reel");
        Thread.sleep(2000);
        (driver).findElement(By.xpath(
                        "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView"))
                .click();
        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_open_profile");
        System.out.println("TC16- Opened user from list of likes in reel");
        Thread.sleep(500);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
        System.out.println("TC17- Back from creators profile");
        Thread.sleep(500);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
        System.out.println("TC18- Existed from creators profile Card");
        Thread.sleep(500);
        (driver).findElement(By.id("com.threesixteen.app:id/iv_close")).click();
        System.out.println("TC19- Existed from comment section");
        Thread.sleep(500);
    } else {
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_comment");
//      clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.LinearLayout[2]/android.widget.ImageView");
        System.out.println("TC20- Opened the comment section.....");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
        System.out.println("TC21- clicked comment section.....");
        Thread.sleep(1000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_comment")).sendKeys("wow");
        System.out.println("TC22- Typed wow comment section");
        Thread.sleep(500);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
        System.out.println("TC23- Comment on Reel Done");
        Thread.sleep(500);
        (driver).findElement(By.xpath(
                        "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"))
                .click();
        System.out.println("TC24- Opened the list of likes in reel");
        Thread.sleep(2000);
        (driver).findElement(By.xpath(
                        "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView"))
                .click();
        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_open_profile");
        System.out.println("TC25- Opened user from list of likes in reel");
        Thread.sleep(500);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
        System.out.println("TC26- Back from creators profile");
        Thread.sleep(500);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
        System.out.println("TC27- Existed from creators profile Card");
        Thread.sleep(500);
        (driver).findElement(By.id("com.threesixteen.app:id/iv_close")).click();
        System.out.println("TC28- Existed from comment section");
        Thread.sleep(500);
    }
    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
    System.out.println("TC29- Creators Profile opened");
    Thread.sleep(500);
    clickAndWaitForElementWithId("com.threesixteen.app:id/btn_open_profile");
    System.out.println("TC30- Creators Profile opened in full view");
    Thread.sleep(500);
    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
    System.out.println("TC31- Back from creators profile");
    Thread.sleep(500);
    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
    System.out.println("TC32- Existed from creators profile Card");
    Thread.sleep(500);
    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_share");
    System.out.println("TC33- Clicked on share icon on reel");
    Thread.sleep(500);
    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_copy_link");
    System.out.println("TC34- share link is copied");
    Thread.sleep(500);
    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_share");
    System.out.println("TC35- clicked on share icon on reel");
    Thread.sleep(500);
    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_download");
    System.out.println("TC36- Clicked on Download button button on reel");
    Thread.sleep(500);
    if (isVisibleWithId("com.threesixteen.app:id/iv_profileImage"))
    {
    	 clickAndWaitForElementWithId("com.threesixteen.app:id/iv_profileImage");
    	    System.out.println("TC37- creator profile image present");
    	    Thread.sleep(1000);
    }
    else
    {
    	 driver.navigate().back();
    	    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_profileImage");
    	    System.out.println("TC37- creator profile image present");
    	    Thread.sleep(1000);
    }
   
}
    
    public static void ExoQualityChange() throws InterruptedException {
    	
   	 Thread.sleep(10000);
   	 clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
	 if (isVisibleWithXPath1("//android.widget.FrameLayout[@content-desc=\"Hide player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[2]"))
	 {  clickAndWaitForElementWithXpath1("//android.widget.FrameLayout[@content-desc=\"Hide player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[2]");
         System.out.println("TC07- Clicked on video player setting");
	 }
	 else
	 {           
    	 Thread.sleep(10000);
   	 clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
   	 clickAndWaitForElementWithXpath1("//android.widget.FrameLayout[@content-desc=\"Hide player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[2]");
        System.out.println("TC08- Clicked on video player setting");
   	 }
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Video Quality')]");
        System.out.println("TC08- clicked on video quality");
        Thread.sleep(1000);
        if (isVisibleWithXPath1("//*[contains(@text,'1080p')]")) {
            clickAndWaitForElementWithXpath1("//*[contains(@text,'1080p')]");
            System.out.println("TC09- changed the video qulaity to 1080p");
            Thread.sleep(1000);
        }

        if (isVisibleWithXPath1("//*[contains(@text,'720p')]")) {
            clickAndWaitForElementWithXpath1("//*[contains(@text,'720p')]");
            System.out.println("TC10- changed the Video qulaity to 720p");
            Thread.sleep(1000);
        }

        if (isVisibleWithXPath1("//*[contains(@text,'480p')]")) {
            clickAndWaitForElementWithXpath1("//*[contains(@text,'480p')]");
            System.out.println("TC11- changed the Video qulaity to 480p");
            Thread.sleep(1000);
        }

        if (isVisibleWithXPath1("//*[contains(@text,'240p')]")) {
            clickAndWaitForElementWithXpath1("//*[contains(@text,'240p')]");
            System.out.println("TC12- changed the video qulaity to 240p");
            Thread.sleep(1000);
        }

        if (isVisibleWithXPath1("//*[contains(@text,'360p')]")) {
            clickAndWaitForElementWithXpath1("//*[contains(@text,'360p')]");
            System.out.println("TC13- changed the Video qulaity to 360p");
            Thread.sleep(1000);
        }

    }

      
    
    
    public static void ExoRotate() throws InterruptedException {
        for (int i = 1; i <= 5; i++) {
            
            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
            Thread.sleep(10000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
            System.out.println("TC" + String.format("%02d", i + 1) + "- video player screen Rotate");
            Thread.sleep(10000);
        }
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
 
    
    public static void PIPSwitch() throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            if (isVisibleWithId("com.threesixteen.app:id/tv_time_and_watching")) {
                ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.HOME));
                Thread.sleep(5000);
            }
            clickAndWaitForElementWithXpath1("//android.widget.TextView[@content-desc=\"Rooter\"]");
            Thread.sleep(5000);
        }
        System.out.println("F--> PIP switch done 10 times");
        Thread.sleep(2000);

    }

    static AppiumDriver driver;
    private Capabilities cap;


    @BeforeMethod
    public void setup() throws MalformedURLException, InterruptedException {

        DesiredCapabilities cap = new DesiredCapabilities();

//		
		cap.setCapability("deviceName", "RZ8T907T67Y");
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
        Thread.sleep(5000);


        if (isVisibleWithId("android:id/button2")) {
            clickAndWaitForElementWithId("android:id/button2");
            System.out.println("Click on close");
           Thread.sleep(1000);
        }
		 clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView");
		    clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView[1]");
	        Thread.sleep(5000);
		    System.out.println("Gmail Login Done");
	      

//			 if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button//android.")) {
//		            clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button");
//		            clickAndWaitForElementWithId("com.threesixteen.app:id/btn_close");
////					    	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_neg");
//		            System.out.println("Spinwheel rotate");
//        }
//			 
//        if (isVisibleWithId("com.android.permissioncontroller:id/permission_allow_button")) {
//            clickAndWaitForElementWithId("com.android.permissioncontroller:id/permission_allow_button");
//            System.out.println("Notification permission allowed");
//        }

//        driver.navigate().back();
		    if (isVisibleWithXPath1("//*[contains(@text,'Update')]"))  {
		         
		           driver.navigate().back();
		            System.out.println("Exist from Update");
		            Thread.sleep(1000);
		       }
		    if (isVisibleWithXPath1("//*[contains(@text,'Spin & Win')]")) 
	        {
	        driver.findElement(By.xpath("//*[contains(@text,'Spin & Win')]")).click();
	        System.out.println("TC06- Click on spin wheel");
	        Thread.sleep(20000);
	        driver.navigate().back();
	        }
    }  
    
    
    
    @Test(priority = 1)
    public void Dummytest01() throws InterruptedException {

//     OpenCentralReeltab();
        Thread.sleep(500);
}


	
	@AfterMethod
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
