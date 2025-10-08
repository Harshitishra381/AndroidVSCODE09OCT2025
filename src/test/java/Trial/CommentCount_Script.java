package Trial;

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

public class CommentCount_Script<MobileElement, Rotatable> extends Functions {


	
    
    
    @SuppressWarnings("unchecked")
	@Test(priority = 01)
    public void CommentCountOnReel01() throws InterruptedException, MalformedURLException {

       OpenCentralReeltab();
        
       clickAndWaitForElementWithId("com.threesixteen.app:id/iv_comment");
       System.out.println("TC02- Opened the comment section.....");
       Thread.sleep(2000);
   
        MobileElement element = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView"));
        String initialCommentCount = ((WebElement) element).getText();
        System.out.println("TC03- Initial Comment count is " + initialCommentCount);
       
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
            System.out.println("TC04- clicked comment section.....");
            Thread.sleep(1000);
            if (isVisibleWithId("com.threesixteen.app:id/et_comment")) {
            (driver).findElement(By.id("com.threesixteen.app:id/et_comment")).sendKeys("wow");
            System.out.println("TC05- Typed wow comment section");
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
            System.out.println("TC06- Comment on Reel Done");
            }
            else
            {
                Thread.sleep(3000);
                clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
                (driver).findElement(By.id("com.threesixteen.app:id/et_comment")).sendKeys("wow");
                System.out.println("TC07- Typed wow comment section");
                Thread.sleep(1000);
                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
                System.out.println("TC08- Comment on Reel Done");
                Thread.sleep(1000);
            }

            Thread.sleep(10000);

        MobileElement element1 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView"));
        String updatedCommentCount = ((WebElement) element1).getText();
        System.out.println("TC09- Updated Comment count is " + updatedCommentCount);
        
        
     
     int initialCommentCountValue = Integer.parseInt(initialCommentCount.split(" ")[0]);
     int updatedCommentCountValue = Integer.parseInt(updatedCommentCount.split(" ")[0]);

     int difference = updatedCommentCountValue - initialCommentCountValue;

     if (difference == 1) {
         System.out.println("Difference between updated comment count and initial comment count is 1");
     } 
     else 
     {
    	 
  		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_comment");
         System.out.println("Difference between updated comment count and initial commment count is not 1");
     }

    }
    
    
    


	@SuppressWarnings("unchecked")
	@Test(priority = 02)
    public void CommmentCountOnVideo02() throws InterruptedException, MalformedURLException {
    
    	

    	OpenVideo();
        SkipAd();
        Thread.sleep(2000);
    	 MobileElement element = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView"));
         String initialCommentCount = ((WebElement) element).getText();
         System.out.println("TC03A- Initial Comment count is " + initialCommentCount);
        
         
//         clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
       clickAndWaitForElementWithId("com.threesixteen.app:id/iv_live_comments");
         System.out.println("TC04- Clicked comment section");
         Thread.sleep(1000);
         clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
         (driver).findElement(By.id("com.threesixteen.app:id/et_comment")).sendKeys("Nice played");
         System.out.println("TC05- Typed Nice played comment section");
         clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
         System.out.println("TC06- Send the  comment");
         Thread.sleep(1000);
         clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
         Thread.sleep(1000);


        MobileElement element1 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView"));
        String updatedCommentCount = ((WebElement) element1).getText();
        System.out.println("TC07- Updated Like count is " + updatedCommentCount);
        Thread.sleep(1000);
    	
    	
    	
        int initialCommentCountValue = Integer.parseInt(initialCommentCount.split(" ")[0]);
        int updatedCommentCountValue = Integer.parseInt(updatedCommentCount.split(" ")[0]);

        int difference = updatedCommentCountValue - initialCommentCountValue;

        if (difference == 1) {
        	
            System.out.println("TC08- Difference between updated Comment count and initial Comment count is 1");
            Thread.sleep(1000);
            driver.navigate().back();
            Thread.sleep(1000);
        }
        else
        {
            clickAndWaitForElementWithXpath1("//*[contains(@text,'Data Saver')]");

        }

           
    } 
   
    
    
    
    
