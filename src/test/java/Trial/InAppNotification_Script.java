package Trial;

import io.appium.java_client.AppiumBy;

import org.openqa.selenium.*;
import org.testng.annotations.Test;


public class InAppNotification_Script<MobileElement, Rotatable> extends Functions  {


	
//    public static void clickAndWaitForElementWithXpath1(final String xpath) {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
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
//            
//        };
//        wait.until(condition);
//    }
//
//    public static void clickAndWaitForElementWithId(final String id) {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
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

    
//    public static void OpenNotificationtab() throws InterruptedException {
//    	
//        Thread.sleep(1000);
//    	if (isVisibleWithXPath1("//android.widget.FrameLayout[@content-desc=\"Notifications\"]/android.widget.FrameLayout[2]/android.widget.ImageView"))
//        {
//        	
//    		clickAndWaitForElementWithXpath1("//android.widget.FrameLayout[@content-desc=\"Notifications\"]/android.widget.FrameLayout[2]/android.widget.ImageView");
//            Thread.sleep(1000);
//
//        } 
//    	
//    		if (isVisibleWithXPath1("//android.widget.FrameLayout[@content-desc=\"Notifications\"]/android.widget.FrameLayout[1]/android.widget.TextView"))
//     	{
//    			clickAndWaitForElementWithXpath1("//android.widget.FrameLayout[@content-desc=\"Notifications\"]/android.widget.FrameLayout[1]/android.widget.TextView");
//    	        Thread.sleep(1000);
//
//     	}
//    		else
//    			
//    		{
//    		
//             clickAndWaitForElementWithId("com.threesixteen.app:id/iv_notification");
//             Thread.sleep(1000);
//	
//    		}
//        
//        System.out.println("TC01 - Notification tab opened");
//    }
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
////	     cap1.setCapability("deviceName", "RZ8T907T67Y");
////		cap.setCapability("deviceName", "13793294180004Z");
//       cap.setCapability("deviceName", "6381e3e");
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
//        Thread.sleep(3000);
//   
//   
//
//      
//
////		 clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView");
////		    clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[1]");
////			System.out.println("Gmail Login Done");
//
//	        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button//android."))
//	        {
//	            clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button");
//	            clickAndWaitForElementWithId("com.threesixteen.app:id/btn_close");
////				    	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_neg");
//	            System.out.println("Spinwheel rotate");
//           }
//       if (isVisibleWithId("com.android.permissioncontroller:id/permission_allow_button")) 
//       {
//           clickAndWaitForElementWithId("com.android.permissioncontroller:id/permission_allow_button");
//           System.out.println("Notification permission allowed");
//
//       }
//       if (isVisibleWithXPath1("//*[contains(@text,'Update')]"))  {
//           
//           driver.navigate().back();
//            System.out.println("Exist from Update");
//            Thread.sleep(1000);
//       }
//
//   }
//
//    
//    
   

   
    @Test(priority = 1)
    
    public void InAppNotificationTest1() throws InterruptedException {

         OpenNotificationtab();
            Thread.sleep(1000);
			driver.findElement(By.xpath("//*[contains(@text,'Stream dekhiye aur coins jeetiye')]")).click();
//            clickAndWaitForElementWithXpath1(
//                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]");
        System.out.println("TC02 -Open first Notification from me tab");
        SkipSurvey();
        SkipAd();

        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
        if (isVisibleWithId("com.threesixteen.app:id/iv_volume"))
        {
           clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
           System.out.println("TC03- UnMute the video");
        } 
        else 
        {
           Thread.sleep(700);
           clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
           clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
           System.out.println("TC04- UnMute the video");
        }       
        Thread.sleep(10000);
        driver.navigate().back();
        Thread.sleep(1000);
        SkipCollectCoinBottomSheet();
        clickAndWaitForElementWithId("com.threesixteen.app:id/textViewMarkAllRead");
        System.out.println("TC05 -Mark on All read");
        Thread.sleep(1000);
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(5)"));
        System.out.println("TC06- Me tab scrolled");
        Thread.sleep(1000);

    }
    
    

