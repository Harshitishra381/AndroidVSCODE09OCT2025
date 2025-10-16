package Trial;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;


public class Functions  {
	



	
  public static void clickAndWaitForElementWithXpath1(final String xpath) {
    if (driver == null) {
        System.out.println("Driver is null, cannot click element");
        return;
    }
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    try {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        element.click();
    } catch (Exception e) {
        try {
            WebElement element = driver.findElement(By.xpath(xpath));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        } catch (Exception ex) {
            System.out.println("Failed to click element: " + ex.getMessage());
        }
    }
}

    
    
    
//    public class Example {
//        private WebDriver driver;
//
//        public Example(WebDriver driver) {
//            this.driver = driver;
//        }
//
//        public void clickAndWaitForElementWithXpath(final String xpath) {
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
//            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
//            // Click the element
//            element.click();
//        }
//    }
    
    
    
//    public class Example2 {
//        private WebDriver driver;
//
//        public Example2(WebDriver driver) {
//            this.driver = driver;
//        }
//
//        public void clickAndWaitForElementWithId(final String id) {
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
//            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id(id)));
//
//            // Click the element
//            element.click();
//        }
//    }
    
    

   public static void clickAndWaitForElementWithId(final String id) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    try {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id(id)));
        element.click();
    } catch (Exception e) {
        WebElement element = driver.findElement(By.id(id));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }
}



    public static  boolean isVisibleWithId(final String id) {
          boolean isVisible;
        isVisible = !driver.findElements(By.id(id)).isEmpty();
        return isVisible;
    }

    public static  boolean isVisibleWithXPath1(final String xPath) {
        boolean isVisible;
        isVisible = !driver.findElements(By.xpath(xPath)).isEmpty();
        return isVisible;
    }
    
    

    public  boolean isVisibleWithClass(final String className) {
        return !driver.findElements(By.className(className)).isEmpty();
    }


 public static void OpenLivetStream () throws InterruptedException {
    
 

if (isVisibleWithXPath1("//*[contains(@text,'Following')]")) {
    clickAndWaitForElementWithXpath1("//*[contains(@text,'Following')]");
    System.out.println("TC01 - Following tab opened");
        Thread.sleep(5000);


} else
  {
    clickAndWaitForElementWithXpath1("//*[contains(@text, 'Pro Streams')]");
    // driver.findElement(By.xpath("//*[contains(@text,'Pro Streams')]")).click();
    System.out.println("TC01 - Pro Streams tab opened");
        Thread.sleep(5000);


}

        Thread.sleep(5000);

    clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
    System.out.println("TC02 - First Live session opened");
    Thread.sleep(10000);

if (isVisibleWithXPath1("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ImageView")) {
    System.out.println("⚠️ TCCC - AdBlocker detected");

    driver.navigate().back();
    Thread.sleep(2000);

    if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
    }

    // if (isVisibleWithId("com.threesixteen.app:id/thumbnail")) {
    //     clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
    //     System.out.println(" TC11 - Stream opened from recommendations");
    //     Thread.sleep(5000);
    // } else {
    //     System.out.println("❌ TC11 - Recommendation thumbnail not found.");
    // }
}

Thread.sleep(1000);

 }

    



public static void miniplayertofullplayerSwitch() throws InterruptedException {
     int repeats = 10;
     for (int i = 0; i < repeats; i++) {
         Thread.sleep(1000);
         driver.navigate().back();
         Thread.sleep(1000);
         clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
     }
     System.out.println("F--> " + repeats + " times Mini Player to Full screen done");
     Thread.sleep(2000);
 }
 
 
 public static void PIPSwitch() throws InterruptedException {
     Thread.sleep(1000);
     for (int i = 1; i <= 10; i++) {
         if (isVisibleWithId("com.threesixteen.app:id/tv_time_and_watching")) {
             try {
                 if (driver instanceof AndroidDriver) {
                     ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.HOME));
                 } else {
                     System.out.println("Driver is not an instance of AndroidDriver");
                 }
                 Thread.sleep(1000);
             } catch (Exception e) {
                 System.out.println("Error pressing HOME key or waiting: " + e.getMessage());
             }
         }
         try {
             clickAndWaitForElementWithXpath1("//android.widget.TextView[@content-desc=\"Rooter\"]");
             Thread.sleep(1000);
         } catch (Exception e) {
             System.out.println("Error clicking Rooter icon or waiting: " + e.getMessage());
         }
     }
     System.out.println("F--> PIP switch done 20 times");
     Thread.sleep(1000);
 }
 
 
 
 public static void SendAppInBackground() throws InterruptedException {
     for (int i = 1; i <= 5; i++) {
    	 
             ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.HOME));
             Thread.sleep(3000);
         
         clickAndWaitForElementWithXpath1("//android.widget.TextView[@content-desc=\"Rooter\"]");
         Thread.sleep(3000);
     }
     System.out.println("F--> Background switch done 5 times");
     Thread.sleep(1000);

 }
 
 
 
 
 public static void  OpenVideo() throws InterruptedException {
 
     Thread.sleep(1000);
     if (isVisibleWithXPath1("//*[contains(@text,'Videos')]")) {
          clickAndWaitForElementWithXpath1("//*[contains(@text,'Videos')]");
          System.out.println("TC09- click on videos tab");
          Thread.sleep(5000);
 }
     else
     {
         clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.TextView");
         System.out.println("TC10- click on videos tab");
         Thread.sleep(5000);
    	 
    	 
    	 
     }
        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
          System.out.println("TC10- click on video");
	        SkipSurvey();

//          if (isVisibleWithXPath1("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ImageView"))
//          {
//              System.out.println("TCCC- AdBlocker detected");
//              Thread.sleep(2000);
//              driver.navigate().back();
//              Thread.sleep(2000);
//              clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
//              System.out.println("TC11- Video opened from recomendations ");
//              Thread.sleep(2000);
//          }
//          if (isVisibleWithXPath1("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ImageView"))
//          {
//              System.out.println("TCCC- AdBlocker detected");
//              Thread.sleep(2000);
//              driver.navigate().back();
//              Thread.sleep(2000);
//              clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
//              System.out.println("TC11- Video opened from recomendations ");
//
//              Thread.sleep(1000);    
//          }
//          Thread.sleep(1000);
      }
private static void clickAndWaitForElementWithtext(String string) {
	// TODO Auto-generated method stub
	
}



