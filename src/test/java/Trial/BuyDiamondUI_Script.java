package Trial;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class BuyDiamondUI_Script<MobileElement, Rotatable>  extends Functions{


	@Test(priority = 1)
	public void SideNavigationDiamond1() throws InterruptedException {

		clickAndWaitForElementWithId("com.threesixteen.app:id/iv_profile_image");
		System.out.println("TC01- opens side nav");
		clickAndWaitForElementWithId("com.threesixteen.app:id/txt_diamonds");
		System.out.println("TC02- open Diamond history from side nav");
		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.widget.TabWidget/android.view.View[2]")).click();
//		System.out.println("TC03- open Receievd tab");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[contains(@text,'Spent')]")).click();
//		System.out.println("TC04- Open spent tab");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[contains(@text,'Bought')]")).click();
//		System.out.println("TC5- open Offer winnings");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[contains(@text,'Redeemed')]")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
//	 clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
		System.out.println("TC06- back from diamond log");

	}

	
	
	@Test(priority = 2)
	public void DiamondPurchase2() throws InterruptedException {

		OpenSideNav();
		String targetText = "Buy Diamonds";
        boolean textFound = false;
        int maxScrolls = 5;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

        for (int i = 0; i < maxScrolls && !textFound; i++) {
            try {
                driver.findElement(
               		 AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + targetText + "\"))"));         
                textFound = true;
                System.out.println("TC02- Product description scrolled and found");
            } catch (Exception e) {
                driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@text,'" + targetText + "')]"))); 
            }
        }
        driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
        System.out.println("Clicking on: " + targetText);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_gems");
		System.out.println("TC03 -Openn diammond log");
		driver.navigate().back();
		System.out.println("TC04 -Back from diamond log diammond log");
	}
	
	
	
	

	@Test(priority = 3)
	public void Diamondpurchase3() throws InterruptedException {

		OpenSideNav();
      String targetText = "Buy Diamonds";
        boolean textFound = false;
        int maxScrolls = 5;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

        for (int i = 0; i < maxScrolls && !textFound; i++) {
            try {
                driver.findElement(
               		 AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + targetText + "\"))"));         
                textFound = true;
                System.out.println("TC02- Product description scrolled and found");
            } catch (Exception e) {
                driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@text,'" + targetText + "')]"))); 
            }
        }
        driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
        System.out.println("Clicking on: " + targetText);
        if (isVisibleWithXPath1("//*[contains(@text,'₹ 10')]")) {
        driver.findElement(By.xpath("//*[contains(@text,'₹ 10')]")).click();
		System.out.println("TC05 -Click on 10RS Diamond card");
		clickAndWaitForElementWithId("com.threesixteen.app:id/btn_buy");
		System.out.println("TC06 -Click on Buy now");
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_proceed_dcd");
		System.out.println("TC07 -Click on continue");
		clickAndWaitForElementWithXpath1(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
		System.out.println("TC08 -Click on paytm");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);        }
        else
        {
    		System.out.println("TC08 - 10Rs Diamond pack nnot available");

        }
//        clickAndWaitForElementWithId("net.one97.paytm:id/tv_yes");
//        System.out.println("TC09 -Click cancel payment");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_close");
//        System.out.println("TC10 -Click on close");
	}






	@Test(priority = 4)

	public void DiamondPurchase4() throws InterruptedException {
	
		OpenSideNav();
		 String targetText = "Buy Diamonds";
	        boolean textFound = false;
	        int maxScrolls = 5;
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

	        for (int i = 0; i < maxScrolls && !textFound; i++) {
	            try {
	                driver.findElement(
	               		 AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + targetText + "\"))"));         
	                textFound = true;
	                System.out.println("TC02- Product description scrolled and found");
	            } catch (Exception e) {
	                driver.findElement(
	                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
	                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@text,'" + targetText + "')]"))); 
	            }
	        }
	        driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
	        System.out.println("Clicking on: " + targetText);
	        if (isVisibleWithXPath1("//*[contains(@text,'₹ 29')]")) {
	        	
	            driver.findElement(By.xpath("//*[contains(@text,'₹ 29')]")).click();
		System.out.println("TC11 -Click on 29RS Diamond card");
		clickAndWaitForElementWithId("com.threesixteen.app:id/btn_buy");
		System.out.println("TC12 -Click on Buy now");
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_proceed_dcd");
		System.out.println("TC13 -Click on continue");
		clickAndWaitForElementWithXpath1(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
		System.out.println("TC14 -Click on paytm");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);	        }
	        else
	        {
	    		System.out.println("TC14 29rs pack not avaible right now ");

	        }
