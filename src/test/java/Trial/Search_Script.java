package Trial;


import com.google.common.collect.ImmutableMap;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

import org.openqa.selenium.*;

import java.net.MalformedURLException;



public class Search_Script<MobileElement, Rotatable> extends Functions {




    @Test(priority = 1)
    public void BasicSearchTest1() throws InterruptedException {

//    	OpenSearch();
//        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_view_all");
//        System.out.println("TC02- Open top cretaors list from search");
//        clickAndWaitForElementWithXpath1(
//                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.Button");
//        System.out.println("TC03- Follow the creator");
//        clickAndWaitForElementWithXpath1(
//                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.Button");
//        System.out.println("TC04- UnFollow the creator");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
//        System.out.println("TC05- Back from top creators list");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_category_view_all");
//        System.out.println("TC07- Open top categories list");
//        driver.findElement(By.xpath("//*[contains(@text,'Garena Free Fire')]")).click();
//        System.out.println("TC08- Click on Free fire  search");
//        driver.findElement(By.xpath("//*[contains(@text,'Creators')]")).click();
//        Thread.sleep(1000);
//        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
//        System.out.println("TC11- Open profile");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
//        System.out.println("TC12- Back from Profile");
        
    }

   

    @Test(priority = 2)
    
    public void GarenafreefireSearchReelDataTest2() throws InterruptedException, MalformedURLException {

    	OpenSearch();
		Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Garena Free Fire");
        System.out.println("TC02- Type Garena Free Fire in search");
    	 driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(@text,'Reels')]")).click();
        System.out.println("TC01- open reels tab from search");
        Thread.sleep(2000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.GridView/android.view.ViewGroup[1]");
        System.out.println("TC02- Open first reel from search");
    }

    
    
    
    @Test(priority = 3)
    