// 	 else
// 		 
// 	 {
//
// 	
// 	String targetId = "com.threesixteen.app:id/video_timer"; 
// 	boolean idFound = false;
// 	int maxScrolls = 10; 
//
// 	for (int i = 0; i < maxScrolls && !idFound; i++) {
// 	    try {
// 	        driver.findElement(
// 	            AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().resourceId(\"" + targetId + "\"))"));
// 	        idFound = true;
// 	        System.out.println("TC - Video found");
// 	    } catch (Exception e) {
// 	        driver.findElement(
// 	            AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
// 	        Thread.sleep(1000); 
// 	    }
// 	}
// 	if (idFound) {
// 	    System.out.println("Opened video");
// 	    driver.findElement(AppiumBy.id(targetId)).click(); 
// 	} else {
// 	    System.out.println("Element with resource ID: " + targetId + " not found after " + maxScrolls + " scrolls");
// 	}
// 	Thread.sleep(1000); 
//
// 
// 	 }

 
 

 
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

 
 
 public static void attemptUnmute() throws InterruptedException {
	    for (int i = 1; i <= 6; i++) {
	        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
	        if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
	            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
	            System.out.println("Unmute Attempt " + i);
	            SkipCollectCoinBottomSheet();
	            break;
	        }
            else
            {
                throw new InterruptedException("Volume icon not found, cannot unmute.");
            }
	    }
	}
 
 
 
 public static	void openAndHandleStream(String tag) throws InterruptedException {
		
	    if (isVisibleWithId("com.threesixteen.app:id/replay_tag")) {
	        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
	        System.out.println(tag + " - Opened recorded stream ");
	        SkipSurvey();

	        Thread.sleep(7000);

	        // AdBlocker Check
	        if (isVisibleWithXPath1("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ImageView")) {
	            System.out.println(tag + " - AdBlocker detected");
	            Thread.sleep(2000);
	            driver.navigate().back();
	            Thread.sleep(2000);
	            driver.navigate().back();
	        } else {
	            attemptUnmute();
	        }
	    }
	 
	    
	}
 
 
