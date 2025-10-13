package Trial;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class TaskPage_Script<MobileElement, Rotatable> extends Functions {



    
    
    @Test(priority = 1)
    public void Taskpage1() throws InterruptedException {


	    	OpenTaskPage();
	        Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_user_coins");
            System.out.println("TC02- Open coin logs");
            Thread.sleep(1000);
            SkipAd();
            SkipAd()  ; 
            Thread.sleep(1000);
            driver.navigate().back();
            SkipAd();
            System.out.println("TC03- Back from coin logs");
            SkipAd();
            if (isVisibleWithId("com.threesixteen.app:id/tv_gems")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_gems");
            System.out.println("TC04- Open Diamond logs");
            Thread.sleep(1000);
            driver.navigate().back();
            System.out.println("TC05- Back from Diamond logs");
            Thread.sleep(1000);
            }
            if (isVisibleWithXPath1("/*[contains(@text,'See All Rewards')]")) {
            driver.findElement(By.xpath("//*[contains(@text,'See All Rewards')]")).click();

            System.out.println("TC06- click on see all  Rewards");
            Thread.sleep(1000);
            driver.navigate().back();
            Thread.sleep(1000);
            System.out.println("TC07- Back from Rewards");
            Thread.sleep(1000);
            }
//            clickAndWaitForElementWithXpath1("android.widget.FrameLayout[@content-desc=\" \"]/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView");
//            clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"Buy Diamonds\"]");
            driver.findElement(By.xpath("//*[contains(@text,'Buy Diamonds')]")).click();
            System.out.println("TC08- click on buy diamond");
            Thread.sleep(1000);
            driver.navigate().back();
            System.out.println("TC09- Back from Diamond purchase");
            Thread.sleep(1000);
            if (isVisibleWithXPath1("//*[contains(@text,'How To Win?')]")) {
      

            driver.findElement(By.xpath("//*[contains(@text,'How To Win?')]")).click();
            System.out.println("TC10- click on how to win");

            Thread.sleep(1000);
            driver.findElement(By.xpath("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.widget.TextView[2]")).click();
            System.out.println("TC11- click on okay button");
            Thread.sleep(1000);
            
            driver.findElement(By.xpath("//*[contains(@text,'How To Win?')]")).click();
            System.out.println("TC12- click on how to win again");
            Thread.sleep(1000);
            
            driver.findElement(By.xpath("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView")).click();
            System.out.println("TC13- click on cross icon");
          
            
            Thread.sleep(1000);
            
            
            driver.findElement(By.xpath("//*[contains(@text,'Spin & Win')]")).click();
            System.out.println("TC16- click on spin and win");
            Thread.sleep(1000); 
//           driver.findElement(By.id("com.threesixteen.app:id/tv_spin_wheel")).click();
//            System.out.println("TC14- click on spin wheel");

            Thread.sleep(1000);
            driver.findElement(By.id("com.threesixteen.app:id/ic_close")).click();
            System.out.println("TC15-- Back from spin wheel by click on cross icon");
            }
            else
            {
            	
            	
            	driver.findElement(By.xpath("//*[contains(@text,'Spin & Win')]")).click();
                System.out.println("TC16- click on spin and win");
                Thread.sleep(1000);  
                
                driver.navigate().back();
                Thread.sleep(1000);  
                
                driver.findElement(By.xpath("//*[contains(@text,'Rewards')]")).click();
                System.out.println("TC17- click on rewards");
                Thread.sleep(1000);  
                SkipAd();
                SkipAd();

                driver.navigate().back();
                Thread.sleep(1000); 
            	driver.findElement(By.xpath("//*[contains(@text,'Daily Streak')]")).click();
                System.out.println("TC18- click on daily streak");
                Thread.sleep(1000);  
                
                driver.navigate().back();
               
            }
    } 
            
            
            
            
    @Test(priority = 2)
    public void DailystreakButton2() throws InterruptedException {
   
            
	    	OpenTaskPage();
	        Thread.sleep(1000);
	        if (isVisibleWithId("com.threesixteen.app:id/tv_daily_streak")) {
            driver.findElement(By.id("com.threesixteen.app:id/tv_daily_streak")).click();
            System.out.println("TC02- click daily streak on new format page");
            Thread.sleep(1000);
            if (isVisibleWithId("com.threesixteen.app:id/btn_collect")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/btn_collect");
            System.out.println("TC03- Click on collect reward");
            Thread.sleep(5000);
            SkipAd();
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_coins");
            System.out.println("TC04- Click on coins on next bottom sheet");
            Thread.sleep(1000);
            SkipAd();
            clickAndWaitForElementWithId("com.threesixteen.app:id/btn_earn_more");
            System.out.println("TC05- Click on earn more coins");
            Thread.sleep(1000);
            if (isVisibleWithXPath1("//*[contains(@text,'How To Win?')]")) {

            driver.findElement(By.xpath("//*[contains(@text,'How To Win?')]")).click();
            System.out.println("TC08- click on how to win");
            }
	        }
	        }
    else
    {           
    	 driver.findElement(By.id("com.threesixteen.app:id/iv_daily_streak")).click();
         System.out.println("TC02- click daily streak on old format");
         Thread.sleep(1000);
         
         if (isVisibleWithId("com.threesixteen.app:id/btn_collect")) {
         clickAndWaitForElementWithId("com.threesixteen.app:id/btn_collect");
         System.out.println("TC03- Click on collect reward");
         Thread.sleep(5000);
         SkipAd();        
         clickAndWaitForElementWithId("com.threesixteen.app:id/tv_coins"); 
         System.out.println("TC04- Click on coins on next bottom sheet");
         Thread.sleep(1000);
         SkipAd();
         clickAndWaitForElementWithId("com.threesixteen.app:id/btn_earn_more");
         System.out.println("TC05- Click on earn more coins");
         Thread.sleep(1000);
         
         if (isVisibleWithXPath1("//*[contains(@text,'How To Win?')]")) {

             driver.findElement(By.xpath("//*[contains(@text,'How To Win?')]")).click();
             System.out.println("TC08- click on how to win");
             }
         else
         {
        	 
         driver.navigate().back();
             System.out.println("TC09- click on Close");
         }

         }
    }
	        }
    
        
        
       
    
    
    
    
    
    @Test(priority = 3)
    public void collectpendingcoins3() throws InterruptedException {
   
    
    	 
    	OpenTaskPage();
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_user_coins");
        System.out.println("TC02- Open coin logs");
        Thread.sleep(5000);
        SkipAd();
        clickAndWaitForElementWithId("com.threesixteen.app:id/layout_pending_coins");
        System.out.println("TC03- click on collect pending coins");
        Thread.sleep(1000);
        if (isVisibleWithXPath1("//*[contains(@text,'Collect')]")) {
            Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Collect')]")).click();
        System.out.println("TC04- clciked on pending coins collect button");
        Thread.sleep(1000);
        SkipAd();
        Thread.sleep(1000);
        SkipAd();
        driver.navigate().back();
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_user_coins");
        System.out.println("TC05- click on coins log Again");

        }

    }
  
    
	 
	 
    @Test(priority = 4)
    public void collectpendingcoins4() throws InterruptedException {
   
    
    	 
    	OpenTaskPage();
        Thread.sleep(1000);
        String targetText = "See All Rewards";
        boolean textFound = false;
        int maxScrolls = 3; 

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
        if(isVisibleWithXPath1("//*[contains(@text,'\" + targetText + \"')]"))
        {
        driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
        System.out.println("Clicking on: " + targetText);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(@text,'Collect Pending Coins')]")).click();
//        clickAndWaitForElementWithId("com.threesixteen.app:id/layout_pending_coins");
        System.out.println("TC02- click on collect pending coins");
        Thread.sleep(1000);
        if (isVisibleWithXPath1("//*[contains(@text,'Collect')]")) {
            Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Collect')]")).click();
        System.out.println("TC02- clciked on pending coins collect button");
        Thread.sleep(1000);


        }
        }

    }
		
	 
	
	 
		
		@Test(priority = 5)
		public void Taskpagequestions5() throws InterruptedException {
		
			
			OpenTaskPage();
		
		String targetText = "What is the use of Rooter Coins";
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
        driver.findElement(By.xpath("//*[contains(@text,'Close')]")).click();
        Thread.sleep(1000); 
        System.out.println("TC02- clciked on Close");
        
        String targetText1 = "Where can I check coins and diamond balance and history";
        boolean textFound1 = false;
        int maxScrolls1 = 7; 

        for (int i = 0; i < maxScrolls1 && !textFound1; i++) {
            try {
                driver.findElement(
               		 AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + targetText1 + "\"))"));         
                textFound1 = true;
                System.out.println("TC03- Product description scrolled and found");
            } catch (Exception e) {
                driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
                Thread.sleep(1000); 
            }
        }
        driver.findElement(By.xpath("//*[contains(@text,'" + targetText1 + "')]")).click();
        System.out.println("Clicking on: " + targetText1);

		
        Thread.sleep(1000); 
        driver.findElement(By.xpath("//*[contains(@text,'Close')]")).click();
        Thread.sleep(1000); 
        System.out.println("TC04- clciked on Close");

		}
        
        
    	@Test(priority = 6)
		public void Taskpagequestions6() throws InterruptedException {
    		
    	OpenTaskPage();
        Thread.sleep(5000); 

        String targetText11 = "Where do I get the Paytm Cashback";
        boolean textFound11 = false;
        int maxScrolls11 = 9; 

        for (int i = 0; i < maxScrolls11 && !textFound11; i++) {
            try {
                driver.findElement(
               		 AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + targetText11 + "\"))"));         
                textFound11 = true;
                System.out.println("TC05- Product description scrolled and found");
            } catch (Exception e) {
                driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
                Thread.sleep(1000); 
            }
        }
        driver.findElement(By.xpath("//*[contains(@text,'" + targetText11 + "')]")).click();
        System.out.println("Clicking on: " + targetText11);
		
        Thread.sleep(2000); 

        driver.findElement(By.xpath("//*[contains(@text,'Close')]")).click();
        Thread.sleep(1000); 
        System.out.println("TC06- clicked on Close");
    	}
    	
    	
    	
    	
    	@Test(priority = 7)
		public void Taskpagequestions7() throws InterruptedException {
   
        	OpenTaskPage();
		 String targetText111 = "How can I earn Rooter Coins";
	        boolean textFound111 = false;
	        int maxScrolls111 = 5; 

	        for (int i = 0; i < maxScrolls111 && !textFound111; i++) {
	            try {
	                driver.findElement(
	               		 AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + targetText111 + "\"))"));         
	                textFound111 = true;
	                System.out.println("TC07- Product description scrolled and found");
	            } catch (Exception e) {
	                driver.findElement(
	                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
	                Thread.sleep(1000); 
	            }
	        }
	        driver.findElement(By.xpath("//*[contains(@text,'" + targetText111 + "')]")).click();
	        System.out.println("Clicking on: " + targetText111);
            Thread.sleep(1000); 

		 driver.findElement(By.xpath("//*[contains(@text,'Close')]")).click();
	        Thread.sleep(1000); 
	        System.out.println("TC08- clciked on Close");
	 
		
		}
		

		
		
		
		@Test(priority = 8)
		public void Taskdone8() throws InterruptedException, MalformedURLException {
		
		
	    	OpenTaskPage();

		Thread.sleep(1000);
		System.out.println("TC01- Task page opened");	
	 driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
		if (isVisibleWithXPath1("//*[contains(@text,'Collect')]")) {
			clickAndWaitForElementWithXpath1("//*[contains(@text,'Collect')]");
			System.out.println("TC02- Coin collected");

		} else 
		
		{
			String targetText = "See More Tasks";
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
				clickAndWaitForElementWithXpath1("//*[contains(@text,'See More Tasks')]");
				System.out.println("TC03- Opened see More tasks");
				if (isVisibleWithXPath1("//*[contains(@text,'Collect')]")) {
					clickAndWaitForElementWithXpath1("//*[contains(@text,'Collect')]");
					System.out.println("TC04- Coin collected");
					SkipAd();
					if (isVisibleWithXPath1("//*[contains(@text,'Collect')]")) {
						clickAndWaitForElementWithXpath1("//*[contains(@text,'Collect')]");
						System.out.println("TC05- Coin collected");
						SkipAd();
					}
					else
					{
						clickAndWaitForElementWithXpath1("//*[contains(@text,'Watch')]");
						System.out.println("TC06- Tasks Opened");
					}
					
				}
				else
				if (isVisibleWithXPath1("//*[contains(@text,'Watch')]")) {
					clickAndWaitForElementWithXpath1("//*[contains(@text,'Watch')]");
					System.out.println("TC07- Tasks Opened");
				}

			}
		}
		
		
		
		
		
		
		@Test(priority = 9)
		public void SeeAlloffers9() throws InterruptedException, MalformedURLException {
		
			
			OpenTaskPage();
	        Thread.sleep(1000);
	        
			String targetText = "See All Offers";
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
			clickAndWaitForElementWithXpath1("//*[contains(@text,'Total offer winnings')]");
			System.out.println("TC04- offers page opened");

		}
	
		
	
	
		
		 @Test(priority = 10)
		    public void Taskpage10() throws InterruptedException {


			    	OpenTaskPage();
			        Thread.sleep(1000);
			        if(isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View"))
					{
			        	clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View");
					
					System.out.println("TC04- click on coupon");
					SkipAd();

		 					clickAndWaitForElementWithId("com.threesixteen.app:id/iv_coupon_info");
							System.out.println("TC04- Coupon opened");

		 }
		 
		 }
		 
		 
		 
		 
		 
		 @Test(priority = 11)
			public void OpenContestFromTaskPage11() throws InterruptedException {
			 
			 OpenTaskPage();
			 String targetText = "Contests";
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
		        Thread.sleep(1000);
		        
		        if (isVisibleWithXPath1("//*[contains(@text,'" + targetText + "')]")) {
		            driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
		            System.out.println("Clicking on: " + targetText);
		            Thread.sleep(1000);
		        
		        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_contest_view_all");
				System.out.println("TC01- Contest opened from task page");
		        Thread.sleep(2000);
				clickAndWaitForElementWithId("com.threesixteen.app:id/iv_history");
		        System.out.println("TC02- open Contest history");
		        Thread.sleep(2000);
		        driver.navigate().back();
		        Thread.sleep(2000);
		        driver.navigate().back();
		        Thread.sleep(2000);
		        System.out.println("TC03- Back from Contest history");

		        Thread.sleep(2000);
		        String targetText1 = "Contests";
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
		        System.out.println("Clicking on: " + targetText1);
		        Thread.sleep(2000);
		        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_contest_view_all");
				System.out.println("TC04- Contest opened from task page 2nd time");
		        Thread.sleep(2000);
		        }
		        else
		        {
					System.out.println("TC04- Contest not found on task page");

		        }

		 }
		 
		 
		 
		 
		 
		
				@Test(priority = 12)
				public void SeeMoreTasks12() throws InterruptedException, MalformedURLException {
				
					
					OpenTaskPage();
			        Thread.sleep(1000);       
					String targetText = "See More Tasks";
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
			        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_user_coins");
		            System.out.println("TC02- Open coin logs");
		            Thread.sleep(1000);
			 
	    	 }
		 
				
				
				
		 
		 
				 @Test(priority = 13)
				    public void CollectPendingCoinsfromRewardGaming13() throws InterruptedException {

				        OpenSideNav();
				        Thread.sleep(1000);
				        String targetText = "Rewards";
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
				            }
				        }
				        driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
				        System.out.println("Clicking on: " + targetText);
				        Thread.sleep(1000);
				        SkipSurvey();
				        SkipAd();
                        SkipAd();
