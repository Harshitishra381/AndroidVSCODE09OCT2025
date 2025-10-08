package Trial;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.*;
import java.net.MalformedURLException;

public class Video_Script<MobileElement, Rotatable> extends Functions  {
	
	
	


    @Test(priority = 1)
    public void VideominiPlayertofullAndPlaybackSpeedChange01() throws InterruptedException, MalformedURLException {


            OpenVideo();
            Thread.sleep(3000);         
            miniplayertofullplayerSwitch();
            driver.navigate().back();
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
            clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
            System.out.println("TC02- Mini player  send to Full screen");
            Thread.sleep(10000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
            if (isVisibleWithXPath1("//android.widget.FrameLayout[@content-desc=\"Show player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[2]"))
            {	clickAndWaitForElementWithXpath1(
                    "//android.widget.FrameLayout[@content-desc=\"Show player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[2]");
            System.out.println("TC03A- Clicked on video player setting");
            }
            else
            {
            Thread.sleep(10000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
            if (isVisibleWithXPath1("//android.widget.FrameLayout[@content-desc=\"Show player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[2]"))
            { clickAndWaitForElementWithXpath1(
                    "//android.widget.FrameLayout[@content-desc=\"Show player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[2]");
            System.out.println("TC03B- Clicked on video player setting");
            }
            else
            {
            	 Thread.sleep(10000);
                 clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
            	 clickAndWaitForElementWithXpath1(
                         "//android.widget.FrameLayout[@content-desc=\"Show player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[2]");
                 System.out.println("TC03C- Clicked on video player setting");
            }
    }   
            clickAndWaitForElementWithXpath1("//*[contains(@text,'Playback Speed')]");
            System.out.println("TC05- clicked on video playback speed");
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1("//*[contains(@text,'Normal')]");
            System.out.println("TC06- changed the video palyback speed to Normal");
            Thread.sleep(1000);
      
    }

   
    

	@Test(priority = 2)
	
    public void VideoPIPtofullscreentest2() throws InterruptedException, MalformedURLException {

		
            OpenVideo();
            Thread.sleep(5000);
            PIPSwitch();
            clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
            System.out.println("TC40- Open suggested video");
            Thread.sleep(5000);
            PIPSwitch();
            clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
            System.out.println("TC41- Open suggested video");
            Thread.sleep(5000);
        }
      




//    @Test(priority = 3)
//    public void Screenrotation3() throws InterruptedException, MalformedURLException {
//
//        if (isVisibleWithXPath1("//android.widget.Button[contains(@text, 'Videos')]"))
//        {
//            driver.findElement(By.xpath("//android.widget.Button[contains(@text, 'Videos')]")).click();
//            System.out.println("TC01- Video tab opened");
//            Thread.sleep(1000);
//            clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
//            System.out.println("TC02- Video Opened from videos tab");
//            Thread.sleep(7000);
//
//        }
//        else
//        {
//            driver.findElement(AppiumBy.androidUIAutomator(
//                    "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
//            if (isVisibleWithId("com.threesixteen.app:id/video_timer")) {
//                clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
//                System.out.println("TC02- Video Opened from homepage");
//                Thread.sleep(10000);
//            }
//
//        }
//
////        ((SupportsRotation) driver).rotate(ScreenOrientation.LANDSCAPE);
////        System.out.println("TC02- Handset rotate to landscape");
////        Thread.sleep(7000);
////        ((SupportsRotation) driver).rotate(ScreenOrientation.PORTRAIT);
////        System.out.println("TC02- Handset rotate to Portrait");
////        Thread.sleep(7000);
//
//    }



    @Test(priority = 4)
    public void VideomuteunmuteafterPIP4() throws InterruptedException, MalformedURLException {


         OpenVideo();
         Thread.sleep(5000);
         PIPSwitch();
         Thread.sleep(2000);
         driver.navigate().back();
         Thread.sleep(1000);
         clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
         clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
         System.out.println("TC08- Mini player paused & send to Full screen");
         Thread.sleep(10000);
         clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
         if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
            System.out.println("TC11- UnMute the video");
        } 
         else 
        {
//            driver.navigate().back();
//            Thread.sleep(2000);
//            clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
//            clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
//            System.out.println("TC12- Mini player paused & send to Full screen");
//            Thread.sleep(7000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
            if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
            System.out.println("TC13- UnMute the video");
            Thread.sleep(1000); 
            }
            else
            {
                Thread.sleep(7000);
                clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
                System.out.println("TC14- UnMute the video");
                Thread.sleep(1000); 

            }
        }

    }
   
    
    
    

