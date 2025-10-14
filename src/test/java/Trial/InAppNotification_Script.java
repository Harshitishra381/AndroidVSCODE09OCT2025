package Trial;

import io.appium.java_client.AppiumBy;

import org.openqa.selenium.*;
import org.testng.annotations.Test;


public class InAppNotification_Script<MobileElement, Rotatable> extends Functions  {


	

   
    @Test(priority = 1)
    
    public void InAppNotificationTest1() throws InterruptedException {

         OpenNotificationtab();
            Thread.sleep(1000);
			driver.findElement(By.xpath("//*[contains(@text,'Stream dekhiye aur coins jeetiye')]")).click();
//            clickAndWaitForElementWithXpath1(
//                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]");
        System.out.println("TC02 -Open first Notification from me tab");
        Thread.sleep(3000);
        // SkipSurvey();
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
        if (isVisibleWithId("com.threesixteen.app:id/imageViewMarkAllRead")) {
            System.out.println("Mark all read button is visible");
                    clickAndWaitForElementWithId("com.threesixteen.app:id/textViewMarkAllRead");
            System.out.println("TC05 -Mark on All read");
        } else {
            System.out.println("Mark all read button is not visible");
        }
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



