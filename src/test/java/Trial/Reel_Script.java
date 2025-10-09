package Trial;


import com.google.common.base.Objects;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import org.openqa.selenium.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Reel_Script<MobileElement, Rotatable> extends Functions {


	

    @Test(priority = 1)
    public void CentralReelTest1() throws InterruptedException {
    	
    	OpenCentralReeltab();
         ReelTest();
    }
     
            

    @Test(priority = 2)
    public void SearchReelTest2() throws InterruptedException, MalformedURLException {

        
        OpenSearch();
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
  		System.out.println("TC02- Click on search box");
        Thread.sleep(1000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("bgmi");
        System.out.println("TC03- Type bgmi in search");
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(@text,'Reels')]")).click();
        System.out.println("TC05- open reels tab from search");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.GridView/android.view.ViewGroup[1]");
        System.out.println("TC06- Open first reel from search");
		Thread.sleep(2000);

        ReelTest();
    }
        
       

    @Test(priority = 3)
    public void SelfProfieReelTest3() throws InterruptedException {
    	

        OpenSideNav();
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/txt_name");
        System.out.println("TC02- opens self profile");
        Thread.sleep(1000);
        if (isVisibleWithXPath1("//android.widget.LinearLayout[@content-desc=\"6\"]"))
        {
        clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"6\"]");   
        System.out.println("TC04- Open reel section");
        }
        if (isVisibleWithXPath1("//android.widget.LinearLayout[@content-desc=\"8\"]"))
        {
        clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"8\"]");   
        System.out.println("TC04- Open reel section");
        }
        if (isVisibleWithXPath1("//android.widget.LinearLayout[@content-desc=\"7\"]"))
        {
        clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"7\"]");   
        System.out.println("TC04- Open reel section");
        }
        if (isVisibleWithXPath1("//android.widget.LinearLayout[@content-desc=\"9\"]"))
        {
        clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"9\"]");   
        System.out.println("TC04- Open reel section");
        }
        
        if (isVisibleWithXPath1("//android.widget.LinearLayout[@content-desc=\"9\"]")) {
        clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"9\"]"); }
        
        if (isVisibleWithXPath1("//android.widget.LinearLayout[@content-desc=\"8\"]")) {
            clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"8\"]"); }
//      
        	 if (isVisibleWithXPath1("//android.widget.LinearLayout[@content-desc=\"10\"]")) {
        	        clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"10\"]"); }
