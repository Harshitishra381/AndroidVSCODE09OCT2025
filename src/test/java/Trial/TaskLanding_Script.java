package Trial;

import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;
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



public class TaskLanding_Script<MobileElement, Rotatable> extends Functions {


	
  
    
    
    @Test(priority = 1)
    public void ReelTaskLandingtest01() throws InterruptedException, MalformedURLException {	
    	
    	
    	clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ImageView");
        System.out.println("TC01- open side nav");
//        driver.findElement(
//                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
//        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Tasks')]");
        System.out.println("TC02- Task Page Opened");
        Thread.sleep(2000);

//        MobileElement element = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView"));
//        String TaskName = ((WebElement) element).getText();
//        System.out.println("TC03- Task Name is " + TaskName);
         Thread.sleep(3000);
        
        if (isVisibleWithXPath1("//*[contains(@text,'Watch 10 Reels')]"))
        {
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Watch 10 Reels')]");
        System.out.println("TC04- Reel Opened");
            clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.Button");
            Thread.sleep(8000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_share");
            System.out.println("TC05- Task landed correctly, Reel Opened");
            Thread.sleep(2000);
        }
        else
        {
            System.out.println("TC04- 10 Reels task is already Completed");
        }
    }
    
    
    
    
    @Test(priority = 2)
    public void ReelsTaskLandingtest02() throws InterruptedException, MalformedURLException {	
    	
    	
    	clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ImageView");
        System.out.println("TC01- open side nav");
//        driver.findElement(
//                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
//        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Tasks')]");
        System.out.println("TC02- Task Page Opened");
        Thread.sleep(2000);

//        MobileElement element = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView"));
//        String TaskName = ((WebElement) element).getText();
//        System.out.println("TC03- Task Name is " + TaskName);
         Thread.sleep(3000);
        
        if (isVisibleWithXPath1("//*[contains(@text,'Watch 30 Reels')]"))
        {
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Watch 30 Reels')]");
        System.out.println("TC04- 30 Reel Task Opened");
            Thread.sleep(5000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_share");
            System.out.println("TC05- 30 Reels Task landed correctly, Reel Opened");
            Thread.sleep(2000);
        }
        else
        {
            System.out.println("TC04- Watch 30 Reels task is Completed");
        }
    }
    	
    	
    
    
    
    @Test(priority = 3)
    public void VideoTaskLandingtest03() throws InterruptedException, MalformedURLException {	
    	
    	
    	clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ImageView");
        System.out.println("TC01- open side nav");
//        driver.findElement(
//                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
//        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Tasks')]");
        System.out.println("TC02- Task Page Opened");
         Thread.sleep(3000);
        
        if (isVisibleWithXPath1("//*[contains(@text,'Watch Videos for 7 Minutes')]"))
        {
            clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[4]/android.widget.RelativeLayout/android.widget.Button");
           System.out.println("TC03- 7 minutes Video Task Opened");
            Thread.sleep(10000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
            Thread.sleep(1000);
            System.out.println("TC04- 7 minutes Video Task landed correctly, Video Opened");
            Thread.sleep(2000);
        }
        else
        {
            System.out.println("TC05- Watch 7 Minutes Video task is already Completed");
        }
    }
    	
    
    
    
    @Test(priority = 4)
    public void VideoTaskLandingtest04() throws InterruptedException, MalformedURLException {	
    	
    	
    	clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ImageView");
        System.out.println("TC01- open side nav");
//        driver.findElement(
//                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
//        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Tasks')]");
        System.out.println("TC02- Task Page Opened");
         Thread.sleep(3000);
        
        if (isVisibleWithXPath1("//*[contains(@text,'Watch Videos for 20 Minutes')]"))
        {
            clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[4]/android.widget.RelativeLayout/android.widget.Button");
           System.out.println("TC03- 20 minutes Video Task Opened");
            Thread.sleep(10000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
            Thread.sleep(1000);
            System.out.println("TC04- 20 minutes Video Task landed correctly, Video Opened");
            Thread.sleep(2000);
            System.out.println("TC05- Watch 20 Minutes Video task is already Completed");

        }
        else
        {
        	driver.findElement(
                  AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
        	if (isVisibleWithXPath1("//*[contains(@text,'Watch Videos for 20 Minutes')]"))
            {
        		clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[4]/android.widget.RelativeLayout/android.widget.Button");
                System.out.println("TC03- 20 minutes Video Task Opened");
                 Thread.sleep(10000);
                 clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
                 Thread.sleep(1000);
                 System.out.println("TC04- 20 minutes Video Task landed correctly, Video Opened");
                 Thread.sleep(2000);
                 System.out.println("TC05- Watch 20 Minutes Video task is already Completed");
            }
        	else
        	{
                System.out.println("TC05- Watch 20 Minutes Video task is already Completed");

        	}
        }
        
    }
    
 
    
    
    
    
    @Test(priority = 5)
    public void LivestreamTaskLandingtest05() throws InterruptedException, MalformedURLException {	
    	
    	
    	clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ImageView");
        System.out.println("TC01- open side nav");
//        driver.findElement(
//                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
//        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Tasks')]");
        System.out.println("TC02- Task Page Opened");
         Thread.sleep(3000);
        
        if (isVisibleWithXPath1("//*[contains(@text,'Watch Live Gaming Streams for 15 minutes')]"))
        {
            clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.RelativeLayout/android.widget.Button");
           System.out.println("TC03- Watch Live Gaming Streams for 15 minutes Task Opened");
            Thread.sleep(10000);
            clickAndWaitForElementWithXpath1("//*[contains(@text,'Live Chat')]");
            Thread.sleep(1000);
            System.out.println("TC04- Watch Live Gaming Streams for 15 minutes landed correctly, Stream Opened");

        }
        else
        {
                System.out.println("TC05- Watch Live Gaming Streams for 15 minutes task is already Completed");

        	}
        }
        
    
    
    
    @Test(priority = 6)
    public void  QuizFFLeaderBoard06() throws InterruptedException, MalformedURLException {	
    	
 
    	  clickAndWaitForElementWithXpath1(
	        		"//android.view.View[@content-desc=\"Rewards\"]");
          Thread.sleep(2000);

    	String targetText = "Play exciting quiz";
        boolean textFound = false;
        int maxScrolls = 5; 

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
        System.out.println("TC01- Quiz found");
        Thread.sleep(2000);
        
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_quiz_card_bg");
        System.out.println("TC02- Quiz opened");
        Thread.sleep(1000);

        clickAndWaitForElementWithXpath1("//*[contains(@text,'View Leaderboard')]");
        System.out.println("TC03- FF leaderboard opened");
         Thread.sleep(1000);
         clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.widget.ImageView[2]");
            System.out.println("TC04- FF leaderboard Refreshed");
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[3]");
            System.out.println("TC05- clicked on banner");
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView");
            System.out.println("TC06- bottomsheet closed");
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[1]/android.view.View[3]/android.widget.TextView[1]");
            System.out.println("TC07- Names are co ming in leaderboard");
            Thread.sleep(1000);     
            clickAndWaitForElementWithXpath1("//*[contains(@text,'Individual Performance')]");
            System.out.println("TC08- Individual performance sheet opned");
             Thread.sleep(1000);
             clickAndWaitForElementWithXpath1("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView[1]");
             System.out.println("TC09-individual performance bottomsheet closed");
             Thread.sleep(1000);
            
            

    }
    
    
    
    
    @Test(priority = 7)
    public void IPLleaderboard07() throws InterruptedException, MalformedURLException {	
    	
 
    	  clickAndWaitForElementWithXpath1(
	        		"//android.view.View[@content-desc=\"Rewards\"]");
          Thread.sleep(2000);

    	String targetText = "Play exciting quiz";
        boolean textFound = false;
        int maxScrolls = 5; 

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
        System.out.println("TC01- Quiz found");
        Thread.sleep(2000);
        
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_quiz_card_bg");
        System.out.println("TC02- Quiz opened");
        Thread.sleep(1000);

        String targetText1 = "Play IPL Quiz & Win Exciting Prizes";
        boolean textFound1 = false;
        int maxScrolls1 = 5; 

        for (int i = 0; i < maxScrolls1 && !textFound1; i++) {
            try {
                driver.findElement(
               		 AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + targetText1 + "\"))"));         
                textFound1 = true;
                System.out.println("TC02- Product description scrolled and found");
            } catch (Exception e) {
                driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
                Thread.sleep(1000); 
            }
        }
        driver.findElement(By.xpath("//*[contains(@text,'" + targetText1 + "')]")).click();
        System.out.println("TC03- IPL quiz found");
        Thread.sleep(2000);
        
        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[5]/android.widget.TextView");
        System.out.println("TC04- IPL leaderboard Opened");
        Thread.sleep(1000);
        
           clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.widget.ImageView[2]");
            System.out.println("TC05- IPL leaderboard Refreshed");
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[3]");
            System.out.println("TC06- clicked on banner");
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView");
            System.out.println("TC07- bottomsheet closed");
            Thread.sleep(1000);
            
            
            
            clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.TextView[1]");
            System.out.println("TC08- Names are coming in yesterday's leaderboard");
            Thread.sleep(1000);    
            clickAndWaitForElementWithXpath1("//*[contains(@text,'Individual Performance')]");
            System.out.println("TC09- Individual performance sheet opned");
             Thread.sleep(1000);
             clickAndWaitForElementWithXpath1("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView[1]");
             System.out.println("T10-individual performance bottomsheet closed from yesterday's leaderboard");
             Thread.sleep(1000);
             
             
             
             clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.TextView");
             System.out.println("TC11- today's leaderboard opened");
              Thread.sleep(1000);
              clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.TextView[1]");
              System.out.println("TC12- Names are coming in today's leaderboard");
              Thread.sleep(1000);    
              clickAndWaitForElementWithXpath1("//*[contains(@text,'Individual Performance')]");
              System.out.println("TC13- Individual performance sheet opned");
               Thread.sleep(1000);
               clickAndWaitForElementWithXpath1("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView[1]");
               System.out.println("TC14-individual performance bottomsheet closed from today's leaderboard");
               Thread.sleep(1000);
               
               
               clickAndWaitForElementWithXpath1("//*[contains(@text,'Tournament')]");
               System.out.println("TC15- tournament leaderboard opened");
                Thread.sleep(1000);        
                clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.TextView[1]");
                System.out.println("TC16- Names are coming in tournament's leaderboard");
                Thread.sleep(1000);    
                clickAndWaitForElementWithXpath1("//*[contains(@text,'Individual Performance')]");
                System.out.println("TC17- Individual performance sheet opned");
                 Thread.sleep(1000);
                 clickAndWaitForElementWithXpath1("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView[1]");
                 System.out.println("TC18-individual performance bottomsheet closed from tournament's leaderboard");
                 Thread.sleep(1000);
    }
    
    
    
    
    
    


}



