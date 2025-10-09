package Trial;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class LiveStream_script<MobileElement, Rotatable> extends Functions {





   
     

    @Test(priority = 1)
    public void LiveMiniplayertabswittch1() throws InterruptedException {

         OpenLivetStream();
         Thread.sleep(5000);
        driver.navigate().back();
        System.out.println("TC09- Player switch to mini player");
        Thread.sleep(1000);
        if (isVisibleWithXPath1("//*[contains(@text,'Continue Watching')]")) {
        	clickAndWaitForElementWithXpath1("//*[contains(@text,'Continue Watching')]");
        } 
        TabSwitch();
    }
    

    
    
   
    @Test(priority = 2)
    public void livestreamwatccanwin2() throws InterruptedException {

        OpenLivetStream();

        Thread.sleep(2000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
        System.out.println("TC09- Exist from Live chat");
        Thread.sleep(2000);
        
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().resourceId(\"com.threesixteen.app:id/layout_fan_rank\")).setAsHorizontalList().scrollForward(3)"));
        System.out.println("TC04- scroll left ");
        Thread.sleep(2000); 
        
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().resourceId(\"com.threesixteen.app:id/layout_fan_rank\")).setAsHorizontalList().scrollForward(3)"));
        System.out.println("TC04- scroll left ");
        Thread.sleep(2000); 
        driver.findElement(By.xpath("//*[contains(@text,'Active Tasks')]")).click();
//        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_watch_n_view_lottie");
        System.out.println("TC04- open active tasks");
        Thread.sleep(2000); 
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_refresh");
        System.out.println("TC05- refresh watch & winn");
        Thread.sleep(2000); 
        if (isVisibleWithId("com.threesixteen.app:id/iv_2x_toggle")) {
        	
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_coins");
        System.out.println("TC06- Open coins log");
        Thread.sleep(2000); 
        driver.navigate().back();
        Thread.sleep(2000); 
        System.out.println("TC07- Back from coins log");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1("//*[contains(@text,'See More Tasks')]");
		System.out.println("TC08- Opened see More tasks");
      driver.navigate().back();
      System.out.println("TC09- Back from task page");
      Thread.sleep(2000); 
      clickAndWaitForElementWithId("com.threesixteen.app:id/tv_coins");
      System.out.println("TC10- Open coins log");
      Thread.sleep(2000); 
      driver.navigate().back();
      Thread.sleep(2000); 
      System.out.println("TC11- Back from coins log");
        driver.navigate().back();
        System.out.println("TC12- Back from task page");
        Thread.sleep(2000); 
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
        System.out.println("TC13- Exist from Live chat");
        Thread.sleep(2000); 
        
        
        driver.findElement(By.xpath("//*[contains(@text,'Active Tasks')]")).click();
        System.out.println("TC14- open Active tasks");
        Thread.sleep(2000); 
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_more_task");
        System.out.println("TC15- Open see more tasks");
        Thread.sleep(2000); 
        driver.navigate().back();
        Thread.sleep(2000); 
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
        System.out.println("TC16- Close bottom sheet");
        }
        else
        {
        	 clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        		System.out.println("TC17- 2x not coming in Active tasks bottom sheet");
              Thread.sleep(1000);
        }
    }
    

    @Test(priority = 3)
    public void liveplayercomennt3() throws InterruptedException {

    	OpenLivetStream();

        Thread.sleep(1000);
//        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
//        System.out.println("TC02- opened feed");

        Thread.sleep(7000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/et_comment_collapsed");
        System.out.println("TC06- clicked comment section.....");
        if (isVisibleWithId("com.threesixteen.app:id/et_comment"))
        {
         
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
        else
        {
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
            System.out.println("TC10- Only Followers chat allowed");
        }
    }

    
    @Test(priority = 4)
    public void liveplayerFanrank4() throws InterruptedException {

    	OpenLivetStream();
        SkipSurvey();
        Thread.sleep(7000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
        System.out.println("TC03- Exist from Live chat");
        Thread.sleep(1000);
        if (isVisibleWithId("com.threesixteen.app:id/layout_fan_rank")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/layout_fan_rank");
            System.out.println("TC04- Open Fan Rank live session");
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]");
            System.out.println("TC05- Open 1st Fan Rank userprofile");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/btn_open_profile");
            System.out.println("TC06- Creators Profile opened in full view");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
            System.out.println("TC07- Back from creators profile");
            Thread.sleep(1000);
            if (isVisibleWithId("com.threesixteen.app:id/iv_refresh")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_refresh");
            System.out.println("TC09- Refresh  the Fan rank");
            Thread.sleep(1000);
            }
            else
            {
            	 clickAndWaitForElementWithId("com.threesixteen.app:id/layout_fan_rank");
                 System.out.println("TC10- Open Fan Rank live session");
                 Thread.sleep(1000);
                 clickAndWaitForElementWithId("com.threesixteen.app:id/iv_refresh");
                 System.out.println("TC11- Refresh  the Fan rank");
                 Thread.sleep(1000);
            }
            Thread.sleep(1000);
            System.out.println("TC12- Scrolling Fan rank");
            Thread.sleep(1000);

            driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(5)"));
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_winning");
            System.out.println("TC13- Click on Winnings");
            Thread.sleep(1000);
            driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_info_button");
            System.out.println("TC14- Click on Eye button");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/btn_continue");
            System.out.println("TC15- Click on Close button");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
            System.out.println("TC16- Exist from Fan Rank");
            Thread.sleep(1000);
        }
        
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().resourceId(\"com.threesixteen.app:id/layout_fan_rank\")).setAsHorizontalList().scrollForward(3)"));
        System.out.println("TC16A- scroll left ");
        Thread.sleep(2000); 
        
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_top_donors_support_lottie");
        System.out.println("TC17- Opned  Top Donors list");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/refresh_btn");
        System.out.println("TC18- Refreshed top donors list");
        Thread.sleep(1000);
        if (isVisibleWithXPath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView")) {
            clickAndWaitForElementWithXpath1(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");
            System.out.println("TC19- Opened Top donor's profile");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/btn_open_profile");
            System.out.println("TC19A- Creators channel opened in full view");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
            System.out.println("TC20- Back from creators profile");
            Thread.sleep(1000);
     
        }
        Thread.sleep(1000);
        if (isVisibleWithId("com.threesixteen.app:id/refresh_btn")) {
        	driver.navigate().back();
        System.out.println("TC22- Existed from top donors list");
        Thread.sleep(1000);
        }
        else
        {
        	
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_top_donors_support_lottie");
            System.out.println("TC23- Opned  Top Donors list");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
            System.out.println("TC24- Existed from top donors list");
        }
        driver.findElement(AppiumBy.androidUIAutomator(
        	    "new UiScrollable(new UiSelector().resourceId(\"com.threesixteen.app:id/layout_fan_rank\")).setAsHorizontalList().scrollBackward(3)"));
        	System.out.println("TC25-A - scroll right");
        	Thread.sleep(2000);

        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_live_comments");
        System.out.println("TC25- Open live chat again");
        Thread.sleep(1000);
        driver.navigate().back();
        System.out.println("TC26- Switch to mini player");
    }

    
    
    @Test(priority = 6)
    public void livestreamwatchandwin6() throws InterruptedException {

        OpenLivetStream();
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_watch_n_view_lottie");
        System.out.println("TC03- open watch & Win for live stream");
        Thread.sleep(500);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_refresh");
        System.out.println("TC04- Refresh watch & Win");
        Thread.sleep(500);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_refresh");
        System.out.println("TC05- Refresh watch & Win");
        Thread.sleep(500);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_coins");
        System.out.println("TC06- open coins page");
        Thread.sleep(500);
        driver.navigate().back();
//        clickAndWaitForElementWithXpath1("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
        System.out.println("TC07- back from coins page");
        driver.navigate().back();
//        clickAndWaitForElementWithXpath1("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
//        System.out.println("TC08- Back to Watch and win");
        Thread.sleep(500);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
        System.out.println("TC09- Exist from Watch and win");
        Thread.sleep(1000);
        if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
            System.out.println("TC10- Exist from Live chat");
        }

    }

    
    @Test(priority = 7)
    public void livestreaminetractivepolls7() throws InterruptedException {

        OpenLivetStream();
        if (isVisibleWithId("com.threesixteen.app:id/iv_interactive")) {
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_interactive");
        System.out.println("TC03- Open interactive center");
        Thread.sleep(500);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.GridView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView");
        System.out.println("TC04- Open Live stream polls");
        Thread.sleep(500);
        clickAndWaitForElementWithId("com.threesixteen.app:id/ic_refresh");
        System.out.println("TC05- refresh page");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
        System.out.println("TC06- Close Polls");
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.GridView/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.ImageView");
        System.out.println("TC07- Open Top donors from interactive center");
        driver.navigate().back();
    }
    else
    {
    	 clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
         System.out.println("TC09- Exist from Live chat");
         Thread.sleep(1000);
         
        System.out.println("TC07-  Interactive center not available");
    }
    }
    
    

    @Test(priority = 8)
    public void livestreaminetractivemoreIRL8() throws InterruptedException {

        OpenLivetStream();
        if (isVisibleWithId("com.threesixteen.app:id/iv_interactive")) {
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_interactive");
        System.out.println("TC03- Open interactive center");
        Thread.sleep(1000);
        if (isVisibleWithXPath1("//*[contains(@text,'More IRLs')]")) {
            driver.findElement(By.xpath("//*[contains(@text,'More IRLs')]")).click();
            System.out.println("TC03- Click on more IRLs");
            Thread.sleep(1000);
        } else {
            driver.findElement(By.xpath("//*[contains(@text,'More Streams')]")).click();
            System.out.println("TC03- Click on more IRLs");
        }
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ImageView[1]");
        System.out.println("TC03- Click on stream layout");
        Thread.sleep(1000);
       
    }
        else
        {
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_gift_donation");
            System.out.println("TC01- Open Donation box");
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_arrow_magic_chat");
            System.out.println("TC02- Click on Gift Magic chat");
            Thread.sleep(1000);
            driver.navigate().back();
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_gift_donation");
            System.out.println("TC03- Open donation box");
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_arrow_sticker");
            System.out.println("TC04- Open gift sticker");
            Thread.sleep(1000);
        }
    }
    




    @Test(priority = 10)
    public void Livebuttonotimeronstreaminprotab10() throws InterruptedException, MalformedURLException {
    	

    	 driver.findElement(By.xpath("//*[contains(@text,'Following')]")).click();
         System.out.println("TC01- Following tab opened");
         Thread.sleep(1000);
      
        Thread.sleep(1000);
        if (isVisibleWithId("com.threesixteen.app:id/tv_live")) {
            System.out.println("TC02- Live button is visbile");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_author");
            System.out.println("TC03- Open streamer profile");
            Thread.sleep(1000);
            driver.navigate().back();
            System.out.println("TC04- Backk from streamer profile");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_more");
            System.out.println("TC04- Click on more button");
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1("//*[contains(@text,'About')]");
            System.out.println("TC05- Click on About button");
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1("//*[contains(@text,'Done')]");
            System.out.println("TC06- Click on Done button");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_more");
            System.out.println("TC07- Click on more button");
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1("//*[contains(@text,'Follow')]");
            System.out.println("TC08- Click on Follow button");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_more");
            System.out.println("TC09- Click on more button");
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1("//*[contains(@text,'Following')]");
            System.out.println("TC10-  unFollow creator");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
            System.out.println("TC11- open stream");
            Thread.sleep(500);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
            System.out.println("TC12- Exist from Live chat");
            Thread.sleep(500);
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_time_and_watching");
            System.out.println("TC13- time watching data is coming from backkend for stream");
            Thread.sleep(500);
            clickAndWaitForElementWithXpath1(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.TextView");
            System.out.println("TC14- Game Name is coming from backend for stream");
            Thread.sleep(500);
            clickAndWaitForElementWithXpath1(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.TextView");
            System.out.println("TC15- Game Language is coming from backend for stream");
            Thread.sleep(500);
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_follow");
            System.out.println("TC16- Follow streamer");
            Thread.sleep(500);
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_follow");
            System.out.println("TC17- UnFollow streamer");
            Thread.sleep(1000);
        } else {
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_follow");
            System.out.println("TC17- Live button not visible");

        }
    }

    
    @Test(priority = 11)

    public void LivebuttonotimeronstreamINSEARCH11() throws InterruptedException, MalformedURLException {

        OpenSearch();
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
   		Thread.sleep(2000);       
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("BGMS");
        System.out.println("TC03- Type BGMS in search");
   		Thread.sleep(2000);       
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
   		System.out.println("TC04- Click on serach button");
   		Thread.sleep(2000);       
        driver.findElement(By.xpath("//*[contains(@text,'Live')]")).click();
        System.out.println("TC05- Click on Live tab");
        Thread.sleep(2000);
        if (isVisibleWithXPath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")) {
            System.out.println("TC06- Live button is visbile");
            Thread.sleep(2000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_author");
            System.out.println("TC07- Open streamer profile");
            Thread.sleep(2000);
            driver.navigate().back();
            System.out.println("TC08- Back from streamer profile");
            Thread.sleep(2000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_more");
            System.out.println("TC09- Click on more button");
            Thread.sleep(2000);
            clickAndWaitForElementWithXpath1("//*[contains(@text,'About')]");
            System.out.println("TC10- Click on About button");
            Thread.sleep(2000);
            clickAndWaitForElementWithXpath1("//*[contains(@text,'Done')]");
            System.out.println("TC11- Click on Done button");
            Thread.sleep(2000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
            System.out.println("TC16- open stream");
            Thread.sleep(3000);
        
                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
                System.out.println("TC17- Exist from Live chat");
                Thread.sleep(2000);
            
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_time_and_watching");
            System.out.println("TC18- time watching data is coming from backkend for stream");
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.TextView");
            System.out.println("TC19- Game Name is coming from backend for stream");
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.HorizontalScrollView");
            System.out.println("TC20- Game Language is coming from backend for stream");
            Thread.sleep(1000);
            driver.navigate().back();
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_follow");
            System.out.println("TC21- Follow streamer");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_follow");
            System.out.println("TC22- UnFollow streamer");
        } else {
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_follow");
            System.out.println("TC06- Live button not visible");

        }
    }
    
    
    @Test(priority = 12)
    public void liveplayershare12() throws InterruptedException {

    	OpenLivetStream();

        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
        System.out.println("TC02- opened feed");
        Thread.sleep(3000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
        System.out.println("TC04- Exist from Live chat");
        Thread.sleep(1000);
        if (isVisibleWithId("com.threesixteen.app:id/layout_img_like")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/layout_img_like");
            System.out.println("TC04- live session Liked");
        }
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/layout_share");
        System.out.println("TC03- Click on share icon");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_copy_link");
        System.out.println("TC04- Copy link");
        

    }
    

    @Test(priority = 13)
    public void livestreamemojis13() throws InterruptedException {

    	OpenLivetStream();

        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
        System.out.println("TC02- opened feed");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
        System.out.println("TC04- Exist from Live chat");
        Thread.sleep(1000);
        if (isVisibleWithId("com.threesixteen.app:id/iv_post_support")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post_support");
            System.out.println("TC02- Like session");
        }
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_comment");
        System.out.println("TC03- Click on live chat ");
        Thread.sleep(2000);
        
        
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.threesixteen.app:id/stickers_rv\")"));
        System.out.println("TC04- found gift stickers");


        
        driver.findElement(AppiumBy.androidUIAutomator(
        	    "new UiScrollable(new UiSelector().resourceId(\"com.threesixteen.app:id/stickers_rv\"))" +
        	    ".setAsHorizontalList()" +
        	    ".scrollIntoView(new UiSelector().description(\"target_description\"))"
        	));

//        driver.findElement(AppiumBy.androidUIAutomator(
//                "new UiScrollable(new UiSelector().resourceId(\"com.threesixteen.app:id/stickers_rv\")).setAsHorizontalList().scrollForward()"));
//        System.out.println("TC04- scroll gift stickers");
//        Thread.sleep(3000);  
       
        if (isVisibleWithId("com.threesixteen.app:id/emote_layout")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/emote_layout");
            System.out.println("TC05- Open emojis layout");
            Thread.sleep(1000); 
        }
        
        clickAndWaitForElementWithXpath1(
              "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.ImageView[1]");
        System.out.println("TC06- emoji 1");

        clickAndWaitForElementWithXpath1(
              "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.ImageView[2]");
        System.out.println("TC07- emoji 2");

        clickAndWaitForElementWithXpath1(
              "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.ImageView[3]");
        System.out.println("TC08- emoji 3");

        clickAndWaitForElementWithXpath1(
              "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.ImageView[4]");
        System.out.println("TC09- emoji 4");
        
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.ImageView[1]");
          System.out.println("TC06- emoji 1");

//
//        clickAndWaitForElementWithXpath1(
//              "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.ImageView[5]");
//        System.out.println("TC06- emoji 5");
//
//        clickAndWaitForElementWithXpath1(
//                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.ImageView[5]");
//        System.out.println("TC06- emoji 6");
//
//        clickAndWaitForElementWithXpath1(
//                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.ImageView[6]");
//        System.out.println("TC07- Sended emojis ");
     
     
    

       
        
       
        
//        clickAndWaitForElementWithXpath1(
//                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.ImageView[7]");
//        System.out.println("TC11- Click on crossed icon");
//        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView[1]"))
//        { clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView[1]");
//        System.out.println("TC12- Open first gift stiker");
//        Thread.sleep(1000);
//
//        clickAndWaitForElementWithId(
//                "com.threesixteen.app:id/tv_gems");
//        System.out.println("TC13- Open Dimaond log");
     
        }

       
    
       
    
	
	
    @Test(priority = 14)
    public void liveStreaRecommendedFeed14() throws InterruptedException {

    	OpenLivetStream();
    	Thread.sleep(1000);
//        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
//        System.out.println("TC02- First Live session Opened");
//        Thread.sleep(7000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
        Thread.sleep(2000);
        OpenRecommendedFeed();
    }
    
    
    
    
    
   
    @Test(priority = 15)
    public void livestreamGiftsticker15() throws InterruptedException {

    	
        Thread.sleep(2000);
    	OpenLivetStream();

        Thread.sleep(2000);

//        if (isVisibleWithId("com.threesixteen.app:id/iv_post_support")) {
//            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post_support");
//            System.out.println("TC03- Like session");
//            Thread.sleep(2000);
//        }
//        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
//        System.out.println("TC04- open stream ");
//        Thread.sleep(10000);
        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView[1]"))
        {
        	clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView[1]");
        System.out.println("TC05- Open first gift stiker");
        Thread.sleep(2000);

        clickAndWaitForElementWithId(
                "com.threesixteen.app:id/tv_diamonds");
        System.out.println("TC06- Open Dimaond log");

        Thread.sleep(2000);
        driver.navigate().back();
        System.out.println("TC07- Exist from Dimaond log");

        Thread.sleep(2000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
        System.out.println("TC08- Exist from gift sticker");
        Thread.sleep(2000);
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().resourceId(\"com.threesixteen.app:id/stickers_rv\")).setAsHorizontalList().scrollForward()"));
        System.out.println("TC09- scroll gift stickers");
        Thread.sleep(2000);

        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().resourceId(\"com.threesixteen.app:id/stickers_rv\")).setAsHorizontalList().scrollForward()"));
        System.out.println("TC10- scroll gift stickers Again");
        Thread.sleep(2000);

        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView"))
        { clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageView[1]");
        System.out.println("TC11- Open 2nd gift sticker");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_diamonds");
        System.out.println("TC12- Open Dimaond log");

        Thread.sleep(2000);
        driver.navigate().back();
        System.out.println("TC13- Exist from Dimaond log");

        Thread.sleep(2000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
        System.out.println("TC14- Exist from gift sticker");
        }
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView[1]");
        System.out.println("TC15- Open 3rd gift sticker");
        Thread.sleep(2000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_diamonds");
        System.out.println("TC16- Open Dimaond log");
        Thread.sleep(2000);

        driver.navigate().back();
        System.out.println("TC17- Exist from Dimaond log");

        Thread.sleep(2000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
        System.out.println("TC18- Exist from gift sticker");
        Thread.sleep(2000);
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().resourceId(\"com.threesixteen.app:id/stickers_rv\")).setAsHorizontalList().scrollForward()"));
        System.out.println("TC19- scroll gift stickers");
        Thread.sleep(2000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.ImageView[1]");
        System.out.println("TC20- Open 4th gift sticker");
        Thread.sleep(2000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_diamonds");
        System.out.println("TC21- Open Dimaond log");

        Thread.sleep(2000);
        driver.navigate().back();
        System.out.println("TC22- Exist from Dimaond log");
        Thread.sleep(2000);

        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
        System.out.println("TC23- Exist from gift sticker");
        Thread.sleep(2000);
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().resourceId(\"com.threesixteen.app:id/stickers_rv\")).setAsHorizontalList().scrollForward()"));
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().resourceId(\"com.threesixteen.app:id/stickers_rv\")).setAsHorizontalList().scrollForward()"));
        System.out.println("TC24- scroll gift stickers");
        Thread.sleep(2000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.ImageView[1]");
        System.out.println("TC25- Open 5th gift sticker");
        Thread.sleep(2000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_diamonds");
        System.out.println("TC26- Open Dimaond log");
        Thread.sleep(2000);
        driver.navigate().back();
        System.out.println("TC27- Exist from Dimaond log");

        Thread.sleep(2000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
        System.out.println("TC28- Exist from gift sticker");
        
        }
        }
        
    
    
    
    
    @Test(priority = 16)
    public void liveStreamfreeStickerDonate16() throws InterruptedException {

        OpenLivetStream();
        Thread.sleep(2000);
        if (isVisibleWithXPath1("//*[contains(@text,'Free')]")) {
        Thread.sleep(2000);
       	clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView[1]");
        Thread.sleep(2000);
        System.out.println("TC05- Open first free sticker");
        Thread.sleep(5000);
        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.Button");
        System.out.println("TC06- clicked on watch ad button");
        Thread.sleep(30000);
       
	     driver.navigate().back();
	        System.out.println("TC07- clicked back");

	        Thread.sleep(5000);
	        if (isVisibleWithXPath1("//*[contains(@text,'Free')]")) 
            {
		        System.out.println("TC08- test pass");

            }
	        else {
	     driver.navigate().back();
	        System.out.println("TC08- clicked back 2nd time");

	        Thread.sleep(5000);

        SkipAd();
    	clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView[1]");
        Thread.sleep(1000);
        System.out.println("TC09- Open first free sticker");
        Thread.sleep(2000);
	        }
       
        
        
        }
    }

    
    

  
        
    @Test(priority = 17)
    public void livestreamGiftstickerINLANDSCAPE17() throws InterruptedException {
  	  
       OpenLivetStream();        
        driver.navigate().back();
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
        clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
        System.out.println("TC02- Mini player  send to Full screen");
        Thread.sleep(5000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
        System.out.println("TC03- Player rotate to landscape");
        Thread.sleep(3000);
        
       
           	clickAndWaitForElementWithXpath1("//*[contains(@text,'Free')]");
            Thread.sleep(2000);
            System.out.println("TC04- Open first free sticker");
            Thread.sleep(5000);

     

        Thread.sleep(1000);
        driver.navigate().back();
        System.out.println("TC05- Exist from sticker sheet");

    	clickAndWaitForElementWithXpath1("//*[contains(@text,'Free')]");
        Thread.sleep(2000);
        System.out.println("TC06- Open first free sticker");
        Thread.sleep(5000);
        Thread.sleep(1000);
        driver.navigate().back();
        System.out.println("TC07- Exist from sticker sheet");

        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().resourceId(\"com.threesixteen.app:id/stickers_rv\")).setAsHorizontalList().scrollForward()"));
        System.out.println("TC08- scroll gift stickers");

        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().resourceId(\"com.threesixteen.app:id/stickers_rv\")).setAsHorizontalList().scrollForward()"));
        System.out.println("TC09- scroll gift stickers Again");
        
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().resourceId(\"com.threesixteen.app:id/stickers_rv\")).setAsHorizontalList().scrollForward()"));
        System.out.println("TC10- scroll gift stickers Again");
        
        
        if (isVisibleWithId("com.threesixteen.app:id/emote_layout")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/emote_layout");
            System.out.println("TC11- Open emojis layout");
            Thread.sleep(1000); 
        }
}
        
        
    @Test(priority = 18)
    public void ProBagesTet18() throws InterruptedException  {
    	
			OpenSideNav();        
            if (isVisibleWithXPath1("//android.widget.ImageView[@content-desc=\"Pro\"]")) {
            System.out.println("TC03- Pro badges is visible");
          
                clickAndWaitForElementWithId("com.threesixteen.app:id/txt_name");
                System.out.println("TC10- opens self profile");
                clickAndWaitForElementWithId("com.threesixteen.app:id/pro_user_icon");
                System.out.println("TC11- Profile badges present on profile page");
             }
              else
            {
              driver.findElement(By.xpath("//*[contains(@text,'Buy Pro')]")).click();
              System.out.println("TC12- Click on Buy pro");
              Thread.sleep(1000);
              clickAndWaitForElementWithId("com.threesixteen.app:id/web_view");
              System.out.println("TC13- Web view is visible");
  
             }
                 System.out.println("TC14- Profile badges test pass");
    	 }
            
    

    
    @Test(priority = 19)
    
    
    public void ProStreamComment19() throws InterruptedException {


    	OpenLivetStream();

	        
	        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
	        System.out.println("TC02- opened feed");
            clickAndWaitForElementWithId("com.threesixteen.app:id/et_comment_collapsed");
            System.out.println("TC03- clicked comment section.....");            {
            (driver).findElement(By.id("com.threesixteen.app:id/et_comment")).sendKeys("Hi");
            System.out.println("TC04- Typed Hi comment section.....");
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
            System.out.println("TC05- Send the  comment on live stream");
            
        }
    }
   
    
    
    @Test(priority = 20)
    
    public void ProCreatorTagoProfileTest20() throws InterruptedException, MalformedURLException  {



    	OpenSearch();
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("LIDOMA ASIA");
        System.out.println("TC03- Type lidoma in search");
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
   		System.out.println("TC04- Click on ENTER");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
        System.out.println("TC05- open Lidoma profile");
        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView");
        System.out.println("TC06- pro creator tag is coming");

    }
    
    
    
    @Test(priority = 21)
    
    public void ProCreatorlist21() throws InterruptedException, MalformedURLException {


    	OpenExplorePage();
        String targetText = "Pro Creators";
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

//        clickAndWaitForElementWithXpath1("//*[contains(@text,'View All')]");
        System.out.println("TC033- Pro creator list opened");
        
        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");
        System.out.println("TC04- open profile from pro cerartor list");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.findElement(AppiumBy.androidUIAutomator(
              "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(5)"));
        System.out.println("TC05- List scrolled");
        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView");
        System.out.println("TC06- open profile from pro cerartor list");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        System.out.println("TC07- Back from list");

    }
 
    
    
    
    @Test(priority = 22)
        public void ProStreamOpenedFanRank22() throws InterruptedException, MalformedURLException  {

    
//    	if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button"))
//    	{ clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
//	        System.out.println("TC01- Pro stream tab opened");
//    	}
//    	else
//    	{
//            clickAndWaitForElementWithXpath1("//*[contains(@text,'Pro Streams')]");
//	        System.out.println("TC01- Pro stream tab opened");
//    	}
    	OpenLivetStream();
        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
        System.out.println("TC02- opened feed");
        SkipSurvey();
        Thread.sleep(7000);
       
        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
        if (isVisibleWithId("com.threesixteen.app:id/live_rew"))
        {
  		clickAndWaitForElementWithId("com.threesixteen.app:id/live_rew");
  		System.out.println("TC03-  stream Backwarded");
   		Thread.sleep(1000);
        }
        else
        {
       		Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
       		if (isVisibleWithId("com.threesixteen.app:id/live_rew"))
            {
      		clickAndWaitForElementWithId("com.threesixteen.app:id/live_rew");
      		System.out.println("TC03-  stream Backwarded in 2nd time");
       		Thread.sleep(1000);
            }

        }
   		Thread.sleep(7000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
        System.out.println("TC04- Exist from Live chat");
        SkipSurvey();
        if (isVisibleWithId("com.threesixteen.app:id/layout_fan_rank")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/layout_fan_rank");
            System.out.println("TC05- Open Fan Rank live session");
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]");
            System.out.println("TC05- Open 1st Fan Rank userprofile");
            clickAndWaitForElementWithId("com.threesixteen.app:id/btn_open_profile");
            System.out.println("TC06- Creators Profile opened in full view");
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
            System.out.println("TC07- Back from creators profile");
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_refresh");
            System.out.println("TC10- Refresh  the Fan rank");
            System.out.println("TC11- Scrolling Fan rank");
            driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(5)"));
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_winning");
            System.out.println("TC12- Click on Winnings");
            Thread.sleep(1000);
            driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_info_button");
            System.out.println("TC13- Click on Eye button");
            clickAndWaitForElementWithId("com.threesixteen.app:id/btn_continue");
            System.out.println("TC14- Click on Close button");
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
            System.out.println("TC15- Exist from Fan Rank");
        }
        else
        {
            System.out.println("TC16-  Fan Rank not enable for this stream");

        }
    	
    }
    
    
    
    
    
    @Test(priority = 23)
    
    
    public void Protabliveplayerrortate23() throws InterruptedException  {
 
    	
    	Thread.sleep(1000);
    	if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button"))
    	{ clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
	        System.out.println("TC01- Pro stream tab opened");
	        if(isVisibleWithId("com.threesixteen.app:id/stream_tier_tag")) {		 
	 			clickAndWaitForElementWithId("com.threesixteen.app:id/stream_tier_tag");
	 	        System.out.println("TC03- opened feed");
	 	        Thread.sleep(7000);
		  }
  	      else
  	      {
    			OpenLivetStream();
 
  	      }
    	}
    	else
    	{
    		if(isVisibleWithXPath1("//*[contains(@text,'Pro Streams')]")) {
                clickAndWaitForElementWithXpath1("//*[contains(@text,'Pro Streams')]");
    	        System.out.println("TC01- Pro stream tab opened");
        		}
        		else
        		{
        			OpenLivetStream();
        		}
    	}
	    if(isVisibleWithId("com.threesixteen.app:id/layout_comment")) {
        clickAndWaitForElementWithId("com.threesixteen.app:id/layout_comment");
        System.out.println("TC02- opened stream");
        SkipSurvey();
        }
         else
        {
    	 clickAndWaitForElementWithId("com.threesixteen.app:id/click_view");
         System.out.println("TC02- opened stream");
         SkipSurvey();
         }
        Thread.sleep(7000);
        driver.navigate().back();
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
        clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
        System.out.println("TC03- Mini player  send to Full screen");
        Thread.sleep(10000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
        System.out.println("TC04- Player rotate to landscape");
        Thread.sleep(10000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
        System.out.println("TC05- Player rotate to portrait");
        Thread.sleep(10000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
        System.out.println("TC06- Player rotate to landscape");
        Thread.sleep(10000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
        System.out.println("TC07- Player rotate to portrait");
		Thread.sleep(1000);

        


    }
    
   
    
    @Test(priority = 24)
    
    
    public void ProStreamPIP24() throws InterruptedException  {
    
    
    
        
    	   Thread.sleep(3000);
    	   
      	if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button"))
      	{ clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
  	        System.out.println("TC01- Pro stream tab opened");
  	      if(isVisibleWithId("com.threesixteen.app:id/stream_tier_tag")) {		 
	 			clickAndWaitForElementWithId("com.threesixteen.app:id/stream_tier_tag");
	 	        System.out.println("TC03- opened feed");
	 	        Thread.sleep(7000);
		  }
  	      else
  	      {
    			OpenLivetStream();
 
  	      }
      	}
      	else
      	{
      		if(isVisibleWithXPath1("//*[contains(@text,'Pro Streams')]")) {
              clickAndWaitForElementWithXpath1("//*[contains(@text,'Pro Streams')]");
  	        System.out.println("TC01- Pro stream tab opened");
      		}
      		else
      		{
      			OpenLivetStream();
      		}
      		

      	}
     	
		 if (isVisibleWithId("com.threesixteen.app:id/stream_tier_tag")) {		 
			clickAndWaitForElementWithId("com.threesixteen.app:id/stream_tier_tag");
	        System.out.println("TC02- opened feed");
	        Thread.sleep(7000);	 
		 }
		 else
		 {
		    driver.findElement(AppiumBy.androidUIAutomator(
	               "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)")); 
		  if(isVisibleWithId("com.threesixteen.app:id/stream_tier_tag")) {		 
	 			clickAndWaitForElementWithId("com.threesixteen.app:id/stream_tier_tag");
	 	        System.out.println("TC03- opened feed");
	 	        Thread.sleep(7000);
		  }
	 	        else
	 	        {
	 	        	driver.findElement(AppiumBy.androidUIAutomator(
	 	 	               "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
	 	        	if(isVisibleWithId("com.threesixteen.app:id/stream_tier_tag")) {		 
	 	    			clickAndWaitForElementWithId("com.threesixteen.app:id/stream_tier_tag");
	 	    	        System.out.println("TC04- opened feed");;
	 	    	        Thread.sleep(7000);	 
	 	    		 }
	 	    		 else
	 	    		 {
	 	    		    driver.findElement(AppiumBy.androidUIAutomator(
	 	    	               "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
	 	    		  if(isVisibleWithId("com.threesixteen.app:id/stream_tier_tag")) {		 
	 	      			clickAndWaitForElementWithId("com.threesixteen.app:id/stream_tier_tag");
	 	      	        System.out.println("TC05- opened feed");
	 	      	        Thread.sleep(7000);	 
	 	      		 }
	 	      		 else
	 	      		 {
	 	      		    driver.findElement(AppiumBy.androidUIAutomator(
	 	      	               "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
	 	      		if(isVisibleWithId("com.threesixteen.app:id/stream_tier_tag")) {		 
	 	    			clickAndWaitForElementWithId("com.threesixteen.app:id/stream_tier_tag");
	 	    	        System.out.println("TC06- opened feed");
	 	    	        Thread.sleep(7000);	 
	 	    		 }
	 	    		 else
	 	    		 {
	 	    		    driver.findElement(AppiumBy.androidUIAutomator(
	 	    	               "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
	 	      	if(isVisibleWithId("com.threesixteen.app:id/stream_tier_tag")) {		 
	 	  			clickAndWaitForElementWithId("com.threesixteen.app:id/stream_tier_tag");
	 	  	        System.out.println("TC07- opened feed");
	 	  	        Thread.sleep(7000);	 
	 	  		 }
	 	  		 else
	 	  		 {
	 	  		    driver.findElement(AppiumBy.androidUIAutomator(
	 	  	               "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
	 	  		if(isVisibleWithId("com.threesixteen.app:id/stream_tier_tag")) {		 
	 	  			clickAndWaitForElementWithId("com.threesixteen.app:id/stream_tier_tag");
	 	  	        System.out.println("TC08- opened feed");
	 	  	        Thread.sleep(7000);	 
	 	  		 }
	 	  		 else
	 	  		 {
	 	  		    driver.findElement(AppiumBy.androidUIAutomator(
	 	  	               "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
	 	  		if(isVisibleWithId("com.threesixteen.app:id/stream_tier_tag")) {		 
	 	  			clickAndWaitForElementWithId("com.threesixteen.app:id/stream_tier_tag");
	 	  	        System.out.println("TC09- opened feed");
	 	  	        Thread.sleep(7000);	 
	 	  		 }
	 	  		 else
	 	  		 {
	 	  		    driver.findElement(AppiumBy.androidUIAutomator(
	 	  	               "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
	 	  		if(isVisibleWithId("com.threesixteen.app:id/stream_tier_tag")) {		 
	 	  			clickAndWaitForElementWithId("com.threesixteen.app:id/stream_tier_tag");
	 	  	        System.out.println("TC10- opened feed");
	 	  	        Thread.sleep(7000);	 
	 	  		 }
	 	  		 else
	 	  		 {
	 	  		    driver.findElement(AppiumBy.androidUIAutomator(
	 	  	               "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
	 	  		if(isVisibleWithId("com.threesixteen.app:id/stream_tier_tag")) {		 
	 	  			clickAndWaitForElementWithId("com.threesixteen.app:id/stream_tier_tag");
	 	  	        System.out.println("TC11- opened feed");
	 	  	        Thread.sleep(7000);	 
	 	  		 }
	 	  		 else
	 	  		 {
 	        System.out.println("TC12- Can not find Pro stream Right Now so Mid Tier stream opened");
 	      driver.findElement(AppiumBy.androidUIAutomator(
	               "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(4)"));
 	      clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
	        System.out.println("TC04- opened feed");
	        Thread.sleep(7000);	 
		           }
	 	  		 }
	 	       }
	 	 	 }
	 	   }
	 	 }
	   }
    }
  }
}

    
//		PIPSwitch();
        Thread.sleep(5000);
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.HOME));
       Thread.sleep(5000);
       System.out.println("TC13- Presseed Home button on handset");
       clickAndWaitForElementWithXpath1("//android.widget.TextView[@content-desc=\"Rooter\"]");
       System.out.println("TC14- Switch to full screen from PIP");
       Thread.sleep(5000);
       driver.navigate().back();
       Thread.sleep(1000);
       clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
       clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
       System.out.println("TC15- Mini player paused & send to Full screen");
       Thread.sleep(10000);
      
        
		 }
  
		
    
    
    
    
    
    @Test(priority = 25)
    public void DataCheckHomePage25() throws InterruptedException  {
  	  
  	  
  	  if (isVisibleWithXPath1("//*[contains(@text,'Missed')]")) {
	            System.out.println("TC00- New Homepage found ");
	      	    Thread.sleep(5000); 

       
  	    driver.findElement(AppiumBy.androidUIAutomator(
  	            "new UiScrollable(new UiSelector().text(\"Missed\")).setAsHorizontalList().scrollForward(2)"));
    driver.findElement(AppiumBy.androidUIAutomator(
    "new UiScrollable(new UiSelector().text(\"Videos\")).setAsHorizontalList().scrollForward(2)"));
driver.findElement(AppiumBy.androidUIAutomator(
        "new UiScrollable(new UiSelector().text(\"Esports\")).setAsHorizontalList().scrollForward()"));
	    driver.findElement(AppiumBy.androidUIAutomator(
	            "new UiScrollable(new UiSelector().text(\"Esports\")).setAsHorizontalList().scrollForward()"));
		    driver.findElement(AppiumBy.androidUIAutomator(
		            "new UiScrollable(new UiSelector().text(\"Missed\")).setAsHorizontalList().scrollForward()"));
			    System.out.println("TC07- scroll Top Bar");
		          clickAndWaitForElementWithXpath1("//*[contains(@text,'Missed')]");
	      	    System.out.println("TC08- Missed tab opened");
	      	    Thread.sleep(5000); 
		  		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
	            System.out.println("TC09- Feed Present in Tab");
		        SkipSurvey();

	      	    Thread.sleep(5000); 
		      	driver.navigate().back();
	      	    Thread.sleep(5000);     	
	      	  driver.findElement(AppiumBy.androidUIAutomator(
			            "new UiScrollable(new UiSelector().text(\"Missed\")).setAsHorizontalList().scrollForward()"));
		      	  driver.findElement(AppiumBy.androidUIAutomator(
				            "new UiScrollable(new UiSelector().text(\"Missed\")).setAsHorizontalList().scrollForward()"));
			      	  driver.findElement(AppiumBy.androidUIAutomator(
					            "new UiScrollable(new UiSelector().text(\"Giveaways 💎\")).setAsHorizontalList().scrollForward()"));
			      	 driver.findElement(AppiumBy.androidUIAutomator(
					            "new UiScrollable(new UiSelector().text(\"Giveaways 💎\")).setAsHorizontalList().scrollForward()"));
			      	 driver.findElement(AppiumBy.androidUIAutomator(
					            "new UiScrollable(new UiSelector().text(\"Giveaways 💎\")).setAsHorizontalList().scrollForward()"));
			      	 driver.findElement(AppiumBy.androidUIAutomator(
					            "new UiScrollable(new UiSelector().text(\"Giveaways 💎\")).setAsHorizontalList().scrollForward()"));
						    System.out.println("TC10- scroll Top Bar");
				      	    Thread.sleep(5000); 
//		      	 driver.findElement(AppiumBy.androidUIAutomator(
//				            "new UiScrollable(new UiSelector().text(\"Indoneisa\")).setAsHorizontalList().scrollForward()"));
//		      	    Thread.sleep(2000); 
                  if (isVisibleWithXPath1("//*[contains(@text,'Indonesia')]")) {
					    clickAndWaitForElementWithXpath1("//*[contains(@text,'Indonesia')]");
			      	    System.out.println("TC11- indonesia tab opened");
			      	    Thread.sleep(5000); 
					    
					    if (isVisibleWithId("com.threesixteen.app:id/player_layout")) {
					    clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
			            System.out.println("TC12- Feed Present in Tab");
				        SkipSurvey();

				      	Thread.sleep(5000);
				      	driver.navigate().back();
				      	Thread.sleep(5000);
					    }
                  
					    else
					    {
					      	Thread.sleep(1000);
						    clickAndWaitForElementWithId("com.threesixteen.app:id/btn_try_again");
				            System.out.println("TC13- click on watch other streanms ");
					        SkipSurvey();


					    }
                  }
					    
	driver.findElement(AppiumBy.androidUIAutomator(
	            "new UiScrollable(new UiSelector().text(\"Missed\")).setAsHorizontalList().scrollForward()"));
  	  driver.findElement(AppiumBy.androidUIAutomator(
		            "new UiScrollable(new UiSelector().text(\"Missed\")).setAsHorizontalList().scrollForward()"));
  	  driver.findElement(AppiumBy.androidUIAutomator(
		            "new UiScrollable(new UiSelector().text(\"Missed\")).setAsHorizontalList().scrollForward()"));
  	    System.out.println("TC15- MISSED TAB SCROLLED");

  	  driver.findElement(AppiumBy.androidUIAutomator(
	            "new UiScrollable(new UiSelector().text(\"Esports\")).setAsHorizontalList().scrollForward()"));
		    driver.findElement(AppiumBy.androidUIAutomator(
		            "new UiScrollable(new UiSelector().text(\"Esports\")).setAsHorizontalList().scrollForward()"));
		    driver.findElement(AppiumBy.androidUIAutomator(
		            "new UiScrollable(new UiSelector().text(\"Esports\")).setAsHorizontalList().scrollForward()"));
			    driver.findElement(AppiumBy.androidUIAutomator(
			            "new UiScrollable(new UiSelector().text(\"Esports\")).setAsHorizontalList().scrollForward()"));
			    driver.findElement(AppiumBy.androidUIAutomator(
			            "new UiScrollable(new UiSelector().text(\"Giveaways 💎\")).setAsHorizontalList().scrollForward()"));
				    System.out.println("TC14- scroll Top Bar");
		      	    Thread.sleep(5000); 
										      	    
										      	if (isVisibleWithXPath1("//*[contains(@text,'All Streams')]"))   {
										      	    
										      	  clickAndWaitForElementWithXpath1("//*[contains(@text,'All Streams')]");
										      	    System.out.println("TC15- All streams tab opened");
										      	    Thread.sleep(5000); 
										      	    
										      	    
										      	  driver.findElement(
										                  AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(5)"));
										      	    System.out.println("TC12- All streams scrolled");
										      	  clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
										            System.out.println("TC13- Feed Present in Tab");
											        SkipSurvey();


				                       	    Thread.sleep(1000);
										      	}
}

else
{
    System.out.println("TC14- This is Old Homepage so test stopped ");

}

}



    
    
    
    @Test(priority = 26)
 	public void  MissedTabContentisplaying26() throws InterruptedException, MalformedURLException {

	  
  	
        	Thread.sleep(3000);
          if (isVisibleWithXPath1("//*[contains(@text,'Missed')]")) {
    
          clickAndWaitForElementWithXpath1("//*[contains(@text,'Missed')]");
  	      System.out.println("TC01- Missed  tab opened");
  	      Thread.sleep(5000); 
  		  clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
          System.out.println("TC02- Feed Present in Tab");
  	      Thread.sleep(5000);  
	  	  Thread.sleep(5000);
	  	SkipSurvey();
	      System.out.println("TC05- not fount button trying again");
	      driver.navigate().back();
	      Thread.sleep(3000);
	      clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
	      clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
	      System.out.println("TC02A- Mini player paused & send to Full screen");
		  Thread.sleep(5000); 
	      clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
	      clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
	      System.out.println("TC06- UnMute the video");
          }
  
  else
  {
      System.out.println("TC06- This is old homepage ,Missed tab not visible. ");

  }
	      
    }

    
  	    
    
  

  
  
  @Test(priority = 27)
	public void  GiveawaysContentisplaying27() throws InterruptedException, MalformedURLException  {

	  
	  
        if (isVisibleWithXPath1("//*[contains(@text,'Missed')]")) {
        	
	  	    System.out.println("TC01- Mised tab deteteced");

	  driver.findElement(AppiumBy.androidUIAutomator(
	            "new UiScrollable(new UiSelector().text(\"Missed\")).setAsHorizontalList().scrollForward()"));
    	  driver.findElement(AppiumBy.androidUIAutomator(
		            "new UiScrollable(new UiSelector().text(\"Missed\")).setAsHorizontalList().scrollForward()"));
	      	  driver.findElement(AppiumBy.androidUIAutomator(
			            "new UiScrollable(new UiSelector().text(\"Videos\")).setAsHorizontalList().scrollForward()"));
	         	 driver.findElement(AppiumBy.androidUIAutomator(
			               "new UiScrollable(new UiSelector().text(\"Videos\")).setAsHorizontalList().scrollForward()"));
	            	 driver.findElement(AppiumBy.androidUIAutomator(
			                  "new UiScrollable(new UiSelector().text(\"Videos\")).setAsHorizontalList().scrollForward()"));
		      	                Thread.sleep(5000);
		      	              driver.findElement(AppiumBy.androidUIAutomator(
		      	    	            "new UiScrollable(new UiSelector().text(\"Missed\")).setAsHorizontalList().scrollForward()"));
		      	        	  driver.findElement(AppiumBy.androidUIAutomator(
		      	    		            "new UiScrollable(new UiSelector().text(\"Missed\")).setAsHorizontalList().scrollForward()"));
		      	    	      	  driver.findElement(AppiumBy.androidUIAutomator(
		      	    			            "new UiScrollable(new UiSelector().text(\"Videos\")).setAsHorizontalList().scrollForward()"));
		      	    	         	 driver.findElement(AppiumBy.androidUIAutomator(
		      	    			               "new UiScrollable(new UiSelector().text(\"Videos\")).setAsHorizontalList().scrollForward()"));
		      	    	            	 driver.findElement(AppiumBy.androidUIAutomator(
		      	    			                  "new UiScrollable(new UiSelector().text(\"Videos\")).setAsHorizontalList().scrollForward()"));
		      	    		      	                Thread.sleep(5000);
		      	        
    
		      	                
		        clickAndWaitForElementWithXpath1("//*[contains(@text,'Giveaways')]");
		  	    System.out.println("TC01- giveaways  tab opened");
		  	    Thread.sleep(1000); 
		  		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
		        System.out.println("TC02- Feed Present in Tab");
                Thread.sleep(1000);
                SkipSurvey();
                driver.navigate().back();
                Thread.sleep(1000);
                clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
                clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
                System.out.println("TC02A- Mini player paused & send to Full screen");
         	    Thread.sleep(1000); 
                clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
                System.out.println("TC06- UnMute the video");
                
                
            }
        else
        {
            System.out.println("TC06- This is old homepage ,Missed tab not visible. ");

        }
    }


    

  @Test(priority = 28)
  
  public void ProCreatorTagOnJonthanTest28() throws InterruptedException, MalformedURLException  {



  	OpenSearch();
      clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
      System.out.println("TC02- Click on search box");
      (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("jonathan");
      System.out.println("TC03- Type jonathan in search");
      driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
 		System.out.println("TC04- Click on ENTER");
      clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
      System.out.println("TC05- open Jonathan profile");
      clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView");
      System.out.println("TC06- pro creator tag is coming");
      
  }
  
  
  
  
  @Test(priority = 29)
  
	public void ProRecordedStreamForProUsers29() throws InterruptedException, MalformedURLException  {

		
  	OpenSearch();
      clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
      System.out.println("TC02- Click on search box");
 		Thread.sleep(1000);
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Zainab");
		System.out.println("TC03- Type Zainab in search");
		 driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
	   	System.out.println("TC04- Click on ENTER");
	   	Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open Zainab's profile");
		Thread.sleep(1000);
		clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView");
      System.out.println("TC06- pro creator tag is coming");
 		Thread.sleep(1000);
      driver.navigate().back();
 		Thread.sleep(1000);
      clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open Zainab's profile");
		Thread.sleep(1000);
      if (isVisibleWithId("com.threesixteen.app:id/replay_tag"))
      {
  		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
			System.out.println("TC07- open recorded stream");
			SkipSurvey();
      Thread.sleep(7000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
		clickAndWaitForElementWithId("com.threesixteen.app:id/exo_duration");
		System.out.println("TC08- stream duration is visible");
      Thread.sleep(7000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
		clickAndWaitForElementWithId("com.threesixteen.app:id/live_ffwd");
		System.out.println("TC09- stream forwarded");
	   }
  else 
  {
  	driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));	
  	 if (isVisibleWithId("com.threesixteen.app:id/replay_tag"))
       {
       clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
	   	System.out.println("TC10- open recorded stream");
	   	SkipSurvey();
       Thread.sleep(7000);
       
       }
  }
		clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
		clickAndWaitForElementWithId("com.threesixteen.app:id/exo_duration");
		System.out.println("TC11- stream exo duration is visible");
      Thread.sleep(7000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
		clickAndWaitForElementWithId("com.threesixteen.app:id/exo_position");
		System.out.println("TC12- stream exo Position is visible");
      Thread.sleep(7000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
		clickAndWaitForElementWithId("com.threesixteen.app:id/live_ffwd");
		System.out.println("TC13- recorded stream forwarded");
	    Thread.sleep(7000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
		clickAndWaitForElementWithId("com.threesixteen.app:id/live_rew");
		System.out.println("TC14- recorded stream Backwarded");
	  	System.out.println("TC15- Pro recorded stream playing for pro users");
	   }
      
  

  @Test(priority = 30)
  
 	public void MidtioerRecordedStreamForProUsers30() throws InterruptedException, MalformedURLException  {
    
 		
  	OpenSearch();
 		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
 		System.out.println("TC02- Click on search box");
 		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Mr WolF");
 		System.out.println("TC03- Type Mr wolf in search");
 		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
 		System.out.println("TC04- Click on ENTER");
      Thread.sleep(2000);
 		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
 		System.out.println("TC05- open wolf's profile");
      Thread.sleep(1000);
         if (isVisibleWithId("com.threesixteen.app:id/replay_tag"))
         {
     		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
 			System.out.println("TC06- open recorded stream");
 			SkipSurvey();
          Thread.sleep(7000);
 		clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
 		clickAndWaitForElementWithId("com.threesixteen.app:id/exo_duration");
 		System.out.println("TC07- stream duration is visible");
      Thread.sleep(7000);
 		clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
 		clickAndWaitForElementWithId("com.threesixteen.app:id/live_ffwd");
 		System.out.println("TC08- stream forwarded");
 	   }
     else 
     {
     	driver.findElement(
 				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));	
     	 if (isVisibleWithId("com.threesixteen.app:id/replay_tag"))
          {
          clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
  	   	System.out.println("TC09- open recorded stream");
          }
     }
          Thread.sleep(7000);
  		clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
  		clickAndWaitForElementWithId("com.threesixteen.app:id/exo_duration");
  		System.out.println("TC10- stream exo duration is visible");
          Thread.sleep(7000);
  		clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
  		clickAndWaitForElementWithId("com.threesixteen.app:id/exo_position");
  		System.out.println("TC11- stream exo Position is visible");
          Thread.sleep(7000);
  		clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
  		clickAndWaitForElementWithId("com.threesixteen.app:id/live_ffwd");
  		System.out.println("TC12- recorded stream forwarded");
          Thread.sleep(7000);
   		clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
   		clickAndWaitForElementWithId("com.threesixteen.app:id/live_rew");
   		System.out.println("TC13- recorded stream Backwarded");
 	  		System.out.println("TC14- Pro recorded stream playing for pro users");
  	   }
         
  
  
  
  
  
  @Test(priority = 31)
  
  public void FreePreviewTimerForPro31() throws InterruptedException  {

  
  	
				    if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button"))
			    	{ clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
			        System.out.println("TC01- Pro stream tab opened");
			        
		    	}
		    	else
		    	{
		            clickAndWaitForElementWithXpath1("//*[contains(@text,'Pro Streams')]");
			        System.out.println("TC01- Pro stream tab opened");
		    	}   
					Thread.sleep(2000);

		    	 if(isVisibleWithId("com.threesixteen.app:id/layout_comment")) {
		    	        clickAndWaitForElementWithId("com.threesixteen.app:id/layout_comment");
		    	        System.out.println("TC02- opened stream");
		    	        }
		    	         else
		    	        {
		    	    	 clickAndWaitForElementWithId("com.threesixteen.app:id/click_view");
		    	         System.out.println("TC02- opened stream");
		    	         }
				Thread.sleep(7000);
				if (isVisibleWithId("com.threesixteen.app:id/tv_timer_fls")) 
				{
				clickAndWaitForElementWithId("com.threesixteen.app:id/tv_timer_fls");
				System.out.println("TC03- Free review timer is working");
				clickAndWaitForElementWithId("com.threesixteen.app:id/web_view");
				}
				else
				{
					System.out.println("TC04- Pro user not seeing free preview");

				}
				}
  
  
  
  
  
    
    
	@AfterMethod
	
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}



