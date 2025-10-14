package Trial;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
	public void Diamond10purchase3() throws InterruptedException {

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
        String targetText1 = "₹ 10";
	        boolean textFound1 = false;
	        int maxScrolls1 = 5; 

	        for (int i = 0; i < maxScrolls1 && !textFound1; i++) {
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
	        driver.findElement(By.xpath("//*[contains(@text,'" + targetText1 + "')]")).click();
	        System.out.println("Clicking on: " + targetText1);
	        Thread.sleep(1000);  
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
       
//        clickAndWaitForElementWithId("net.one97.paytm:id/tv_yes");
//        System.out.println("TC09 -Click cancel payment");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_close");
//        System.out.println("TC10 -Click on close");
	






	@Test(priority = 4)

	public void Diamond29Purchase4() throws InterruptedException {
	
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
	public void Diamond50Purchase5() throws InterruptedException {

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
		String targetText1 = "₹ 50";
	        boolean textFound1 = false;
	        int maxScrolls1 = 5; 

	        for (int i = 0; i < maxScrolls1 && !textFound1; i++) {
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
	        driver.findElement(By.xpath("//*[contains(@text,'" + targetText1 + "')]")).click();
	        System.out.println("Clicking on: " + targetText1);
	        Thread.sleep(1000);  
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
		
	
	

	private boolean isvisbileWithXpath1(String xpath) {
		return !driver.findElements(By.xpath(xpath)).isEmpty();
	}



	@Test(priority = 6)
	public void Diamond100Purchase6() throws InterruptedException {

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
		String targetText1 = "₹ 100";
	        boolean textFound1 = false;
	        int maxScrolls1 = 5; 

	        for (int i = 0; i < maxScrolls1 && !textFound1; i++) {
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
	        driver.findElement(By.xpath("//*[contains(@text,'" + targetText1 + "')]")).click();
	        System.out.println("Clicking on: " + targetText1);
	        Thread.sleep(1000);  
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
		

	@Test(priority = 7)
	public void Diamond250Purchase7() throws InterruptedException {

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
	       String targetText1 = "₹ 250";
	        boolean textFound1 = false;
	        int maxScrolls1 = 5; 

	        for (int i = 0; i < maxScrolls1 && !textFound1; i++) {
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
	        driver.findElement(By.xpath("//*[contains(@text,'" + targetText1 + "')]")).click();
	        System.out.println("Clicking on: " + targetText1);
	        Thread.sleep(1000);  
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
	       

	
	
	
	@Test(priority = 8)
	public void Diamond500Purchase8() throws InterruptedException {

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
      String targetText1 = "₹ 500";
	        boolean textFound1 = false;
	        int maxScrolls1 = 5; 

	        for (int i = 0; i < maxScrolls1 && !textFound1; i++) {
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
	        driver.findElement(By.xpath("//*[contains(@text,'" + targetText1 + "')]")).click();
	        System.out.println("Clicking on: " + targetText1);
	        Thread.sleep(1000);  
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

	    	String targetText1 = "₹ 600";
	        boolean textFound1 = false;
	        int maxScrolls1 = 5; 

	        for (int i = 0; i < maxScrolls1 && !textFound1; i++) {
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
	        driver.findElement(By.xpath("//*[contains(@text,'" + targetText1 + "')]")).click();
	        System.out.println("Clicking on: " + targetText1);
	        Thread.sleep(1000);  
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
	    


	@Test(priority = 10)
	public void Diamond5Purchase10() throws InterruptedException {

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

			String targetText1 = "₹ 5";
	        boolean textFound1 = false;
	        int maxScrolls1 = 5; 

	        for (int i = 0; i < maxScrolls1 && !textFound1; i++) {
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
	        driver.findElement(By.xpath("//*[contains(@text,'" + targetText1 + "')]")).click();
	        System.out.println("Clicking on: " + targetText1);
	        Thread.sleep(1000);  
	     
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
		   Thread.sleep(1000);
	        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_gems");
			System.out.println("TC01 -Open diamond log ");
           		   Thread.sleep(5000);

            if (isVisibleWithXPath1("//android.webkit.WebView/android.view.View/android.widget.TextView[2]")) {
    			System.out.println("TC02 -Diamond payout webview is opend ");
                
				// clickAndWaitForElementWithXpath1("//android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.TextView[7]");
    			// System.out.println("TC03 -payout webview opened");

            }
            else
            {
             			System.out.println("TC04 -Diamond payout wbeview not opened");
						throw new NoSuchElementException("WebView not found");
            }
	}
	
                
	
	
}