    @Test(priority = 5)
    
    public void VideoQualitychangeafterPIP5() throws InterruptedException, MalformedURLException {

            OpenVideo();
            Thread.sleep(10000);
            PIPSwitch();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
            clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
            System.out.println("TC06- Mini player paused & send to Full screen");
            Thread.sleep(2000);
            ExoQualityChange();
            Thread.sleep(1000);

        }
       

    private boolean isVisibleWithXpath1(String s) {

        return false;
    }



  



    @Test(priority = 6)

    public void VideoPlayerForwardBackward6() throws InterruptedException {

            OpenVideo();
            Thread.sleep(5000);
            driver.navigate().back();
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
            clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
            System.out.println("TC03- Mini player paused & send to portrait");
            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
            if (isVisibleWithId("com.threesixteen.app:id/exo_rew"))
            {
                clickAndWaitForElementWithId("com.threesixteen.app:id/exo_rew");
                System.out.println("TC04- Video forwarded & revverse 5 sec");
                driver.navigate().back();
            }
            else
            {
                Thread.sleep(10000);
                clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
                clickAndWaitForElementWithId("com.threesixteen.app:id/exo_rew");
                System.out.println("TC05- Video forwarded & revverse 5 sec");
                driver.navigate().back();
            }

            }
           

      
        



    @Test(priority = 7)
    

    public void VideoPlayerComment7() throws InterruptedException {

            OpenVideo();
            Thread.sleep(10000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_live_comments");
            System.out.println("TC01- Comment section  opened");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
            System.out.println("TC02- Clicked comment section");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/et_comment");
            (driver).findElement(By.id("com.threesixteen.app:id/et_comment")).sendKeys("Nice played");
            System.out.println("TC03- Typed Nice played comment section");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
            System.out.println("TC04- Send the  comment");
            Thread.sleep(3000);
            clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView");
            System.out.println("TC05- open likes list");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
            System.out.println("TC06- closed bottom sheet");
            Thread.sleep(1000);
            driver.navigate().back();
            Thread.sleep(1000);
    }
    


    @Test(priority = 8)
    
    public void VideoWatcchAndWinCoinsDetailsandRecommededVideo8() throws InterruptedException {

            OpenVideo();
            Thread.sleep(10000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/layout_watch_and_win");
            System.out.println("TC03- open watch & Win");
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_refresh");
            System.out.println("TC04- Refresh watch & Win");
            if (isVisibleWithId("com.threesixteen.app:id/iv_2x_toggle")) {
                System.out.println("TC05- 2x Button is visible in Active Tasks sheet");
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_coins");
            System.out.println("TC05- open coins page");
            Thread.sleep(1000);
            driver.navigate().back();
            Thread.sleep(1000);
            System.out.println("TC06- Back from coins log");
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1("//*[contains(@text,'See More Tasks')]");
			System.out.println("TC07- Opened see More tasks");
          driver.navigate().back();
          System.out.println("TC08- Back from task page");
          Thread.sleep(2000); 
          clickAndWaitForElementWithId("com.threesixteen.app:id/tv_coins");
          System.out.println("TC09- Open coins log");
          Thread.sleep(2000); 
          driver.navigate().back();
          Thread.sleep(2000); 
          System.out.println("TC10- Back from coins log");
            driver.navigate().back();
            Thread.sleep(1000);
            System.out.println("TC11- Bottom sheet closed");
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]");
            System.out.println("TC12- click on share  button");
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_download");
            System.out.println("TC13- Download the video");
            Thread.sleep(1000);
            if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
            }
            Thread.sleep(1000);
           OpenRecommendedFeed();
           Thread.sleep(1000);

            }
            else
            {
            	clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
           		System.out.println("TC11- 2x not coming in Active tasks bottom sheet");
                 Thread.sleep(1000);
            }
        }
       


    @Test(priority = 9)

    public void VideoMiniPlayerTabSwittch9() throws InterruptedException {

         OpenVideo();
         Thread.sleep(10000);
         driver.navigate().back();
         System.out.println("TC03- switch to mmini player");
         Thread.sleep(1000);
         
         TabSwitch();
        

    }

    
    
    
    