//				        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.GridView/android.widget.FrameLayout[1]");
				        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View");
				        System.out.println("TC02- Gaming section  open in Rewards");
				        Thread.sleep(2000);
//			        	clickAndWaitForElementWithXpath1("//*[contains(@text,'All')]");
//				        System.out.println("TC03- click on All tabs");
//				        Thread.sleep(5000);
//				        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_buy_diamonds");
//				        System.out.println("TC04- click on collect pending coins");
//				        Thread.sleep(1000);
//				        driver.navigate().back();
//				        Thread.sleep(1000);
//				        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_buy_diamonds");
//				        System.out.println("TC05- click on collect pending coins");
//				        Thread.sleep(1000);

				     
				 }
				
				 
				 
				 @Test(priority = 14)
				    public void CollectPendingCoinsfromRewardWinning14() throws InterruptedException {

				        OpenSideNav();
				        Thread.sleep(1000);
				        String targetText = "Rewards";
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
				            }
				        }
				        driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
				        System.out.println("Clicking on: " + targetText);
				        SkipSurvey();
                        SkipAd();
                        SkipAd();
				        Thread.sleep(1000);
//				        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.GridView/android.widget.FrameLayout[1]");
				        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View");
				        System.out.println("TC02- Gaming section  open in Rewards");
				        Thread.sleep(5000);
