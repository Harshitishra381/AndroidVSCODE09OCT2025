package Trial;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

import org.openqa.selenium.*;

public class Explorepage_Script<MobileElement, Rotatable>  extends Functions{
	
	


	@Test(priority = 1)
	public void ExplorepageGameCenter01() throws InterruptedException {

        Thread.sleep(1000);
        OpenExplorePage();
        Thread.sleep(1000);
	    System.out.println("TC02- Open Explore page ");	  
        Thread.sleep(1000);
	    String targetText = "🧩 Game Center";
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
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
//        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[2]");
//        System.out.println("TC02- Click on view All on Game Center");
//        Thread.sleep(3000);
        if(isVisibleWithId("com.android.chrome:id/close_button")) {
        clickAndWaitForElementWithId("com.android.chrome:id/close_button");
        Thread.sleep(1000);
        }
        else
        {
        	 driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
             System.out.println("Clicking on: " + targetText);
             Thread.sleep(3000);
             clickAndWaitForElementWithId("com.android.chrome:id/close_button");
             Thread.sleep(1000);
        
        driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
        System.out.println("Clicking on: " + targetText);
        Thread.sleep(3000);
        }
        if (isVisibleWithId("com.android.chrome:id/close_button")) {
        clickAndWaitForElementWithId("com.android.chrome:id/close_button");
        }
        else
        {driver.navigate().back();}

	}

	
	
	
	
	@Test(priority = 2)
	public void ExplorePageFFDiamondsHacks02() throws InterruptedException {
        Thread.sleep(1000);
		 if (isVisibleWithId("com.android.chrome:id/close_button")) {
		        clickAndWaitForElementWithId("com.android.chrome:id/close_button");
		        }
	        Thread.sleep(1000);
		   OpenExplorePage();
	        Thread.sleep(1000);
	        System.out.println("TC02- Open Explore page ");
	        Thread.sleep(1000);
	        String targetText = "FF Diamond hacks 💎";
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
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
	        System.out.println("Clicking on: " + targetText);
	        Thread.sleep(3000);
//	        driver.findElement(
//	                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
//            clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.View");
//            System.out.println("TC02- Open video from FFDiamondsHacks");
	        Thread.sleep(3000);

            clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
            System.out.println("TC10- click on video");
            

	}

	
	
	@Test(priority = 3)
	public void ExplorePageGTAHightlights03() throws InterruptedException {

           Thread.sleep(1000);
		    OpenExplorePage();
	        Thread.sleep(10000);
	        System.out.println("TC01- Open Explore page ");
	        Thread.sleep(1000);
	        String targetText = "GTA Highlights ✨";
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
	        Thread.sleep(5000);
	        
	        if  (isVisibleWithXPath1("//*[contains(@resource-id, 'com.threesixteen.app:id/click_view')]"))  {
	          clickAndWaitForElementWithXpath1("//*[contains(@resource-id, 'com.threesixteen.app:id/click_view')]");
            System.out.println("TC03- Open video from GTA Hightlights");
	        }
	        else
	        {
	        	 driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
	 	        System.out.println("Clicking on: " + targetText);
	 	        Thread.sleep(5000);
	        	
//	        	driver.navigate().back();
		        Thread.sleep(3000);
		        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.View");
	            System.out.println("TC03- Open video from GTA Hightlights");

	        }
	        
	}
	
	
	
