package Trial;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class RecordedStreamTest<MobileElement> extends Functions  {


	
	

   
    
    
 
     
 

    
    
    
    @Test(priority = 5)
	public void RegaltosRecordedStreamPro5() throws InterruptedException, MalformedURLException {
   
		
    	OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Regaltos");
		System.out.println("TC03- Type regaltos in search");
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
   		System.out.println("TC04- Click on ENTER");
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open regaltos's profile");
        Thread.sleep(1000);
  	   MuteRecordedStream("TC06");
        
        
         }
    

    
    
    @Test(priority = 6)
    
	public void SoulZerefRecordedStreamPro6() throws InterruptedException, MalformedURLException  {

		
    	OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Zeref");
		System.out.println("TC03- Type Zeref in search");
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
   		System.out.println("TC04- Click on ENTER");
		Thread.sleep(2000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open zeref's profile");
        Thread.sleep(1000);
  	   MuteRecordedStream("TC06");
    }
    
    
    
    @Test(priority = 7)
 	public void Bit8GoldyRecordedStreamPro7() throws InterruptedException, MalformedURLException {
      
		
    	OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("8bit Goldy");
		System.out.println("TC03- Type 8bit goldy in search");
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
   		System.out.println("TC04- Click on ENTER");		
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open goldy's profile");
        Thread.sleep(1000);
  	   MuteRecordedStream("TC06");

    }
        
    
    
    @Test(priority = 8)
    
   	public void ScoutOPRecordedStreamPro8() throws InterruptedException, MalformedURLException {
    
 
   		
    	OpenSearch();
   		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
   		System.out.println("TC02- Click on search box");
   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("DJ RUTURAJ LIVE");
   		System.out.println("TC03- Type RUTURAJ DJ in search");
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
   		System.out.println("TC04- Click on ENTER");
   		Thread.sleep(1000);
   		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
   		System.out.println("TC05- open Creators's profile");
   		Thread.sleep(1000);
  	   MuteRecordedStream("TC06");
   		Thread.sleep(1000);

       }
    
    
    
    @Test(priority = 9)
   	public void Mamba8bitRecordedstreamPro9() throws InterruptedException, MalformedURLException  {
   
   		
    	OpenSearch();
   		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
   		System.out.println("TC02- Click on search box");
   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("8bit mamba");
   		System.out.println("TC03- Type 8bit mamba in search");
   		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
   		System.out.println("TC04- Click on ENTER");
   		Thread.sleep(1000);
   		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
   		System.out.println("TC05- open mamba's profile");
   		Thread.sleep(1000);
  	   MuteRecordedStream("TC06");
   		

       }
    
    
    
    @Test(priority = 10)
    
   	public void Rusherw0w8bitRecordedstreampro10() throws InterruptedException, MalformedURLException {
   
   		
    	OpenSearch();
   		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
   		System.out.println("TC02- Click on search box");
   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("8bit rusherwow");
   		System.out.println("TC03- Type 8bit rusherwow in search");
   	    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
   		Thread.sleep(1000);
   		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
   		System.out.println("TC05- open 8bit rusherwow's profile");
   		Thread.sleep(1000);
  	   MuteRecordedStream("TC06");
        
       }
    
    
    
    @Test(priority = 11)
    
   	public void Binks698bitRecordedStreamPro11() throws InterruptedException, MalformedURLException {
  
   		
    	OpenSearch();
   		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
   		System.out.println("TC02- Click on search box");
   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("bink 8bit");
   		System.out.println("TC03- Type 8bit Binks 69 in search");
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
   		System.out.println("TC04- Click on ENTER");
   		Thread.sleep(1000);
   		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
   		System.out.println("TC05- open 8bit binks's profile");
        Thread.sleep(1000);
  	   MuteRecordedStream("TC06");
          
          
       }
    
    
   
    @Test(priority = 12)
    
   	public void SoulViperRecordedStreamPro12() throws InterruptedException, MalformedURLException {
 
   		
    	OpenSearch();
   		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
   		System.out.println("TC02- Click on search box");
   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("SouL Viper");
   		System.out.println("TC03- Type soul viper in search");
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
   		System.out.println("TC04- Click on serach button");
   		Thread.sleep(1000);
   		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
   		System.out.println("TC05- open viper's profile");
   		Thread.sleep(1000);
  	   MuteRecordedStream("TC06");
          
       }
    
    
    
    @Test(priority = 13)
    
   	public void SoulSidRecordedStreamPro13() throws InterruptedException, MalformedURLException  {
  
   		
    	OpenSearch();
   		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
   		System.out.println("TC02- Click on search box");
   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("SouL sid");
   		System.out.println("TC03- Type soul sid in search");
   	    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
   		Thread.sleep(1000);
   		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
   		System.out.println("TC05- open sid's profile");
        Thread.sleep(1000);
  	   MuteRecordedStream("TC06");
        
        
       }
    
    
    
    
    @Test(priority = 14)
   	public void SoulOxyRecordedStreamPro14() throws InterruptedException, MalformedURLException  {
   
   		
    	OpenSearch();
   		Thread.sleep(1000);
   		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
   		System.out.println("TC02- Click on search box");
   		Thread.sleep(1000);
   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("soul oxy");
   		System.out.println("TC03- Type soul oxy in search");
   		Thread.sleep(1000);
   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).click();
   		Thread.sleep(1000);
   	     driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
   		Thread.sleep(1000);
   		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
   		System.out.println("TC05- open oxy's profile");
        Thread.sleep(1000);
  	   MuteRecordedStream("TC06");
        
        
       }
    
    
    
      
    
    @Test(priority = 15)
    
   	public void HeadFlicker8bitRecordedStreamPro15() throws InterruptedException, MalformedURLException  {
   
   		
    	OpenSearch();
   		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
   		System.out.println("TC02- Click on search box");
   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("8bit HeadFlicker");
   		System.out.println("TC03- Type 8bitHeadFlicker in search");
   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).click();
   	    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");   		
	    Thread.sleep(1000);
	    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
   		System.out.println("TC05- open 8bitheadflicker's profile");
        Thread.sleep(1000);
  	   MuteRecordedStream("TC06");
        
       }
    
    
    
    @Test(priority = 16)
   	public void RAESportsRecordedStreamPro16() throws InterruptedException, MalformedURLException  {
  
   		
    	OpenSearch();
   		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
   		System.out.println("TC02- Click on search box");
   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("RA esports");
   		System.out.println("TC03- Type RA esports in search");
   	    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
   		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(@text,'Creators')]")).click();

		driver.findElement(By.xpath("//*[contains(@text,'RA ESPORTS')]")).click();

//   		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
   		System.out.println("TC05- open RA sports's profile");
        Thread.sleep(1000);
  	   MuteRecordedStream("TC06");
        
        
       }
    
    
    
    
    @Test(priority =17)
    
   	public void RAWSOMERecordedstreampro17() throws InterruptedException, MalformedURLException  {
   
   		
    	OpenSearch();
   		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
   		System.out.println("TC02- Click on search box");
   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Rawsome");
   		System.out.println("TC03- Type Rawsome in search");
   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).click();
   	     driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
   		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
   		System.out.println("TC05- open Rawsome's profile");
        Thread.sleep(1000);
  	   MuteRecordedStream("TC06");
        
        
       }
    
    
    
    
    @Test(priority = 18 )
   	public void ZainabRecordedStreamPro19() throws InterruptedException, MalformedURLException  {
   
   		
//    	OpenSearch();
//   		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
//   		System.out.println("TC02- Click on search box");
//   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Zainab");
//   		System.out.println("TC03- Type Zainab in search");
//   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).click();
//   	     driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
//		System.out.println("TC04- Click on serach button");
//   		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
//   		System.out.println("TC05- open ZAINAB's profile");
//        MuteRecordedStream();
//        
        
       }
    
    
    
    
    @Test(priority = 20)
    
   	public void Mafia8BitRecordedStreamPro20() throws InterruptedException, MalformedURLException  {
 
   		
    	OpenSearch();
   		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
   		System.out.println("TC02- Click on search box");
   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("8bit mafia");
   		System.out.println("TC03- Type 8bit mafia in search");
   	    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
   		Thread.sleep(1000);
   		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
   		System.out.println("TC05- open MAFIA's profile");
        Thread.sleep(1000);
  	   MuteRecordedStream("TC06");
        
       }
    
    
    
