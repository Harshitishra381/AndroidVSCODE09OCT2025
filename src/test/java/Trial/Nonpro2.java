package Trial;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;

public class Nonpro2<MobileElement> extends Functions{


   
    @Test(priority = 00)
    public void BuyProTest00() throws InterruptedException {

          OpenSideNav();
		Thread.sleep(1000);
			driver.findElement(By.xpath("//*[contains(@text,'Buy Pro')]")).click();
			System.out.println("TC02- Click on Buy pro");
			Thread.sleep(5000);
			driver.navigate().back();
			OpenCentralReelTab();
			Thread.sleep(2000);
					System.out.println("TC03- Back from Buy pro");
			
			
//			String currentContext = ((AndroidDriver) driver).getContext();
//
//			// List all available contexts
//			Set<String> contextHandles = ((AndroidDriver) driver).getContextHandles();
//
//			// Switch to web view
//			for (String contextHandle : contextHandles) {
//			    if (contextHandle.contains("WEBVIEW")) {
//			        ((AndroidDriver) driver).context(contextHandle);
//			        break;
//			    }
//			}

//			System.out.println("TC03- Swicthed to Webview");
//			Thread.sleep(10000);

//			WebElement element = driver.findElement(By.xpath("//*[contains(@text,'Buy for')]"));
//			element.click();
			
//			System.out.println("TC04- click on buy for");
//			Thread.sleep(10000);

			
			
		}
    
    

    
    
    
    
    
    private void OpenCentralReelTab() {
		// TODO Auto-generated method stub
		
	}


	@Test(priority = 01)
    public void UnlockProStreamTest01() throws InterruptedException {
    	
    	 if (isVisibleWithXPath1(
                 "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button")) {
             clickAndWaitForElementWithXpath1(
                     "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
             System.out.println("TC01- Pro stream opened");

         } else {
             driver.findElement(By.xpath("//*[contains(@text,'Pro Streams')]")).click();
             System.out.println("TC01- Pro tab opened");
         }
					clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
					System.out.println("TC02- stream opened");
					Thread.sleep(10000);
					if (isVisibleWithId("com.threesixteen.app:id/tv_timer_fls")) 
					   {
						clickAndWaitForElementWithId("com.threesixteen.app:id/tv_timer_fls");
						System.out.println("TC03- Free review timer is working");
						Thread.sleep(1000);
						clickAndWaitForElementWithId("com.threesixteen.app:id/stream_tier_tag_fls");
						System.out.println("TC04- Clicked on watch ad/buy pro badges");
						Thread.sleep(5000);
					   }
					else
					{
						System.out.println("TC04- This is pro stream");

					}
						
	    	   
				

						}
			     
					
    
    
    
    
					         
    @Test(priority = 03)
    public void commenrOnNonprotest03() throws InterruptedException {		    
					         
    	 if (isVisibleWithXPath1(
                 "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button")) {
             clickAndWaitForElementWithXpath1(
                     "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
             System.out.println("TC01- Pro stream opened");

         } else {
             driver.findElement(By.xpath("//*[contains(@text,'Pro Streams')]")).click();
             System.out.println("TC01- Pro tab opened");
         }
	
			clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
			System.out.println("TC02- opened feed");
			Thread.sleep(50000);

			clickAndWaitForElementWithId("com.threesixteen.app:id/et_comment_collapsed");
			System.out.println("TC03- clicked comment section.....");
			Thread.sleep(2000);
			if (isVisibleWithId("com.threesixteen.app:id/et_comment"))
			{
			(driver).findElement(By.id("com.threesixteen.app:id/et_comment")).sendKeys("Hi");
			System.out.println("TC04- Typed Hi comment section.....");
			Thread.sleep(2000);
			clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
			System.out.println("TC05- Sended comment on live stream");
			Thread.sleep(2000);
			}
	
	
}
    
    
    
    
    @Test(priority = 04)
    public void Buyprocoupon04() throws InterruptedException {	
    
    		    

    			if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ImageView"))
    			{   clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ImageView");
    			        System.out.println("TC01- open side nav from old homapage");
    			}
    			else
    			{
    			    clickAndWaitForElementWithId("com.threesixteen.app:id/layout_nav_profile");
    			    System.out.println("TC02- open side nav from New homapage");
    			}
    		    
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
			                Thread.sleep(1000); 
			            }
			        }
			        driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
			        System.out.println("Clicking on: " + targetText);
			        Thread.sleep(1000);  
				clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"Gaming\"]");
				System.out.println("TC03- Gaming section  open in Rewards");
				driver.findElement(By.xpath("//*[contains(@text,'Redeem Now')]")).click();
				System.out.println("TC04- Click on redeem now");
				if (isVisibleWithXPath1("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.TextView"))
				{
					driver.findElement(By.xpath(
						"/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.TextView"))
						.click();
					
				System.out.println("TC05- Click on Buy pro");
				Thread.sleep(2000);
				driver.navigate().back();
				System.out.println("TC06- Back from Buy pro");
				Thread.sleep(2000);
				driver.navigate().back();
				}
				else
				{
					System.out.println("TC06- No pro coupons avaible on top");

				}
			
			}
					
    
    @Test(priority = 05)
    public void acesss1080fornonpro05() throws InterruptedException {	
    }
    	
    	