	@Test(priority = 4)
	public void ExplorePageBGMIEsportsHighlights04() throws InterruptedException {

           Thread.sleep(1000);
		    OpenExplorePage();
	        Thread.sleep(1000);
	        System.out.println("TC02- Open Explore page ");
	        Thread.sleep(1000);
	        String targetText = "BGMI Esports Highlights ✨";
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
	        Thread.sleep(1000);
	        driver.findElement(
	                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
	        Thread.sleep(1000);

	        if (isVisibleWithXPath1("//*[contains(@text,'Continue Watching')]")) {
	        	clickAndWaitForElementWithXpath1("//*[contains(@text,'Continue Watching')]");
	        }
	        clickAndWaitForElementWithId("com.threesixteen.app:id/click_view");
	        System.out.println("TC03- Open video");
	        if (isVisibleWithXPath1("//*[contains(@text,'Continue Watching')]")) {
	        	clickAndWaitForElementWithXpath1("//*[contains(@text,'Continue Watching')]");
	        } 
	        Thread.sleep(1000);
	        driver.navigate().back();	  
	        Thread.sleep(1000);
	        if (isVisibleWithXPath1("//*[contains(@text,'Continue Watching')]")) {
	        	clickAndWaitForElementWithXpath1("//*[contains(@text,'Continue Watching')]");
	        } 
//	        driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
//	        System.out.println("Clicking on: " + targetText);
//	        Thread.sleep(1000);

	        

	}
	
	
	
	
	@Test(priority = 5)
	public void ExplorePageMineCraftAnimation05() throws InterruptedException {

		   OpenExplorePage();
	        Thread.sleep(1000);
	        System.out.println("TC02- Open Explore page ");
	        Thread.sleep(1000);
	        String targetText = "Minecraft Animations";
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
	        Thread.sleep(2000);
	        driver.findElement(
	                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
	        Thread.sleep(1000);
	        clickAndWaitForElementWithId("com.threesixteen.app:id/click_view");
	        System.out.println("TC03- Open video from Minecraft Animations");
	        Thread.sleep(2000);
	        if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
		        Thread.sleep(1000);
	            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close"); }
	        Thread.sleep(1000);
	        clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
	        System.out.println("TC04- Open recommended video");

	}
	
	
	@Test(priority = 6)
	public void ExplorePageMontageReel06() throws InterruptedException {

           Thread.sleep(1000);
	  	   OpenExplorePage();
	        Thread.sleep(1000);
	        System.out.println("TC02- Open Explore page ");
	        Thread.sleep(1000);
	        String targetText = "Montages";
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
	                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward(1)"));
	            }
	        }
	        SkipCollectCoinBottomSheet();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
	        System.out.println("Clicking on: " + targetText);
	        driver.findElement(
	                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
	        Thread.sleep(1000);
	        ReelTest();

	}
	
	
	
	@Test(priority = 7)
	public void ExplorePageFFEventUpdates7() throws InterruptedException {

            Thread.sleep(1000);
		    OpenExplorePage();
	        Thread.sleep(1000);
	        System.out.println("TC02- Open Explore page ");
	        Thread.sleep(1000);
	        String targetText = "FF Event Updates 🔔";
	        boolean textFound = false;
	        int maxScrolls = 10; 

	        for (int i = 0; i < maxScrolls && !textFound; i++) {
	            try {
	                driver.findElement(
	               		 AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + targetText + "\"))"));         
	                textFound = true;
	                System.out.println("TC02- Product description scrolled and found");
	            } catch (Exception e) {
	                driver.findElement(
	                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward(1)"));
	            }
	        }
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
	        System.out.println("Clicking on: " + targetText);
	        Thread.sleep(1000);
	        clickAndWaitForElementWithId("com.threesixteen.app:id/click_view");
	        System.out.println("TC03- Open video ");
	        Thread.sleep(2000);
	        if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
		        Thread.sleep(1000);
	            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close"); }
	        Thread.sleep(1000);
	        clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
	        System.out.println("TC04- Open recommended video");
	        Thread.sleep(1000);

	}
	
	
	
	@Test(priority = 8)
	public void ExplorePageGTARP8() throws InterruptedException {

          Thread.sleep(1000);
		   OpenExplorePage();
	        Thread.sleep(1000);
	        System.out.println("TC02- Open Explore page ");
	        String targetText = "GTA RP";
	        boolean textFound = false;
	        int maxScrolls = 10; 

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
	        Thread.sleep(1000);
	        clickAndWaitForElementWithId("com.threesixteen.app:id/click_view");
	        System.out.println("TC03- Open video");
	        Thread.sleep(2000);
	        if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
		        Thread.sleep(1000);
	            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close"); }
	        Thread.sleep(1000);
	        clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
	        System.out.println("TC04- Open recommended video");
	        Thread.sleep(1000);
	}
	
	
	@Test(priority = 9)
	public void ExplorePageTrendingVideosOnRotter9() throws InterruptedException {

            Thread.sleep(1000);
		    OpenExplorePage();
	        Thread.sleep(1000);
	        System.out.println("TC02- Open Explore page ");
	        String targetText = "📈 Trending Videos on Rooter";
	        boolean textFound = false;
	        int maxScrolls = 10; 

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
	        Thread.sleep(1000);
	        driver.findElement(
	                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
	        Thread.sleep(1000);
	        clickAndWaitForElementWithId("com.threesixteen.app:id/click_view");
	        System.out.println("TC03- Open video ");
	        Thread.sleep(1000);
	        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
	        if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
		        Thread.sleep(1000);
	            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close"); }
	        Thread.sleep(1000);
	        clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
	        System.out.println("TC04- Open recommended video");
	}
	
	
	
	@Test(priority = 10)
	public void ExplorePageViralReels10() throws InterruptedException {

        Thread.sleep(1000);
		   OpenExplorePage();
	        Thread.sleep(3000);
	        System.out.println("TC02- Open Explore page ");
	        Thread.sleep(5000);
	        String targetText = "🚀 Viral Reels";
	        boolean textFound = false;
	        int maxScrolls = 10; 

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
	        SkipSurvey();
	       
	        Thread.sleep(1000);
	        Thread.sleep(5000);
	        ReelTest();
	        Thread.sleep(1000);
	}
	
	
	
	@Test(priority = 11)
	public void ExplorePageBGMIingameupdates11() throws InterruptedException {

           Thread.sleep(1000);
		    OpenExplorePage();
	        Thread.sleep(1000);
	        System.out.println("TC02- Open Explore page ");
	        String targetText = "BGMI in-game updates";
	        boolean textFound = false;
	        int maxScrolls = 10; 

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
	        Thread.sleep(1000);
	        driver.findElement(
	                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
	        Thread.sleep(1000);
	        clickAndWaitForElementWithId("com.threesixteen.app:id/click_view");
	        System.out.println("TC03- Open video");
	        Thread.sleep(1000);
	        SkipAd();
	        if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
		        Thread.sleep(1000);
	            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close"); }
	        Thread.sleep(1000);
	        clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
	        Thread.sleep(1000);
	        System.out.println("TC04- Open recommended video");


	}
	
	
	
	@Test(priority = 12)
	public void ExplorePageFFTipsnTricks12() throws InterruptedException {

//           Thread.sleep(1000);
//		    OpenExplorePage();
//	        Thread.sleep(1000);
//	        System.out.println("TC02- Open Explore page ");
//	        String targetText = "FF Tips n Tricks";
//	        boolean textFound = false;
//	        int maxScrolls = 10; 
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
//	        driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
//	        System.out.println("Clicking on: " + targetText);
//	        driver.findElement(
//	                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
//	        Thread.sleep(1000);
//	        Thread.sleep(1000);
//	        clickAndWaitForElementWithId("com.threesixteen.app:id/click_view");
//	        System.out.println("TC03- Open video");
//	        Thread.sleep(1000);
//	        if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
//		        Thread.sleep(1000);
//	            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close"); }
//	        Thread.sleep(1000);
//	        clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
//	        System.out.println("TC04- Open recommended video");
	}
	
	
	
	@Test(priority = 13)
	public void ExplorePageStyleMyName13() throws InterruptedException {

           Thread.sleep(1000);
		    OpenExplorePage();
	        Thread.sleep(1000);
	        System.out.println("TC02- Open Explore page ");
	        String targetText = "Style Now";
	        boolean textFound = false;
	        int maxScrolls = 10; 

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
	        if (isVisibleWithXPath1("//*[contains(@text,'" + targetText + "')]")) {
	            driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
	            System.out.println("Clicking on: " + targetText);
	            driver.findElement(
		                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
		        Thread.sleep(1000);
	            Thread.sleep(1000);
	        } else {
	            System.out.println("TC02 - '" + targetText + "' not found on Explore page");
	        }

	     
	        
	}
	
	
	@Test(priority = 14)
	public void HomePageStyleMyName14() throws InterruptedException {

           Thread.sleep(1000);
	        System.out.println("TC02- Homepage Opened");
	        String targetText = "Style Now";
	        boolean textFound = false;
	        int maxScrolls = 10; 

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
	        Thread.sleep(1000);
	     
	        
	}
	
	        
	        
	        
	        
	
	@AfterMethod

	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
