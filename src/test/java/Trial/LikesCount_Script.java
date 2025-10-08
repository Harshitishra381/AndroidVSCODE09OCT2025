package Trial;

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

public class LikesCount_Script<MobileElement, Rotatable>  extends Functions {


    
    
    
    @SuppressWarnings("unchecked")
	@Test(priority = 01)
    public void LikesCountOnReel01() throws InterruptedException, MalformedURLException {

        OpenCentralReeltab();
        System.out.println("TC01- Central Reel Tab opened");        
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_comment");
       System.out.println("TC02- Opened the comment section.....");
       Thread.sleep(2000);
        MobileElement element = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"));
        String initialLikeCount = ((WebElement) element).getText();
        System.out.println("TC03- Initial Likes count is " + initialLikeCount);
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_like");
        System.out.println("TC04- Reels Liked");
        Thread.sleep(30000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_comment");
       System.out.println("TC05- Opened the comment section.....");
       Thread.sleep(1000);
        MobileElement element1 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"));
        String updatedLikeCount = ((WebElement) element1).getText();
        System.out.println("TC06- Updated Like count is " + updatedLikeCount);
        Thread.sleep(1000);

     int initialLikeCountValue = Integer.parseInt(initialLikeCount.split(" ")[0]);
     int updatedLikeCountValue = Integer.parseInt(updatedLikeCount.split(" ")[0]);

     int difference = updatedLikeCountValue - initialLikeCountValue;

     if (difference == 1) {
         System.out.println("Difference between updated Like count and initial Like count is 1");
     } 
     else 
     {
    	 
  		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_comment");
         System.out.println("Difference between updated Like count and initial Like count is not 1");
     }

    }
    
    
    
    
    @SuppressWarnings("unchecked")
	@Test(priority = 02)
    public void LikesCountOnVideo02() throws InterruptedException, MalformedURLException {
    	
    	
    	
      	OpenVideo();
        SkipAd();
        Thread.sleep(2000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_comment");
        System.out.println("TC03- Open Comment section");
        Thread.sleep(2000);
    	 MobileElement element = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"));
         String initialLikeCount = ((WebElement) element).getText();
         System.out.println("TC05- Initial Likes count is " + initialLikeCount);
         Thread.sleep(1000);
         driver.navigate().back();
         Thread.sleep(1000);
         clickAndWaitForElementWithId("com.threesixteen.app:id/layout_img_like");
         System.out.println("TC06- click on Like Video");
         Thread.sleep(30000);
 		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_comment");
        System.out.println("TC07- Open Likes List");
        Thread.sleep(1000);

        MobileElement element1 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"));
        String updatedLikeCount = ((WebElement) element1).getText();
        System.out.println("TC08- Updated Like count is " + updatedLikeCount);
        Thread.sleep(1000);
    	
    	
    	
        int initialLikeCountValue = Integer.parseInt(initialLikeCount.split(" ")[0]);
        int updatedLikeCountValue = Integer.parseInt(updatedLikeCount.split(" ")[0]);

        int difference = updatedLikeCountValue - initialLikeCountValue;

        if (difference == 1) {
        	
            System.out.println("TC09- Difference between updated Like count and initial Like count is 1");
            Thread.sleep(1000);
            driver.navigate().back();
            Thread.sleep(1000);

    		clickAndWaitForElementWithId("com.threesixteen.app:id/video_timer");
            Thread.sleep(10000);
            System.out.println("TC10- Video opened");

       	    MobileElement element11 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/tv_num_support"));
            String initialLikeCount1 = ((WebElement) element11).getText();
            System.out.println("TC11- Initial Likes count is " + initialLikeCount1);

            int initialLikeCountValue1 = Integer.parseInt(initialLikeCount1.split(" ")[0]);
            int updatedLikeCountValue1 = Integer.parseInt(updatedLikeCount.split(" ")[0]);

            int difference1 = updatedLikeCountValue1 - initialLikeCountValue1;

            if (difference1 == 0) {
                System.out.println("Likes Count on video is working fine , count is matching inside and outside of Video layout");	
            }
            else
            {
                clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
                System.out.println("Likes Count on video inside and outside not Matching");	

            }
        	
        
        	
        } else {
        	
   		 clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView");
            System.out.println("Difference between updated Like count and initial Like count is not 1");
            
           
        }
    		}
    	
       
   
    
    
    
        
	
	
	@AfterMethod
	
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}