//				        if (isVisibleWithXPath1("//*[contains(@text,'Winning')]"))
//				        		{
//				        	clickAndWaitForElementWithXpath1("//*[contains(@text,'Winning')]");
//					        System.out.println("TC03- Open winning tab");
//					        Thread.sleep(1000);
//					        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_buy_diamonds");
//					        System.out.println("TC04- click on collect pending coins");
//					        Thread.sleep(1000);
//					        driver.navigate().back();
//					        Thread.sleep(1000);
//					        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_buy_diamonds");
//					        System.out.println("TC05- click on collect pending coins");
//					        Thread.sleep(1000);
//				        		}
				 }
				 
				 
				 
				 
				 
				 
				 @Test(priority = 15)
				    public void SpinWheel15() throws InterruptedException {

				 OpenTaskPage();		 
				 if (isVisibleWithId("com.threesixteen.app:id/tv_spin_wheel")) {
				  driver.findElement(By.id("com.threesixteen.app:id/tv_spin_wheel")).click();
		            System.out.println("TC02- click on spin wheel");

		            Thread.sleep(1000);
		      
		            }
		            else
		            {
		            	
		            	driver.findElement(By.xpath("//*[contains(@text,'Spin & Win')]")).click();
		                System.out.println("TC03- click on spin and win");
		                Thread.sleep(1000);  
		                
		            }
				    driver.findElement(By.xpath("//*[contains(@text,'Spin Again')]")).click();
	                System.out.println("TC04- click on Spin Again");
	                Thread.sleep(20000); 
				    SkipAd();
				    
	            	driver.findElement(By.xpath("//*[contains(@text,'Spin & Win')]")).click();
	                System.out.println("TC05- click on Spin wheel");
				    SkipAd();

	                Thread.sleep(20000); 

	                driver.findElement(By.xpath("//*[contains(@text,'Collect Coins')]")).click();
	                System.out.println("TC06- click on collect coins");
				    SkipAd();

	                Thread.sleep(20000); 
	                SkipAd();
	                if (isVisibleWithXPath1("//*[contains(@text,'Spin Again')]")) {
	                driver.findElement(By.xpath("//*[contains(@text,'Spin Again')]")).click();
	                System.out.println("TC07- click on Spin Again");
	                Thread.sleep(2000); 
				    SkipAd();

				 }
				 else
				 {
					 driver.navigate().back();
					 driver.findElement(By.xpath("//*[contains(@text,'Spin Again')]")).click();
		                System.out.println("TC07- click on Spin Again");
		                Thread.sleep(2000); 
				 }
	                
				 }
				 
				 
				
				 
				 
				   
				    
				    @Test(priority = 16)
				    public void  QuizFFLeaderBoard16() throws InterruptedException, MalformedURLException {	
				    	
				 
				    	  clickAndWaitForElementWithXpath1(
					        		"//android.view.View[@content-desc=\"Rewards\"]");
				          Thread.sleep(2000);

				    	String targetText = "See All Quizzes";
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
				        System.out.println("TC01- Quiz found and opened");
				        Thread.sleep(2000);
				        
//				        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_quiz_card_bg");
//				        System.out.println("TC02- Quiz opened");
//				        Thread.sleep(1000);

				        clickAndWaitForElementWithXpath1("//*[contains(@text,'View Leaderboard')]");
				        System.out.println("TC03- FF leaderboard opened");
				         Thread.sleep(1000);
				         clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.widget.ImageView[2]");
				            System.out.println("TC04- FF leaderboard Refreshed");
				            Thread.sleep(1000);
//				            clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[3]");
//				            System.out.println("TC05- clicked on banner");
//				            Thread.sleep(1000);
//				            clickAndWaitForElementWithXpath1("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView");
//				            System.out.println("TC06- bottomsheet closed");
//				            Thread.sleep(1000);
				            clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[1]/android.view.View[3]/android.widget.TextView[1]");
				            System.out.println("TC07- Names are co ming in leaderboard");
				            Thread.sleep(1000);     
				            clickAndWaitForElementWithXpath1("//*[contains(@text,'Individual Performance')]");
				            System.out.println("TC08- Individual performance sheet opned");
				             Thread.sleep(1000);
				             driver.navigate().back();
				             System.out.println("TC09-individual performance bottomsheet closed");
				             Thread.sleep(1000);
				            
				            

				    }
				    
				    
				    
				    @Test(priority = 17)
				    public void IPLleaderboard17() throws InterruptedException, MalformedURLException {	
				    	
				 
//				    	  clickAndWaitForElementWithXpath1(
//					        		"//android.view.View[@content-desc=\"Rewards\"]");
//				          Thread.sleep(2000);
//
//					    	String targetText = "See All Quizzes";
//				        boolean textFound = false;
//				        int maxScrolls = 5; 
//
//				        for (int i = 0; i < maxScrolls && !textFound; i++) {
//				            try {
//				                driver.findElement(
//				               		 AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + targetText + "\"))"));         
//				                textFound = true;
//				                System.out.println("TC02- Product description scrolled and found");
//				            } catch (Exception e) {
//				                driver.findElement(
//				                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
//				                Thread.sleep(1000); 
//				            }
//				        }
//				        driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
//				        System.out.println("TC01- Quiz found");
//				        Thread.sleep(2000);
//				      
////				        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_quiz_card_bg");
////				        System.out.println("TC02- Quiz opened");
////				        Thread.sleep(1000);
//
//				        String targetText1 = "Play IPL Quiz & Win Exciting Prizes";
//				        boolean textFound1 = false;
//				        int maxScrolls1 = 5; 
//
//				        for (int i = 0; i < maxScrolls1 && !textFound1; i++) {
//				            try {
//				                driver.findElement(
//				               		 AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + targetText1 + "\"))"));         
//				                textFound1 = true;
//				                System.out.println("TC02- Product description scrolled and found");
//				            } catch (Exception e) {
//				                driver.findElement(
//				                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
//				                Thread.sleep(1000); 
//				            }
//				        }
//				        driver.findElement(By.xpath("//*[contains(@text,'" + targetText1 + "')]")).click();
//				        System.out.println("TC03- IPL quiz found");
//				        Thread.sleep(2000);
//				        
//				        driver.findElement(AppiumBy.androidUIAutomator(
//			                    "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));
//				        
//			            clickAndWaitForElementWithXpath1("//*[contains(@text,'View Leaderboard')]");
//				        System.out.println("TC04- IPL leaderboard Opened by clicking on view leaderboard");
//				        Thread.sleep(1000);
//				           clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.widget.ImageView[2]");
//				            System.out.println("TC05- IPL leaderboard Refreshed");
//				            Thread.sleep(1000);
//				            clickAndWaitForElementWithXpath1("//*[contains(@text,'See Winnings & Rules')]");
//				            System.out.println("TC06- clicked on banner");
//				            Thread.sleep(1000);
//				            driver.navigate().back();
//				            Thread.sleep(1000);
//				            clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.TextView[1]");
//				            System.out.println("TC08- Names are coming in yesterday's leaderboard");
//				            Thread.sleep(1000);    
//				            clickAndWaitForElementWithXpath1("//*[contains(@text,'Individual Performance')]");
//				            System.out.println("TC09- Individual performance sheet opned");
//				             Thread.sleep(1000);
//				             clickAndWaitForElementWithXpath1("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView[1]");
//				             System.out.println("T10-individual performance bottomsheet closed from yesterday's leaderboard");
//				             Thread.sleep(1000);
//				             
//				             
//				             
//				             clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.TextView");
//				             System.out.println("TC11- today's leaderboard opened");
//				              Thread.sleep(1000);
//				              clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.TextView[1]");
//				              System.out.println("TC12- Names are coming in today's leaderboard");
//				              Thread.sleep(1000);    
//				              clickAndWaitForElementWithXpath1("//*[contains(@text,'Individual Performance')]");
//				              System.out.println("TC13- Individual performance sheet opned");
//				               Thread.sleep(1000);
//				               clickAndWaitForElementWithXpath1("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView[1]");
//				               System.out.println("TC14-individual performance bottomsheet closed from today's leaderboard");
//				               Thread.sleep(1000);
//				               
//				               
//				               clickAndWaitForElementWithXpath1("//*[contains(@text,'Tournament')]");
//				               System.out.println("TC15- tournament leaderboard opened");
//				                Thread.sleep(1000);        
//				                clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.TextView[1]");
//				                System.out.println("TC16- Names are coming in tournament's leaderboard");
//				                Thread.sleep(1000);    
//				                clickAndWaitForElementWithXpath1("//*[contains(@text,'Individual Performance')]");
//				                System.out.println("TC17- Individual performance sheet opned");
//				                 Thread.sleep(1000);
//				                 clickAndWaitForElementWithXpath1("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView[1]");
//				                 System.out.println("TC18-individual performance bottomsheet closed from tournament's leaderboard");
//				                 Thread.sleep(1000);
				    	
				    	
				    	
				    }
				    
				    
				 
				
				
    }




