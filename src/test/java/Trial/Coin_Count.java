package Trial;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.*;
import java.net.MalformedURLException;

public class Coin_Count<MobileElement, Rotatable> extends Functions {


	
	
    
  

    
    @SuppressWarnings("unchecked")
	@Test(priority = 01)
    public void CoinsCount01() throws InterruptedException, MalformedURLException {

    	
        	OpenSideNav();
           Thread.sleep(1000);
           String targetText = "Tasks";
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
           System.out.println("Clicking on: " + targetText);
           Thread.sleep(1000);  

        MobileElement element = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/tv_user_coins"));
        String TaskCoinCount = ((WebElement) element).getText();
        System.out.println("TC02- Coin count on TasK page is " + TaskCoinCount);
       
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ImageView"))
		{   clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ImageView");
		        System.out.println("TC03- open side nav from old homapage");
		}
		else
		{
		    clickAndWaitForElementWithId("com.threesixteen.app:id/layout_nav_profile");
		    System.out.println("TC03- open side nav from New homapage");
		}

        MobileElement element1 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]"));
        String SideNavCoinCount = ((WebElement) element1).getText();
        System.out.println("TC04- Coin count on Side Nav is " + SideNavCoinCount);
        
      
        
        if (TaskCoinCount.equals(SideNavCoinCount)) {
        	
            System.out.println("TC05- Side nav and Task page coin count matching");
        }
        
        else
        {
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
            System.out.println("TC06- Side nav and Task page coin count not matching");
  
        }
        
    } 
 



		@SuppressWarnings("unchecked")
    	@Test(priority = 02)
        public void CoinsCount02() throws InterruptedException, MalformedURLException {
        
        
            OpenSideNav();
             
             
             MobileElement element1 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]"));
             String SideNavCoinCount = ((WebElement) element1).getText();
             System.out.println("TC02- Coin count on Side Nav is " + SideNavCoinCount);
             

             Thread.sleep(1000);
             
             String targetText = "Rewards";
             boolean textFound = false;
             int maxScrolls = 5; 

             for (int i = 0; i < maxScrolls && !textFound; i++) {
                 try {
                     driver.findElement(
                    		 AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + targetText + "\"))"));         
                     textFound = true;
                 } catch (Exception e) {
                     driver.findElement(
                         AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
                     Thread.sleep(1000); 
                 }
             }
             driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
             System.out.println("Clicking on: " + targetText);
             Thread.sleep(20000); 
             SkipAd();
             SkipAd();
             if (isVisibleWithId("com.threesixteen.app:id/tv_user_coins")) {
            	 
             
        	   MobileElement element11 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/tv_user_coins"));
               String RewardCoinCount = ((WebElement) element11).getText();
               System.out.println("TC04- Coin count on Reward page is " + RewardCoinCount);
               Thread.sleep(2000);
                
        
               if (RewardCoinCount.equals(SideNavCoinCount)) {           
            	   Thread.sleep(1000);     
          
            System.out.println("TC05- Side nav and Reward page coin count matching");

        }
        
        else
        {
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
            System.out.println("T06- Side nav and Rewards page coin count not matching");
  
        }
             }
             else
             {
          	   Thread.sleep(5000);     
            	 driver.navigate().back();
          	   Thread.sleep(1000);    
               SkipAd();
               MobileElement element11 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/tv_user_coins"));
               String RewardCoinCount = ((WebElement) element11).getText();
               System.out.println("TC04- Coin count on Reward page is " + RewardCoinCount);
               Thread.sleep(2000);
                
        
               if (RewardCoinCount.equals(SideNavCoinCount)) {           
            	   Thread.sleep(1000);     
          
            System.out.println("TC05- Side nav and Reward page coin count matching");

        }
        
        else
        {
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
            System.out.println("T06- Side nav and Rewards page coin count not matching");
        }


             }
        
        }
        
        
        
        
        
        @SuppressWarnings("unchecked")
    	@Test(priority = 03)
        public void CoinsCount03() throws InterruptedException, MalformedURLException {
        
       
        	
        	
        	OpenSideNav();

             
            
             
             MobileElement element1 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]"));
             String SideNavCoinCount = ((WebElement) element1).getText();
             System.out.println("TC02- Coin count on Side Nav is " + SideNavCoinCount);
             Thread.sleep(1000);
             driver.navigate().back();
             Thread.sleep(1000);

            	OpenTaskPage();
              System.out.println("TC02- Win coin page opene");
              Thread.sleep(1000);

        
		        MobileElement element111 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/tv_user_coins"));
		        String WinCoinpageCoinCount = ((WebElement) element111).getText();
		        System.out.println("TC11- Coin count on Win page is " + WinCoinpageCoinCount);
		        Thread.sleep(1000);
		
		        
		        
		        if (SideNavCoinCount.equals(WinCoinpageCoinCount)) {
		            Thread.sleep(1000);
		            System.out.println("TC12- Win coin and Rewards page coin count matching");
		        }
		        
		        else
		        {
		            Thread.sleep(1000);
		
		            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
		            System.out.println("TC13- Win coin and Rewards page coin count not matching");
		  
		        }
        
    }
    
    
    
    
        @SuppressWarnings("unchecked")
    	@Test(priority = 04)
        public void CoinsCount04() throws InterruptedException, MalformedURLException {
        
	
        	
        	 OpenSideNav();
             MobileElement element1 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]"));
             String SideNavCoinCount = ((WebElement) element1).getText();
             System.out.println("TC02- Coin count on Side Nav is " + SideNavCoinCount);
             Thread.sleep(1000);
             driver.navigate().back();
             Thread.sleep(1000);
             OpenTaskPage();
             clickAndWaitForElementWithId("com.threesixteen.app:id/tv_user_coins");
             System.out.println("TC02- Open coin logs");
             Thread.sleep(1000);
             SkipAd();
             Thread.sleep(5000);             
			MobileElement element2 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[1]"));
             String CoinLogCoinCount = ((WebElement) element2).getText();
             System.out.println("TC02- Coin count on coin log is " + CoinLogCoinCount);
             
             if (SideNavCoinCount.equals(CoinLogCoinCount)) {
		            Thread.sleep(1000);
		            System.out.println("TC12- side nav and coin log coin count matching");
		        }
		        
		        else
		        {
		            Thread.sleep(1000);
		
		            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
		            System.out.println("TC13- side nav and coin log coin count not matching");
		  
		        }
        
        }
        
        
        
        
	
	@AfterMethod
	
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}