//        
// 
//        if (isVisibleWithXPath1("//android.widget.LinearLayout[@content-desc=\"82\"]")) {
//            clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"82\"]"); }
//        
//        if (isVisibleWithXPath1("//android.widget.LinearLayout[@content-desc=\"83\"]")) {
//            clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"83\"]"); }
//        Thread.sleep(1000);
//        if (isVisibleWithXPath1("//android.widget.LinearLayout[@content-desc=\"2\"]")) {
//            clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"2\"]"); }
//          
//        if (isVisibleWithXPath1("//android.widget.LinearLayout[@content-desc=\"3\"]")) {
//            clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"3\"]"); }
//          
//        if (isVisibleWithXPath1("//android.widget.LinearLayout[@content-desc=\"4\"]")) {
//            clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"4\"]"); }
//          
//        if (isVisibleWithXPath1("//android.widget.LinearLayout[@content-desc=\"5\"]")) {
//            clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"5\"]"); }
//          
//        if (isVisibleWithXPath1("//android.widget.LinearLayout[@content-desc=\"6\"]")) {
//            clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"6\"]"); }
        
        
        
        
        
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.view.ViewGroup[1]/android.widget.ImageView");
        System.out.println("TC04- Open First reel");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_comment");
        System.out.println("TC07- Opened the comment section.....");
        Thread.sleep(1000);
        if (isVisibleWithId("com.threesixteen.app:id/tv_comment"))
        {
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
            System.out.println("TC08- clicked comment section.....");
            Thread.sleep(1000);
            (driver).findElement(By.id("com.threesixteen.app:id/et_comment")).sendKeys("wow");
            System.out.println("TC09- Typed wow comment section");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
            System.out.println("TC10- Comment on Reel Done");
            Thread.sleep(1000);
            (driver).findElement(By.xpath(
                            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"))
                    .click();
            System.out.println("TC11- Opened the list of likes in reel");
            Thread.sleep(1000);
//            (driver).findElement(By.xpath(
//                            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView"))
//                    .click();
            if (isVisibleWithId("com.threesixteen.app:id/btn_open_profile"))
            {
            clickAndWaitForElementWithId("com.threesixteen.app:id/btn_open_profile");
            Thread.sleep(1000);
            System.out.println("TC12- Opened user from list of likes in reel");
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
            System.out.println("TC13- Back from creators profile");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
            System.out.println("TC14- Existed from creators profile Card");
            }
            Thread.sleep(1000);
            if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
                Thread.sleep(1000);
            (driver).findElement(By.id("com.threesixteen.app:id/iv_close")).click();
            System.out.println("TC15- Existed from comment section"); 
            Thread.sleep(1000);
            
            }
        } 
        else 
        {
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_comment");
            System.out.println("TC07- Opened the comment section.....");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
            System.out.println("TC08- clicked comment section.....");
            Thread.sleep(1000);
            (driver).findElement(By.id("com.threesixteen.app:id/et_comment")).sendKeys("wow");
            System.out.println("TC09- Typed wow comment section");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
            System.out.println("TC10- Comment on Reel Done");
            Thread.sleep(1000);
            (driver).findElement(By.xpath(
                            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"))
                    .click();
            Thread.sleep(1000);
            System.out.println("TC11- Opened the list of likes in reel");
//            (driver).findElement(By.xpath(
//                            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView"))
//                    .click();
//            Thread.sleep(1000);
            if (isVisibleWithId("com.threesixteen.app:id/btn_open_profile"))
            {
                Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/btn_open_profile");
            System.out.println("TC12- Opened user from list of likes in reel");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
            System.out.println("TC13- Back from creators profile");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
            System.out.println("TC14- Existed from creators profile Card");
            Thread.sleep(1000);
            if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
                Thread.sleep(1000);
                (driver).findElement(By.id("com.threesixteen.app:id/iv_close")).click();
                System.out.println("TC15- Existed from comment section"); }
        }
            Thread.sleep(1000);
        (driver).findElement(By.id("com.threesixteen.app:id/iv_close")).click();
        System.out.println("TC15- Existed from comment section"); 
        }
        if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
            Thread.sleep(1000);
        (driver).findElement(By.id("com.threesixteen.app:id/iv_close")).click();
        System.out.println("TC15- Existed from comment section"); 
        Thread.sleep(1000);
        }
        Thread.sleep(5000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
        System.out.println("TC16- Creators Profile opened");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_open_profile");
        System.out.println("TC17- Creators Profile opened in full view");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
        System.out.println("TC18- Back from creators profile");
        Thread.sleep(1000);
//        if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
//            (driver).findElement(By.id("com.threesixteen.app:id/iv_close")).click();
//            System.out.println("TC19- Existed from comment section"); }
//            Thread.sleep(1000);
//        if (isVisibleWithId("com.threesixteen.app:id/iv_close")) 
//        {
//        	driver.navigate().back();
//            System.out.println("CLICK BACK ");
//
//         } 
    
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_share");
        System.out.println("TC20- Clicked on share icon on reel");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_copy_link");
        System.out.println("TC21- share link is copied");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_share");
        System.out.println("TC22- clicked on share icon on reel");
        Thread.sleep(1000);
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_download");
        System.out.println("TC23- Clicked on Download button button on reel");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        
    }

    
    
    

 
    @Test(priority = 4)
    public void CentralReelMuteUnmute4() throws InterruptedException, MalformedURLException {

    	OpenCentralReeltab();
        System.out.println("TC01- Central Reel Tab opened");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
        System.out.println("TC03- Reel mute & UnMute");
        if (isVisibleWithId("com.threesixteen.app:id/iv_like")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_like");
            System.out.println("TC04- Reels Liked");
        }

    }

    
    
   
    
    @Test(priority = 5)
    public void HorizontalReelTabTest5() throws InterruptedException, MalformedURLException {


    	 String targetText = "Reels";
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
         
        if (isVisibleWithId("com.threesixteen.app:id/iv_reels")) {
         driver.findElement(By.id("com.threesixteen.app:id/iv_reels")).click();
         System.out.println("TC05- Reel opened");
         
            ReelTest();
        }
        else
        {
        	 String targetText1 = "Watch More Reels";
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
           ReelTest();

        }
    }
  
    
 
   
    @Test(priority = 6)
    public void OthersProfileReellTest6() throws InterruptedException, MalformedURLException {

        OpenSearch();
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
        Thread.sleep(1000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Zainab");
        System.out.println("TC03- Type zainab in search");
        Thread.sleep(1000);
   	    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
   		System.out.println("TC04- Click on serach button");
   		Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(@text,'Creators')]")).click();
        System.out.println("TC05- Click on creator tab");
   		Thread.sleep(2000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
        System.out.println("TC06- open profile");
   		Thread.sleep(2000);
        clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"217\"]");
        System.out.println("TC07- open reels tab");
   		Thread.sleep(2000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.view.ViewGroup[2]/android.widget.ImageView");
        System.out.println("TC08- Open First reel");
        ReelTest();
        
    }
    
   

    @Test(priority = 7)

    public void ReelsTestAfterTabsSwitch7() throws InterruptedException {

        TabSwitch();
    	OpenCentralReeltab();
        ReelTest();
        
    }
    
    
    
    

    @Test(priority = 8)

    public void CentralReelsScroll50TimesAndTest8() throws InterruptedException {
    	
    	OpenCentralReeltab();

  	    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
	    System.out.println("TC02- Volume buton present");
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(5)"));
        System.out.println("TC03- Central reels tabs scrolled 1");
        driver.findElement(
               AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(5)"));
        System.out.println("TC04- Central reels tabs scrolled 2");

        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
	    System.out.println("TC05- Volume buton present");

        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(5)"));
         System.out.println("TC06-central reels tabs scrolled 3");
         
      if (isVisibleWithId("com.threesixteen.app:id/iv_like")) {
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_like");
        System.out.println("TC07- Reels Liked");
      }
      else
      {
    	  driver.findElement(
                  AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
           System.out.println("TC08-central reels tabs scrolled 3");
           clickAndWaitForElementWithId("com.threesixteen.app:id/iv_like");
           System.out.println("TC09- Reels Liked");
      }

      
				 
				  clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
				    System.out.println("TC12- Volume buton present");
			    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_post_date");
			    System.out.println("TC13- Reel views present");
			    Thread.sleep(1000);
			    driver.navigate().back();
			    Thread.sleep(1000);
			    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_more");
			    System.out.println("TC14- Clicked on Three dots");
			    if (isVisibleWithXPath1("//*[contains(@text,'Report')]")) {
			    driver.findElement(By.xpath("//*[contains(@text,'Report')]")).click();
			    System.out.println("TC15- Clicked on report");
			    clickAndWaitForElementWithXpath1(
			            "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.TextView");
			    System.out.println("TC16- select tag inappropriate");
			    clickAndWaitForElementWithId("com.threesixteen.app:id/btn_submit");
			    clickAndWaitForElementWithId("com.threesixteen.app:id/btn_submit");
			    System.out.println("TC17- Reel Reported");
			    if (isVisibleWithId("com.threesixteen.app:id/btn_submit"))
			    {
			    	driver.navigate().back();
			        System.out.println("TC18- This reel is already Reported");
			    }
			}
			    if (isVisibleWithId("com.threesixteen.app:id/iv_comment")) {
			clickAndWaitForElementWithId("com.threesixteen.app:id/iv_comment");
			//clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.LinearLayout[2]/android.widget.ImageView");
			System.out.println("TC19- Opened the comment section.....");
			Thread.sleep(1000);
    }
			    else
			    {
			    	 driver.findElement(
			                  AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
			           System.out.println("TC08-central reels tabs scrolled 3");
			           clickAndWaitForElementWithId("com.threesixteen.app:id/iv_comment");
						//clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.LinearLayout[2]/android.widget.ImageView");
						System.out.println("TC19- Opened the comment section.....");
						Thread.sleep(1000);
			    }
			if (isVisibleWithId("com.threesixteen.app:id/tv_comment")) {
			    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
			    System.out.println("TC20- clicked comment section.....");
			    (driver).findElement(By.id("com.threesixteen.app:id/et_comment")).sendKeys("wow");
			    System.out.println("TC21- Typed wow comment section");
			    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
			    System.out.println("TC22- Comment on Reel Done");
			    (driver).findElement(By.xpath(
			                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"))
			            .click();
			    System.out.println("TC22- Opened the list of likes in reel");
			    Thread.sleep(1000);
			    (driver).findElement(By.xpath(
			                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView"))
			            .click();
			    clickAndWaitForElementWithId("com.threesixteen.app:id/btn_open_profile");
			    System.out.println("TC23- Opened user from list of likes in reel");
			    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
			    System.out.println("TC24- Back from creators profile");
			    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
			    System.out.println("TC25- Existed from creators profile Card");
			    if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
		            (driver).findElement(By.id("com.threesixteen.app:id/iv_close")).click();
		            System.out.println("TC26- Existed from comment section"); }
		            Thread.sleep(1000);
			} else {
			    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_comment");
			//  clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.LinearLayout[2]/android.widget.ImageView");
			    System.out.println("TC26A- Opened the comment section.....");
			    Thread.sleep(1000);
			    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
			    System.out.println("TC27- clicked comment section.....");
			    (driver).findElement(By.id("com.threesixteen.app:id/et_comment")).sendKeys("wow");
			    System.out.println("TC28- Typed wow comment section");
			    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
			    System.out.println("TC29- Comment on Reel Done");
			    (driver).findElement(By.xpath(
			                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"))
			            .click();
			    System.out.println("TC30- Opened the list of likes in reel");
			    Thread.sleep(1000);
			    (driver).findElement(By.xpath(
			                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView"))
			            .click();
			    clickAndWaitForElementWithId("com.threesixteen.app:id/btn_open_profile");
			    System.out.println("TC31- Opened user from list of likes in reel");
			    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
			    System.out.println("TC32- Back from creators profile");
			    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
			    System.out.println("TC33- Existed from creators profile Card");
			    if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
		            (driver).findElement(By.id("com.threesixteen.app:id/iv_close")).click();
		            System.out.println("TC34- Existed from comment section"); }
		            Thread.sleep(1000);
			}
			clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
			System.out.println("TC35- Creators Profile opened");
            Thread.sleep(1000);
			clickAndWaitForElementWithId("com.threesixteen.app:id/btn_open_profile");
			System.out.println("TC36- Creators Profile opened in full view");
            Thread.sleep(1000);
			clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
			System.out.println("TC37- Back from creators profile");
            Thread.sleep(1000);
			 if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
		            Thread.sleep(1000);
		            (driver).findElement(By.id("com.threesixteen.app:id/iv_close")).click();
		            System.out.println("TC38- Existed from section"); }
		            Thread.sleep(1000);
			if (isVisibleWithId("com.threesixteen.app:id/iv_close"))
			{
				driver.navigate().back();
			}
			clickAndWaitForElementWithId("com.threesixteen.app:id/iv_share");
			System.out.println("TC39- Clicked on share icon on reel");
			clickAndWaitForElementWithId("com.threesixteen.app:id/tv_copy_link");
			System.out.println("TC40- share link is copied");
			clickAndWaitForElementWithId("com.threesixteen.app:id/iv_share");
			System.out.println("TC41- clicked on share icon on reel");
			clickAndWaitForElementWithId("com.threesixteen.app:id/tv_download");
			System.out.println("TC42- Clicked on Download button button on reel");
			if (isVisibleWithId("com.threesixteen.app:id/iv_profileImage"))
			{
				 clickAndWaitForElementWithId("com.threesixteen.app:id/iv_profileImage");
				    System.out.println("TC43- creator profile image present");
			}
			else
			{
				 driver.navigate().back();
				    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_profileImage");
				    System.out.println("TC44- creator profile image present");
			}    }

    
    
    
  

    @Test(priority = 10)
    public void OthersPofileReelScroll10() throws InterruptedException {

        OpenSearch();
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
        Thread.sleep(1000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("zainab");
        System.out.println("TC03- Type zainab in search");
        Thread.sleep(1000);
   	 driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
   		System.out.println("TC04- Click on serach button");
   		Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(@text,'Creators')]")).click();
        System.out.println("TC05- Click on creator tab");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
        System.out.println("TC06- open profile");
        clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"217\"]");
        System.out.println("TC07- open reels tab");
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.view.ViewGroup[2]/android.widget.ImageView");
        System.out.println("TC08- Open First reel");
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(5)"));
        driver.findElement(AppiumBy
                .androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(5)"));
        System.out.println("TC09- Reels scrolled");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_share");
		System.out.println("Tc10- Clicked on share icon on reel");
        	

    }
   
    
    @Test(priority = 11)
    
    public void ReelTestonSeachAllTab11() throws InterruptedException {

        OpenSearch();
        Thread.sleep(2000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
        Thread.sleep(2000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("BGMI");
        System.out.println("TC03- Type BGMI in search");
        Thread.sleep(2000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
        Thread.sleep(5000);
        driver.findElement(By.id("com.threesixteen.app:id/tv_view_all_reel")).click();        
        System.out.println("TC04- Click on view All");
        Thread.sleep(2000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/card_view");
        System.out.println("TC04- Open First reel");
        Thread.sleep(20000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_share");
     		System.out.println("TC05- Clicked on share icon on reel");

    }
    
    
    
 @Test(priority = 12)
    

 public void ReelTestAfterVideoMiniPlayer12() throws InterruptedException {

        OpenVideo();    
        Thread.sleep(7000);
        driver.navigate().back();
        System.out.println("TC02- switch to mini player");
        Thread.sleep(1000);
    	OpenCentralReeltab();
        System.out.println("TC01- Central Reel Tab opened");
        ReelTest();

    }
	
 
 
 
 
    
 @Test(priority = 13)
 
 public void ReelTestAfterLiveStreamMiniPlayer13() throws InterruptedException {

     OpenLivetStream();   
     SkipSurvey();
     Thread.sleep(5000);
     driver.navigate().back();
     System.out.println("TC02- switch to mini player");
 	OpenCentralReeltab();
     System.out.println("TC01- Central Reel Tab opened");
     ReelTest();

 }
 
 
 
@Test(priority = 14)
 
 public void HorizontalReelTestAfterMiniPlayer14() throws InterruptedException {

     OpenLivetStream();   
     Thread.sleep(5000);
     driver.navigate().back();
     System.out.println("TC02- switch to mini player");
//     clickAndWaitForElementWithXpath1(
//	            "//android.widget.FrameLayout[@content-desc=\"Home\"]/android.widget.FrameLayout[1]");
//     Thread.sleep(2000);
     if (isVisibleWithXPath1("//*[contains(@text,'For You')]"))
     {
    	 
         clickAndWaitForElementWithXpath1("//*[contains(@text,'For You')]");
         System.out.println("TC03- For you tab opened");	 
     }
     else
     {
    	 driver.navigate().back();
         System.out.println("TC02- switch to mini player 2nd time");
         clickAndWaitForElementWithXpath1("//*[contains(@text,'For You')]");
         System.out.println("TC03- For you tab opened");
         Thread.sleep(5000);
     }
//     clickAndWaitForElementWithXpath1("//*[contains(@text,'For You')]");
//     System.out.println("TC03- For you tab opened");
//     Thread.sleep(5000);

     String targetText = "Reels";
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
     Thread.sleep(2000);
     driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
     System.out.println("Clicking on: " + targetText);
     Thread.sleep(2000);
     SkipSurvey();

    if (isVisibleWithId("com.threesixteen.app:id/iv_reels")) {
     driver.findElement(By.id("com.threesixteen.app:id/iv_reels")).click();
     System.out.println("TC05- Reel opened");
     Thread.sleep(2000);

        ReelTest();
    }
    else
    {
    	 String targetText1 = "Watch More Reels";
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
       SkipSurvey();

       ReelTest();

    }
}


  

@Test(priority = 15)

public void ReelDelete15() throws InterruptedException {
	
	

	 OpenSideNav();
     Thread.sleep(1000);
     clickAndWaitForElementWithId("com.threesixteen.app:id/txt_name");
     System.out.println("TC02- opens self profile");
     Thread.sleep(5000);
     if (isVisibleWithXPath1("//android.widget.LinearLayout[@content-desc=\"6\"]"))
     {
     clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"6\"]");   
     System.out.println("TC04- Open reel section");
     }
     if (isVisibleWithXPath1("//android.widget.LinearLayout[@content-desc=\"7\"]"))
     {
     clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"7\"]");   
     System.out.println("TC04- Open reel section");
     if (isVisibleWithXPath1("//android.widget.LinearLayout[@content-desc=\"8\"]"))
     {
     clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"8\"]");   
     System.out.println("TC04- Open reel section");
     }
     if (isVisibleWithXPath1("//android.widget.LinearLayout[@content-desc=\"9\"]"))
     {
     clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"9\"]");   
     System.out.println("TC04- Open reel section");
     }
     Thread.sleep(1000);
     clickAndWaitForElementWithXpath1(
             "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.view.ViewGroup[1]/android.widget.ImageView");
     System.out.println("TC04- Open First reel");
     Thread.sleep(5000);
     clickAndWaitForElementWithId("com.threesixteen.app:id/iv_more");
     System.out.println("TC09- Clicked on Three dots");
     Thread.sleep(2000);
     if (isVisibleWithXPath1("//*[contains(@text,'Delete')]")) 
     {
         Thread.sleep(2000);
     driver.findElement(By.xpath("//*[contains(@text,'Delete')]")).click();
     System.out.println("TC10- Clicked on Delete");
     Thread.sleep(2000);
}
else
{    
    Thread.sleep(2000);
	clickAndWaitForElementWithId("com.threesixteen.app:id/iv_more");
    System.out.println("TC11- Clicked on Three dots");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[contains(@text,'Delete')]")).click();
    System.out.println("TC12- Clicked on Delete");
    Thread.sleep(1000);
}
}
}
	
	
	
	

@Test(priority = 16)

public void ReelUploadNewReel16() throws InterruptedException {

		
		
		OpenSideNav();
		Thread.sleep(500);
		clickAndWaitForElementWithXpath1("//*[contains(@text,'Create')]");
		//clickAndWaitForElementWithId("com.threesixteen.app:id/btn_create");
		System.out.println("TC02- Click on create");
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/layout_reel");
		System.out.println("TC03- Click on Reel upload");
		Thread.sleep(1000);		
		if (isVisibleWithId("com.android.permissioncontroller:id/permission_allow_button")) {
			Thread.sleep(1000);
			clickAndWaitForElementWithId("com.android.permissioncontroller:id/permission_allow_button");
			System.out.println("TC04- Click on permission allowed");

			Thread.sleep(1000);
		}
		clickAndWaitForElementWithXpath1("//*[contains(@text,'Video')]");
		Thread.sleep(2000);
		System.out.println("TC05- Click on Video");
		Thread.sleep(3000);

		  String targetText = "Kya karein ese teammates ka_ #BGMI.mp4";
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
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
	        System.out.println("Clicking on: " + targetText);
	        Thread.sleep(3200);
//        	clickAndWaitForElementWithXpath1("//*[contains(@text,'Kya karein ese teammates ka_ #BGMI.mp4.mp4')]");
		Thread.sleep(2000);
		System.out.println("TC06- Reel selected");
		Thread.sleep(2000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/et_video_title");
		System.out.println("TC07- Click on Edit reel title");
		Thread.sleep(2000);
		(driver).findElement(By.id("com.threesixteen.app:id/et_video_title")).sendKeys("Test Reel");
		System.out.println("TC08- Typing title");
	    Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/btn_select_game");
		System.out.println("TC09- Click on select Game");
	    Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/btn_select");
		System.out.println("TC10- Game selected");
	    Thread.sleep(1000);
//		clickAndWaitForElementWithXpath1("//*[contains(@text,'Select Tag')]");
//		System.out.println("TC11- click on select tag");
//	    Thread.sleep(1000);
////		clickAndWaitForElementWithXpath1("//*[contains(@text,'EmoteRoyale')]");
////	    Thread.sleep(1000);
////		System.out.println("TC12- Selecting tag");
////		clickAndWaitForElementWithXpath1("//*[contains(@text,'Meme')]");
////	    Thread.sleep(1000);
////		clickAndWaitForElementWithXpath1("//*[contains(@text,'Adventure')]");
////	    Thread.sleep(1000);
//		clickAndWaitForElementWithId("com.threesixteen.app:id/btn_done");
//		System.out.println("TC13- click On Done");
//	    Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/add_thumbnail_button");
		System.out.println("TC14- click On Thumbnail");
	    Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/iv_thumbnail");
		System.out.println("TC15- Select thumbnail");
	    Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/btn_buy");
		System.out.println("TC16- Click on select");
	    Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/btn_post");
		System.out.println("TC17- Click on Post Reel");
	    Thread.sleep(5000);
	    driver.navigate().back();
	    Thread.sleep(5000);
		 OpenSideNav();
	     clickAndWaitForElementWithId("com.threesixteen.app:id/txt_name");
	     System.out.println("TC19- opens self profile");
		    Thread.sleep(1000);
		 
		    if (isVisibleWithXPath1("//android.widget.LinearLayout[@content-desc=\"8\"]"))
		     {
		     clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"8\"]");   
		     System.out.println("TC20- Open reel section");
		     }
		     if (isVisibleWithXPath1("//android.widget.LinearLayout[@content-desc=\"7\"]"))
		     {
		     clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"7\"]");   
		     System.out.println("TC20- Open reel section");
		     }
		     if (isVisibleWithXPath1("//android.widget.LinearLayout[@content-desc=\"9\"]"))
		     {
		     clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"9\"]");   
		     System.out.println("TC20- Open reel section");
		     }		     
		    
		     	     System.out.println("TC19- opens Reel tab");
		    Thread.sleep(1000);
		     }


@Test(priority = 17)
public void ReelOpenfromVideoRecommendationse17() throws InterruptedException, MalformedURLException {


        OpenVideo();
        Thread.sleep(3000);         

        driver.findElement(AppiumBy.androidUIAutomator(
             "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));

        
        String targetText = "Reels";
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
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
        System.out.println("Clicking on: " + targetText);
        
        
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_reels");
		System.out.println("TC15- Open reel");
	    Thread.sleep(1000);
	    ReelTest();
	    
}









@Test(priority = 18)
public void Reelsftertabswitch18() throws InterruptedException, MalformedURLException {



	  OpenCentralReeltab();
      Thread.sleep(1000);
	  MobileElement element1 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/tv_name"));
      String CreatorName1 = ((WebElement) element1).getText();
      System.out.println("TC02- Creator Name of the reel is  " + CreatorName1);
      Thread.sleep(1000);
      TabSwitch();
	  System.out.println("TC03- tab switch done");
	    
      OpenCentralReeltab();

      MobileElement element2 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/tv_name"));
      String CreatorName2 = ((WebElement) element2).getText();
      System.out.println("TC05- Creator Name of the reel after tab switch is  " + CreatorName2);
      Thread.sleep(1000); 
      if (Objects.equal(CreatorName1, CreatorName2)) {
    	    Thread.sleep(1000);
    	    System.out.println("TC15 - Creator Name is same for reel after tabs switch");
    	} else {
    	    Thread.sleep(1000);
    	    System.out.println("TC15 - Creator Name is not same for reel after tabs switch");
    	    OpenSideNav();
    	}
}
	



@Test(priority = 19)
public void ReelsftercomingfromBackground19() throws InterruptedException, MalformedURLException {



	  OpenCentralReeltab();
      Thread.sleep(1000);
	  MobileElement element1 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/tv_name"));
      String CreatorName1 = ((WebElement) element1).getText();
      System.out.println("TC02- Creator Name of the reel is  " + CreatorName1);
      Thread.sleep(1000);
      SendAppInBackground();
	    

      MobileElement element2 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/tv_name"));
      String CreatorName2 = ((WebElement) element2).getText();
      System.out.println("TC05- Creator Name of the reel after tab switch is  " + CreatorName2);
      Thread.sleep(1000); 
      if (Objects.equal(CreatorName1, CreatorName2)) {
    	    Thread.sleep(1000);
    	    System.out.println("TC06 - Creator Name is same for reel after tabs switch");
    	} else {
    	    Thread.sleep(1000);
    	    System.out.println("TC07 - Creator Name is not same for reel after tabs switch");
    	    OpenSideNav();
    	}
}




   @Test(priority = 20)
    public void ReelsAfterComingFromBackgroundTooLong20() throws InterruptedException, MalformedURLException {



	  OpenCentralReeltab();
      Thread.sleep(1000);
	  MobileElement element1 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/tv_name"));
      String CreatorName1 = ((WebElement) element1).getText();
      System.out.println("TC02- Creator Name of the reel is  " + CreatorName1);
      Thread.sleep(2000);
      
      ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.HOME));
      Thread.sleep(50000);
  
      clickAndWaitForElementWithXpath1("//android.widget.TextView[@content-desc=\"Rooter\"]");
      Thread.sleep(3000);	    

      MobileElement element2 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/tv_name"));
      String CreatorName2 = ((WebElement) element2).getText();
      System.out.println("TC05- Creator Name of the reel after tab switch is  " + CreatorName2);
      Thread.sleep(1000); 
      if (Objects.equal(CreatorName1, CreatorName2)) {
    	    Thread.sleep(1000);
    	    System.out.println("TC06 - Creator Name is same for reel after tabs switch");
    	} else {
    	    Thread.sleep(1000);
    	    System.out.println("TC07 - Creator Name is not same for reel after tabs switch");
    	    OpenSideNav();
    	}
}
	




   @Test(priority = 21)
   public void CentralReelTabReelPlayingOrNot21() throws InterruptedException, MalformedURLException {


    OpenCentralReeltab();
    Thread.sleep(1000);    
    CheckReelProgress();
    
    
   }

   
   
   
   @Test(priority = 22)
   public void SearchReelPlayingOrNot22() throws InterruptedException, MalformedURLException {

	   OpenSearch();
       Thread.sleep(2000);
       clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
       System.out.println("TC02- Click on search box");
       Thread.sleep(2000);
       (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("BGMI");
       System.out.println("TC03- Type BGMI in search");
       Thread.sleep(2000);
       driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
       Thread.sleep(5000);
       driver.findElement(By.id("com.threesixteen.app:id/tv_view_all_reel")).click();        
       System.out.println("TC04- Click on view All");
       Thread.sleep(2000);
       clickAndWaitForElementWithId("com.threesixteen.app:id/card_view");
       System.out.println("TC04- Open First reel");
       Thread.sleep(2000);
       CheckReelProgress();
   
   }
   


	@AfterMethod
	
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}



