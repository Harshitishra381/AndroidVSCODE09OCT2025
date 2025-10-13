package Trial;


import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class ContestPage_Script extends Functions {


	
   

	 
	 @Test(priority = 1)
	    public void contestDatafunctionaltest1() throws InterruptedException, MalformedURLException {
	
		    OpenSideNav();
	        Thread.sleep(2000);
	    
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
	            driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
	            System.out.println("Clicking on: " + targetText);
	            Thread.sleep(1000);  
	        }
	        Thread.sleep(2000);
	        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView"))
	        {     clickAndWaitForElementWithXpath1(
	                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");
	                System.out.println("TC03- Open first contest ");

	        }
	        else
	        {
	        	
	        	 clickAndWaitForElementWithXpath1(
		                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[1]");
		                System.out.println("TC04- Open Live stream contest ");
	        }
//	            clickAndWaitForElementWithXpath1(
//	                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView");
//	            System.out.println("TC04- Open feed from contest");
	            Thread.sleep(10000);
	      if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.widget.FrameLayout[1]/android.widget.TextView"))      
	      {    clickAndWaitForElementWithXpath1(
                   "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.widget.FrameLayout[1]/android.widget.TextView");
	      }
	      else
	      {    clickAndWaitForElementWithXpath1(
                  "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.widget.FrameLayout[2]/android.widget.ImageView");
	      }
	       
		      System.out.println("TC05- Open Feed from first contest");
	           Thread.sleep(1000);
	        
		 if (isVisibleWithId("com.threesixteen.app:id/iv_more"))
			 
		 {
			  System.out.println("TC06- Reel opened from contest");
	            Thread.sleep(1000);
			  clickAndWaitForElementWithId("com.threesixteen.app:id/iv_more");
	            System.out.println("TC07- Clicked on Three dots");
	            Thread.sleep(1000);
	            if (isVisibleWithXPath1("//*[contains(@text,'About')]"))
	            {
	            driver.findElement(By.xpath("//*[contains(@text,'About')]")).click();
	            Thread.sleep(1000);
	            }
	            else
	            {
					  clickAndWaitForElementWithId("com.threesixteen.app:id/iv_more");
					  driver.findElement(By.xpath("//*[contains(@text,'About')]")).click();
			            Thread.sleep(1000);

	            }
	            
	            clickAndWaitForElementWithXpath1(
	                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button");
	            System.out.println("TC07A- Opened the about & Clicked on Done in Reels.....");
	            Thread.sleep(1000);
	 
		        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_more");
		        System.out.println("TC08- Clicked on Three dots");
		        Thread.sleep(1000);
		        if (isVisibleWithXPath1("//*[contains(@text,'Report')]"))
	        {
	            driver.findElement(By.xpath("//*[contains(@text,'Report')]")).click();
	            System.out.println("TC09- Clicked on report");
	            Thread.sleep(500);
	            clickAndWaitForElementWithXpath1(
	                    "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.TextView");
	            System.out.println("TC10- select tag inappropriate");
	            Thread.sleep(500);
	            clickAndWaitForElementWithId("com.threesixteen.app:id/btn_submit");
	            Thread.sleep(500);
	            clickAndWaitForElementWithId("com.threesixteen.app:id/btn_submit");
	            System.out.println("TC11- Reel Reported");
	            Thread.sleep(500);
	            if (isVisibleWithId("com.threesixteen.app:id/btn_submit"))
	            {
		            Thread.sleep(500);
		            System.out.println("TC11A- This Reel is already Reported");
	            	driver.navigate().back();
		            Thread.sleep(500);
	            }
	        }	        
	            Thread.sleep(2000);
		        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_comment");
		        System.out.println("TC12- Opened the comment section.....");
		        Thread.sleep(1000);
		        if (isVisibleWithId("com.threesixteen.app:id/tv_comment"))
		        {
	            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
	            System.out.println("TC13- clicked comment section.....");
	            Thread.sleep(1000);
	            (driver).findElement(By.id("com.threesixteen.app:id/et_comment")).sendKeys("wow");
	            System.out.println("TC14- Typed wow comment section");
	            Thread.sleep(500);
	            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
	            System.out.println("TC15- Comment on Reel Done");
	            Thread.sleep(500);
	            (driver).findElement(By.xpath(
	                            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"))
	                    .click();
	            System.out.println("TC16- Opened the list of likes in reel");
	            Thread.sleep(2000);
	            if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView"))
	            (driver).findElement(By.xpath(
	                            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView"))
	                    .click();
	            clickAndWaitForElementWithId("com.threesixteen.app:id/btn_open_profile");
	            System.out.println("TC17- Opened user from list of likes in reel");
	            Thread.sleep(500);
	            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
	            System.out.println("TC18- Back from creators profile");
	            Thread.sleep(500);
	            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
	            System.out.println("TC19- Existed from creators profile Card");
	            Thread.sleep(1000);
          
	           if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
	            (driver).findElement(By.id("com.threesixteen.app:id/iv_close")).click();
	            System.out.println("TC20- Existed from comment section");
	            Thread.sleep(1000); 
	            }
		        }
	         
	        else 
	        {
	            Thread.sleep(2000);   
	            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_comment");
//	          clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.LinearLayout[2]/android.widget.ImageView");
	            System.out.println("TC21- Opened the comment section.....");
	            Thread.sleep(1000);
	            if (isVisibleWithId("com.threesixteen.app:id/tv_comment")) {
	            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
	            System.out.println("TC22- clicked comment section.....");
	            Thread.sleep(1000);
	            }
	            else
	            {
		            Thread.sleep(3000);
		            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_comment");
		            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
		            System.out.println("TC22- clicked comment section.....");
		            Thread.sleep(1000);

	            }
	            (driver).findElement(By.id("com.threesixteen.app:id/et_comment")).sendKeys("wow");
	            System.out.println("TC23- Typed wow comment section");
		        Thread.sleep(1000);
	            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
	            System.out.println("TC24- Comment on Reel Done");
		        Thread.sleep(1000);
	            (driver).findElement(By.xpath(
	                            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"))
	                    .click();
	            System.out.println("TC25- Opened the list of likes in reel");
	            Thread.sleep(2000);
	            if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView"))
		            (driver).findElement(By.xpath(
		                            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView"))
		                    .click();
		            clickAndWaitForElementWithId("com.threesixteen.app:id/btn_open_profile");
		            System.out.println("TC26- Opened user from list of likes in reel");
		            Thread.sleep(500);
		            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
		            System.out.println("TC27- Back from creators profile");
		            Thread.sleep(500);
		            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
		            System.out.println("TC28- Existed from creators profile Card");
		            Thread.sleep(1000);
	          
		           if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
		            (driver).findElement(By.id("com.threesixteen.app:id/iv_close")).click();
		            System.out.println("TC29- Existed from comment section");
		            Thread.sleep(1000); 
		            }
	        }
		        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		        System.out.println("TC30- Creators Profile opened");
		        Thread.sleep(1000);
		        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_open_profile");
		        System.out.println("TC31- Creators Profile opened in full view");
		        Thread.sleep(1000);
		        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
		        System.out.println("TC32- Back from creators profile");
		        Thread.sleep(1000);
		        if (isVisibleWithId("com.threesixteen.app:id/iv_share")) 
		        {
		        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_share");
		        System.out.println("TC34- Clicked on share icon on reel");
		        Thread.sleep(500);
		        }
		        else
		        {
		        	clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
			        System.out.println("TC33- Existed from creators profile Card");
			        Thread.sleep(500);
			        driver.navigate().back();
			        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_share");
			        System.out.println("TC34- Clicked on share icon on reel");
			        Thread.sleep(500);
		        }
		        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_copy_link");
		        System.out.println("TC35- share link is copied");
		        Thread.sleep(500);
		        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_share");
		        System.out.println("TC36- clicked on share icon on reel");
		        Thread.sleep(500);
		        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_download");
		        System.out.println("TC37- Clicked on Download button button on reel");
		        Thread.sleep(500);
		        driver.navigate().back();
		        Thread.sleep(1000);
		        System.out.println("TC37A- Reel test pass from contest");


	
	 }
	 
		 else
			 
		 {
	           Thread.sleep(3000);
	        if (isVisibleWithId("com.threesixteen.app:id/tv_num_support"))
	       {
		           System.out.println("TC38- Video opened from contest");
		           Thread.sleep(5000);
		           clickAndWaitForElementWithId("com.threesixteen.app:id/tv_time_and_watching");
		           System.out.println("TC39- time watching data is coming from backkend for Video");
		           Thread.sleep(3000);
		           if (isVisibleWithId("com.threesixteen.app:id/iv_live_comments")) 
		           {
				   clickAndWaitForElementWithId("com.threesixteen.app:id/iv_live_comments");
		           System.out.println("TC41- Comment section  opened");
		           Thread.sleep(2000);
		           clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
		           System.out.println("TC42- Clicked comment section");
		           Thread.sleep(2000);
                  if (isVisibleWithId("com.threesixteen.app:id/et_comment"))
                  {
		           clickAndWaitForElementWithId("com.threesixteen.app:id/et_comment");
		           (driver).findElement(By.id("com.threesixteen.app:id/et_comment")).sendKeys("Nice played");
		           System.out.println("TC43- Typed Nice played comment section");
		           Thread.sleep(2000);
		           clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
		           System.out.println("TC44- Send the  comment");
		           Thread.sleep(2000);
		           clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView");
		           System.out.println("TC45- open likes list");
		           Thread.sleep(2000);
		           clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
		           System.out.println("TC46- closed bottom sheet");
		           Thread.sleep(2000);
		           clickAndWaitForElementWithId("com.threesixteen.app:id/layout_watch_and_win");
		           System.out.println("TC47- open watch & Win");
		           Thread.sleep(2000);
		           clickAndWaitForElementWithId("com.threesixteen.app:id/iv_refresh");
		           System.out.println("TC48- Refresh watch & Win");
		           Thread.sleep(2000);
		           clickAndWaitForElementWithId("com.threesixteen.app:id/tv_coins");
		           System.out.println("TC49- open coins page");
		           Thread.sleep(3000);
		           driver.navigate().back();
		           Thread.sleep(3000);
		           System.out.println("TC50- Back from coins log");
		           Thread.sleep(5000);
		           driver.navigate().back();
		           Thread.sleep(3000);
		           System.out.println("TC51- Bottom sheet closed");
		           Thread.sleep(2000);
		           clickAndWaitForElementWithXpath1(
		                   "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.ImageView");
		           System.out.println("TC52- click on share  button");
		           Thread.sleep(2000);
		           clickAndWaitForElementWithId("com.threesixteen.app:id/tv_download");
		           System.out.println("TC53- Download the video");
		           Thread.sleep(2000);
		           driver.navigate().back();
		           Thread.sleep(2000);
           
//           clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//	        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_play_pause");
//           System.out.println("TC54- Pause the video");

	             Thread.sleep(10000);
	             clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
           if (isVisibleWithId("com.threesixteen.app:id/iv_fs")) 
           {
	            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
	            System.out.println("TC55- Video player screen Rotate to landscape");
	            Thread.sleep(10000);
	            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
	            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
	            System.out.println("TC56- Video player screen Rotate to portrait");
	            Thread.sleep(10000);
           
           }
           else
           {
		       Thread.sleep(5000);
	           clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
		       clickAndWaitForElementWithId("com.threesixteen.app:id/exo_play_pause");
	           System.out.println("TC57- Exo pause");
	           Thread.sleep(5000);
           }
	           Thread.sleep(10000);
	           clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
	           clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
	           System.out.println("TC58- Video player screen Rotate to landscape");
	           Thread.sleep(10000);
	           clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
	           clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
	           System.out.println("TC59- Video player screen Rotate to portrait");
	           Thread.sleep(10000);
           if (isVisibleWithId("com.threesixteen.app:id/iv_close")) 
           {
               clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
           }
               Thread.sleep(2000);
	           clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
	           clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
	           System.out.println("TC61- UnMute the video");
	           Thread.sleep(10000);
	           clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
	           clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
	           System.out.println("TC62- Mute the video");
	           Thread.sleep(10000);
	           clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
	           clickAndWaitForElementWithId("com.threesixteen.app:id/exo_rew");
	           System.out.println("TC63- Exo reverse");
	           Thread.sleep(10000);   
	           clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
	           System.out.println("TC69- Open suggested video");
	           Thread.sleep(2000);
	           clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
	           System.out.println("TC70- Open suggested video");
	           Thread.sleep(2000);
	           clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
	           System.out.println("TC71- Open suggested video");
	           Thread.sleep(10000);



           if (isVisibleWithId("com.threesixteen.app:id/tv_time_and_watching"))
           {
               ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.HOME));
               System.out.println("TC72- Switched to PIP");
               Thread.sleep(2000);
           }
           
              System.out.println("TC74- contest video test done");
           
	        }
		  }
           else
           {
               System.out.println("TC75-this is Live sesion in contest so skipping the test");

           }
	   
	       }
		 
		 }
	 }
	 

	 
	 
	 
	 
	 
	 @Test(priority = 2)
	    public void Contestpagehistorydatatest2() throws InterruptedException {

		 OpenSideNav();
	        Thread.sleep(1000);
	       
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
	            driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
	            System.out.println("Clicking on: " + targetText);
	            Thread.sleep(1000);  
	        }
	        Thread.sleep(1000);
	        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_history");
	        System.out.println("TC03- open Contest history");
	        Thread.sleep(1000);
	        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
	        System.out.println("TC04- Exist from Contest history");
	        Thread.sleep(1000);
	        driver.findElement(
	                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
	        System.out.println("TC05- page scrolled");
	        Thread.sleep(1000);
	       

	    }
	 
	 
	
	
	 @Test(priority = 3)
	    public void ContestpageBanner3() throws InterruptedException {

		 OpenSideNav();
	        Thread.sleep(2000);
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
	    	        Thread.sleep(2000);
	            }
	            driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
	            System.out.println("Clicking on: " + targetText);
		        Thread.sleep(2000);
	        }
	        Thread.sleep(2000);
	        clickAndWaitForElementWithId("com.threesixteen.app:id/vp_banners");
	        System.out.println("TC02- Click on Banner in contest ");
	        Thread.sleep(2000);
	        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_contest_title");
	        System.out.println("TC02- Contets open from Banner");
	        Thread.sleep(2000);
	        
	 }
	
	 
	 
	 
	 
	

}