    public void GarenafreefireSearchVideoTest3() throws InterruptedException, MalformedURLException {

    	OpenSearch();
		Thread.sleep(2000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
		Thread.sleep(2000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Garena Free Fire");
        System.out.println("TC02- Type Garena Free Fire in search");
		Thread.sleep(2000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on search button");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(@text,'Videos')]")).click();
        System.out.println("TC03- Click on Videos tab");
        Thread.sleep(2000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
        System.out.println("TC03- First Video Opened");
		Thread.sleep(5000);
	     SkipAd();
        clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
        System.out.println("TC18- Open suggested video");
		Thread.sleep(5000);

    }

    
    
    @Test(priority = 4)
    
    
    public void IRLSearchReelTest4() throws InterruptedException, MalformedURLException {

    	OpenSearch();
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("irl");
        System.out.println("TC02- Type IRL in search");
   	    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
		Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Reels')]")).click();
        System.out.println("TC01- open reels tab from search");
		Thread.sleep(1000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.GridView/android.view.ViewGroup[1]");
        System.out.println("TC02- Open first reel from search");  
		Thread.sleep(2000);
    }
    

    @Test(priority = 5)
    
    public void IRLSearchVideoTest5() throws InterruptedException, MalformedURLException {

    	OpenSearch();
		Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("irl");
        System.out.println("TC03- Type irl in search");
    	 driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
        driver.findElement(By.xpath("//*[contains(@text,'Videos')]")).click();
        System.out.println("TC05- Click on Videos tab");
		Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
        System.out.println("TC06- First Video Opened");
		Thread.sleep(2000);

    }

    
    @Test(priority = 6)
    
    
    public void MinecraftSearchVideoTest6() throws InterruptedException, MalformedURLException {
       
    	OpenSearch();
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("minecraft");
        System.out.println("TC03- Type Minercraft in search");
   	    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
        System.out.println("TC04- clicked on Minecraft in search");
        driver.findElement(By.xpath("//*[contains(@text,'Videos')]")).click();
        System.out.println("TC05- Click on Videos tab");
        Thread.sleep(5000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
        System.out.println("TC06- First Video Opened");
        Thread.sleep(5000);
        SkipAd();
        Thread.sleep(5000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay"); 
        if (isVisibleWithId("com.threesixteen.app:id/iv_volume"))
        {
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
        System.out.println("TC07- First Video muted");
        }
        else
        {
              Thread.sleep(5000);
              clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
              clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
              System.out.println("TC09- UnMute the video");
        }
        
    }


    


    @Test(priority = 7)

    public void Followotherchannelfromserach7() throws InterruptedException {

    	OpenSearch();
        Thread.sleep(2000); 
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
        Thread.sleep(2000); 
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("BGMS");
        System.out.println("TC03- Type BGMS in search");
        Thread.sleep(2000); 
   	    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
        Thread.sleep(2000); 
        driver.findElement(By.xpath("//*[contains(@text,'Creators')]")).click();
        System.out.println("TC05- Click on creator tab");
        Thread.sleep(2000); 
        if (isVisibleWithXPath1("//*[contains(@text,'SAMAR FF')]")) {
//        {  clickAndWaitForElementWithXpath1(
//                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
//        System.out.println("TC06- open profile");
        driver.findElement(By.xpath("//*[contains(@text,'SAMAR FF')]")).click();
        System.out.println("TC05- Click on creator tab");
    }
    else
    {
    	driver.navigate().back();
        Thread.sleep(2000); 
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
        Thread.sleep(2000); 
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("BGMS");
        System.out.println("TC03- Type BGMS in search");
        Thread.sleep(2000); 
   	    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
        Thread.sleep(2000); 
        driver.findElement(By.xpath("//*[contains(@text,'Creators')]")).click();
        System.out.println("TC05- Click on creator tab");
        Thread.sleep(2000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
        System.out.println("TC06- open profile");	
    }
        Thread.sleep(2000); 
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_cta_main");
        System.out.println("TC07- Follow/UnFollow BGMS page");
        Thread.sleep(2000); 
		 if (isVisibleWithXPath1("//*[contains(@text,'Yes')]"))  {
		        Thread.sleep(2000); 
	            clickAndWaitForElementWithXpath1("//*[contains(@text,'Yes')]");
	            System.out.println("TC08- Clicked on YES");

	        }
	        Thread.sleep(2000); 
	        
	        if (isVisibleWithXPath1("//*[contains(@text,'YES')]"))  {
	            Thread.sleep(2000); 
	            clickAndWaitForElementWithXpath1("//*[contains(@text,'YES')]");
	            System.out.println("TC08- Clicked on YES");

	        }
	        Thread.sleep(2000); 
        if (isVisibleWithXPath1("//*[contains(@text,'Following')]"))  {
            Thread.sleep(2000); 
            clickAndWaitForElementWithXpath1("//*[contains(@text,'Following')]");
            System.out.println("TC09- Clicked on following");

        }
        else
        {
            Thread.sleep(2000); 
            clickAndWaitForElementWithXpath1("//*[contains(@text,'Follow')]");
            System.out.println("TC10- Clicked on follow");


        }

    }

    
    
    @Test(priority = 8)
    
    
    public void BGMSSearchCreatorList8() throws InterruptedException, MalformedURLException {

    	OpenSearch();
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("BGMS");
        System.out.println("TC02- Type BGMS in search");
    	 driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
	    Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Creators')]")).click();
        System.out.println("TC02- Click on creator tab");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
        System.out.println("TC02- open profile");
		Thread.sleep(1000);


    }
	
    
    
    @Test(priority = 9)
    
    
    public void othersprofilefollowrfollwoingtest9() throws InterruptedException, MalformedURLException {

    	OpenSearch();
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("BGMI");
        System.out.println("TC03- Type BGMI in search");
    	 driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
	    Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Creators')]")).click();
        System.out.println("TC05- Click on creator tab");
	    Thread.sleep(1000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
        System.out.println("TC06- open profile");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_profile_share");
        System.out.println("TC07- Click on share icon");
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");
        System.out.println("TC08- Copy profile link");
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_followers");
        System.out.println("TC09- Open followers list");
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
        System.out.println("TC10- Open profile");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
        System.out.println("TC11- Back from Profile");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Following')]")).click();
        System.out.println("TC12- Open following list");
        if (isVisibleWithId("com.threesixteen.app:id/tv_name")) {
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
        System.out.println("TC13- Open profile");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
        System.out.println("TC14- Back from Profile");
        }

    }
    
    

    @Test(priority = 10)
    
    public void MinecraftSearchReelTest10() throws InterruptedException, MalformedURLException {

    	OpenSearch();
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Minecraft");
        System.out.println("TC02- Type Minecraft in search");
   	    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
        driver.findElement(By.xpath("//*[contains(@text,'Reels')]")).click();
        System.out.println("TC01- open reels tab from search");
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.GridView/android.view.ViewGroup[1]");
        System.out.println("TC02- Open first reel from search");
		Thread.sleep(1000);


        
    }
    
    
    
	
    @Test(priority = 11)

    public void SearchVideoPlayerLikeWatchNWin11() throws InterruptedException {

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
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Videos')]")).click();
        System.out.println("TC05- Click on Videos tab");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
        System.out.println("TC06- First Video Opened");
        Thread.sleep(10000);
        SkipAd();
        clickAndWaitForElementWithId("com.threesixteen.app:id/layout_watch_and_win");
        System.out.println("TC07- Open watch & Win");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_refresh");
        System.out.println("TC08- Refresh watch & Win");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_refresh");
        System.out.println("TC09- Refresh watch & Win");
        Thread.sleep(500);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_coins");
        System.out.println("TC10- Open coins page");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);

    }
    
 
 @Test(priority = 12)
    
    public void BGMISearchReelTest12() throws InterruptedException, MalformedURLException {

     	OpenSearch();
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("BGMI");
        System.out.println("TC02- Type BGMI in search");
   	    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
        driver.findElement(By.xpath("//*[contains(@text,'Reels')]")).click();
        System.out.println("TC01- open reels tab from search");
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.GridView/android.view.ViewGroup[1]");
        System.out.println("TC02- Open first reel from search");
		Thread.sleep(1000);

        
    }
 
 
 @Test(priority = 13)
 
 public void PUBGSearchReelTest13() throws InterruptedException, MalformedURLException {

 	OpenSearch();
     clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
     System.out.println("TC02- Click on search box");
     (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("PUBG Mobile");
     System.out.println("TC02- Type PUBG MObile in search");
	    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
     driver.findElement(By.xpath("//*[contains(@text,'Reels')]")).click();
     System.out.println("TC01- open reels tab from search");
     clickAndWaitForElementWithXpath1(
             "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.GridView/android.view.ViewGroup[1]");
     System.out.println("TC02- Open first reel from search");
		Thread.sleep(1000);

     
 }
    
	
 
 @Test(priority = 14)
 
 
 public void MinecraftSearchVideoTest14() throws InterruptedException, MalformedURLException {
    
 	OpenSearch();
     clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
     System.out.println("TC02- Click on search box");
     (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Minecraft");
     System.out.println("TC03- Type Minecraft in search");
	    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
	     Thread.sleep(5000);
     driver.findElement(By.xpath("//*[contains(@text,'Videos')]")).click();
     System.out.println("TC05- Click on Videos tab");
     Thread.sleep(5000);
     clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
     System.out.println("TC06- First Video Opened");
     Thread.sleep(10000);
     SkipAd();
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
 
 
 
 
 @Test(priority = 15)
 
 
 public void GTASearchVideoTest15() throws InterruptedException, MalformedURLException {
    
 	OpenSearch();
     clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
     System.out.println("TC02- Click on search box");
     Thread.sleep(1000);   
     (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("GTA");
     System.out.println("TC03- Type GTA in search");
     Thread.sleep(1000);   
	    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
	     Thread.sleep(1000);   
     driver.findElement(By.xpath("//*[contains(@text,'Videos')]")).click();
     System.out.println("TC05- Click on Videos tab");
     Thread.sleep(2000);   
     clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
     System.out.println("TC06- First Video Opened");
     Thread.sleep(5000);   
     SkipAd();
     clickAndWaitForElementWithId("com.threesixteen.app:id/tv_time_and_watching");
     System.out.println("TC06- Video working");

     
 }
	
 
 

 @Test(priority = 16)
 
 public void GTASearchReelTest16() throws InterruptedException, MalformedURLException {

 	OpenSearch();
     clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
     System.out.println("TC02- Click on search box");
     (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("GTA");
     System.out.println("TC02- Type GTA in search");
	    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
		Thread.sleep(1000);
     driver.findElement(By.xpath("//*[contains(@text,'Reels')]")).click();
     System.out.println("TC01- open reels tab from search");
		Thread.sleep(1000);
     clickAndWaitForElementWithXpath1(
             "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.GridView/android.view.ViewGroup[1]");
     System.out.println("TC02- Open first reel from search");
		Thread.sleep(1000);

     
 }
 
 
 
 
 @Test(priority = 17)
 
 
 public void GTASearchCreatorList17() throws InterruptedException, MalformedURLException {

 	OpenSearch();
     clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
     System.out.println("TC02- Click on search box");
     (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("GTA");
     System.out.println("TC02- Type GTA in search");
	 driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
		Thread.sleep(1000);
     driver.findElement(By.xpath("//*[contains(@text,'Creators')]")).click();
     System.out.println("TC02- Click on creator tab");
     clickAndWaitForElementWithXpath1(
             "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
     System.out.println("TC02- open profile");  
		Thread.sleep(1000);


 }
	
 
@Test(priority = 18)
 
 
 public void MinecreftSearchCreatorList18() throws InterruptedException, MalformedURLException {

    	OpenSearch();
     clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
     System.out.println("TC02- Click on search box");
     (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Minecraft");
     System.out.println("TC02- Type Minecraft in search");
	 driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
		Thread.sleep(1000);
     driver.findElement(By.xpath("//*[contains(@text,'Creators')]")).click();
     System.out.println("TC02- Click on creator tab");
     clickAndWaitForElementWithXpath1(
             "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
     System.out.println("TC02- open profile");
		Thread.sleep(1000);


 }




@Test(priority = 19)


public void PUBGSearchCreatorList19() throws InterruptedException, MalformedURLException {

	OpenSearch();
    clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
    System.out.println("TC02- Click on search box");
    (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("PUBG");
    System.out.println("TC02- Type PUBG in search");
	 driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
		Thread.sleep(1000);
    driver.findElement(By.xpath("//*[contains(@text,'Creators')]")).click();
    System.out.println("TC02- Click on creator tab");
    clickAndWaitForElementWithXpath1(
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
    System.out.println("TC02- open profile");
	Thread.sleep(1000);



}



@Test(priority = 20)


			public void SearchVideoUITest20() throws InterruptedException, MalformedURLException {
			   
				OpenSearch();
			    Thread.sleep(1000);
			    clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
			    System.out.println("TC02- Click on search box");
			    Thread.sleep(2000);   
			    (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("BGMI");
			    System.out.println("TC03- Type bgmi in search");
			    Thread.sleep(1000);   
				    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
					System.out.println("TC04- Click on serach button");
					Thread.sleep(3000);
			    driver.findElement(By.xpath("//*[contains(@text,'Videos')]")).click();
			    System.out.println("TC05- Click on Videos tab");
			    Thread.sleep(3000);
			    clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView[1]");
			    System.out.println("TC06- Opened creator profile");
			    Thread.sleep(2000);
			    driver.navigate().back();
			    Thread.sleep(2000);
			    if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout[1]/android.widget.TextView"))
			    {  clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout[1]/android.widget.TextView");
			    System.out.println("TC07- Likes count is coming");
			    Thread.sleep(1000);
			    clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView");
			    System.out.println("TC08- comment count is coming");
			    Thread.sleep(1000);
			    driver.navigate().back();
			    Thread.sleep(1000);
			    }
			    clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView[2]");
			    System.out.println("TC09- Click on more");
			    Thread.sleep(2000);
			    driver.navigate().back();
			    Thread.sleep(10000);
			    clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[2]");
			    System.out.println("TC010- View and Date coming on video");
			    Thread.sleep(10000);
			    SkipAd();
			    if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[3]"))
			    {  clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[3]");
			    System.out.println("TC11- Title coming coming on video");
			    Thread.sleep(1000);  } 
			    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_follow");
			    System.out.println("TC13- Followed the cretaor");
			    Thread.sleep(1000);   
			    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_time_and_watching");
			    System.out.println("TC14- View and Date coming on video");
			    Thread.sleep(3000);   
			    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_support");
			    System.out.println("TC15- LiKESs count coming on video");
			    Thread.sleep(1000);   
			    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_comment");
			    System.out.println("TC16- Comment count coming on video");
			    Thread.sleep(2000);
			    driver.navigate().back();
			    Thread.sleep(2000);
			    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_shares");
			    System.out.println("TC17- share count coming on video");
				Thread.sleep(1000);
			    driver.navigate().back();
			    Thread.sleep(2000);
			    if (isVisibleWithId("com.threesixteen.app:id/rv_tags"))
			    {
			    	  clickAndWaitForElementWithId("com.threesixteen.app:id/rv_tags");
			    	    System.out.println("TC19- Tags coming on video");
			    	    
			    	    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_followers");
			    	    System.out.println("TC20- Followers count of creator coming on video in serach");
			    }
			    else
			    {
			    	
			    	 driver.navigate().back();
			    	    Thread.sleep(2000);
			    	    clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
			    System.out.println("TC18- First Video Opened");
			    Thread.sleep(5000);   
			    clickAndWaitForElementWithId("com.threesixteen.app:id/rv_tags");
			    System.out.println("TC19- Tags coming on video");
			    Thread.sleep(1000);   
			    
			    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_followers");
			    System.out.println("TC20- Followers count of creator coming on video in serach");
			 }
			}
				
			 
			
			@Test(priority = 21)
			
			public void SearchLiveUITest21() throws InterruptedException, MalformedURLException {
			   
				OpenSearch();
			    Thread.sleep(1000);
			    clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
			    System.out.println("TC02- Click on search box");
			    Thread.sleep(1000);
			    (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("BGMI");
			    System.out.println("TC03- Type bgmi in search");
			    Thread.sleep(1000);
				    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
					System.out.println("TC04- Click on serach button");
				    Thread.sleep(10000);
			    driver.findElement(By.xpath("//*[contains(@text,'Live')]")).click();
			    System.out.println("TC05- Click on Live tab");
			    Thread.sleep(2000);
		        SkipSurvey();

			    clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView[1]");
			    System.out.println("TC06- Opened creator profile");
		        SkipSurvey();

			    Thread.sleep(1000);
			    driver.navigate().back();
			    Thread.sleep(1000);
			    if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout[1]/android.widget.TextView"))
			    { clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout[1]/android.widget.TextView");
			    System.out.println("TC07- Likes count is coming");
			    Thread.sleep(1000);
			    clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView");
			    System.out.println("TC08- comment count is coming");
			    Thread.sleep(1000);
			    driver.navigate().back();
			    Thread.sleep(1000);
			    }
			    clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView[2]");
			    System.out.println("TC09- Click on more");
			    Thread.sleep(1000);
			    driver.navigate().back();
			    Thread.sleep(1000);
			    clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[2]");
			    System.out.println("TC010- View and Date coming on Live");
			    Thread.sleep(3000);
			    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
			    Thread.sleep(2000);
			    clickAndWaitForElementWithId("com.threesixteen.app:id/rv_tags");
			    System.out.println("TC18- Tags coming on Live stream");
			    Thread.sleep(2000);
			    Thread.sleep(1000);
			//    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
			//    System.out.println("TC12- Existed from Chat");
			//    Thread.sleep(1000);
			    clickAndWaitForElementWithId("com.threesixteen.app:id/rv_tags");
			    System.out.println("TC18- Tags coming on Live stream");
			    Thread.sleep(1000);
			    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_follow");
			    System.out.println("TC13- Followed the cretaor");
			    Thread.sleep(1000);
			    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_time_and_watching");
			    System.out.println("TC14- View and Date coming on video");
			    Thread.sleep(1000);
			    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_support");
			    System.out.println("TC15- Likes count coming on video");
			    Thread.sleep(1000);
			    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_comment");
			    System.out.println("TC16- Comment count coming on video");
			    Thread.sleep(1000);
			    Thread.sleep(1000);
			    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_shares");
			    System.out.println("TC17- share count coming on video");
			  
			}
	
 
@Test(priority = 22)


		public void BGMISearchCreatortabTest22() throws InterruptedException, MalformedURLException {
		
			OpenSearch();
		    clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		    System.out.println("TC02- Click on search box");
		    (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("BGMI");
		    System.out.println("TC03- Type bgmi in search");
			    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
				System.out.println("TC04- Click on serach button");
						Thread.sleep(1000);
				driver.findElement(By.xpath("//*[contains(@text,'Creators')]")).click();
				Thread.sleep(1000);
				clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
				System.out.println("TC11- Open profile");
				clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
				System.out.println("TC12- Back from Profile");
		
		
		}
		
		
		@Test(priority = 23)
		
		
		public void PUBGSearchCreatortabTest23() throws InterruptedException, MalformedURLException {
		
			OpenSearch();
			Thread.sleep(1000);
		    clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		    System.out.println("TC02- Click on search box");
		    (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("PUBG");
		    System.out.println("TC03- Type PUBG in search");
			    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
				System.out.println("TC04- Click on serach button");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[contains(@text,'Creators')]")).click();
				Thread.sleep(1000);
				clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
				System.out.println("TC11- Open profile");
				Thread.sleep(1000);
				clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
				System.out.println("TC12- Back from Profile");
		
		
		}
		
		
		
		
		@Test(priority = 24)
		
		
		public void GTASearchCreatortabTest24() throws InterruptedException, MalformedURLException {
		
			OpenSearch();
			Thread.sleep(1000);
		    clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		    System.out.println("TC02- Click on search box");
		    (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("GTA");
		    System.out.println("TC03- Type GTA in search");
			    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
				System.out.println("TC04- Click on serach button");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[contains(@text,'Creators')]")).click();
				clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
				System.out.println("TC11- Open profile");
				clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
				System.out.println("TC12- Back from Profile");
		
		
		}
		
		
		
		@Test(priority = 25)
		
		
		public void MinecraftSearchCreatortabTest25() throws InterruptedException, MalformedURLException {
		
			OpenSearch();
		    clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		    System.out.println("TC02- Click on search box");
		    (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Minecraft");
		    System.out.println("TC03- Type Minecraft in search");
			    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
				System.out.println("TC04- Click on serach button");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[contains(@text,'Creators')]")).click();
				clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
				System.out.println("TC11- Open profile");
				clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
				System.out.println("TC12- Back from Profile");
		
		
		}
		
		
		
		
		@Test(priority = 26)
		
			public void OtherProfileFollowingFollowerlist26() throws InterruptedException, MalformedURLException 
		{
				
			   OpenSearch();
			       Thread.sleep(1000);
				clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
				System.out.println("TC02- Click on search box");
			       Thread.sleep(1000);
				(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Quantum");
				System.out.println("TC03- Type Quasntum in search");
			       Thread.sleep(1000);
				driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		  		System.out.println("TC04- Click on ENTER");
		        Thread.sleep(1000);
				clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
				System.out.println("TC05- open Quantum's profile");
			       Thread.sleep(1000);
		       clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_followers");
		       System.out.println("TC06- Open followers list");
		       Thread.sleep(1000);
		       driver.findElement(AppiumBy
		               .androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(10)"));
		       Thread.sleep(1000);
		       System.out.println("Scrolled");
		
		       clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		       System.out.println("TC07- Open profile");
		       Thread.sleep(1000);
		       clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
		       System.out.println("TC08- Back from Profile");
		       Thread.sleep(1000);
		       driver.findElement(By.xpath("//*[contains(@text,'Following')]")).click();
		       System.out.println("TC09- Open following list");
		       Thread.sleep(1000);
		       driver.findElement(AppiumBy
		               .androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(10)"));
		       System.out.println("Scrolled");
		       Thread.sleep(1000);
		       clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		       System.out.println("TC10- Open profile");
		       Thread.sleep(1000);
		       clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
		       System.out.println("TC11- Back from Profile");
		       Thread.sleep(1000);
		       driver.navigate().back();
		    
		}





    }