// public static void MuteRecordedStream() throws InterruptedException {
	 
	 
	

		// Helper method to open stream and handle playback
	public static void MuteRecordedStream(String tag) throws InterruptedException {
	
		//     if (isVisibleWithId("com.threesixteen.app:id/replay_tag")) {
		//         clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
		//         System.out.println(tag + " - Opened recorded stream 1st ");
		//         SkipSurvey();
		//         Thread.sleep(7000);

		//         // AdBlocker Check
		//         if (isVisibleWithXPath1("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ImageView")) {
		//             System.out.println(tag + " - AdBlocker detected");
		//             Thread.sleep(2000);
		//             driver.navigate().back();
		//             Thread.sleep(2000);
		//             driver.navigate().back();
		//         } else {
		//             attemptUnmute();
		//         }
		//     }
		

		// // First attempt to open stream
		// if (isVisibleWithId("com.threesixteen.app:id/replay_tag")) {
		//     openAndHandleStream("TF01");
		// } else {
		//     driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
		//     Thread.sleep(1000);
		//     openAndHandleStream("TF05");
	    //     SkipSurvey();

		// }

		// // Back, scroll and second attempt
		// Thread.sleep(5000);
		// driver.navigate().back();
		// Thread.sleep(2000);
		// driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
		// Thread.sleep(2000);
		// openAndHandleStream("TF13");


        // Thread.sleep(5000);
		// driver.navigate().back();
		// Thread.sleep(2000);
		// driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
		// Thread.sleep(2000);
		// openAndHandleStream("TF14");


		// // Third attempt to open the stream
		// Thread.sleep(1000);
		// driver.navigate().back();
		// Thread.sleep(1000);
		// driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
		// Thread.sleep(1000);
		// if (isVisibleWithId("com.threesixteen.app:id/replay_tag")) {
		//     openAndHandleStream("TF15");
		// } else {
		//     clickAndWaitForElementWithId("com.threesixteen.app:id/iv_watch_n_view_lottie");
		//     System.out.println("TF16 - replay_tag not found for the 3rd stream");
		// }


    int failureCount = 0;

    try {
        if (isVisibleWithId("com.threesixteen.app:id/replay_tag")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
            System.out.println(tag + " - Opened recorded stream 1st ");
            SkipSurvey();
            Thread.sleep(7000);

            // AdBlocker Check
            if (isVisibleWithXPath1("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ImageView")) {
                System.out.println(tag + " - AdBlocker detected");
                Thread.sleep(2000);
                driver.navigate().back();
                Thread.sleep(2000);
                driver.navigate().back();
            } else {
                attemptUnmute();
            }
        }
    } catch (Exception e) {
        System.out.println(tag + " - Pre-check stream (non-counted) failed: " + e.getMessage());
    }

    // Stream 1 - TF01 or TF05
    try {
                    System.out.println("Attempting to open 2nd  stream (TF01/TF05)");
                             Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(2000);
        if (isVisibleWithId("com.threesixteen.app:id/replay_tag")) {
            openAndHandleStream("TF01");
        } else {
            driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
            Thread.sleep(1000);
            openAndHandleStream("TF05");
            SkipSurvey();
        }
    } catch (Exception e) {
        System.out.println("TF01/TF05 - Stream 1 failed: " + e.getMessage());
        failureCount++;
    }

    // Stream 2 - TF13
    try {
                            System.out.println("Attempting to open 3rd  stream (TF133)");

        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(AppiumBy.androidUIAutomator(
            "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));
        Thread.sleep(2000);
        openAndHandleStream("TF13");
    } catch (Exception e) {
        System.out.println("TF13 - Stream 2 failed: " + e.getMessage());
        failureCount++;
    }

    // Stream 3 - TF14
    try {
                                    System.out.println("Attempting to open 4th  stream (TF14)");

        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(AppiumBy.androidUIAutomator(
            "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
        Thread.sleep(2000);
        openAndHandleStream("TF14");
    } catch (Exception e) {
        System.out.println("TF14 - Stream 3 failed: " + e.getMessage());
        failureCount++;
    }

    // Stream 4 - TF15 or TF16
    try {
                                            System.out.println("Attempting to open 5th  stream (TF14)");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.findElement(AppiumBy.androidUIAutomator(
            "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(4)"));
        Thread.sleep(1000);
        if (isVisibleWithId("com.threesixteen.app:id/replay_tag")) {
            openAndHandleStream("TF15");
        } else {
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_watch_n_view_lottie");
            System.out.println("TF16 - replay_tag not found for the 4th stream");
        }
    } catch (Exception e) {
        System.out.println("TF15/TF16 - Stream 4 failed: " + e.getMessage());
        failureCount++;
    }

    // Final evaluation
    if (failureCount >= 2) {
        throw new AssertionError("Test failed: " + failureCount + " out of 4 stream attempts failed.");
    } else {
        System.out.println("Test passed: Only " + failureCount + " stream(s) failed.");
    }
}

	 
	
	 
	 
	 
	 
	 
	 

//	    Thread.sleep(1000);
//
//	    // Check if replay_tag is visible
//	    if (isVisibleWithId("com.threesixteen.app:id/replay_tag")) {
//	        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
//	        System.out.println("TF01- open recorded stream 1st");
//	        Thread.sleep(7000);
//
//	        // Check if AdBlocker is detected
//	        if (isVisibleWithXPath1("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ImageView")) {
//	            System.out.println("TF02- AdBlocker detected");
//	            Thread.sleep(2000);
//	            driver.navigate().back();
//	            Thread.sleep(2000);
//	            driver.navigate().back();
//	            Thread.sleep(2000);
//
//	            // Scroll to end and reopen the recorded stream
//	            driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
//	            Thread.sleep(1000);
//	            clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
//	            System.out.println("TF03- open recorded stream again");
//	        } else {
//	            // Attempt to unmute the video
//	            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//	            
//	            // Check if the volume icon is visible
//	            if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
//	                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//	                System.out.println("TF04- UnMute the video");
//	            } else {
//	                Thread.sleep(700);
//	                clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//	                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//	                System.out.println("TF04A- UnMute the video");
//	            }
//	        }
//	    } else {
//	        // Scroll and try to find replay_tag again
//	        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
//	        Thread.sleep(1000);
//	        
//	        // If replay_tag is visible, open the recorded stream
//	        if (isVisibleWithId("com.threesixteen.app:id/replay_tag")) {
//	            clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
//	            System.out.println("TF05- open recorded stream 1st");
//	            Thread.sleep(7000);
//
//	            // Check for AdBlocker and handle it
//	            if (isVisibleWithXPath1("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ImageView")) {
//	                System.out.println("TF06- AdBlocker detected");
//	                Thread.sleep(2000);
//	                driver.navigate().back();
//	                Thread.sleep(2000);
//	                driver.navigate().back();
//	                Thread.sleep(2000);
//	            } else {
//	                clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//	                
//	                // Check if the volume icon is visible
//	                if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
//	                    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//	                    System.out.println("TF07- UnMute the video");
//	                } else {
//		                Thread.sleep(2000);
//	                    clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//	                    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//	                    System.out.println("TF08- UnMute the video");
//	                }
//	                Thread.sleep(2000);
//	                clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//	                if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
//	                    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//	                    System.out.println("TF09- UnMute the video");
//	                }
//	                else {
//		                Thread.sleep(2000);
//	                    clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//	                    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//	                    System.out.println("TF10- UnMute the video");
//	                }
//	                Thread.sleep(2000);
//	                clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//	                if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
//	                    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//	                    System.out.println("TF11- UnMute the video");
//	                }
//	                else {
//		                Thread.sleep(2000);	               
//		                clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//	                    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//	                    System.out.println("TF12- UnMute the video");
//	                }
//	            }
//	        }
//	    }
//        Thread.sleep(5000);
//
//	    // Scroll to end, check for replay_tag again and reopen the stream
//        Thread.sleep(2000);
//	    driver.navigate().back();
//        Thread.sleep(2000);
//	    driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
//        Thread.sleep(2000);
//	    
//	    if (isVisibleWithId("com.threesixteen.app:id/replay_tag")) {
//	        Thread.sleep(2000);
//	        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
//	        System.out.println("TF13- open recorded stream 2nd");
//	        Thread.sleep(7000);
//	        
//	        if (isVisibleWithXPath1("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ImageView")) {
//	            System.out.println("TF14- AdBlocker detected");
//	            Thread.sleep(2000);
//	            driver.navigate().back();
//	            Thread.sleep(2000);
//	            driver.navigate().back();
//	        } else {
//	            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//	            
//	            // Check if the volume icon is visible
//	            if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
//	                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//	                System.out.println("TF15- UnMute the video");
//	            } else {
//	                Thread.sleep(700);
//	                clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//	                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//	                System.out.println("TF16- UnMute the video");
//	                clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//		            
//		            // Check if the volume icon is visible
//		            if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
//		                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//		                System.out.println("TF17- UnMute the video");
//		            } else {
//		                Thread.sleep(700);
//		                clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//		                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//		                System.out.println("TF18- UnMute the video");
//		                clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//			            
//			            // Check if the volume icon is visible
//			            if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
//			                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//			                System.out.println("TF19- UnMute the video");
//			            } else {
//			                Thread.sleep(700);
//			                clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//			                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//			                System.out.println("TF20- UnMute the video");
//			                clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//				            
//				            // Check if the volume icon is visible
//				            if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
//				                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//				                System.out.println("TF21- UnMute the video");
//				            } else {
//				                Thread.sleep(700);
//				                clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//				                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//				                System.out.println("TF22- UnMute the video");
//				                clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//					            
//					            // Check if the volume icon is visible
//					            if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
//					                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//					                System.out.println("TF23- UnMute the video");
//					            } else {
//					                Thread.sleep(700);
//					                clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//					                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//					                System.out.println("TF24- UnMute the video");
//					            
//					            }
//				            }
//			            }
//		            }
//	            }
//	        }
//	    }
//
//	    // Final scroll and stream open check
//	    driver.navigate().back();
//	    Thread.sleep(1000);
//	    driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
//	    Thread.sleep(1000);
//
//	    // Open the 3rd stream
//	    if (isVisibleWithId("com.threesixteen.app:id/replay_tag")) {
//	        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
//	        System.out.println("TF25- open recorded stream 3rd");
//	        Thread.sleep(7000);
//	        
//	        if (isVisibleWithXPath1("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ImageView")) {
//	            System.out.println("TF26- AdBlocker detected");
//	            Thread.sleep(2000);
//	            driver.navigate().back();
//	            Thread.sleep(2000);
//	            driver.navigate().back();
//	        } else {
//	            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//	            
//	            // Check if the volume icon is visible
//	            if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
//	                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//	                System.out.println("TF27- UnMute the video");
//	            } else {
//	                Thread.sleep(700);
//	                clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//	                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//	                System.out.println("TF28- UnMute the video");
//	            
//                 clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//	            
//	            // Check if the volume icon is visible
//	            if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
//	                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//	                System.out.println("TF29- UnMute the video");
//	            } else {
//	                Thread.sleep(700);
//	                clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//	                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//	                System.out.println("TF30- UnMute the video");
//	            }
// clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//	            
//	            // Check if the volume icon is visible
//	            if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
//	                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//	                System.out.println("TF31- UnMute the video");
//	            } else {
//	                Thread.sleep(700);
//	                clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//	                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//	                System.out.println("TF32- UnMute the video");
//	            }
//                  clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//	            
//	            // Check if the volume icon is visible
//	            if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
//	                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//	                System.out.println("TF33- UnMute the video");
//	            } else {
//	                Thread.sleep(700);
//	                clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//	                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//	                System.out.println("TF34- UnMute the video");
//	            }
//                clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
// 	            
//	            // Check if the volume icon is visible
//	            if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
//	                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//	                System.out.println("TF35- UnMute the video");
//	            } else {
//	                Thread.sleep(700);
//	                clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//	                clickAndWaitForElementWithId("com.threesixteen.app:id/PlayerPlayPause");
//	                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//	                System.out.println("TF36- UnMute the video");
//	            }
//	            
//	        }
//	        }
//	    } else {
//	        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_watch_n_view_lottie");
//	        System.out.println("TF37- replay_tag not found for the 3rd stream");
//	    }


 public static void SkipSurvey() throws InterruptedException {
	 
	 Thread.sleep(1000);

//	 if (isVisibleWithXPath1("com.threesixteen.app:id/exit_button")) {
//	     System.out.println("Survey detected");
//	     Thread.sleep(2000);
//	     clickAndWaitForElementWithId("com.threesixteen.app:id/exit_button");
//	     Thread.sleep(2000);
//	     System.out.println("Survey closed");
//	 } else {
//	     System.out.println("Survey not found");
//	 }

 }
 
 
 public static void OpenRecommendedFeed() throws InterruptedException {
 	
 	
 
 	 clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
 	SkipSurvey();
      Thread.sleep(1000);
      if (isVisibleWithXPath1("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ImageView"))
      {
          System.out.println("TF01- AdBlocker detected");
          Thread.sleep(1000);
          driver.navigate().back();
          Thread.sleep(1000);

      }
      if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
          clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close"); }
      Thread.sleep(1000);
      clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
      System.out.println("TF02- Stream opened from recomendations ");
      SkipSurvey();
      Thread.sleep(1000);
      if (isVisibleWithXPath1("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ImageView"))
      {
          System.out.println("TF03- AdBlocker detected");
          Thread.sleep(1000);
          driver.navigate().back();
          Thread.sleep(1000);
      }
      if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
          clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close"); }
      clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
      System.out.println("TF04- Stream opened from recomendations ");
      SkipSurvey();
      if (isVisibleWithXPath1("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ImageView"))
      {
          System.out.println("TF05- AdBlocker detected");
          Thread.sleep(1000);
          driver.navigate().back();
          Thread.sleep(1000);
         
      }
      if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
          clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close"); }
      clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
      SkipSurvey();
      System.out.println("TF06- Stream opened from recomendations ");
      Thread.sleep(2000);
      if (isVisibleWithXPath1("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ImageView"))
      {
          System.out.println("TF07- AdBlocker detected");
          Thread.sleep(1000);
          driver.navigate().back();
          Thread.sleep(1000);
      }
      if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
          clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close"); }
      clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
      System.out.println("TF08- Stream opened from recomendations ");
      SkipSurvey();
      Thread.sleep(2000);
      if (isVisibleWithXPath1("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ImageView"))
      {
          System.out.println("TF09- AdBlocker detected");
          Thread.sleep(1000);
          driver.navigate().back();
          Thread.sleep(1000);
          
      }
      if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
          clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close"); }
      clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
      System.out.println("TF10- Stream opened from recomendations ");
      SkipSurvey();
      Thread.sleep(2000);
      if (isVisibleWithXPath1("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ImageView"))
      {
          System.out.println("TF11- AdBlocker detected");
          Thread.sleep(1000);
          driver.navigate().back();
          Thread.sleep(1000);
         
      }
      if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
          clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close"); }
      clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
      System.out.println("TF12- Stream opened from recomendations ");
      SkipSurvey();
      Thread.sleep(2000);
      if (isVisibleWithXPath1("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ImageView"))
      {
          System.out.println("TF13- AdBlocker detected");
          Thread.sleep(1000);
          driver.navigate().back();
          Thread.sleep(1000);
          
      }
      if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
          clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close"); }
      clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
      System.out.println("TF14- Stream opened from recomendations ");
      SkipSurvey();
      Thread.sleep(2000);
      if (isVisibleWithXPath1("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ImageView"))
      {
          System.out.println("TF15- AdBlocker detected");
          Thread.sleep(1000);
          driver.navigate().back();
          Thread.sleep(1000);
          
      }
      if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
          clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close"); }
      clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
      System.out.println("TF16- Stream opened from recomendations ");
      SkipSurvey();
      Thread.sleep(2000);
      if (isVisibleWithXPath1("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ImageView"))
      {
          System.out.println("TF18- AdBlocker detected");
          Thread.sleep(1000);
          driver.navigate().back();
          Thread.sleep(1000);
  
      }
      if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
          clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close"); }
      System.out.println("TF18-> Open Recommended Feed 10 times");
      SkipSurvey();
      Thread.sleep(1000);

      
 }
 
 

 
 
public static void TabSwitch() throws InterruptedException {
                            Thread.sleep(2000);

    for (int i = 1; i <= 5; i++) {
                    SkipCollectCoinBottomSheet();

       
            if (isVisibleWithXPath1("//android.view.View[@content-desc=\"Reels\"]")) {
                clickAndWaitForElementWithXpath1("//android.view.View[@content-desc=\"Reels\"]");
                System.out.println("reel tab clicked");
            }
                        Thread.sleep(2000);

            SkipCollectCoinBottomSheet();
            if (isVisibleWithXPath1("//android.view.View[@content-desc=\"Rewards\"]")) {
                clickAndWaitForElementWithXpath1("//android.view.View[@content-desc=\"Rewards\"]");
                System.out.println("reward tab clicked");
            }
                        Thread.sleep(2000);

            SkipCollectCoinBottomSheet();
            
            if (isVisibleWithXPath1("//android.view.View[@content-desc=\"Home\"]")) {
                clickAndWaitForElementWithXpath1("//android.view.View[@content-desc=\"Home\"]");
                System.out.println("home tab clicked");
            }

                        Thread.sleep(2000);
                        SkipCollectCoinBottomSheet();

            if (isVisibleWithXPath1("//android.view.View[@content-desc=\"Explore\"]")) {
                clickAndWaitForElementWithXpath1("//android.view.View[@content-desc=\"Explore\"]");
                System.out.println("explore tab clicked");
            }

                        Thread.sleep(2000);
                                SkipCollectCoinBottomSheet();
     System.out.println("F--> Simplified Tabs Switch Done");

        }
    
} 






public static void SkipCollectCoinBottomSheet() throws InterruptedException {
	
	
    Thread.sleep(2000);


	if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView[1]"))
    {
        Thread.sleep(2000);
       clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView[1]");
       System.out.println("TF00- Removed collect pending coin bottom sheet");
    } 
    Thread.sleep(1000);

	
	 if (isVisibleWithXPath1("//*[contains(@text,'Continue Watching')]")) {
	        Thread.sleep(1000);

     	clickAndWaitForElementWithXpath1("//*[contains(@text,'Continue Watching')]");
        System.out.println("TF00- clicked on conitnue watching ");

     } 
	
	
	
	
}

public static void OpenTaskPage() {
	
	if (isVisibleWithXPath1("//android.view.View[@content-desc=\"Rewards\"]")) {
    clickAndWaitForElementWithXpath1(
    		"//android.view.View[@content-desc=\"Rewards\"]");
	  System.out.println("TC01- task page opened");
	}
	else
	{
		if (isVisibleWithXPath1("//android.widget.FrameLayout[@content-desc=\"Win Coins\"]"))
		{
			clickAndWaitForElementWithXpath1(
        		"//android.widget.FrameLayout[@content-desc=\"Win Coins\"]");
		}
	
	else
	{
   		driver.findElement(By.xpath("//*[contains(@text,'Rewards')]")).click();

	}
	
	  System.out.println("TC01- task page opened");

	}
}



public static void OpenHomePage() {
	
	if (isVisibleWithXPath1("//android.view.View[@content-desc=\"Home\"]")) {
		 clickAndWaitForElementWithXpath1(
		            "//android.view.View[@content-desc=\"Home\"]");
	}
	else
	{
		clickAndWaitForElementWithXpath1(
	            "//android.widget.FrameLayout[@content-desc=\"Home\"]");
	}
	
}


public static void OpenExplorePage() {
	
	if (isVisibleWithXPath1("//android.view.View[@content-desc=\"Explore\"]")) {
		 clickAndWaitForElementWithXpath1(
		            "//android.view.View[@content-desc=\"Explore\"]");
	}
	else
	{
		clickAndWaitForElementWithXpath1(
	            "//android.widget.FrameLayout[@content-desc=\"Explore\"]");
	}
	
}

public static void OpenCentralReeltab( ) {
	
	if (isVisibleWithXPath1("//android.view.View[@content-desc=\"Reels\"]")) {
	 clickAndWaitForElementWithXpath1(
	            "//android.view.View[@content-desc=\"Reels\"]");
}
else
{
	 clickAndWaitForElementWithXpath1(
	            "//android.widget.FrameLayout[@content-desc=\"Reels\"]");
}
	  System.out.println("TC01- Central Reel tab opened");

	 	 
	
}


public static void ExoRotate() throws InterruptedException {
  for (int i = 1; i <= 2; i++) {
  	
      Thread.sleep(20000);
      clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
      if (isVisibleWithId("com.threesixteen.app:id/iv_fs"))
      {
          clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
      }
      else
      {
          Thread.sleep(5000);
      clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
      }
      Thread.sleep(20000);
	    clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
     clickAndWaitForElementWithXpath1("//[@content-desc=\"Play\"]");
	    clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
      if (isVisibleWithId("com.threesixteen.app:id/iv_fs"))
      {
          clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
      }
      else
      {
          Thread.sleep(5000);
      clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
      }
      System.out.println("TC" + String.format("%02d", i + 1) + "- Exo player screen Rotate");
      Thread.sleep(5000);
  }
}
 
 
public static void OpenSearch() throws InterruptedException {
	

	

			clickAndWaitForElementWithXpath1("//android.view.View[@content-desc=\"Explore\"]");
			  Thread.sleep(1000);		

				clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ImageView");
				Thread.sleep(2000);
				    System.out.println("TC0B- open serach from explore page");

		}
	
	

 
 
public static void OpenSideNav() throws InterruptedException { 
    

	    clickAndWaitForElementWithId("com.threesixteen.app:id/layout_nav_profile");
	    System.out.println("TC0B- open side nav from New homepage");
	}
    






public static void OpenNotificationtab() throws InterruptedException {
	
    Thread.sleep(1000);
	if (isVisibleWithXPath1("//android.widget.FrameLayout[@content-desc=\"Notifications\"]/android.widget.FrameLayout[2]/android.widget.ImageView"))
    {
    	
		clickAndWaitForElementWithXpath1("//android.widget.FrameLayout[@content-desc=\"Notifications\"]/android.widget.FrameLayout[2]/android.widget.ImageView");
        Thread.sleep(1000);

    } 
	
		if (isVisibleWithXPath1("//android.widget.FrameLayout[@content-desc=\"Notifications\"]/android.widget.FrameLayout[1]/android.widget.TextView"))
 	{
			clickAndWaitForElementWithXpath1("//android.widget.FrameLayout[@content-desc=\"Notifications\"]/android.widget.FrameLayout[1]/android.widget.TextView");
	        Thread.sleep(1000);

 	}
		else
			
		{
		
         clickAndWaitForElementWithId("com.threesixteen.app:id/iv_notification");
         Thread.sleep(1000);

		}
    
        System.out.println("TC01 - Notification tab opened");
}
 
 
 
public void TestShareCount() throws InterruptedException {
    
    WebElement element = driver.findElement(By.id("com.threesixteen.app:id/tv_num_shares"));
    String initialShareCount = element.getText();
    System.out.println("TC03- Initial share count is " + initialShareCount);
    Thread.sleep(2000);

    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post_whatsapp");
    System.out.println("TC04- Clicked on share button");
    Thread.sleep(5000);
    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_more");
    System.out.println("TC05- Clicked on More button");
    Thread.sleep(5000);
    driver.navigate().back();
    Thread.sleep(5000);

    WebElement element1 = driver.findElement(By.id("com.threesixteen.app:id/tv_num_shares"));
    String updatedShareCount = element1.getText();
    System.out.println("TC06- Updated share count is " + updatedShareCount);
    Thread.sleep(2000);


    int difference = Integer.parseInt(updatedShareCount) - Integer.parseInt(initialShareCount);
    Thread.sleep(2000);

    if (difference == 1) 
    {
    	
   
         Thread.sleep(30000);
        System.out.println("Difference between updated share count and initial share count is 1");
    clickAndWaitForElementWithId("com.threesixteen.app:id/layout_comment");
    System.out.println("TC07- opened stream");
    Thread.sleep(10000);
    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
    System.out.println("TC08- Exist from Live chat");
    Thread.sleep(1000);
    
   
    
    WebElement element2 = driver.findElement(By.id("com.threesixteen.app:id/tv_num_shares"));
    String initialShareCount11 = element2.getText();
    System.out.println("TC09- Initial share count is " + initialShareCount11);
    Thread.sleep(2000);
    
    int difference1 = Integer.parseInt(updatedShareCount) - Integer.parseInt(initialShareCount11);
    Thread.sleep(2000);
    if (difference1 == 0) {
    	

    System.out.println("Difference between internal share count and external share count is 0");    
    clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.ImageView");
    System.out.println("TC10- Clicked on share button");
    Thread.sleep(5000);
    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_more");
    System.out.println("TC11- Clicked on More button");
    Thread.sleep(5000);
    driver.navigate().back();
    Thread.sleep(15000);

    WebElement element111 = driver.findElement(By.id("com.threesixteen.app:id/tv_num_shares"));
    String updatedShareCount1 = element111.getText();
    System.out.println("TC12- Updated share count is " + updatedShareCount1);
    Thread.sleep(2000);


    // Check if the difference between updated share count and initial share count is 1
    int difference11 = Integer.parseInt(updatedShareCount1) - Integer.parseInt(initialShareCount11);
    Thread.sleep(2000);

    if (difference11 == 1) {
        System.out.println("Share Count is Working fine for Live stream");
    } 
    }
    
    else
    {
        clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
        System.out.println("Share count count mismatched ");
    }
   }
}    
    
    
 
 
 




public static void ReelTest() throws InterruptedException {
	
	CheckReelProgress();

	 if (isVisibleWithId("com.threesixteen.app:id/iv_like")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_like");
            System.out.println("TC01- Reels Liked");
            Thread.sleep(2000);
	 }
     if(isVisibleWithXPath1("//*[contains(@text,'Follow')]"))
     {
	     System.out.println("TC02- Follow buton present");
         Thread.sleep(2000);
	  clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
	     System.out.println("TC03- Volume buton present");
         Thread.sleep(2000);
     }
     else
     {  	  
    	 System.out.println("TC04- You already followed this creator ");
    	 clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
   	    System.out.println("TC05- Volume buton present");
     }
	    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_reel_title");
    System.out.println("TC06- Reel keyword present");
    Thread.sleep(2000);
	    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_reels2");
    System.out.println("TC07- Reel icon present");
    Thread.sleep(2000);
    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_post_date");
    System.out.println("TC08- Reel views present");
    Thread.sleep(2000);
    driver.navigate().back();
    Thread.sleep(2000);
    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_more");
    System.out.println("TC09- Clicked on Three dots");
    Thread.sleep(2000);
    if (isVisibleWithXPath1("//*[contains(@text,'Report')]")) {
    driver.findElement(By.xpath("//*[contains(@text,'Report')]")).click();
    System.out.println("TC10- Clicked on report");
    Thread.sleep(2000);
    clickAndWaitForElementWithXpath1(
            "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.TextView");
    System.out.println("TC11- select tag inappropriate");
    Thread.sleep(2000);
    clickAndWaitForElementWithId("com.threesixteen.app:id/btn_submit");
    Thread.sleep(2000);
    clickAndWaitForElementWithXpath1("//*[contains(@text,'Done')]");
    System.out.println("TC12- Reel Reported");
    Thread.sleep(2000);
    if (isVisibleWithId("com.threesixteen.app:id/btn_submit"))
    {
        Thread.sleep(2000);
    	driver.navigate().back();
        Thread.sleep(2000);
        System.out.println("TC13- This reel is already Reported");
    }
}
    Thread.sleep(2000);
 clickAndWaitForElementWithId("com.threesixteen.app:id/iv_comment");
System.out.println("TC14- Opened the comment section.....");
Thread.sleep(2000);
if (isVisibleWithId("com.threesixteen.app:id/tv_comment")) {
    Thread.sleep(2000);
    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
    System.out.println("TC15- clicked comment section.....");
    Thread.sleep(2000);
    (driver).findElement(By.id("com.threesixteen.app:id/et_comment")).sendKeys("wow");
    System.out.println("TC16- Typed wow comment section");
    Thread.sleep(2000);
    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
    System.out.println("TC17- Comment on Reel Done");
    Thread.sleep(2000);
    (driver).findElement(By.xpath(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"))
            .click();
    System.out.println("TC18- Opened the list of likes in reel");
    Thread.sleep(2000);
    if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView"))
     {(driver).findElement(By.xpath(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView"))
            .click();
     }
    Thread.sleep(2000);
    if (isVisibleWithId("com.threesixteen.app:id/btn_open_profile")) {
        Thread.sleep(2000);
    clickAndWaitForElementWithId("com.threesixteen.app:id/btn_open_profile");
    System.out.println("TC19- Opened user from list of likes in reel");
    Thread.sleep(2000);
    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
    System.out.println("TC20- Back from creators profile");
    Thread.sleep(2000);
    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
    System.out.println("TC21- Existed from creators profile Card");
    Thread.sleep(2000);
    }
    if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
        Thread.sleep(2000);
    (driver).findElement(By.id("com.threesixteen.app:id/iv_close")).click();
    System.out.println("TC22- Existed from comment section"); 
} 
}

else 
{
    Thread.sleep(2000);
    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_comment");
    System.out.println("TC22- Opened the comment section.....");
    Thread.sleep(2000);
    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
    System.out.println("TC23- clicked comment section.....");
    Thread.sleep(2000);
    (driver).findElement(By.id("com.threesixteen.app:id/et_comment")).sendKeys("wow");
    System.out.println("TC24- Typed wow comment section");
    Thread.sleep(2000);
    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
    System.out.println("TC25- Comment on Reel Done");
    Thread.sleep(2000);
    (driver).findElement(By.xpath(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"))
            .click();
    System.out.println("TC26- Opened the list of likes in reel");
    Thread.sleep(2000);
    (driver).findElement(By.xpath(
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView"))
    .click();
    Thread.sleep(2000);
    clickAndWaitForElementWithId("com.threesixteen.app:id/btn_open_profile");
    System.out.println("TC27- Opened user from list of likes in reel");
    Thread.sleep(2000);
    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
    System.out.println("TC28- Back from creators profile");
    Thread.sleep(2000);
    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
    System.out.println("TC29- Existed from creators profile Card");
    Thread.sleep(2000);
    if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
        Thread.sleep(2000);
        (driver).findElement(By.id("com.threesixteen.app:id/iv_close")).click();
        System.out.println("TC30- Existed from comment section"); 
}

Thread.sleep(2000);
if (isVisibleWithId("com.threesixteen.app:id/tv_name")) {
clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
System.out.println("TC31- Creators Profile opened");
Thread.sleep(2000);
}
else
{
    Thread.sleep(2000);
    driver.navigate().back();
    Thread.sleep(2000);
    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
    System.out.println("TC31A- Creators Profile opened");
    Thread.sleep(2000);

}
clickAndWaitForElementWithId("com.threesixteen.app:id/btn_open_profile");
System.out.println("TC32- Creators Profile opened in full view");
Thread.sleep(2000);
clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
System.out.println("TC33- Back from creators profile");
Thread.sleep(2000);
if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
    Thread.sleep(2000);
clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");    
Thread.sleep(2000);
System.out.println("TC34- Existed from creators profile Card"); }
if (isVisibleWithId("com.threesixteen.app:id/iv_share"))
{
    Thread.sleep(2000);

clickAndWaitForElementWithId("com.threesixteen.app:id/iv_share");
System.out.println("TC35- Clicked on share icon on reel");
}
else
{
    Thread.sleep(2000);
	driver.navigate().back();
    Thread.sleep(2000);
	 clickAndWaitForElementWithId("com.threesixteen.app:id/iv_share");
	    System.out.println("TC35- Clicked on share icon on reel");
        Thread.sleep(2000);
	
}
Thread.sleep(2000);
clickAndWaitForElementWithId("com.threesixteen.app:id/tv_copy_link");
System.out.println("TC36- share link is copied");
Thread.sleep(2000);
clickAndWaitForElementWithId("com.threesixteen.app:id/iv_share");
System.out.println("TC37- clicked on share icon on reel");
Thread.sleep(2000);
clickAndWaitForElementWithId("com.threesixteen.app:id/tv_download");
System.out.println("TC38- Clicked on Download button button on reel");
Thread.sleep(2000);
if (isVisibleWithId("com.threesixteen.app:id/tv_reel_title"))
{
    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_reel_title");
    System.out.println("TC39- Reel keyword present");
    Thread.sleep(2000);
}
else
{
    Thread.sleep(2000);
	driver.navigate().back();
    Thread.sleep(2000);
	if (isVisibleWithId("com.threesixteen.app:id/iv_profileImage")) {
        Thread.sleep(2000);

	    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_reel_title");
	    System.out.println("TC39- Reel keyword present");
        Thread.sleep(2000);
	}
}
      clickAndWaitForElementWithId("com.threesixteen.app:id/iv_task");
      System.out.println("TC40- Open tasks from reel");
      clickAndWaitForElementWithId("com.threesixteen.app:id/iv_refresh");
      System.out.println("TC41- refresh watch & winn");
      Thread.sleep(2000); 
      if (isVisibleWithId("com.threesixteen.app:id/iv_2x_toggle")) {
      	
          clickAndWaitForElementWithId("com.threesixteen.app:id/tv_coins");
          System.out.println("TC42- Open coins log");
          Thread.sleep(2000); 
          driver.navigate().back();
          Thread.sleep(2000); 
          System.out.println("TC43- Back from coins log");
          Thread.sleep(2000);
          clickAndWaitForElementWithXpath1("//*[contains(@text,'See More Tasks')]");
			System.out.println("TC44- Opened see More tasks");
          driver.navigate().back();
          System.out.println("TC45- Back from task page");
          Thread.sleep(2000); 
          clickAndWaitForElementWithId("com.threesixteen.app:id/tv_coins");
          System.out.println("TC42- Open coins log");
          Thread.sleep(2000); 
          driver.navigate().back();
          Thread.sleep(2000); 
          System.out.println("TC43- Back from coins log");
          Thread.sleep(1000);
          driver.navigate().back();
          Thread.sleep(2000); 
          System.out.println("TC44- Back from taskpage");
          Thread.sleep(2000);
          clickAndWaitForElementWithId("com.threesixteen.app:id/iv_like");
          System.out.println("TC45- Reels Liked");
          Thread.sleep(2000);
          
          
      }
      else
      {
    	  clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
  		System.out.println("TC46- 2x not coming in Active tasks bottom sheet");
        Thread.sleep(2000);
      }
}
}






public void  ThemeChange() throws InterruptedException {
	
    OpenSideNav();
    WebElement element = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.GridView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[2]"));
    String CurrentTheme = element.getText();  // No need to cast to WebElement
    System.out.println("TC03- CurrentTheme is " + CurrentTheme);  
    driver.findElement(By.xpath("//*[contains(@text,'Theme')]")).click();
    System.out.println("TC02- Click on themes");
    
    if(CurrentTheme.equals("Dark")) {
    clickAndWaitForElementWithId("com.threesixteen.app:id/txt_lite_mode");
    System.out.println("TC03- Switch to Light Mode");
    }
    if(CurrentTheme.equals("Light")) {
        clickAndWaitForElementWithId("com.threesixteen.app:id/txt_dark_mode");
    	    System.out.println("TC04- Switch to Dark Mode");
    }
    Thread.sleep(2000);

}


public void ShopTabSwitch() throws InterruptedException {
	
	
    clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View/android.view.View[4]/android.widget.RadioButton");
    Thread.sleep(2000);
   
    clickAndWaitForElementWithXpath1("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View/android.view.View[2]/android.widget.RadioButton");
    Thread.sleep(2000);

    clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View/android.view.View[3]/android.widget.RadioButton");
    Thread.sleep(2000);

    clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View/android.view.View[5]/android.widget.RadioButton");
    Thread.sleep(2000);
    System.out.println("TC01- Shop tab switch Done ");

	
	
	
	
	
}


public void CheckVideoProgress() throws InterruptedException {
	
	
    clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");  
    driver.navigate().back();
    clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
    clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
    System.out.println("TC03- Mini player paused & send to portrait");
    
    clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay"); 
    System.out.println("OverlayClicked");
    Thread.sleep(1000);
     WebElement seekbarposition = driver.findElement(By.id("com.threesixteen.app:id/exo_progress"));  
    String progressValue = seekbarposition.getAttribute("content-desc");
    System.out.println("initial Progress bar position value is : " + progressValue);   
    driver.navigate().back();
    clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
    clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
    System.out.println("TC04- Mini player played & send to portrait");
    Thread.sleep(5000);
    driver.navigate().back();
    clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
    clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
    System.out.println("TC04- Mini player paused & send to portrait");

    
    clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
    System.out.println("OverlayClicked Again");
    Thread.sleep(1000);

     	WebElement seekbarposition2 = driver.findElement(By.id("com.threesixteen.app:id/exo_progress"));
    	String progressValue2 = seekbarposition2.getAttribute("content-desc");
    	System.out.println("Final Progres position value is : " + progressValue2);
	

	   
	if ( progressValue2 == progressValue ) {
	   
	   clickAndWaitForElementWithId("com.threesixteen.app:id/tv_diamonds");
	    System.out.println("TC06 - Video Not playing, Porgress bar Not moving");
	
	}
	else
	{
	    System.out.println("TC07- Video playing, Porgress bar moving");
	
	}
	}






	
	
	







    public static void SkipAd() throws InterruptedException {
    JavascriptExecutor js = (JavascriptExecutor) driver;

    String[] adXpaths = {
        "//android.widget.ImageButton[@content-desc=\"Close\"]",
        "//android.widget.ImageButton[@content-desc='Close']",
        "//*[contains(@text,'Close')]",
        "//*[contains(@text,'Skip video')]",
        "//*[contains(@text,'Continue')]",
        "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.widget.Button",
        "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View[2]/android.widget.Button",
        "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.widget.Button",
        "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button",
        "//android.widget.FrameLayout[@content-desc=\"IAInterstitialView\"]/android.widget.FrameLayout[2]/android.widget.FrameLayout[2]/android.widget.ImageView",
        "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button"
    };

    for (int i = 0; i < 6; i++) {
        for (String xpath : adXpaths) {
            if (isVisibleWithXPath1(xpath)) {
                try {
                    WebElement element = driver.findElement(By.xpath(xpath));

                    // Try normal click first
                    try {
                        element.click();
                        System.out.println("Clicked via normal click → " + xpath);
                                            Thread.sleep(1000);

                    } catch (Exception e1) {
                     
                        try {
                            js.executeScript("arguments[0].click();", element);
                            System.out.println("Clicked via JavaScriptExecutor → " + xpath);
                        } catch (Exception e2) {
                            System.out.println("Failed JS click for: " + xpath);
                                                Thread.sleep(1000);

                        }
                    }

                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println("Element not interactable: " + xpath);
                }
            }
        }

        // Handle cases where none of the buttons are visible → try back navigation
        // if (isVisibleWithXPath1("//android.webkit.WebView/android.view.View")) {
        //     try {
        //         driver.navigate().back();
        //         System.out.println("Navigated back to close ad (fallback)");
        //         Thread.sleep(1000);
        //     } catch (Exception e) {
        //         System.out.println("Failed to navigate back");
        //     }
        // }

        Thread.sleep(1000); 
    }

    System.out.println("Ad closing sequence completed");
}




public void SkipAdBeforeAppLaunch() throws InterruptedException {
		 
	//   Thread.sleep(30000);
	  if (isVisibleWithXPath1("//android.widget.ImageButton[@content-desc=\"Close\"]"))  {	         			 
			 clickAndWaitForElementWithXpath1("//android.widget.ImageButton[@content-desc=\"Close\"]") ;
		        System.out.println("AD01- Google Ads sheet closed");

	  }
	  if (isVisibleWithXPath1("//*[contains(@text,'Close')]"))  { 
			 clickAndWaitForElementWithXpath1("//*[contains(@text,'Close')]") ;
		     System.out.println("AD02- Clicked on close ad button");
		            	  } 

	  if (isVisibleWithXPath1("//*[contains(@text,'Skip video')]"))  { 
clickAndWaitForElementWithXpath1("//*[contains(@text,'Skip video')]") ;
System.out.println("AD02- Clicked on skip video ad button");
	  }
	  
if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View"))  {	         			 

clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View") ;
System.out.println("AD02- Clicked on cross icon of intersticial ad");

}

if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View"))  {	         			 

clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View") ;
   System.out.println("AD02- Clicked on cross icon of intersticial ad");

}
	        if (isVisibleWithXPath1("//android.widget.ImageButton[@content-desc=\"Close\"]"))  {	         			 
 			 clickAndWaitForElementWithXpath1("//android.widget.ImageButton[@content-desc=\"Close\"]") ;
	        System.out.println("AD01- Google Ads sheet closed");

 	  }
 			 
	        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button"))
	        {	         			 
 			 clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button") ;
 		     System.out.println("AD02- Clicked on cross icon of intersticial ad");

	        }

             if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]"))
	        {	         			 
 			 clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]") ;
 		     System.out.println("AD02- Clicked on cross icon of intersticial ad");

	        }
 			 	
	        if (isVisibleWithXPath1("//android.widget.FrameLayout[@content-desc=\"IAInterstitialView\"]/android.widget.FrameLayout[2]/android.widget.FrameLayout[2]/android.widget.ImageView"))  {	         			 
    			 clickAndWaitForElementWithXpath1("//android.widget.FrameLayout[@content-desc=\"IAInterstitialView\"]/android.widget.FrameLayout[2]/android.widget.FrameLayout[2]/android.widget.ImageView") ;
		        System.out.println("AD01- AD closed");

    	  }
	        
	        
	        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button"))  {	         			 
   			 clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button") ;
		        System.out.println("AD01- AD closed");

   	  }
	        
	        if (isVisibleWithId("app-interstitial-slot")) {
	        	Thread.sleep(1000);
			driver.navigate().back();
			System.out.println("AD09- intersticial ads closed");

	        }

}




//   public static void CheckReelProgress() throws InterruptedException {
//	    Thread.sleep(5000);



public static void CheckReelProgress() throws InterruptedException {
    Thread.sleep(5000);

    WebElement seekbarposition = driver.findElement(By.id("com.threesixteen.app:id/linearProgressIndicator"));
    String progressValue = seekbarposition.getText();
    System.out.println("Initial Progress bar position value is: " + progressValue);

    // Check if progressValue is not empty or invalid
//    if (progressValue.isEmpty() || !progressValue.matches("\\d+")) {
//        System.out.println("Error: Progress value is empty or not a valid number.");
//        return;
//    }

    Thread.sleep(40000);

    WebElement seekbarposition2 = driver.findElement(By.id("com.threesixteen.app:id/linearProgressIndicator"));
    String progressValue2 = seekbarposition2.getText();
    System.out.println("Final Progress position value is: " + progressValue2);

    // Check if progressValue2 is not empty or invalid
//    if (progressValue2.isEmpty() || !progressValue2.matches("\\d+")) {
//        System.out.println("Error: Final progress value is empty or not a valid number.");
//        return;
//    }

    Thread.sleep(2000);

    double progressValueA = Double.parseDouble(progressValue);
    double progressValueB = Double.parseDouble(progressValue2);


    double difference = progressValueB - progressValueA;
    System.out.println("Difference found: " + difference);

    Thread.sleep(2000);

    if (difference == 0.0) {
        System.out.println("TC01 - Reel Not playing, Progress bar Not moving. Trying again");
        Thread.sleep(2000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_diamonds");
        System.out.println("TC01 - Reel Not playing, Progress bar Not moving");
    } else {
        System.out.println("TC02 - Reel playing, Progress bar moving");
    }
}



    
    
    static AppiumDriver driver;
 

    @BeforeMethod
    public void setup() throws MalformedURLException, InterruptedException  {

      
   

            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName", "Android");
            caps.setCapability("platformVersion", "14");
            caps.setCapability("deviceName", "13793294180004Z");
            caps.setCapability("automationName", "UiAutomator2");
            caps.setCapability("appPackage", "com.threesixteen.app");
            caps.setCapability("appActivity", "com.threesixteen.app.ui.activities.SplashActivity");
            caps.setCapability("autoGrantPermissions", true);
            caps.setCapability("ignoreHiddenApiPolicyError", true);
            caps.setCapability("disableSuppressAccessibilityService", true);
            caps.setCapability("noReset", true);
            caps.setCapability("setWebContentsDebuggingEnabled", true);
        caps.setCapability("chromedriverExecutable", "/usr/local/bin/chromedriver");

            URL url = new URL("http://127.0.0.1:4723/wd/hub/");
            driver = new AndroidDriver(url, caps); 

     
     
        
        
if (isVisibleWithXPath1("//android.widget.ImageButton[@content-desc=\"Close\"]")) {
    driver.navigate().back();
    System.out.println("Exist from Ad");
                Thread.sleep(10000);
       }
       System.out.println("Application started");
        Thread.sleep(3000);

if (isVisibleWithId("com.threesixteen.app:id/et_mobile")) {
    clickAndWaitForElementWithId("com.threesixteen.app:id/et_mobile");
    System.out.println("Login bar clicked");

    if (isVisibleWithId("com.google.android.gms:id/cancel")) {
        clickAndWaitForElementWithId("com.google.android.gms:id/cancel");
    }

     (driver).findElement(By.id("com.threesixteen.app:id/et_mobile")).sendKeys("4545454123");
    // Wait before proceeding
    Thread.sleep(2000);
    clickAndWaitForElementWithId("com.threesixteen.app:id/btn_send");
    System.out.println("Clicked on continue button");

    Thread.sleep(2000);

  (driver).findElement(By.id("com.threesixteen.app:id/et_ot")).sendKeys("454545");

    System.out.println("Entered OTP");
        Thread.sleep(5000);

}



// if (isVisibleWithXPath1("//android.widget.ImageButton[@content-desc=\"Close\"]")) {
//     driver.navigate().back();
//     System.out.println("Exist from Ad");
//                 Thread.sleep(10000);
//        }
      

  
        
        if (isVisibleWithXPath1("//android.widget.ImageView[@content-desc=\"Dismiss update dialog\"]"))  {
            Thread.sleep(2000);
            clickAndWaitForElementWithXpath1("//android.widget.ImageView[@content-desc=\"Dismiss update dialog\"]");
            Thread.sleep(2000);
             System.out.println("Exist from Update");
        }
        

        if (isVisibleWithXPath1("//*[contains(@text,'Update')]"))  {
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
             System.out.println("Exist from Update");
        }
        else
        {
        	 if (isVisibleWithXPath1("//android.widget.ImageView[@content-desc=\"Dismiss update dialog\"]"))  {
                 Thread.sleep(2000);
                 clickAndWaitForElementWithXpath1("//android.widget.ImageView[@content-desc=\"Dismiss update dialog\"]");
                 Thread.sleep(2000);
                  System.out.println("Exist from Update");
             }
            Thread.sleep(1000);
            if (isVisibleWithXPath1("//*[contains(@text,'Update')]"))  {
                            Thread.sleep(3000);

                driver.navigate().back();
                 System.out.println("Exist from Update");
                 Thread.sleep(2000);

        }
      }
        if (isVisibleWithXPath1("//*[contains(@text,'Spin & Win')]")) 
        {
        driver.findElement(By.xpath("//*[contains(@text,'Spin & Win')]")).click();
        System.out.println("TC06- Click on spin wheel");
        Thread.sleep(10000);
        driver.navigate().back();
        Thread.sleep(10000);
        driver.navigate().back();
        }
        
        if (isVisibleWithId("android:id/button1")) 
        {
        driver.findElement(By.id("android:id/button1")).click();
        System.out.println("TC06- Click on OK");
        Thread.sleep(10000);
        }

        
        SkipAdBeforeAppLaunch();
//        if (isVisibleWithXPath1("//*[contains(@text,'Close')]"))  { 
//			 clickAndWaitForElementWithXpath1("//*[contains(@text,'Close')]") ;
//		     System.out.println("AD02- Clicked on close ad button");
//		            	  } 
        SkipCollectCoinBottomSheet();
             

   }

    

  
   
    
 
    
        
    
    
    
    
	
	
	
	
    
   





	
	
	@AfterMethod
	
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