//        clickAndWaitForElementWithId("net.one97.paytm:id/tv_yes");
//        System.out.println("TC15 -Click cancel payment");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_close");
//        System.out.println("TC16 -Click on close");
	}

	@Test(priority = 5)
	public void DiamondPurchase5() throws InterruptedException {

		OpenSideNav();
        String targetText = "Buy Diamonds";
		boolean textFound = false;
		int maxScrolls = 5; 
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		for (int i = 0; i < maxScrolls && !textFound; i++) {
		    try {
		        driver.findElement(
		       		 AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + targetText + "\"))"));         
		        textFound = true;
		        System.out.println("TC02- Product description scrolled and found");
		    } catch (Exception e) {
		        driver.findElement(
		            AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
		        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@text,'" + targetText + "')]")));
		    }
		}
		driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
		System.out.println("Clicking on: " + targetText);
		Thread.sleep(1000);  
		if (isvisbileWithXpath1("//*[contains(@text,'₹ 50')]")) {
		driver.findElement(By.xpath("//*[contains(@text,'₹ 50')]")).click();
		System.out.println("TC17 -Click on 50RS Diamond card");
		clickAndWaitForElementWithId("com.threesixteen.app:id/btn_buy");
		System.out.println("TC18 -Click on Buy now");
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_proceed_dcd");
		System.out.println("TC19 -Click on continue");
		clickAndWaitForElementWithXpath1(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
		System.out.println("TC20 -Click on paytm");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);		}
		else
		{
			System.out.println("TC20 - 50rs pack not avaible right now ");
		
		}
		//        clickAndWaitForElementWithId("net.one97.paytm:id/tv_yes");
		//        System.out.println("TC21 -Click cancel payment");
		//        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_close");
		//        System.out.println("TC22 -Click on close");
			}
	
	

	private boolean isvisbileWithXpath1(String xpath) {
		return !driver.findElements(By.xpath(xpath)).isEmpty();
	}



	@Test(priority = 6)
	public void DiamondPurchase6() throws InterruptedException {

		OpenSideNav();
		 String targetText = "Buy Diamonds";
	        boolean textFound = false;
	        int maxScrolls = 5; 
	        WebDriverWait loopWait6 = new WebDriverWait(driver, Duration.ofSeconds(1));

	        for (int i = 0; i < maxScrolls && !textFound; i++) {
	            try {
	                driver.findElement(
	               		 AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + targetText + "\"))"));         
	                textFound = true;
	                System.out.println("TC02- Product description scrolled and found");
	            } catch (Exception e) {
	                driver.findElement(
	                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
	                loopWait6.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@text,'" + targetText + "')]"))); 
	            }
	        }
	        driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
	        System.out.println("Clicking on: " + targetText);
		if(isVisibleWithXPath1("//*[contains(@text,'₹ 100')]")) {
		driver.findElement(By.xpath("//*[contains(@text,'₹ 100')]")).click();
		System.out.println("TC23 -Click on 100RS Diamond card");
		clickAndWaitForElementWithId("com.threesixteen.app:id/btn_buy");
		System.out.println("TC24 -Click on Buy now");
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_proceed_dcd");
		System.out.println("TC25 -Click on continue");
		clickAndWaitForElementWithXpath1(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
		System.out.println("TC26 -Click on paytm");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(1000);		}
		else
		{
			System.out.println("TC26 -100rs diamond pack not available");

		}
//        clickAndWaitForElementWithId("net.one97.paytm:id/tv_yes");
//        System.out.println("TC27 -Click cancel payment");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_close");
//        System.out.println("TC28 -Click on close");
	}

	@Test(priority = 7)
	public void DiamondPurchase7() throws InterruptedException {

		OpenSideNav();
		 String targetText = "Buy Diamonds";
	        boolean textFound = false;
	        int maxScrolls = 5; 
	        WebDriverWait loopWait7 = new WebDriverWait(driver, Duration.ofSeconds(1));

	        for (int i = 0; i < maxScrolls && !textFound; i++) {
	            try {
	                driver.findElement(
	               		 AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + targetText + "\"))"));         
	                textFound = true;
	                System.out.println("TC02- Product description scrolled and found");
	            } catch (Exception e) {
	                driver.findElement(
	                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
	                loopWait7.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@text,'" + targetText + "')]"))); 
	            }
	        }
	        driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
	        System.out.println("Clicking on: " + targetText);
	        if (isVisibleWithXPath1("//*[contains(@text,'₹ 250')]")) {
	     
			driver.findElement(By.xpath("//*[contains(@text,'₹ 250')]")).click();
		System.out.println("TC29 -Click on 250RS Diamond card");
		clickAndWaitForElementWithId("com.threesixteen.app:id/btn_buy");
		System.out.println("TC30 -Click on Buy now");
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_proceed_dcd");
		System.out.println("TC31 -Click on continue");
		clickAndWaitForElementWithXpath1(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
		System.out.println("TC32 -Click on paytm");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		}
	        else
	        {
	    		System.out.println("TC32 - 250rs pack not available");

	        }
//        clickAndWaitForElementWithId("net.one97.paytm:id/tv_yes");
//        System.out.println("TC33 -Click cancel payment");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_close");
//        System.out.println("TC34 -Click on close");
	}

	
	
	
	@Test(priority = 8)
	public void DiamondPurchase8() throws InterruptedException {

		OpenSideNav();
		 String targetText = "Buy Diamonds";
	        boolean textFound = false;
	        int maxScrolls = 5; 
	        WebDriverWait loopWait8 = new WebDriverWait(driver, Duration.ofSeconds(1));

	        for (int i = 0; i < maxScrolls && !textFound; i++) {
	            try {
	                driver.findElement(
	               		 AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + targetText + "\"))"));         
	                textFound = true;
	                System.out.println("TC02- Product description scrolled and found");
	            } catch (Exception e) {
	                driver.findElement(
	                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
	                loopWait8.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@text,'" + targetText + "')]"))); 
	            }
	        }
	        driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
	        System.out.println("Clicking on: " + targetText);
       if (isVisibleWithXPath1("//*[contains(@text,'₹ 500')]")) {
       driver.findElement(By.xpath("//*[contains(@text,'₹ 500')]")).click();
		System.out.println("TC35 -Click on 500RS Diamond card");
		clickAndWaitForElementWithId("com.threesixteen.app:id/btn_buy");
		System.out.println("TC36 -Click on Buy now");
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_proceed_dcd");
		System.out.println("TC37 -Click on continue");
		clickAndWaitForElementWithXpath1(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
		System.out.println("TC38 -Click on paytm");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		}
       else
       {
   		System.out.println("TC38 -500 rs pack not available");

       }
//        clickAndWaitForElementWithId("net.one97.paytm:id/tv_yes");
//        System.out.println("TC39 -Click cancel payment");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_close");
//        System.out.println("TC40 -Click on close");

	}

	@Test(priority = 9)
	public void Diamond600Purchase9() throws InterruptedException {
		

		OpenSideNav();
		 String targetText = "Buy Diamonds";
	        boolean textFound = false;
	        int maxScrolls = 5; 
	        WebDriverWait loopWait9 = new WebDriverWait(driver, Duration.ofSeconds(1));

	        for (int i = 0; i < maxScrolls && !textFound; i++) {
	            try {
	                driver.findElement(
	               		 AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + targetText + "\"))"));         
	                textFound = true;
	                System.out.println("TC02- Product description scrolled and found");
	            } catch (Exception e) {
	                driver.findElement(
	                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
	                loopWait9.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@text,'" + targetText + "')]"))); 
	            }
	        }
	        driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
	        System.out.println("Clicking on: " + targetText);
	    	if (isVisibleWithXPath1("//*[contains(@text,'₹ 600')]")) {
	    		driver.findElement(By.xpath("//*[contains(@text,'₹ 600')]")).click();
			System.out.println("TC41 -Click on 600RS Diamond card");
			clickAndWaitForElementWithId("com.threesixteen.app:id/btn_buy");
			System.out.println("TC42 -Click on Buy now");
			clickAndWaitForElementWithId("com.threesixteen.app:id/tv_proceed_dcd");
			System.out.println("TC43 -Click on continue");
			clickAndWaitForElementWithXpath1(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
			System.out.println("TC44 -Click on paytm");
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
			
		}
	    	else
	    	{
				System.out.println("TC44 - 600 rs pack not available");

	    		
	    	}
//        clickAndWaitForElementWithId("net.one97.paytm:id/tv_yes");
//        System.out.println("TC45 -Click cancel payment");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_close");
//        System.out.println("TC46 -Click on close");
	}

	@Test(priority = 10)
	public void DiamondPurchase10() throws InterruptedException {

		OpenSideNav();
		 String targetText = "Buy Diamonds";
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
	        if (isVisibleWithXPath1("//*[contains(@text,'₹ 5')]")) {
	    		driver.findElement(By.xpath("//*[contains(@text,'₹ 5')]")).click();
			System.out.println("TC41 -Click on 600RS Diamond card");
			clickAndWaitForElementWithId("com.threesixteen.app:id/btn_buy");
			System.out.println("TC42 -Click on Buy now");
			clickAndWaitForElementWithId("com.threesixteen.app:id/tv_proceed_dcd");
			System.out.println("TC43 -Click on continue");
			clickAndWaitForElementWithXpath1(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
			System.out.println("TC44 -Click on paytm");
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
			
		}
	    	else
	    	{
				System.out.println("TC44 - 600 rs pack not available");

	    		
	    	}
	}
	
	

	
	@Test(priority = 11)
	public void DiamondPageUICheck11() throws InterruptedException {

		OpenSideNav();
		 String targetText = "Buy Diamonds";
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
		clickAndWaitForElementWithId("com.threesixteen.app:id/purchase_history_cta");
		System.out.println("TC03 - Click on Dimaond purchase history");
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_coins");
		System.out.println("TC04 - Diamond count is coming Dimaond purchase history");
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_title");
		System.out.println("TC05 - Purchase history is coming Dimaond purchase history");
		if (isVisibleWithXPath1(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.Button")) {
			clickAndWaitForElementWithXpath1(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.Button");
			System.out.println("TC06 - Click on Retry in Dimaond purchase history");
			clickAndWaitForElementWithId("com.threesixteen.app:id/tv_proceed_dcd");
			System.out.println("TC07 - Click on continue");
			clickAndWaitForElementWithXpath1(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView");
			Thread.sleep(1000);
			driver.navigate().back();
			System.out.println("TC08 - Back from paytm page");
			Thread.sleep(1000);
		}
		driver.navigate().back();
		System.out.println("TC09 - Back from purchase history page");
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_gems");
		System.out.println("TC10 -Open diamond log ");
		
//		clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.TextView[8]");
//		System.out.println("TC11 - Diamond History page title is visible ");
//		clickAndWaitForElementWithId("com.threesixteen.app:id/textView30");
//		System.out.println("TC12 - Current balance title is visible");
//		clickAndWaitForElementWithId("com.threesixteen.app:id/ic_currency");
//		System.out.println("TC13 - Diamond icon is visible");
//		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_user_coins");
//		System.out.println("TC14 - Diamond count is coming");

//		if (isVisibleWithId("com.threesixteen.app:id/btn_earn_more")) {
//			clickAndWaitForElementWithXpath1(
//					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout[2]/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]");
//			System.out.println("TC15 - Purchase title is coming");
//		}
//
//		clickAndWaitForElementWithXpath1(
//				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout[2]/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[2]");
//		System.out.println("TC16 - Order Id is coming");
//		clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
//		System.out.println("TC17 - Clciked on Back");

	}
	
	
	
	
	
	@Test(priority = 12)
	public void DiamondPackRepeation12() throws InterruptedException {

		OpenSideNav();
		 String targetText = "Buy Diamonds";
	        boolean textFound = false;
	        int maxScrolls = 4;
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

	        for (int i = 0; i < maxScrolls && !textFound; i++) {
	            try {
	                driver.findElement(
	               		 AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + targetText + "\"))"));         
	                textFound = true;
	                System.out.println("TC01- Product description scrolled and found");
	            } catch (Exception e) {
	                driver.findElement(
	                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
	                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@text,'" + targetText + "')]"))); 
	            }
	        }
	        driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
	        System.out.println("Clicking on: " + targetText);
		if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView"))
		{
			driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));
            System.out.println("TC02- Diamonds Pack Page is scrolling ");

		}
		
        List<WebElement> textElements = driver.findElements(By.id("com.threesixteen.app:id/tv_quantity"));
       

        Map<String, Integer> textCountMap = new HashMap<>();
        for (WebElement element : textElements) {
            String text = ((WebElement) element).getText();
            textCountMap.put(text, textCountMap.getOrDefault(text, 0) + 1);
            

        }
        // Print or log repeating texts
        for (Map.Entry<String, Integer> entry : textCountMap.entrySet()) {
            if (entry.getValue() > 2) {
                System.out.println("Repeating text: " + entry.getKey() + ", Count: " + entry.getValue());
	            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");

            }    
        }
     }
	
	    
	
	
	
	@Test(priority = 13)
	public void DiamondPayout133() throws InterruptedException {

		OpenSideNav();
		 String targetText = "Buy Diamonds";
	        boolean textFound = false;
	        int maxScrolls = 4;
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

	        for (int i = 0; i < maxScrolls && !textFound; i++) {
	            try {
	                driver.findElement(
	               		 AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + targetText + "\"))"));         
	                textFound = true;
	                System.out.println("TC01- Product description scrolled and found");
	            } catch (Exception e) {
	                driver.findElement(
	                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
	                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@text,'" + targetText + "')]"))); 
	            }
	        }
	        driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
	        System.out.println("Clicking on: " + targetText);
		
	        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_gems");
			System.out.println("TC01 -Open diamond log ");
            WebDriverWait methodWait = new WebDriverWait(driver, Duration.ofSeconds(5));
            methodWait.until(ExpectedConditions.presenceOfElementLocated(By.className("android.webkit.WebView")));
            
            if (isVisibleWithClass("android.webkit.WebView")) {
    			System.out.println("TC02 -Diamond payout webview is opend ");
                methodWait.until(ExpectedConditions.elementToBeClickable(By.id("com.threesixteen.app:id/tv_gems")));
                driver.navigate().back();
    			System.out.println("TC03 -Back from Diamond payout webview");

                methodWait.until(ExpectedConditions.elementToBeClickable(By.id("com.threesixteen.app:id/tv_gems")));

                clickAndWaitForElementWithId("com.threesixteen.app:id/tv_gems");
    			System.out.println("TC04 -Open diamond log Again ");
            }
            else
            {
                driver.findElement(By.xpath("//*[contains(@text,'Pro Streams')]")).click();
             			System.out.println("TC04 -Diamond payout wbeview not opened");
            }
	}
	
                
	
	

}