//    	clickAndWaitForElementWithXpath1(
//				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
//		System.out.println("TC01- Pro stream tab opened");
//		Thread.sleep(1000);
//		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
//		System.out.println("TC02- opened feed");
//			Thread.sleep(1000);
//				Thread.sleep(50000);
//				clickAndWaitForElementWithId("com.threesixteen.app:id/stream_tier_tag_fls");
//				System.out.println("TC03- Clicked on watch ad");
//			Thread.sleep(50000);
//			driver.navigate().back();
//			System.out.println("TC04- Close bottom sheet");
//			Thread.sleep(5000);
//			driver.navigate().back();
//			System.out.println("TC05- Exist from rewarded ad");
//			Thread.sleep(5000);
//			clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//			System.out.println("TC06- Click on overlay");
//			Thread.sleep(1000);
//			clickAndWaitForElementWithId("com.threesixteen.app:id/layout_menu");
//			System.out.println("TC07- stream unlocked");
//			Thread.sleep(10000);
//			 driver.navigate().back();
//		        Thread.sleep(1000);
//		        clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
//		        Thread.sleep(1000);
//		        clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
//		        System.out.println("TC03- Mini player paused & send to portrait");
//		        Thread.sleep(2000);  
//			clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//			clickAndWaitForElementWithId(
//					"com.threesixteen.app:id/btn_more_options");
//			System.out.println("TC08- Clicked on live player setting");
//			Thread.sleep(3000);
//			clickAndWaitForElementWithXpath1("//*[contains(@text,'Video Quality')]");
////			/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]
//			System.out.println("TC09- clicked on video quality");
//			Thread.sleep(1000);
//			if (isVisibleWithXPath1("//*[contains(@text,'1080p')]"))
//			{
//			clickAndWaitForElementWithXpath1("//*[contains(@text,'1080p')]");
//			System.out.println("TC10 chnaged the stream qulaity to 1080p");
//			Thread.sleep(3000);
//			driver.navigate().back();
//			Thread.sleep(3000);
//			System.out.println("TC11- Back from rooter pro page");
//			}
//			else
//			{
//			clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
//			System.out.println("TC12- Exist from Live chat");
//			Thread.sleep(1000);
//			clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
//			System.out.println("TC13- Open suggested Live stream from suggestion");
//			Thread.sleep(10000);
//			clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//			clickAndWaitForElementWithId(
//					"com.threesixteen.app:id/btn_more_options");
//			System.out.println("TC14- Clicked on live player setting");
//			Thread.sleep(1000);
//			clickAndWaitForElementWithXpath1("//*[contains(@text,'Video Quality')]");
//			System.out.println("TC15- clicked on video quality");
//			Thread.sleep(5000);
//			if (isVisibleWithXPath1("//*[contains(@text,'1080p')]")) 
//			{
//				clickAndWaitForElementWithXpath1("//*[contains(@text,'1080p')]");
//				System.out.println("TC16- chnaged the stream qulaity to 1080p");
//				Thread.sleep(3000);
//				driver.navigate().back();
//				Thread.sleep(3000);
//				System.out.println("TC17- Back from rooter pro page");
//			} 
//			else 
//			{
//				clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
//				System.out.println("TCC18- Exist from Live chat");
//				Thread.sleep(1000);
//				clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
//				System.out.println("TC19- Open suggested video");
//				Thread.sleep(60000);
//				clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//				clickAndWaitForElementWithId(
//						"com.threesixteen.app:id/btn_more_options");
//				System.out.println("TC20- Clicked on live player setting");
//				Thread.sleep(1000);
//				clickAndWaitForElementWithXpath1("//*[contains(@text,'Video Quality')]");
//				System.out.println("TC21- clicked on video quality");
//				Thread.sleep(5000);
//				if (isVisibleWithXPath1("//*[contains(@text,'1080p')]"))
//					;
//				{
//					clickAndWaitForElementWithXpath1("//*[contains(@text,'1080p')]");
//					System.out.println("T22- chnaged the stream qulaity to 1080p");
//					Thread.sleep(5000);
//					driver.navigate().back();
//				    Thread.sleep(3000);
//					System.out.println("T23- Back from rooter pro page");
//		        }
//			}
//		}
//	}
    	
    	
    	
    @Test(priority = 05)
    public void FreepreviewtimerafterPIP05() throws InterruptedException {	
    
    	
    	
    	 if (isVisibleWithXPath1(
                 "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button")) {
             clickAndWaitForElementWithXpath1(
                     "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
             System.out.println("TC01- Pro stream opened");

         } else {
             driver.findElement(By.xpath("//*[contains(@text,'Pro Streams')]")).click();
             System.out.println("TC01- Pro tab opened");
         }
							clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
							System.out.println("TC02- stream opened");
							Thread.sleep(50000);
						
								((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.HOME));
					            System.out.println("TC03- Switched to PIP");
					            clickAndWaitForElementWithXpath1("//android.widget.TextView[@content-desc=\"Rooter\"]");
					            System.out.println("TC04- Switched PIP to full screen");
					            ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.HOME));
					            System.out.println("TC05- Switched to PIP");
					            clickAndWaitForElementWithXpath1("//android.widget.TextView[@content-desc=\"Rooter\"]");
					            System.out.println("TC06- Switched PIP to full screen");
					            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_timer_fls");
					            System.out.println("TC07- Free preview timer is working fine after PIP");

							   
    	
							
    	
    	
    	
    }

    
    
    
    @Test(priority = 06)
    public void liveplayercomenntByNonPro06() throws InterruptedException {

        if (isVisibleWithXPath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button")) {
            clickAndWaitForElementWithXpath1(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
            System.out.println("TC01- Pro stream opened");

        } else {
            driver.findElement(By.xpath("//*[contains(@text,'Pro Streams')]")).click();
            System.out.println("TC01- Pro tab opened");
        }
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
        System.out.println("TC02- opened feed");
        Thread.sleep(7000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/et_comment_collapsed");
        System.out.println("TC06- clicked comment section.....");
      
        (driver).findElement(By.id("com.threesixteen.app:id/et_comment")).sendKeys("Hi");
        System.out.println("TC07- Typed Hi comment section.....");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
        System.out.println("TC08- Send the  comment on live stream");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
        System.out.println("TC09- Exist from Live chat");
        Thread.sleep(1000);
       
    }

	
	
	
	
	
	
	
	

	
	
	

	
	
	
	@AfterMethod
	

    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