//    @Test(priority = 27)
//   	public void RecordedStreamQlityChange27() throws InterruptedException, MalformedURLException 
// {
//   		
//   		clickAndWaitForElementWithXpath1(
//   		"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView");
//   		System.out.println("TC01- Open Search");
//   		Thread.sleep(1000);
//   		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
//   		System.out.println("TC02- Click on search box");
//   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("RA esports");
//   		System.out.println("TC03- Type RA esports in search");
//   	    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
//		System.out.println("TC04- Click on serach button");
//   		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
//   		System.out.println("TC05- open RA sports's profile");
//        Thread.sleep(1000);
//           if (isVisibleWithId("com.threesixteen.app:id/replay_tag"))
//	        {
//	    		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
//				System.out.println("TC06- open recorded stream");
//	        Thread.sleep(10000);
//            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//    		clickAndWaitForElementWithXpath1("//android.widget.ImageButton[@content-desc=\"Pause\"]");
//			System.out.println("TC06- Exo paused");
//	        Thread.sleep(10000);
//	          ExoQualityChange();
//
//	        }
//           else
//           {
//        	   driver.findElement(
//						AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));	
//		        Thread.sleep(1000);
//		         clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
//		 	   	System.out.println("TC08- open recorded stream");
//		         Thread.sleep(10000);
//		         clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//		    		clickAndWaitForElementWithXpath1("//android.widget.ImageButton[@content-desc=\"Pause\"]");
//					System.out.println("TC06- Exo paused");
//			        Thread.sleep(10000);
//          ExoQualityChange();
//           }
//       }
 
 
 
// @Test(priority = 28)
//   	public void RecordedstreamRotate28() throws InterruptedException, MalformedURLException 
//   	
//   {
//		
//   		clickAndWaitForElementWithXpath1(
//   		"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView");
//   		System.out.println("TC01- Open Search");
//   		Thread.sleep(1000);
//   		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
//   		System.out.println("TC02- Click on search box");
//   		Thread.sleep(1000);
//   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Regaltos");
//   		System.out.println("TC03- Type Regaltos in search");
//   		Thread.sleep(1000);
//    	 driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
//		System.out.println("TC04- Click on serach button");
//   		Thread.sleep(1000);
//   		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
//   		System.out.println("TC05- open RA sports's profile");
//   		Thread.sleep(1000);
//           if (isVisibleWithId("com.threesixteen.app:id/replay_tag"))
//	        {
//	    		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
//				System.out.println("TC06- open recorded stream");
//
//	        }
//           else
//           {
//        	   driver.findElement(
//						AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));	
//		         clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
//		 	   	System.out.println("TC08- open recorded stream");
//
//           }
//	        Thread.sleep(10000);
//          ExoRotate();
//       }
 
 
 
 @Test(priority = 21)
   	public void RecordedstreamUIcheck21() throws InterruptedException, MalformedURLException  {
  
 
		
	        OpenSearch();
			clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
			System.out.println("TC02- Click on search box");
	         Thread.sleep(1000);
			(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Regaltos");
			System.out.println("TC03- Type regaltos in search");
	         Thread.sleep(1000);
			driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
				System.out.println("TC04- Click on serach button");
		         Thread.sleep(1000);
			clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
			System.out.println("TC05- open regaltos's profile");
	         Thread.sleep(1000);
	           if (isVisibleWithId("com.threesixteen.app:id/replay_tag"))
		        {
		    		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
					System.out.println("TC06- open recorded stream");
		        Thread.sleep(1000);}
		  
			  else 
				
		    {
		    	driver.findElement(
						AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));	
		         clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
		         Thread.sleep(1000);
		 	   	System.out.println("TC08- open recorded stream");
		         Thread.sleep(1000);
		    }
	           
	           if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
	               clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close"); }
	           Thread.sleep(1000);
	           
		         Thread.sleep(4000);
		         clickAndWaitForElementWithId("com.threesixteen.app:id/tv_time_and_watching");
		            System.out.println("TC09- time watching data is coming from backkend for stream");
			         Thread.sleep(1000);
			clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.TextView");
	         Thread.sleep(1000);
			clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.TextView");
            System.out.println("TC10- Game Name and language coming ");
	         Thread.sleep(1000);
	         clickAndWaitForElementWithId("com.threesixteen.app:id/tv_time_and_watching");
	            System.out.println("TC11- Follower count is Visible on recorded stream page");
		         Thread.sleep(1000);
		         clickAndWaitForElementWithId("com.threesixteen.app:id/tv_follow");
		         Thread.sleep(1000);
		         clickAndWaitForElementWithId("com.threesixteen.app:id/tv_follow");
		            System.out.println("TC12- Folow and unfolow working fine");
			         clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_support");
			            System.out.println("TC13- Likes count coming from BE");
				         clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_shares");
				            System.out.println("TC14- Share count coming from BE");
					        Thread.sleep(1000);
				            driver.navigate().back();
					        Thread.sleep(1000);
					         clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_comment");
					            System.out.println("TC15- Comment count coming from BE");


	         }

 