    @Test(priority = 10)

    public void SearcchVideoplayerComment10() throws InterruptedException {

        OpenSearch();
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
        Thread.sleep(2000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("bgmi");
        System.out.println("TC02- Type bgmi in search");
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
   		System.out.println("TC04- Click on ENTER");
   		Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Videos')]")).click();
        System.out.println("TC03- Click on Videos tab");
        Thread.sleep(2000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
        System.out.println("TC03- First Video Opened");
        Thread.sleep(3000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_live_comments");
        System.out.println("TC61- Comment section  opened");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
        System.out.println("TC62- Clicked comment section");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/et_comment");
        Thread.sleep(1000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_comment")).sendKeys("Hi");
        System.out.println("TC63- Typed Hi comment section");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
        System.out.println("TC64- Send the  comment");     
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);

    }



    @Test(priority = 11)

    public void searchvideoplayerLikeWatchNWin11() throws InterruptedException {

        OpenSearch();
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
        Thread.sleep(1000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("bgmi");
        System.out.println("TC02- Type bgmi in search");
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
   		System.out.println("TC04- Click on ENTER");
   		Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Videos')]")).click();
        System.out.println("TC03- Click on Videos tab");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
        System.out.println("TC03- First Video Opened");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/layout_watch_and_win");
        System.out.println("TC03- Open Active tasks");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_refresh");
        System.out.println("TC04- Refresh watch & Win");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_refresh");
        System.out.println("TC05- Refresh watch & Win");
        if (isVisibleWithId("com.threesixteen.app:id/iv_2x_toggle")) {
            System.out.println("TC06- 2x Button is visible in Active Tasks sheet");
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_coins");
        System.out.println("TC06- Open coins page");
       
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        }
        else
        {
        	 clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
       		System.out.println("TC02- 2x not coming in Active tasks bottom sheet");
             Thread.sleep(1000);
        }

    }

   


    @Test(priority = 12)
    
    public void IRLSearchVideoTest12() throws InterruptedException, MalformedURLException {

        OpenSearch();

        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
            Thread.sleep(1000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("irl");
        System.out.println("TC02- Type irl in search");
        Thread.sleep(2000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
   		System.out.println("TC04- Click on ENTER");
   		Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Videos')]")).click();
        System.out.println("TC03- Click on Videos tab");
        Thread.sleep(500);
        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
        System.out.println("TC03- First Video Opened");
        Thread.sleep(1000);
    }

    
    
    
    
    @Test(priority = 13)
    
    public void MinecraftSearchVideoTest13() throws InterruptedException, MalformedURLException {
       
        OpenSearch();

        Thread.sleep(3000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
        Thread.sleep(1000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("minecraft");
        System.out.println("TC03- Type Minercraft in search");
        Thread.sleep(3000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
   		System.out.println("TC04- Click on ENTER");
   		Thread.sleep(1000);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[contains(@text,'Videos')]")).click();
        System.out.println("TC05- Click on Videos tab");
        Thread.sleep(3000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
        System.out.println("TC06- First Video Opened");
        Thread.sleep(7000);
        
        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay"); 
        if (isVisibleWithId("com.threesixteen.app:id/iv_volume"))
        {
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
        System.out.println("TC07- First Video muted");
        }
        else
        {
            Thread.sleep(10000);
              clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
              clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
              System.out.println("TC09- UnMute the video");
              Thread.sleep(1000);
        }
        
    }

    
    

    @Test(priority = 14)
    
    public void Videoplayerrotate14() throws InterruptedException {

        OpenVideo();
        Thread.sleep(10000);
        driver.navigate().back();
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
        clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
        System.out.println("TC03- Mini player paused & send to portrait");
        Thread.sleep(10000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
        System.out.println("TC04- Rotate to landscape");
        Thread.sleep(10000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
        System.out.println("TC05- Rotate to portrait");
        Thread.sleep(10000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
        System.out.println("TC06- Rotate to landscape");
        Thread.sleep(10000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
        System.out.println("TC07- Rotate to portrait");
//        ExoRotate();
        clickAndWaitForElementWithId("com.threesixteen.app:id/layout_watch_and_win");
        System.out.println("TC08- watch & win clicked video");
        driver.navigate().back();

    }

    

    @Test(priority = 15)
    

    public void videoqualitychnage15() throws InterruptedException {

            OpenVideo();
            Thread.sleep(1000);
            driver.navigate().back();
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
            clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
            System.out.println("TC03- Mini player paused & send to Full screen");
            Thread.sleep(5000);
            ExoQualityChange();
            Thread.sleep(5000);

    }
    

    @Test(priority = 16)

    public void Videoplayermuteunute16() throws InterruptedException {

            OpenVideo();
            Thread.sleep(10000);
            driver.navigate().back();
            clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
            clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
            System.out.println("TC03- Mini player paused & send to Full screen");
            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
            System.out.println("TC04- Mute the video");
            Thread.sleep(1000);

            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
            if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
                System.out.println("TC06- UnMute the video");
                Thread.sleep(1000);
            } else {
                driver.navigate().back();
                clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
                clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
                System.out.println("TC06- Mini player paused & send to Full screen");
                Thread.sleep(2000);
                clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
                System.out.println("TC07- UnMute the video");
                Thread.sleep(1000);
            }

    }



    @Test(priority = 17)

    public void Videoplayerplaybackspeed17() throws InterruptedException {

                OpenVideo();
                Thread.sleep(1000);
                driver.navigate().back();
                Thread.sleep(1000);
                System.out.println("TC02- Switch to mini player");
                Thread.sleep(10000);
                clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
                clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
                System.out.println("TC03- Mini player paused & send to Full screen");
                Thread.sleep(10000);
                clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
                if (isVisibleWithXPath1("//android.widget.FrameLayout[@content-desc=\"Show player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[2]"))
                {	clickAndWaitForElementWithXpath1(
                        "//android.widget.FrameLayout[@content-desc=\"Show player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[2]");
                      System.out.println("TC04A- Clicked on video player setting");
                }
                else
                {
                Thread.sleep(10000);
                clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
                if (isVisibleWithXPath1("//android.widget.FrameLayout[@content-desc=\"Show player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[2]"))
                {  clickAndWaitForElementWithXpath1(
                        "//android.widget.FrameLayout[@content-desc=\"Show player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[2]");
                System.out.println("TC04B- Clicked on video player setting");
                }
                else
                {
                    Thread.sleep(20000);
                    clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
                    if (isVisibleWithId("//android.widget.FrameLayout[@content-desc=\"Show player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[2]"))
                    {
                    clickAndWaitForElementWithXpath1(
                            "//android.widget.FrameLayout[@content-desc=\"Show player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[2]");
                    System.out.println("TC04C- Clicked on video player setting");
                    }      
                    else
                    {
                    	 Thread.sleep(20000);
                         clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
                         clickAndWaitForElementWithXpath1(
                                 "//android.widget.FrameLayout[@content-desc=\"Show player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[2]");
                         System.out.println("TC04C- Clicked on video player setting");
                    }
                }
              }
                Thread.sleep(1000);
                clickAndWaitForElementWithXpath1("//*[contains(@text,'Playback Speed')]");
                System.out.println("TC05- clicked on video 	Playback speed");
                Thread.sleep(1000);
                clickAndWaitForElementWithXpath1("//*[contains(@text,'2x')]");
                System.out.println("TC06- changed the video qulaity to 2x");
                Thread.sleep(1000);
                driver.navigate().back();
                Thread.sleep(1000);
                clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
                Thread.sleep(1000);
                clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
                System.out.println("TC07- Mini player paused & send to Full screen");
                Thread.sleep(1000);
                System.out.println("TC08- Mini player paused & send to Full screen");
                Thread.sleep(1000);
                clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
                System.out.println("TC09- Open suggested video");
                Thread.sleep(8000);
                driver.navigate().back();
                Thread.sleep(1000);
                CheckVideoProgress();

            }
        
    



    @Test(priority = 18)
    

    public void VideoPlayerTimerMuteButton18() throws InterruptedException {

         OpenVideo();
         Thread.sleep(10000);
         driver.navigate().back();
         System.out.println("TC04- Switch to mini player");

         Thread.sleep(1500);
         if (isVisibleWithId("com.threesixteen.app:id/iv_more")) {
             Thread.sleep(1500);
        	 clickAndWaitForElementWithId("com.threesixteen.app:id/tv_author");
             System.out.println("TC05- Open creators profile");
             Thread.sleep(1500);
             driver.navigate().back();
             Thread.sleep(1500);
             clickAndWaitForElementWithId("com.threesixteen.app:id/iv_more");
             System.out.println("TC06- Click on more button");
             Thread.sleep(1500);
             clickAndWaitForElementWithXpath1("//*[contains(@text,'Follow')]");
             System.out.println("TC07- Click on Follow button");
             Thread.sleep(2000);
             driver.navigate().back();
             Thread.sleep(2000);       	
                 clickAndWaitForElementWithId("com.threesixteen.app:id/iv_more");
                 System.out.println("TC08- Click on more button");          
                 clickAndWaitForElementWithXpath1("//*[contains(@text,'About')]");
                 System.out.println("TC09- Click on about button");
             Thread.sleep(2000);
             if (isVisibleWithXpath1("//*[contains(@text,'Done')]")) {
             clickAndWaitForElementWithXpath1("//*[contains(@text,'Done')]");
             System.out.println("TC10- Click on Done button");
             Thread.sleep(1500);
         }
             else
             {
            	  driver.navigate().back();
                  Thread.sleep(1500);
             }       
        clickAndWaitForElementWithId("com.threesixteen.app:id/video_timer");
        System.out.println("TC15- Video timer available");
        Thread.sleep(1500);
        if (isVisibleWithId("com.threesixteen.app:id/iv_volume_switch")) {
            System.out.println("TC16- Video mute/unmute button available");
            Thread.sleep(1500);
        }

        if (isVisibleWithId("com.threesixteen.app:id/tv_num_support")) {
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_support");
        System.out.println("TC20- Like count is coming from backend");
        Thread.sleep(1500);
//        driver.navigate().back();
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_comment");
        System.out.println("TC21- Comment count is coming from backend");
        Thread.sleep(1500);
        driver.navigate().back();
        Thread.sleep(1500);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_shares");
        System.out.println("TC22- Share count is coming from backend");
        Thread.sleep(1500);
        driver.navigate().back();
        Thread.sleep(1500);
        }
         }
       
         }
    



    @Test(priority = 19)
    
    public void MinecraftSearchVideolikecommentandsharecount19() throws InterruptedException, MalformedURLException {

        OpenSearch();

        Thread.sleep(5000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
        Thread.sleep(5000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Minecraft");
        System.out.println("TC02- Type Minercraf in search");
        Thread.sleep(2000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
     		System.out.println("TC04- Click on ENTER");
     		Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Videos')]")).click();
        System.out.println("TC03- Click on Videos tab");
        Thread.sleep(5000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_author");
        System.out.println("TC05- Open creators profile");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        if (isVisibleWithId("com.threesixteen.app:id/tv_num_support")) {
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_support");
        System.out.println("TC06- Like count is coming from backend");
        Thread.sleep(2000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_comment");
        System.out.println("TC07- Comment count is ccoming from backend");
        Thread.sleep(2000);
        driver.navigate().back();
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_shares");
        System.out.println("TC08- Share count is coming from backend");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        }
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_more");
        System.out.println("TC09- Click on more button");
        Thread.sleep(2000);
        clickAndWaitForElementWithXpath1("//*[contains(@text,'About')]");
        System.out.println("TC12- Click on About button");
        Thread.sleep(2000);
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Done')]");
        System.out.println("TC13- Click on Done button");
        Thread.sleep(2000);

    }

    

    @Test(priority = 191)
    
    
    public void Videotagsandtimer191() throws InterruptedException, MalformedURLException {

         OpenVideo();
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_time_and_watching");
        System.out.println("TC13- time watching data is coming from backkend for Video");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.TextView");
        System.out.println("TC14- Game Name is coming from backend for Video");
        Thread.sleep(1000);

    }

   
    
    @Test(priority = 20)  
    
    public void VideomuteUnmuteAfterScreenRtoatatE20() throws InterruptedException, MalformedURLException {

    	OpenVideo();         
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
      clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
       clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
        System.out.println("TC03- Mini player paused & send to portrait");
        Thread.sleep(5000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
        if (isVisibleWithXpath1("//android.widget.FrameLayout[@content-desc=\"Hide player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[6]"))
        {
        clickAndWaitForElementWithXpath1("//android.widget.FrameLayout[@content-desc=\"Hide player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[6]");
        System.out.println("TC04- Video player screen Rotate to landscape");
        Thread.sleep(5000);
        }
        else
        {
            Thread.sleep(10000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
            System.out.println("TC05- Video player screen Rotate to landscape");
            Thread.sleep(5000);

        }
        Thread.sleep(5000);
        if (isVisibleWithId("com.threesixteen.app:id/miniPlayerPlayPause")) {
        clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
        clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
        System.out.println("TC03- Mini player paused & send to portrait");
        Thread.sleep(5000);
        }
        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
        System.out.println("TC06- Video player screen Rotate to portrait");
        Thread.sleep(10000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
        if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
            System.out.println("TC07- mute/UnMute the video");
            Thread.sleep(5000);
        } 
        else 
        {
            driver.navigate().back();
            Thread.sleep(5000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
            clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
            System.out.println("TC08- Mini player paused & send to portrait");
            Thread.sleep(5000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
            System.out.println("TC09- mute/UnMute the video");
            Thread.sleep(5000);

        }
         Thread.sleep(5000);
         clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
         if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
            System.out.println("TC10- Mute/unmute the video");
            Thread.sleep(5000);
        } 
        else 
        {
            Thread.sleep(5000);
            driver.navigate().back();
            Thread.sleep(5000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
            clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
            System.out.println("TC12- Mini player paused & send to portrait");
            Thread.sleep(5000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
            if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
            System.out.println("TC11- mute/UnMute the video");
            Thread.sleep(5000);
            }
            else
            {
            	
            }
            driver.navigate().back();
            Thread.sleep(5000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
            clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
            System.out.println("TC12- Mini player paused & send to portrait");
            Thread.sleep(5000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
            System.out.println("TC13- mute/UnMute the video");
            Thread.sleep(5000);
        }
            }

        
    
    @Test(priority = 21)
    
	public void SearchVideoPIP21() throws InterruptedException, MalformedURLException {
	

	
		
        OpenSearch();

        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
        Thread.sleep(1000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("BGMS");
        System.out.println("TC03- Type BGMS in search");
        Thread.sleep(1000);
     	 driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
   		System.out.println("TC04- Click on serach button");
   		Thread.sleep(2000);

        driver.findElement(By.xpath("//*[contains(@text,'Videos')]")).click();
        System.out.println("TC05- Click on Video tab");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
        System.out.println("TC06- First Video Opened");
        Thread.sleep(10000);
        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.HOME));
        System.out.println("TC07- Switched to PIP");
        Thread.sleep(2000);
        clickAndWaitForElementWithXpath1("//android.widget.TextView[@content-desc=\"Rooter\"]");
        System.out.println("TC08- Switched PIP to full screen");
        Thread.sleep(000);
        if (isVisibleWithId("com.threesixteen.app:id/tv_time_and_watching"))
        {
            ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.HOME));
            System.out.println("TC09- Switched to PIP");
            Thread.sleep(2000);
        }
        clickAndWaitForElementWithXpath1("//android.widget.TextView[@content-desc=\"Rooter\"]");
        System.out.println("TC10- Switched PIP to full screen");
        Thread.sleep(2000);
        if (isVisibleWithId("com.threesixteen.app:id/tv_time_and_watching"))
        {
            ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.HOME));
            System.out.println("TC11- Switched to PIP");
            Thread.sleep(2000);
        }
        clickAndWaitForElementWithXpath1("//android.widget.TextView[@content-desc=\"Rooter\"]");
        System.out.println("TC12- Switched PIP to full screen");
        Thread.sleep(2000);
        if (isVisibleWithId("com.threesixteen.app:id/tv_time_and_watching"))
        {
            ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.HOME));
            System.out.println("TC13- Switched to PIP");
            Thread.sleep(2000);
        }
        clickAndWaitForElementWithXpath1("//android.widget.TextView[@content-desc=\"Rooter\"]");
        System.out.println("TC14- Switched PIP to full screen");
        Thread.sleep(2000);
        if (isVisibleWithId("com.threesixteen.app:id/tv_time_and_watching"))
        {
            ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.HOME));
            System.out.println("TC15- Switched to PIP");
            Thread.sleep(2000);
        }
        clickAndWaitForElementWithXpath1("//android.widget.TextView[@content-desc=\"Rooter\"]");
        System.out.println("TC10- Switched PIP to full screen");
        Thread.sleep(2000);
	}
    
    
    
    
    
    
    
	
    @Test(priority = 22)
    
	public void SearchVideoRotate22() throws InterruptedException, MalformedURLException {	
		
//		clickAndWaitForElementWithXpath1(
//                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView");
//        System.out.println("TC01- Open Search");
//        Thread.sleep(1000);
//        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
//        System.out.println("TC02- Click on search box");
//        Thread.sleep(1000);
//        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("BGMS");
//        System.out.println("TC03- Type BGMS in search");
//        Thread.sleep(1000);
//        clickAndWaitForElementWithXpath1(
//                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
//        System.out.println("TC04- Click on BGMS in search suggestion");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[contains(@text,'Videos')]")).click();
//        System.out.println("TC05- Click on Video tab");
//        Thread.sleep(1000);
//        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
//        System.out.println("TC06- First Video Opened");
//        Thread.sleep(10000);
//        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//        if (isVisibleWithXpath1("//android.widget.ImageButton[@content-desc=\"Pause\"]"))
//        {
//        clickAndWaitForElementWithXpath1("//android.widget.ImageButton[@content-desc=\"Pause\"]");
//        System.out.println("TC07- exo paused");
//        }
//        else
//        {
//        	 Thread.sleep(10000);
//             clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");	
//             clickAndWaitForElementWithId("com.threesixteen.app:id/exo_play_pause");
//             System.out.println("TC07- exo paused");
//
//        }
//        Thread.sleep(10000);
//        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
//        System.out.println("TC08- Rotate to landscape");
//        Thread.sleep(10000);
//        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
//        System.out.println("TC09- Rotate to portrait");
//        Thread.sleep(10000);
//        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
//        System.out.println("TC10- Rotate to landscape");
//        Thread.sleep(10000);
//        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
//        System.out.println("TC11- Rotate to portrait");
//		ExoRotate();
	}
   
    
    
    

    
    
    @Test(priority = 23)
    
    public void VideoqualityChangeAfterRotation23() throws InterruptedException, MalformedURLException  {

            OpenVideo();
            Thread.sleep(1000);
            driver.navigate().back();
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
            clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
            System.out.println("TC03- Mini player paused & send to portrait");
            Thread.sleep(5000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
            System.out.println("TC04- Video player screen Rotate to landscape");
            Thread.sleep(5000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
            System.out.println("TC05- Video player screen Rotate to portrait");
            Thread.sleep(5000);
//            clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
//            clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
//            System.out.println("TC03- Mini player paused & send to portrait");
//            Thread.sleep(10000);
            ExoQualityChange();  
            Thread.sleep(1000);
            driver.navigate().back();
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
            clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
            System.out.println("TC03- Mini player paused & send to portrait");
            Thread.sleep(1000);
            CheckVideoProgress();

    }



   
    
    
    
    
//@Test(priority = 24)
//    
//    public void ScreenAutoRotation24() throws InterruptedException, MalformedURLException  {
//
//                OpenVideo();
//                Thread.sleep(10000);
//	
//           
////            ((SupportsRotation) driver).rotate(ScreenOrientation.LANDSCAPE);
////             System.out.println("TC02- Handset rotate to landscape");
////            Thread.sleep(30000);
////            ((SupportsRotation) driver).rotate(ScreenOrientation.PORTRAIT);
////            System.out.println("TC02- Handset rotate to Portrait");
////            Thread.sleep(30000);
//            
//          
//            ((SupportsRotation) driver).rotate(ScreenOrientation.PORTRAIT);
//            System.out.println("TC02- Handset rotate to Portrait");
//            Thread.sleep(30000);
//
//            // Rotate to reverse portrait (180 degrees)
//            ((SupportsRotation) driver).rotate(ScreenOrientation.PORTRAIT);
//            System.out.println("TC02- Handset rotate to Reverse Portrait");
//            Thread.sleep(30000);
//
//            // Rotate to landscape (270 degrees)
//            ((SupportsRotation) driver).rotate(ScreenOrientation.LANDSCAPE);
//            System.out.println("TC02- Handset rotate to Landscape (effectively 90 degrees)");
//            Thread.sleep(30000);
            
            
//}
	
	

   
    
    
    
    
    @Test(priority = 24)
    public void Videoprogress24() throws InterruptedException, MalformedURLException {

    
    	OpenVideo();
        Thread.sleep(1000);
        CheckVideoProgress();
        
    	}
    
    
    
    


    @Test()
    
    
    

	@AfterMethod
	
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}