    @Test(priority = 2)
    public void InAppNotificationUpdatesTab2() throws InterruptedException {

        OpenNotificationtab();
        clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"Updates\"]/android.widget.TextView");
        System.out.println("TC02- Updates tab opened");
        clickAndWaitForElementWithId("com.threesixteen.app:id/imageViewBanner");
        System.out.println("TC10- First banner from Updates tab opened");
        Thread.sleep(1000);
        driver.navigate().back();
        System.out.println("TC11- Back from contest");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_name");
        System.out.println("TC12- Notification title present");

    }
    
    
    @Test(priority = 3)
    public void InAppNotificationActivityTab3() throws InterruptedException {
    	
    	OpenNotificationtab();
        Thread.sleep(2000);
    	if (isVisibleWithXPath1("//android.widget.LinearLayout[@content-desc=\"Activity\"]/android.widget.TextView")) 
    	{
        clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"Activity\"]/android.widget.TextView"); 
        }
    	else
		{ 
    		if( isVisibleWithXPath1("//*[contains(@text,'Activity')]")) 
    		{
    		driver.findElement(By.xpath("//*[contains(@text,'Activity')]")).click();
    		}
    		else
    		{
        		driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Activity\"]")).click();
    		}
		
        System.out.println("TC06- Activity tab opened");
        
        String targetText = "Coins Credited for Task";
        boolean textFound = false;
        int maxScrolls = 2; 

        for (int i = 0; i < maxScrolls && !textFound; i++) {
            try {
                driver.findElement(
               		 AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + targetText + "\"))"));         
                textFound = true;
                System.out.println("TC02- Product description scrolled and found");
            } catch (Exception e) {
                driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
                Thread.sleep(1000); 
            }
        }
        driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
        System.out.println("Clicking on: " + targetText);
        Thread.sleep(2000);
		}
    }
    
    
    
    

    @Test(priority = 4)
    public void InAppNotificationUpdateTab4() throws InterruptedException {
    	
        OpenNotificationtab();
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"Updates\"]");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"New Features\"]/android.widget.TextView");
        System.out.println("TC11- New Features tab opened");
        clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"Announcements\"]/android.widget.TextView");
        System.out.println("TC12- Announcements tab opened");
        driver.findElement(AppiumBy
                .androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(5)"));
        System.out.println("TC13- Page scrolled");
        driver.navigate().back();
        
    }
    
    
    

    
    @Test(priority = 5)
    public void InAppNotificationTab5() throws InterruptedException {

    	OpenNotificationtab();
        Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(@text,'Stream dekhiye aur coins jeetiye')]")).click();
        Thread.sleep(1000);
        System.out.println("TC02 -Open first Notification from me tab");
        Thread.sleep(3000);
        SkipSurvey();
        Thread.sleep(5000);
        SkipAd();
        Thread.sleep(10000);
        driver.navigate().back();
        Thread.sleep(5000);   
        SkipCollectCoinBottomSheet();

        clickAndWaitForElementWithId("com.threesixteen.app:id/imageViewSetting");
        System.out.println("TC15 -Click on setting icon");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
    }


   
    
    
    
    @Test(priority = 6)
    public void InAppNotificationHiostory6() throws InterruptedException {

    	OpenNotificationtab();
        Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(@text,'Stream dekhiye aur coins jeetiye')]")).click();
        Thread.sleep(1000);
        System.out.println("TC02 -Open first Notification from me tab");
        Thread.sleep(10000);
        SkipAd();
        SkipSurvey();
        Thread.sleep(10000);

        driver.navigate().back();
        Thread.sleep(1000);
        SkipCollectCoinBottomSheet();

        clickAndWaitForElementWithId("com.threesixteen.app:id/imageViewHistory");
        System.out.println("TC03-Click on clock icon");     
        Thread.sleep(3000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/imageViewBanner");
        System.out.println("TC04 -Open feed");  
        SkipSurvey();

        SkipAd();
        Thread.sleep(1000);
        if (isVisibleWithId("com.threesixteen.app:id/iv_like")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_like");
            System.out.println("TC01- Reels Opened");
	 }
        else
        {
        	if (isVisibleWithId("om.threesixteen.app:id/iv_live_comments")) {
        	 clickAndWaitForElementWithId("com.threesixteen.app:id/iv_live_comments");
             System.out.println("TC01- Video opened");
             SkipAd();
             Thread.sleep(1000);
        	}
        	else
        	{
        		   Thread.sleep(10000);
        	        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
        	        if (isVisibleWithId("com.threesixteen.app:id/iv_volume"))
        	        {
        	           clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
        	           System.out.println("TCB- UnMute the video");
        	        } 
        	        else 
        	        {
        	           Thread.sleep(10000);
        	           clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
        	           clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
        	           System.out.println("TCC- UnMute the video");
        	        }
        	}
        }
        
    }
	
	
	
    
    
	
	

}