    @SuppressWarnings("unchecked")
   	@Test(priority = 03)
       public void CommmentCountOnSearchVideo03() throws InterruptedException, MalformedURLException {
       	
       	
       
    	OpenSearch();
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
		Thread.sleep(1000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("BGMI");
        System.out.println("TC03- Type BGMI in search");
		Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on search button");
		Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Videos')]")).click();
        System.out.println("TC05- Click on Videos tab");
        Thread.sleep(1000);
       
        if (isVisibleWithId("com.threesixteen.app:id/tv_num_comment")) {
               clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_comment");
              System.out.println("TC06- Open Comment section");
 
           Thread.sleep(1000);
       	 MobileElement element = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView"));
            String initialCommentCount = ((WebElement) element).getText();
            System.out.println("TC07- Initial Comment count is " + initialCommentCount);
           
            
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
            System.out.println("TC08- Clicked comment section");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/et_comment");
            (driver).findElement(By.id("com.threesixteen.app:id/et_comment")).sendKeys("Nice played");
            System.out.println("TC09- Typed Nice played comment section");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
            System.out.println("TC10- Send the  comment");
            Thread.sleep(1000);
//            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");


           MobileElement element1 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView"));
           String updatedCommentCount = ((WebElement) element1).getText();
           System.out.println("TC11- Updated comment count is " + updatedCommentCount);
           Thread.sleep(1000);
       	
       	
       	
           int initialCommentCountValue = Integer.parseInt(initialCommentCount.split(" ")[0]);
           int updatedCommentCountValue = Integer.parseInt(updatedCommentCount.split(" ")[0]);

           int difference = updatedCommentCountValue - initialCommentCountValue;

           if (difference == 1) {
           	
               System.out.println("TC12- Difference between updated Comment count and initial Comment count is 1");
               Thread.sleep(1000);
             clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
               System.out.println("TC2A- clicked Back");

               Thread.sleep(1000);

   	  		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
               System.out.println("TC13- Video opened");
               Thread.sleep(1000);

          	    MobileElement element11 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/tv_num_comment"));
               String initialCommentCount1 = ((WebElement) element11).getText();
               System.out.println("TC14- Initial Comment count is " + initialCommentCount1);

               int initialCommentCountValue1 = Integer.parseInt(initialCommentCount1.split(" ")[0]);
               int updatedCommentCountValue1 = Integer.parseInt(updatedCommentCount.split(" ")[0]);

               int difference1 = updatedCommentCountValue1 - initialCommentCountValue1;

               if (difference1 == 0) {
                   System.out.println("Comment Count on video is working fine , count is matching inside and outside of Video layout");	
               }
               else
               {
                   clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
                   System.out.println("Comment Count on video inside and outside not Matching");	

               }
           	
           
           	
           } else {
           	
               clickAndWaitForElementWithId("com.threesixteen.app:id/iv_like");
               System.out.println("Difference between updated comment count and initial comment count is not 1");
               
              
           }
        }
        else
        {
            Thread.sleep(1000);

        	 clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
             System.out.println("TC15- click on video");
             Thread.sleep(1000);

        	 MobileElement element = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView"));
             String initialCommentCount = ((WebElement) element).getText();
             System.out.println("TC03A- Initial Comment count is " + initialCommentCount);
            
             
//             clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
           clickAndWaitForElementWithId("com.threesixteen.app:id/iv_live_comments");
             System.out.println("TC04- Clicked comment section");
             Thread.sleep(1000);
             clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
             (driver).findElement(By.id("com.threesixteen.app:id/et_comment")).sendKeys("Nice played");
             System.out.println("TC05- Typed Nice played comment section");
             Thread.sleep(1000);
             clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
             System.out.println("TC06- Send the  comment");
             Thread.sleep(1000);
             clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
             Thread.sleep(1000);


            MobileElement element1 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView"));
            String updatedCommentCount = ((WebElement) element1).getText();
            System.out.println("TC07- Updated Like count is " + updatedCommentCount);
            Thread.sleep(3000);
        	
        	
        	
            int initialCommentCountValue = Integer.parseInt(initialCommentCount.split(" ")[0]);
            int updatedCommentCountValue = Integer.parseInt(updatedCommentCount.split(" ")[0]);

            int difference = updatedCommentCountValue - initialCommentCountValue;

            if (difference == 1) {
            	
                System.out.println("TC08- Difference between updated Comment count and initial Comment count is 1");
                Thread.sleep(1000);
                driver.navigate().back();
                Thread.sleep(1000);
            }
            else
            {
                clickAndWaitForElementWithXpath1("//*[contains(@text,'Data Saver')]");

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