//     @Test(priority = 30)
// 
//		 public void liveplayerPIP30() throws InterruptedException 
//		{
//		
//				 if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button")) {
//			            clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
//			            System.out.println("TC01- Pro stream opened"); 
//			          
//			        } 
//			        else 
//			        {
//			 	        driver.findElement(By.xpath("//*[contains(@text,'Following')]")).click();
//			            System.out.println("TC01- Following tab opened");
//			        }
//				 
//		     clickAndWaitForElementWithId("com.threesixteen.app:id/layout_comment");
//		     System.out.println("TC02- opened stream");
//		     Thread.sleep(10000);
//		     ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.HOME));
//             Thread.sleep(5000);
//         
//         clickAndWaitForElementWithXpath1("//android.widget.TextView[@content-desc=\"Rooter\"]");
//         Thread.sleep(5000);
//     
//     System.out.println("F--> PIP switch done 10 times");
//     Thread.sleep(2000);
//		     PIPSwitch();
//		     driver.navigate().back();
//	         Thread.sleep(1000);
//	         clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
//	         clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
//	         System.out.println("TC08- Mini player paused & send to Full screen");
//	         Thread.sleep(10000);
//	         clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//	         if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
//	            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//	            System.out.println("TC11- UnMute the Stream");
//	        }
//	         else 
//	        {
//	            driver.navigate().back();
//	            Thread.sleep(1000);
//	            clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
//	            clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
//	            System.out.println("TC12- Mini player paused & send to Full screen");
//	            Thread.sleep(7000);
//	            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//	            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//	            System.out.println("TC13- UnMute the Stream");
//	            Thread.sleep(1000);
//	        }
//		 }
 
 
 
     @Test(priority = 22)
  	public void BitRebelRecordedStreamPro22() throws InterruptedException, MalformedURLException {
       
 		
        OpenSearch();
 		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
 		System.out.println("TC02- Click on search box");
 		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("8bit Rebel");
 		System.out.println("TC03- Type 8bit Rebel in search");
 		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    	System.out.println("TC04- Click on ENTER");	
   		Thread.sleep(1000);
 		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
 		System.out.println("TC05- open Rebel's profile");
        Thread.sleep(1000);
  	   MuteRecordedStream("TC06");

     }

     
     
     @Test(priority = 23)
   	public void KeizerRecordedStreamPro23() throws InterruptedException, MalformedURLException {
        
  		
        OpenSearch();
  		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
  		System.out.println("TC02- Click on search box");
  		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Keizer");
  		System.out.println("TC03- Type Kaizer in search");
  		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
     	System.out.println("TC04- Click on ENTER");		
  		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
  		System.out.println("TC05- open keizer's profile");
        Thread.sleep(1000);
  	   MuteRecordedStream("TC06");

      }
     
     
     
     
     @Test(priority = 24)
    	public void UpthrustEsportsRecordedStreamPro24() throws InterruptedException, MalformedURLException {
   
    		
    	    OpenSearch();
    		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
    		System.out.println("TC02- Click on search box");
    		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Upthrust Esports");
    		System.out.println("TC03- Type Upthrust Esports in search");
    		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).click();
    	     driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
 		    System.out.println("TC04- Click on serach button");
    		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
    		System.out.println("TC05- open uphtust's profile");
            Thread.sleep(1000); 
      	   MuteRecordedStream("TC06");
         
        }
     
     
     
     
     
     @Test(priority = 25)
 	public void GamersFleetRecordedStreamPro25() throws InterruptedException, MalformedURLException  {
 		
        OpenSearch();
 		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
 		System.out.println("TC02- Click on search box");
 		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("GamersFleet");
 		System.out.println("TC03- Type GamersFleet in search");
 		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).click();
 	     driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
 		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
 		System.out.println("TC05- open Gamersfleet's profile");
	    Thread.sleep(1000);
	 	   MuteRecordedStream("TC06");
      
     }
    
     
     
     @Test(priority = 26)
   	public void nightmmareesportsRecordedStreamPr026() throws InterruptedException, MalformedURLException  {
        
  		
        OpenSearch();
  		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
  		System.out.println("TC02- Click on search box");
  		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("NIGHTMARE ESPORTS");
  		System.out.println("TC03- Type NIGHTMARE ESPORTS in search");
  		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    	System.out.println("TC04- Click on ENTER");	
      	Thread.sleep(1000);
  		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
  		System.out.println("TC05- open NIGHTMARE ESPORTS's profile");
        Thread.sleep(1000);
  	   MuteRecordedStream("TC06");

      }
  
     
     
     @Test(priority = 27)
    	public void LidomaAsiaBahasaRecordedStreamTest27() throws InterruptedException, MalformedURLException  {
    
    		
    	    OpenSearch();
    		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
    		System.out.println("TC02- Click on search box");
    		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Lidoma Asia | Bahasa");
    		System.out.println("TC03- Type Lidoma Asia bahasa in search");
    		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).click();
    	     driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
 	    	System.out.println("TC04- Click on serach button");
    		Thread.sleep(1000);
    		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
    		System.out.println("TC05- open lidoma's profile");
            Thread.sleep(1000);
      	   MuteRecordedStream("TC06");
        }
     
     
     
     
     @Test(priority = 28)
 	public void LidomaAsiaRecordedStreamTest28() throws InterruptedException, MalformedURLException  {
 
 		
        OpenSearch();
 		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
 		System.out.println("TC02- Click on search box");
 		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Lidoma Asia ");
 		System.out.println("TC03- Type Lidoma Asia in search");
 		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).click();
 	     driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
 		Thread.sleep(1000);
 		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
 		System.out.println("TC05- open lidoma's profile");
	    Thread.sleep(1000);
	 	   MuteRecordedStream("TC06");
      
     }
     
     
     
     @Test(priority = 29)
   	public void PitajiplayzRecordedStreamPro29() throws InterruptedException, MalformedURLException {
        
  		
        OpenSearch();
  		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
  		System.out.println("TC02- Click on search box");
  		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Pitaji Playz");
  		System.out.println("TC03- Type Pitaji Playz in search");
  		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
     	System.out.println("TC04- Click on ENTER");	
   		Thread.sleep(1000);
  		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
  		System.out.println("TC05- open pitaji's profile");
        Thread.sleep(1000);
  	   MuteRecordedStream("TC06");

      }
     
     
     
     @Test(priority = 30)
   	public void IGRIRecordedStreamPro30() throws InterruptedException, MalformedURLException {
        
  		
        OpenSearch();
  		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
  		System.out.println("TC02- Click on search box");
  		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("IGRI - indian");
  		System.out.println("TC03- Type IGRI in search");
  		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
     	System.out.println("TC04- Click on ENTER");	
   		Thread.sleep(1000);
  		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
  		System.out.println("TC05- open IGRI's profile");
        Thread.sleep(1000);
  	   MuteRecordedStream("TC06");

      }
     
     
     @Test(priority = 31)
    	public void kaztroRecordedStreamPro31() throws InterruptedException, MalformedURLException {
         
   		
        OpenSearch();
   		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
   		System.out.println("TC02- Click on search box");
   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("kaztro");
   		System.out.println("TC03- Type kaztro in search");
   		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
      	System.out.println("TC04- Click on ENTER");	
   		Thread.sleep(1000);
   		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
   		System.out.println("TC05- open kaztro's profile");
        Thread.sleep(1000);
  	   MuteRecordedStream("TC06");

       }
     
     
     
     @Test(priority = 32)
 	public void DemondproXRecordedStreamPro32() throws InterruptedException, MalformedURLException {
      
		
        OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("DemondproX Gaming");
		System.out.println("TC03- Type DemondproX Gaming in search");
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
   		System.out.println("TC04- Click on ENTER");	
    	Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open DemondproX Gaming profile");
        Thread.sleep(1000);
  	   MuteRecordedStream("TC06");

    }
     
     
     
     
    
     
 



	@Test(priority = 33)
      	public void SIGIRecordedStreamPro33() throws InterruptedException, MalformedURLException {
       
 		
 		OpenSearch();
 		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
 		System.out.println("TC02- Click on search box");
 		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("SIGI-South India GTA Invitational");
 		System.out.println("TC03- Type SIGI-South India GTA Invitational in search");
 		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    	System.out.println("TC04- Click on ENTER");		
 		Thread.sleep(1000);
 		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
 		System.out.println("TC05- open SIGI's profile");
        Thread.sleep(1000);
  	   MuteRecordedStream("TC06");

     }
      
      
      
      @Test(priority = 34)
    	public void FEARLESSESPORTSRecordedStreamPro34() throws InterruptedException, MalformedURLException {
     
		
   		OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("FEARLESS ESPORTS");
		System.out.println("TC03- Type FEARLESS ESPORTS in search");
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
  		System.out.println("TC04- Click on ENTER");		
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open FEARLESS ESPORTS's profile");
        Thread.sleep(1000);
  	   MuteRecordedStream("TC06");

   }

      
      
     




	@Test(priority = 35)
  	public void UltraOPRecordedStreamPro35() throws InterruptedException, MalformedURLException  {
   
		
   		OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Ultra OP");
		System.out.println("TC03- Type ULTRA OP in search");
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on ENTER");		
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open ULTRA OP's profile");
        Thread.sleep(1000);
  	   MuteRecordedStream("TC06");

 }
      
      
      
      
      @Test(priority = 36)
    	public void AdenRecordedStreamPro36() throws InterruptedException, MalformedURLException {
     
  		
   		OpenSearch();
  		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
  		System.out.println("TC02- Click on search box");
  		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("AdEn");
  		System.out.println("TC03- Type AdEn in search");
  		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
  		System.out.println("TC04- Click on ENTER");		
  		Thread.sleep(1000);
  		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
  		System.out.println("TC05- open AdEn's profile");
        Thread.sleep(1000);
  	   MuteRecordedStream("TC06");

   }
     
      
      
      @Test(priority = 37)
  	public void GAmingPUJARecordedStreamPro37() throws InterruptedException, MalformedURLException {
   
		
   		OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Gaming PUJA");
		System.out.println("TC03- Type AdEn in search");
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on ENTER");		
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open Gaming with PUJA's profile");
        Thread.sleep(1000); 
  	   MuteRecordedStream("TC06");

 }
     
      
      
      
      @Test(priority = 38)
    	public void FBDJAATGAMERRecordedStreamPro38() throws InterruptedException, MalformedURLException {
     
  		
   		OpenSearch();
  		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
  		System.out.println("TC02- Click on search box");
  		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("FBD FUN CLUB");
  		System.out.println("TC03- Type FBD FUN CLUB in search");
  		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
  		System.out.println("TC04- Click on ENTER");		
  		Thread.sleep(2000);
  		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
  		System.out.println("TC05- open FBD FUN CLUCB's profile");
        Thread.sleep(2000);
  	   MuteRecordedStream("TC06");

   }
      
      
      
      
      
      @Test(priority = 39)
  	public void RepublicArmyRecordedStreamPro39() throws InterruptedException, MalformedURLException {
   
		
   		OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Republic Army");
		System.out.println("TC03- Type Republic Army in search");
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on ENTER");		
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open Republic Army's profile");
        Thread.sleep(1000);
  	   MuteRecordedStream("TC06");

 }
      
      
      
      @Test(priority = 40)
    	public void LuciferSauravRecordedStreamPro40() throws InterruptedException, MalformedURLException {
     
  		
   		OpenSearch();
  		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
  		System.out.println("TC02- Click on search box");
  		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Lucifer SaUrav");
  		System.out.println("TC03- Type Lucifer SaUrav in search");
  		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
  		System.out.println("TC04- Click on ENTER");		
  		Thread.sleep(1000);
  		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
  		System.out.println("TC05- open Lucifer SaUrav's profile");
        Thread.sleep(1000);
  	   MuteRecordedStream("TC06");

   }
      
      
      
      @Test(priority = 41)
  	public void IYDLazyRecordedStreamPro41() throws InterruptedException, MalformedURLException {
   
		
   		OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("iYD LAZY");
		System.out.println("TC03- Type iYD LAZY in search");
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on ENTER");		
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open iYD LAZY's profile");
        Thread.sleep(1000);
  	   MuteRecordedStream("TC06");

 }
        
      
      
      @Test(priority = 42)
    	public void SuRYanShExDRecordedStreamPro42() throws InterruptedException, MalformedURLException {
     
  		
   		OpenSearch();
  		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
  		System.out.println("TC02- Click on search box");
  		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("SuRYanSh ExD");
  		System.out.println("TC03- Type SuRYanSh ExD in search");
  		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
  		System.out.println("TC04- Click on ENTER");		
  		Thread.sleep(1000);
  		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
  		System.out.println("TC05- open SuRYanSh ExD's profile");
        Thread.sleep(1000);
  	   MuteRecordedStream("TC06");

   }
      
      
      
      
    
      
      
      
    
      
      
      
      @Test(priority = 43)
  	public void ThoppiRecordedStreamPro43() throws InterruptedException, MalformedURLException {
   
		
   		OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Thoppi");
		System.out.println("TC03- Type Thoppi in search");
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on ENTER");		
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open Thoppi's profile");
        Thread.sleep(1000);
  	   MuteRecordedStream("TC06");

 }
      
      
      
      
      
      @Test(priority = 44)
      
      
      public void Followingtabliveplayerrortate45() throws InterruptedException {
    
      	
      	Thread.sleep(1000);
        if(isVisibleWithXPath1("//*[contains(@text,'Following')]")) {
              clickAndWaitForElementWithXpath1("//*[contains(@text,'Following')]");
  	        System.out.println("TC01- Pro stream tab opened");

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
        else
        {
            System.out.println("TC07- Following tab is not vsiible . this is old homepoage");

        }


      }
      
      
      
      
      
      @Test(priority = 46)
    	public void APLEsportsRecordedStreamPro46() throws InterruptedException, MalformedURLException {
     
  		
     		OpenSearch();
  		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
  		System.out.println("TC02- Click on search box");
  		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("APL ESPORTS");
  		System.out.println("TC03- Type APL ESPORTS in search");
  		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
  		System.out.println("TC04- Click on ENTER");		
  		Thread.sleep(1000);
  		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
  		System.out.println("TC05- open APL ESPORTS's profile");
        Thread.sleep(1000);
  	   MuteRecordedStream("TC06");

   }
          

	      	    
	      	    
        
    
  
  @Test(priority = 47)
  
 	public void SnaxgamingRecordedStreamPro47() throws InterruptedException, MalformedURLException  {
 
 		
    	OpenSearch();
 		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
 		System.out.println("TC02- Click on search box");
 		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Snax Gaming");
 		System.out.println("TC03- Type snax gaming in search");
 		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).click();
 	    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");   		
	    Thread.sleep(1000);
 		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
 		System.out.println("TC05- open snax's profile");
        Thread.sleep(1000);
  	   MuteRecordedStream("TC06");
     }
          
  
  
  
  
  
  @Test(priority = 48)
  
 	public void CalvinReyecordedStreamPro48() throws InterruptedException, MalformedURLException  {
 
 		
 	    OpenSearch();
 		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
 		System.out.println("TC02- Click on search box");
 		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Calvin");
 		System.out.println("TC03- Type calvin in search");
 		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).click();
 	    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
 		System.out.println("TC04- Click on serach button");   		
 	    Thread.sleep(1000);
 		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
 		System.out.println("TC05- open calvin's profile");
        Thread.sleep(1000);
  	   MuteRecordedStream("TC06");
     
    }
  
  
  
  
  @Test(priority = 49)
  public void SidenavExtendpro49() throws InterruptedException {

      OpenSideNav();
      if (isVisibleWithXPath1("//*[contains(@text,'Extend Pro')]"))  
      {

      String targetText = "Extend Pro";
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
	      Thread.sleep(3000);  
	
	      clickAndWaitForElementWithXpath1("//android.view.View[@content-desc=\"Rooter Extend Plan Rooter\"]/android.widget.TextView");
	      System.out.println("TC03- click on Extend plan");
	      Thread.sleep(3000);     
	      clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]/android.widget.Button[1]");
	      System.out.println("TC03- click on buy button for 7 day");
	      Thread.sleep(3000);  
	    
	      driver.navigate().back();
	      Thread.sleep(3000);  
		  OpenSearch();
     }
     
  }
  
  
  
  
  @Test(priority = 50)
	public void EXTROVERTOGRecordedStreamPro50() throws InterruptedException, MalformedURLException {

	
		OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("EXTROVERT OG");
		System.out.println("TC03- Type EXTROVERT OG in search");
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on ENTER");		
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open EXTROVERT OG's profile");
	    Thread.sleep(1000);
	 	   MuteRecordedStream("TC06");

}
  
  
  
  
  
  @Test(priority = 51)
	public void BlackDaYGamingRecordedStreamPro51() throws InterruptedException, MalformedURLException {

	
		OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("BlackDay Gaming");
		System.out.println("TC03- Type BlackDaY Gaming in search");
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on ENTER");		
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open BlackDaY Gaming's profile");
	    Thread.sleep(1000);
	 	   MuteRecordedStream("TC06");

}
  
  
  
  
  
  
  @Test(priority = 52)
 	public void KIARAAGAMINGRecordedStreamPro52() throws InterruptedException, MalformedURLException {
 
 	
	 	OpenSearch();
	 	clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
	 	System.out.println("TC02- Click on search box");
	 	(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("KIARAA GAMING");
	 	System.out.println("TC03- Type KIARAA GAMING in search");
	 	driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
	 	System.out.println("TC04- Click on ENTER");		
	 	Thread.sleep(1000);
	 	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
	 	System.out.println("TC05- open KIARAA GAMING's profile");
	    Thread.sleep(1000);
	 	   MuteRecordedStream("TC06");

 }
  
  
  
  
  
  @Test(priority = 53)
	public void AdiiPLaYZRecordedStreamPro53() throws InterruptedException, MalformedURLException {

	
		OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Adii PLaYZ ");
		System.out.println("TC03- Type Adii PLaYZ  in search");
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on ENTER");		
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open Adii PLaYZ 's profile");
	    Thread.sleep(1000);
	 	   MuteRecordedStream("TC06");

}
  
  
  
  
  
  
  
  @Test(priority = 54)
 	public void  CaramelRecordedStreamPro54() throws InterruptedException, MalformedURLException {
 
 	
	 	OpenSearch();
	 	clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
	 	System.out.println("TC02- Click on search box");
	 	(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys(" Caramel");
	 	System.out.println("TC03- Type  Caramel  in search");
	 	driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
	 	System.out.println("TC04- Click on ENTER");		
	 	Thread.sleep(1000);
	 	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
	 	System.out.println("TC05- open  Caramel 's profile");
	    Thread.sleep(1000);
	 	   MuteRecordedStream("TC06");

 }
  
  
  
  
  
  
  @Test(priority = 55)
 	public void  VENOMGAMINGRecordedStreamPro55() throws InterruptedException, MalformedURLException {

		
		OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("VENOM GAMING");
		System.out.println("TC03- Type  VENOM GAMING  in search");
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on ENTER");		
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open  VENOM GAMING's profile");
	    Thread.sleep(1000);
	 	   MuteRecordedStream("TC06");

}
  
  
  
  
  
  
  @Test(priority = 56)
 	public void x15queenRecordedStreamPro56() throws InterruptedException, MalformedURLException {
 
 	
	 	OpenSearch();
	 	clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
	 	System.out.println("TC02- Click on search box");
	 	(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("15xQueen");
	 	System.out.println("TC03- Type  creator name  in search");
	 	driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
	 	System.out.println("TC04- Click on ENTER");		
	 	Thread.sleep(1000);
	 	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
	 	System.out.println("TC05- open  PANDGIRL OP's profile");
	    Thread.sleep(1000);
	 	   MuteRecordedStream("TC06");

 }
  
  

  
  
  
 
 
  @Test(priority = 57)
 	public void CrockyMDRecordedStreamPro57() throws InterruptedException, MalformedURLException {

	
	    OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Crocky MD");
		System.out.println("TC03- Type Crocky MD in search");
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on ENTER");		
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open Crocky MD's profile");
	    Thread.sleep(1000);
	 	   MuteRecordedStream("TC06");

}
  
  
  
  @Test(priority = 58)
 	public void ShreemanlegendRecordedStreamPro58() throws InterruptedException, MalformedURLException {

	
		OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("shreeman legend");
		System.out.println("TC03- Type shreeman legend in search");
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on ENTER");		
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open shreeman legend's profile");
	    Thread.sleep(1000);
	 	   MuteRecordedStream("TC06");

}
  
  
  
  @Test(priority = 59)
	public void QUEENNISLIVERecordedStreamPro59() throws InterruptedException, MalformedURLException {
 
		
 		OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Queen is");
		System.out.println("TC03- Type Queen is Live in search");
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on ENTER");		
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open Queen is Live's profile");
        Thread.sleep(1000);
  	   MuteRecordedStream("TC06");

}
  
  
  
  
  @Test(priority = 60)
 	public void SwasthiGAmingRecordedStreamPro60() throws InterruptedException, MalformedURLException {
  
 		
  		OpenSearch();
 		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
 		System.out.println("TC02- Click on search box");
 		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Swasti Gaming");
 		System.out.println("TC03- Type Swasti Gaming in search");
 		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
 		System.out.println("TC04- Click on ENTER");		
 		Thread.sleep(1000);
 		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
 		System.out.println("TC05- open Swasti Gaming's profile");
        Thread.sleep(1000);
  	   MuteRecordedStream("TC06");

 }
  
  
  
  @Test(priority = 61)
	public void IydmaxpllayzRecordedStreamPro661() throws InterruptedException, MalformedURLException {

		
		OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("IYD MAX");
		System.out.println("TC03- Type iyd MAX PLAYZ in search");
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on ENTER");		
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open iyd MAX PLAYZ's profile");
	    Thread.sleep(1000);
	 	   MuteRecordedStream("TC06");

}
  
  
  
  @Test(priority = 62)
 	public void RAOFFLIVERecordedStreamPro62() throws InterruptedException, MalformedURLException  {
 
 		
 		OpenSearch();
 		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
 		System.out.println("TC02- Click on search box");
 		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("RAO LIVE");
 		System.out.println("TC03- Type RAO FF LIVE in search");
 		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
 		System.out.println("TC04- Click on ENTER");		
 		Thread.sleep(1000);
//        clickAndWaitForElementWithXpath1("//*[contains(@text,'Creators')]");
//		System.out.println("TC04- Click on creators");	
 		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
 		System.out.println("TC05- open RAO FF LIVE's profile");
	    Thread.sleep(1000);
	 	   MuteRecordedStream("TC06");

 }
   
  
  
  
  @Test(priority = 63)
 	public void DevilIsOnRecordedStreamPro63() throws InterruptedException, MalformedURLException  {

 		
 		OpenSearch();
 		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
 		System.out.println("TC02- Click on search box");
 		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Devil Is");
 		System.out.println("TC03- Type Devil Is On in search");
 		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
 		System.out.println("TC04- Click on ENTER");		
 		Thread.sleep(1000);
 		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
 		System.out.println("TC05- open Devil Is On's profile");
	    Thread.sleep(1000);
	 	   MuteRecordedStream("TC06");

 }

  
  
  
  
  @Test(priority = 64)
	public void MalluVinerGamingRecordedStreamPro64() throws InterruptedException, MalformedURLException {

	
		OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("MALLU");
		System.out.println("TC03- TypeMALLU VINNER GAMING in search");
		Thread.sleep(1000);
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on ENTER");		
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open MALLU VINNER GAMING's profile");
	    Thread.sleep(1000);
	 	   MuteRecordedStream("TC06");

}
  
  
  
  
  
  @Test(priority = 65)
 	public void PIPPAPORecordedStreamPr065() throws InterruptedException, MalformedURLException {
 
 	
 		OpenSearch();
	 	clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
	 	System.out.println("TC02- Click on search box");
	 	(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("PIPO PAPO");
	 	System.out.println("TC03- Type PIPO PAPO in search");
	 	driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
	 	System.out.println("TC04- Click on ENTER");		
	 	Thread.sleep(1000);
	 	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
	 	System.out.println("TC05- open PIPO's profile");
	    Thread.sleep(1000);
	 	   MuteRecordedStream("TC06");

 }
  
  
  
  
  
  
  
  
  
  
  
  @Test(priority = 66)
	public void JB10RecordedStreamPro66() throws InterruptedException, MalformedURLException {

	
		OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("JB10");
		System.out.println("TC03- Type JB10 in search");
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on ENTER");		
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open JB10's profile");
		Thread.sleep(1000);
	 	   MuteRecordedStream("TC06");

}
  
  
  
  @Test(priority = 67)
 	public void  GIGIGONEMADRecordedStreamPro67() throws InterruptedException, MalformedURLException   {
 
 	
 		OpenSearch();
 		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
 		System.out.println("TC02- Click on search box");
 		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("GIGIGONEMAD");
 		System.out.println("TC03- Type GIGIGONEMAD in search");
 		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
 		System.out.println("TC04- Click on ENTER");		
 		Thread.sleep(1000);
 		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
 		System.out.println("TC05- open profile");
 		Thread.sleep(1000);
  	   MuteRecordedStream("TC06");

 }
  
  
  
 

  
  
  @Test(priority = 68)
	public void  CYNTHIAISLIVERecordedStreamPro68() throws InterruptedException, MalformedURLException   {

	
		OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("CYNTHIA ");
		System.out.println("TC03- Type CYNTHIA IS LIVE in search");
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on ENTER");		
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open profile");
		Thread.sleep(1000);
	 	   MuteRecordedStream("TC06");

}
  
  
  
  
  
  @Test(priority = 69)
  
  public void bit8beg4mercy69() throws InterruptedException, MalformedURLException  {



    	OpenSearch();
      clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
      System.out.println("TC02- Click on search box");
      (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("8bitbeg4mercy");
      System.out.println("TC03- Type 8bitbeg4mercy in search");
      driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
 		System.out.println("TC04- Click on ENTER");
      Thread.sleep(1000);
      clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
      System.out.println("TC05- open profile");
	   MuteRecordedStream("TC06");


  }
  
  
  
  
  @Test(priority = 70)
	public void RAKHALDGAMINGRecordedStreamPro70() throws InterruptedException, MalformedURLException {

	
	    OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("RAKHAL D GAMING");
		System.out.println("TC03- Type creator name in search");
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on ENTER");		
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open Crreator's profile");
	    Thread.sleep(1000);
	 	   MuteRecordedStream("TC06");

}
  
  
  
  
  
  
  

  

  
  
  
  
  private boolean isvisibleWithXpath1(String string) {
 
	return false;
}




@Test(priority =71)
  public void Subscriptioncancelled7daysPack71() throws InterruptedException {

      OpenSideNav();

    	  String targetText1 = "Pro";
          boolean textFound1 = false;
          int maxScrolls1 = 3; 

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
          Thread.sleep(1000); 
      
          if (isvisibleWithXpath1("//android.view.View[@content-desc=\"Rooter Subscribe Again Rooter\"]/android.widget.TextView")) {
              clickAndWaitForElementWithXpath1("//android.view.View[@content-desc=\"Rooter Subscribe Again Rooter\"]/android.widget.TextView");
              System.out.println("TC06- Click on subscribe again");
              Thread.sleep(1000);  
      clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]/android.view.View[1]/android.widget.Button[2]");
      System.out.println("TC07- click on buy button for 7 day pack");
      Thread.sleep(1000);  
      MobileElement element111 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]/android.view.View[1]/android.widget.Button[2]"));
	    String UserName111 = ((WebElement) element111).getText();
      Thread.sleep(1000);
	    System.out.println("TC08- Pack 2  is " + UserName111);  
	    Thread.sleep(1000);
	    if(UserName111.equals("Rooter ₹59 7 days")) {
	    	
		       driver.findElement(By.xpath("//*[contains(@text,'Buy for ₹59')]")).click();
	         System.out.println("TC09- click on buy for 59 Rs pack");
//	       driver.findElement(By.xpath("//*[contains(@text,'')]")).click();
//	         System.out.println("TC10- click on continue");
//	         

	    }
	    else
	    {
	        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
	         System.out.println("TC11-7 Day pack is not vsiible for cancelled subscription");

	    }
     
          }
      

  }
  
  
  

 
  
  @Test(priority =72)
  public void Subscriptioncancelled30DayPack72() throws InterruptedException {

      OpenSideNav();
      String targetText = "Pro";
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
      if (isVisibleWithXPath1("//*[contains(@text,'" + targetText + "')]")) {
      driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
      System.out.println("Clicking on: " + targetText);
      Thread.sleep(1000); 
 
      if (isvisibleWithXpath1("//android.view.View[@content-desc=\"Rooter Subscribe Again Rooter\"]/android.widget.TextView")) {
          clickAndWaitForElementWithXpath1("//android.view.View[@content-desc=\"Rooter Subscribe Again Rooter\"]/android.widget.TextView");
          System.out.println("TC06- Click on subscribe again");
          Thread.sleep(1000);   
      clickAndWaitForElementWithXpath1("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]/android.view.View[1]/android.widget.Button[3]");
      System.out.println("TC07- click on buy button for 30 day pack");
      Thread.sleep(1000);  
      MobileElement element111 = (MobileElement) driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]/android.view.View[1]/android.widget.Button[3]"));
	    String UserName111 = ((WebElement) element111).getText();
	    System.out.println("TC08- Pack 3  is " + UserName111);  
	    Thread.sleep(1000);
	    if(UserName111.equals("Rooter ₹99 ₹129 30 days")) {
	    	
	    	if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button")) {
	        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button");
	         System.out.println("TC09A- click on buy for 30days  pack");
	    	}
	        else
	        {
	 	       driver.findElement(By.xpath("//*[contains(@text,'Buy for ₹99 129 23% Off')]")).click();
		         System.out.println("TC09B- click on buy for 30days  pack");

	        }       

	    }
	    else
	    {
	        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
	         System.out.println("TC11- 30 Day pack is not vsiible for cancelled subscription");

	    }
      }
      
      }

  }
  
  
  
  
  @Test(priority =73)
  public void Subscriptioncancelled180DPac73() throws InterruptedException {

      OpenSideNav();
      String targetText = "Pro";
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
      if (isVisibleWithXPath1("//*[contains(@text,'" + targetText + "')]")) {
      driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
      System.out.println("Clicking on: " + targetText);
      Thread.sleep(1000); 
    
      if (isvisibleWithXpath1("//android.view.View[@content-desc=\"Rooter Subscribe Again Rooter\"]/android.widget.TextView")) {
          clickAndWaitForElementWithXpath1("//android.view.View[@content-desc=\"Rooter Subscribe Again Rooter\"]/android.widget.TextView");
          System.out.println("TC06- Click on subscribe again");
          Thread.sleep(1000);  
    
      
      driver.findElement(AppiumBy.androidUIAutomator(
      	    "new UiScrollable(new UiSelector().text(\"₹99 ₹129 30 days\")).setAsHorizontalList().scrollForward(3)"));
      	System.out.println("TC04- scroll left for more packs ");
      	Thread.sleep(2000);
      
      
      MobileElement element111 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]/android.view.View[1]/android.widget.Button[2]"));
	    String UserName111 = ((WebElement) element111).getText();
      Thread.sleep(1000);
	    System.out.println("TC08- Pack 4  is " + UserName111);  
	    Thread.sleep(3000);
	    if(UserName111.equals("₹699 180 days")) {
	    	
	    	
	        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]/android.view.View[1]/android.widget.Button[2]");

	    
	 	       driver.findElement(By.xpath("//*[contains(@text,'Buy for ₹699')]")).click();
		         System.out.println("TC09B- click on buy for 180 days  pack");

	    }
	    else
	    {
	        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
	         System.out.println("TC11- 180 Day pack is not vsiible for cancelled subscription");

	    }
 }
      }

  }
  
  
  
  
  @Test(priority =74)
  public void Subscriptioncancelled3365DayPack74() throws InterruptedException {

      OpenSideNav();

    	  String targetText1 = "Pro";
          boolean textFound1 = false;
          int maxScrolls1 = 3; 

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
          Thread.sleep(1000); 
          if (isvisibleWithXpath1("//android.view.View[@content-desc=\"Rooter Subscribe Again Rooter\"]/android.widget.TextView")) {
              clickAndWaitForElementWithXpath1("//android.view.View[@content-desc=\"Rooter Subscribe Again Rooter\"]/android.widget.TextView");
              System.out.println("TC06- Click on subscribe again");
              Thread.sleep(1000);   


      
      driver.findElement(AppiumBy.androidUIAutomator(
      	    "new UiScrollable(new UiSelector().text(\"₹99 ₹129 30 days\")).setAsHorizontalList().scrollForward(3)"));
      	System.out.println("TC04- scroll left for more packs ");
      	Thread.sleep(1000);
      
      
      MobileElement element111 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]/android.view.View[1]/android.widget.Button[3]"));
	    String UserName111 = ((WebElement) element111).getText();
	    System.out.println("TC08- Pack 5  is " + UserName111);  
	    Thread.sleep(1000);
	    if(UserName111.equals("₹1199 365 days")) {
  	
	    	
	        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]/android.view.View[1]/android.widget.Button[3]");
	 	    driver.findElement(By.xpath("//*[contains(@text,'Buy for ₹1199')]")).click();
		    System.out.println("TC09B- click on buy for 365 days  pack");

	    }
	    else
	    {
	        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
	        System.out.println("TC11- 365 Day pack is not vsiible for cancelled subscription");

	    }
 }
  }
  
  
  
  
 
  

  
  
  
  @Test(priority = 75)
 	public void MissMegsRecordedStreamPro75() throws InterruptedException, MalformedURLException {

 	
 	    OpenSearch();
 		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
 		System.out.println("TC02- Click on search box");
 		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Miss Megs");
 		System.out.println("TC03- Type creator name in search");
 		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
 		System.out.println("TC04- Click on ENTER");		
 		Thread.sleep(1000);
 		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
 		System.out.println("TC05- open Crreator's profile");
 	    Thread.sleep(1000);
  	   MuteRecordedStream("TC06");

 }

  
  
  
  @Test(priority = 76)
	public void OGMRJAYRecordedStreamPro76() throws InterruptedException, MalformedURLException {

	
		OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("OG-MR.JAY");
		System.out.println("TC03- Type OG-MR.JAY in search");
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on ENTER");		
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open sOG-MR.JAY's profile");
	    Thread.sleep(1000);
	 	   MuteRecordedStream("TC06");

}
  
  
  
  
  
  @Test(priority = 77)
 	public void CHERRYISLIVERecordedStreamPro77() throws InterruptedException, MalformedURLException {

 	
 		OpenSearch();
 		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
 		System.out.println("TC02- Click on search box");
 		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("CHERRY IS LIVE");
 		System.out.println("TC03- Type creator name in search");
 		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
 		System.out.println("TC04- Click on ENTER");		
 		Thread.sleep(1000);
 		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
 		System.out.println("TC05- open profile");
 	    Thread.sleep(1000);
  	   MuteRecordedStream("TC06");

 }
  
  
  
  
  @Test(priority = 78)
	public void AAFATRecordedStreamPro78() throws InterruptedException, MalformedURLException {

	
	    OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("AAFAT");
		System.out.println("TC03- Type creator name in search");
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on ENTER");		
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open Crreator's profile");
	    Thread.sleep(1000);
	 	   MuteRecordedStream("TC06");

}
  
  
  
  
  
  
  
  
  @Test(priority = 79)
	public void NodwinGamigRecordedStreamPro79() throws InterruptedException, MalformedURLException {

	
	    OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("NODWIN Gaming");
		System.out.println("TC03- Type creator name in search");
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on ENTER");		
//		clickAndWaitForElementWithXpath1("//*[contains(@text,'Creators')]");
//		System.out.println("TC05- Click on  Creators tab");		
//
//		Thread.sleep(1000);
//		  String targetText = "NODWIN Gaming";
//	        boolean textFound = false;
//	        int maxScrolls = 5; 
//
//	        for (int i = 0; i < maxScrolls && !textFound; i++) {
//	            try {
//	                driver.findElement(
//	               		 AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + targetText + "\"))"));         
//	                textFound = true;
//	                System.out.println("TC02- Product description scrolled and found");
//	            } catch (Exception e) {
//	                driver.findElement(
//	                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
//	            }
//	        }
//	        Thread.sleep(1000);
////	        driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
////	        System.out.println("Clicking on: " + targetText);
////	        Thread.sleep(3000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open Crreator's profile");
	    Thread.sleep(1000);
	 	   MuteRecordedStream("TC06");

}

      
  
  
  
  
  @Test(priority = 80)
	public void PARTHGAMINGRecordedStreamPro80() throws InterruptedException, MalformedURLException {

	
	    OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("PARTH GAMING");
		System.out.println("TC03- Type creator name in search");
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on ENTER");		
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open Crreator's profile");
	    Thread.sleep(1000);
	 	   MuteRecordedStream("TC06");

}
  
  
  
  
  @Test(priority = 81)
 	public void MiningGirlRecordedStreamPro81() throws InterruptedException, MalformedURLException {

 	    OpenSearch();
 		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
 		System.out.println("TC02- Click on search box");
 		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Mining Girl");
 		System.out.println("TC03- Type creator name in search");
 		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
 		System.out.println("TC04- Click on ENTER");		
 		Thread.sleep(1000);
 		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
 		System.out.println("TC05- open Crreator's profile");
 	    Thread.sleep(1000);
 	   MuteRecordedStream("TC06");
 }
  
  
  
  @Test(priority = 82)
	public void iYDMitishRecordedStreamPro82() throws InterruptedException, MalformedURLException {

	    OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("IYD Mitish");
		System.out.println("TC03- Type creator name in search");
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on ENTER");		
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open Crreator's profile");
	    Thread.sleep(1000);
	 	   MuteRecordedStream("TC06");
}

  
  
  
  @Test(priority = 83)
	public void VediMulgiRecordedStreamPro83() throws InterruptedException, MalformedURLException {

	
	 	OpenSearch();
	 	clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
	 	System.out.println("TC02- Click on search box");
	 	(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Vedi Mulgi");
	 	System.out.println("TC03- Type  creator name in search");
	 	driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
	 	System.out.println("TC04- Click on ENTER");		
	 	Thread.sleep(1000);
	 	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
	 	System.out.println("TC05- open profile");
	    Thread.sleep(1000);
	 	   MuteRecordedStream("TC06");

}
  
  
  
  @Test(priority = 84)
	public void FGARMYRecordedStreamPro84() throws InterruptedException, MalformedURLException {

	
	 	OpenSearch();
	 	clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
	 	System.out.println("TC02- Click on search box");
	 	(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("FG ARMY");
	 	System.out.println("TC03- Type  creator name in search");
	 	driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
	 	System.out.println("TC04- Click on ENTER");		
	 	Thread.sleep(1000);
	 	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
	 	System.out.println("TC05- open profile");
	    Thread.sleep(1000);
	 	   MuteRecordedStream("TC06");

}


  
  
  @Test(priority = 85)
 	public void FAMFFRecordedStreamPro85() throws InterruptedException, MalformedURLException {

 	
 	 	OpenSearch();
 	 	clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
 	 	System.out.println("TC02- Click on search box");
 	 	(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("FAM FF");
 	 	System.out.println("TC03- Type  creator name in search");
 	 	driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
 	 	System.out.println("TC04- Click on ENTER");		
 	 	Thread.sleep(1000);
 	 	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
 	 	System.out.println("TC05- open profile");
 	    Thread.sleep(1000);
  	   MuteRecordedStream("TC06");
  }
  
  
  
  
  @Test(priority = 86)
	public void SARKGamerRecordedStreamPro86() throws InterruptedException, MalformedURLException {

	
	 	OpenSearch();
	 	clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
	 	System.out.println("TC02- Click on search box");
	 	(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("SARK Gamer");
	 	System.out.println("TC03- Type  creator name in search");
	 	driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
	 	System.out.println("TC04- Click on ENTER");		
	 	Thread.sleep(1000);
	 	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
	 	System.out.println("TC05- open profile");
	    Thread.sleep(1000);
	 	   MuteRecordedStream("TC06");
}
  
  
  
  
  

        
        
	  
	  
	  
	  
 
  
  
  
  @Test(priority = 87)
	public void XENORecordedStreamPro87() throws InterruptedException, MalformedURLException {
 
	
	OpenSearch();
	clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
	System.out.println("TC02- Click on search box");
	Thread.sleep(1000);
	(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("XENO");
	System.out.println("TC03- Type Creator name in search");
	Thread.sleep(1000);
	driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
	System.out.println("TC04- Click on ENTER");		
	Thread.sleep(1000);
//	driver.findElement(By.xpath("//*[contains(@text,'Creators')]")).click();
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView[1]")).click();

	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
	System.out.println("TC05- open  profile");
  Thread.sleep(1000);
   MuteRecordedStream("TC06");

}

  
  
  
  
  @Test(priority = 88)
 	public void KamilFF1MRecordedStreamPro88() throws InterruptedException, MalformedURLException {
  
 	
 	OpenSearch();
 	clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
 	System.out.println("TC02- Click on search box");
 	(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Kamil FF 1M");
 	System.out.println("TC03- Type Creator name in search");
 	driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
 	System.out.println("TC04- Click on ENTER");		
 	Thread.sleep(1000);
 	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
 	System.out.println("TC05- open  profile");
   Thread.sleep(1000);
	   MuteRecordedStream("TC06");

 }
  
  
  
  @Test(priority = 89)
	public void IYDLAKSHURecordedStreamPro89() throws InterruptedException, MalformedURLException {

	
	 	OpenSearch();
	 	clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
	 	System.out.println("TC02- Click on search box");
	 	(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("FG ARMY");
	 	System.out.println("TC03- Type  creator name in search");
	 	driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
	 	System.out.println("TC04- Click on ENTER");		
	 	Thread.sleep(1000);
	 	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
	 	System.out.println("TC05- open profile");
	    Thread.sleep(1000);
	 	   MuteRecordedStream("TC06");

}


  @Test(priority = 90)
	public void ParallelIndiaRecordedStreamPro90() throws InterruptedException, MalformedURLException {

	
//	 	OpenSearch();
//	 	clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
//	 	System.out.println("TC02- Click on search box");
//	 	(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Parallel India");
//	 	System.out.println("TC03- Type  creator name in search");
//	 	driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
//	 	System.out.println("TC04- Click on ENTER");		
//	 	Thread.sleep(3000);
//	 	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
//	 	System.out.println("TC05- open profile");
//	    Thread.sleep(3000);
//	    MuteRecordedStream();

}
  
  
  
  @Test(priority = 91)
	public void RICUCHIHARecordedStreamPro91() throws InterruptedException, MalformedURLException {

	
	 	OpenSearch();
	 	clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
	 	System.out.println("TC02- Click on search box");
	 	(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("RIC UCHIHA");
	 	System.out.println("TC03- Type  creator name in search");
	 	driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
	 	System.out.println("TC04- Click on ENTER");		
	 	Thread.sleep(1000);
	 	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
	 	System.out.println("TC05- open profile");
	    Thread.sleep(1000);
	 	   MuteRecordedStream("TC06");

}
  
  
  
  
  @Test(priority = 92)
 	public void LIyaplaysRecordedStreamPro92() throws InterruptedException, MalformedURLException {

 	
 	 	OpenSearch();
 	 	clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
 	 	System.out.println("TC02- Click on search box");
 	 	(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("LIYA PLAYZ");
 	 	System.out.println("TC03- Type  creator name in search");
 	 	driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
 	 	System.out.println("TC04- Click on ENTER");		
 	 	Thread.sleep(1000);
 	 	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
 	 	System.out.println("TC05- open profile");
 	    Thread.sleep(1000);
  	   MuteRecordedStream("TC06");

 }
   
   
  @Test(priority = 93)
	public void EGLAMANRecordedStreamPro93() throws InterruptedException, MalformedURLException {

	
	 	OpenSearch();
	 	clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
	 	System.out.println("TC02- Click on search box");
	 	(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("EGL AMAN");
	 	System.out.println("TC03- Type  creator name in search");
	 	driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
	 	System.out.println("TC04- Click on ENTER");		
	 	Thread.sleep(1000);
	 	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
	 	System.out.println("TC05- open profile");
	    Thread.sleep(1000);
	 	   MuteRecordedStream("TC06");

}
 
 
  
  
  @Test(priority = 94)
	public void M1EvenstRecordedStreamPro94() throws InterruptedException, MalformedURLException {

	
	 	OpenSearch();
	 	clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
	 	System.out.println("TC02- Click on search box");
	 	(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("1M Events");
	 	System.out.println("TC03- Type  creator name in search");
	 	driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
	 	System.out.println("TC04- Click on ENTER");		
	 	Thread.sleep(1000);
	 	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
	 	System.out.println("TC05- open profile");
	    Thread.sleep(1000);
	 	   MuteRecordedStream("TC06");

}
  
  
  
  @Test(priority = 95)
	public void ChinmaykotkarRecordedStreamPro95() throws InterruptedException, MalformedURLException {

	
		OpenSearch();
	clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
	System.out.println("TC02- Click on search box");
	(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Chinmay Kotkar");
	System.out.println("TC03- Type SuRYanSh ExD in search");
	driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
	System.out.println("TC04- Click on ENTER");		
	Thread.sleep(1000);
	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
	System.out.println("TC05- open SuRYanSh ExD's profile");
  Thread.sleep(1000);
   MuteRecordedStream("TC06");

}
  
  
  
  
  @Test(priority = 96)
	public void ZiNGO69RecordedStreamPro96() throws InterruptedException, MalformedURLException {

	
		OpenSearch();
	clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
	System.out.println("TC02- Click on search box");
	(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("ZiNGO 69");
	System.out.println("TC03- Type Thoppi in search");
	driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
	System.out.println("TC04- Click on ENTER");		
	Thread.sleep(1000);
	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
	System.out.println("TC05- open Thoppi's profile");
    Thread.sleep(1000);
	   MuteRecordedStream("TC06");

}
  
  
  
        @Test(priority = 97)
        public void Logout97() throws InterruptedException 
{
//           OpenSideNav();
//            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_arrow_username_lrps");
//            System.out.println("TC02- open profile");
//            Thread.sleep(3000);
//     
//            if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView")) {
//            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView")).click();
//            driver.findElement(By.xpath("//*[contains(@text,'Edit Channel')]")).click();
//            System.out.println("TC04- Click on Edit channel");
//            Thread.sleep(2000);
//            }
//            else
//            {
//            	   clickAndWaitForElementWithId(
//                           "com.threesixteen.app:id/iv_settings");
//                   System.out.println("TC03- Click on three dots");
//                   Thread.sleep(2000);
//                driver.findElement(By.xpath("//*[contains(@text,'Edit Channel')]")).click();
//                System.out.println("TC04- Click on Edit channel");
//                Thread.sleep(2000);
//            }
//            driver.findElement(AppiumBy.androidUIAutomator(
//    	            "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));
//            Thread.sleep(2000);
//            driver.findElement(By.xpath("//*[contains(@text,'Logout')]")).click();
//            System.out.println("TC05- Click on Logout");
//            Thread.sleep(2000);
//            driver.findElement(By.xpath("//*[contains(@text,'Yes')]")).click();
//            Thread.sleep(2000);
//   		    clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView");
//            System.out.println("TC06- Click on Gmail");

           
            
    }


        
        
        
        
	
	
	
	

}
