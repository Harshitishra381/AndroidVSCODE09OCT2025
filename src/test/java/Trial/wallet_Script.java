package Trial;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.*;

public class wallet_Script<MobileElement, Rotatable> extends Functions {


   

    @Test(priority =1)
    public void WalletAddMoneyRS1001() throws InterruptedException {
    	
    	OpenSideNav();
    	clickAndWaitForElementWithId("com.threesixteen.app:id/iv_wallet");
   		System.out.println("TC02- Open wallet from Side nav");
   		
   		driver.findElement(By.xpath("//*[contains(@text,'Add Money')]")).click();
   		System.out.println("TC03- Click on Add money");
   		Thread.sleep(2000);

   		driver.findElement(By.className("android.widget.EditText"));
        System.out.println("TC04- click in box");
   		Thread.sleep(10000);

   		if (isVisibleWithId("numberInput"))
   		{
   	    (driver).findElement(By.id("numberInput")).sendKeys("10");
        System.out.println("TC05- Type amount 10 rs  in box");
   		driver.findElement(By.xpath("//*[contains(@text,'Add Money')]")).click();
   		System.out.println("TC06- Click on Add money");
   		
    }
   		else
   		{
   			(driver).findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[2]/android.view.View/android.widget.EditText")).sendKeys("10");
   	        System.out.println("TC07- Type amount 10 rs  in box");
   	   		driver.findElement(By.xpath("//*[contains(@text,'Add Money')]")).click();
   	   		System.out.println("TC08- Click on Add money");
   			
   		}
    }
       
	
    
    
    @Test(priority =2)
    public void WalletAddMoneyRS50002() throws InterruptedException {
    	
    	
    	
    	OpenSideNav();
    	clickAndWaitForElementWithId("com.threesixteen.app:id/iv_wallet");
   		System.out.println("TC02- Open wallet from Side nav");
   		driver.findElement(By.xpath("//*[contains(@text,'Add Money')]")).click();
   		System.out.println("TC03- Click on Add money");
   		if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[2]/android.widget.Button[2]")) {
   		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[2]/android.widget.Button[2]")).click();
   		}
   		else
   		{
          if (isVisibleWithXPath1("//*[contains(@text,'₹500')]")) 
          {
         		driver.findElement(By.xpath("//*[contains(@text,'₹500')]")).click();

          }
          else
          {
   			driver.findElement(By.xpath("//*[contains(@resource-id, 'mantine-6m4ojcqz9-target')]"));

   		}
   		}
   		System.out.println("TC04- Click on 500rs ");
   	
   		
   		driver.findElement(By.xpath("//*[contains(@text,'Add Money')]")).click();
   		System.out.println("TC06- Click on Add money");
    
    
    }
    
    
    
    
    
    @Test(priority =3)
    public void WalletAddMoneyRS10003() throws InterruptedException {
    	
    	
    	OpenSideNav();
    	clickAndWaitForElementWithId("com.threesixteen.app:id/iv_wallet");
   		System.out.println("TC02- Open wallet from Side nav");
   		driver.findElement(By.xpath("//*[contains(@text,'Add Money')]")).click();
   		System.out.println("TC03- Click on Add money");
   		if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[2]/android.widget.Button[3]")) {
   		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[2]/android.widget.Button[3]")).click();
   		}
   		else
   		{
          if (isVisibleWithXPath1("//*[contains(@text,'₹1,000')]")) 
          {
         		driver.findElement(By.xpath("//*[contains(@text,'₹1,000')]")).click();

          }
   		}
   		System.out.println("TC04- Click on 1000rs ");
   		driver.findElement(By.xpath("//*[contains(@text,'Add Money')]")).click();
   		System.out.println("TC06- Click on Add money");
    
    }
    
    
    
    
    
    @Test(priority =4)
    public void WalletFromSideNav04() throws InterruptedException {
    	
    	OpenSideNav();
    	clickAndWaitForElementWithId("com.threesixteen.app:id/iv_wallet");
   		System.out.println("TC02- Open wallet from Side nav");
   		driver.findElement(By.xpath("//*[contains(@text,'Add Money')]")).click();
   		System.out.println("TC03- Click on Add money");
   		Thread.sleep(1000);
   		driver.navigate().back();
   		Thread.sleep(1000);
   		driver.navigate().back();
    	OpenCentralReeltab();

    }
    
    
    
    
    
    @Test(priority =5)
    public void WalletFromSRewardPageIcon05() throws InterruptedException {
    	
    	
    	OpenSideNav();
    	clickAndWaitForElementWithId("com.threesixteen.app:id/iv_wallet");
   		System.out.println("TC02- Open wallet from Side nav");
   		driver.findElement(By.xpath("//*[contains(@text,'Add Money')]")).click();
   		System.out.println("TC03- Click on Add money");
   		Thread.sleep(1000);
   		driver.navigate().back();
   		Thread.sleep(1000);
   		driver.navigate().back();
    	OpenSideNav();


    }
    
    
    
    
    
    
    @Test(priority =6)
    public void WalletHistoryAndAddMore06() throws InterruptedException {
    	
    	
    	
    	OpenSideNav();
    	clickAndWaitForElementWithId("com.threesixteen.app:id/iv_wallet");
   		System.out.println("TC02- Open wallet from Side nav");
   		driver.findElement(By.xpath("//*[contains(@text,'History')]")).click();
   		System.out.println("TC03- Click on history");
   	   	driver.findElement(By.xpath("//*[contains(@text,'Money Added to Wallet')]")).click();
   	    System.out.println("TC05- Open first item in history");
   	    Thread.sleep(3000);
   	   	driver.findElement(By.xpath("//*[contains(@text,'Add Money')]")).click();
   		System.out.println("TC06- Click on Add money");

   		
   		}

   		
   		
   		
    @Test(priority =7)
    public void WalletDownloadInvoice07() throws InterruptedException {
    	
    	
    	
    	OpenSideNav();
    	clickAndWaitForElementWithId("com.threesixteen.app:id/iv_wallet");
   		System.out.println("TC02- Open wallet from Side nav");
   		driver.findElement(By.xpath("//*[contains(@text,'History')]")).click();
   		System.out.println("TC03- Click on history");
   		String targetText = "success";
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
        Thread.sleep(10000); 
        
        
        
        
        String targetText1 = "Download Invoice";
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
        Thread.sleep(10000); 
//        if (isVisibleWithXPath1("//android.view.View[@content-desc=\"Rooter Download Invoice\"]/android.widget.Image")) {
//        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Rooter Download Invoice\"]/android.widget.Image")).click();
//   		System.out.println("TC04- Click on Download invoice");
//        }
//        else
//        {
//    		driver.findElement(By.xpath("//*[contains(@text,'Download Invoice')]")).click();
//       		System.out.println("TC04- Click on Download invoice1");
//
//        }
//        Thread.sleep(10000); 
//        clickAndWaitForElementWithXpath1("//*[contains(@resource-id,'android:id/icon')]");
//   		System.out.println("TC05- open invoice Invoice");
        Thread.sleep(5000); 
   		driver.navigate().back();
        Thread.sleep(1000);
        if(isVisibleWithXPath1("//*[contains(@text,'Done')]"))
        {
		driver.findElement(By.xpath("//*[contains(@text,'Done')]")).click();
   		System.out.println("TC06- Click on Done");
        }
        else
        {
        	driver.navigate().back();
            Thread.sleep(1000);
    		driver.findElement(By.xpath("//*[contains(@text,'Done')]")).click();
       		System.out.println("TC07- Click on Done");
        }
   		
    }
    
    
    
    
    @Test(priority =8)
    public void WalletQuestion108() throws InterruptedException {
    	
    
    	
    	
    	OpenSideNav();
    	clickAndWaitForElementWithId("com.threesixteen.app:id/iv_wallet");
   		System.out.println("TC02- Open wallet from Side nav");
    	 String targetText = "What is the Wallet?";
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
         
         MobileElement element = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]"));
         String ANSWER1 = ((WebElement) element).getText();  // No need to cast to WebElement
         System.out.println("TC03- Answer in dark mode is " + ANSWER1);

         if (ANSWER1.equals("The Wallet is a feature that allows you to store money, earn cashback, and make transactions on our platform.")) {
             System.out.println("TC04- Question and Answer test is ok");

             clickAndWaitForElementWithXpath1("//*[contains(@text,'Close')]");
             System.out.println("TC05- Click on close");
             driver.navigate().back();
             OpenHomePage();
             ThemeChange();
         	OpenSideNav();
        	clickAndWaitForElementWithId("com.threesixteen.app:id/iv_wallet");
        		System.out.println("TC06- Open wallet from rewards page");
        		 String targetText1 = "What is the Wallet?";
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
                     }
                 }
                 driver.findElement(By.xpath("//*[contains(@text,'" + targetText1 + "')]")).click();
                 System.out.println("Clicking on: " + targetText1);
                 
                 MobileElement element1 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]"));
                 String ANSWER11 = ((WebElement) element1).getText();  // No need to cast to WebElement
                 System.out.println("TC07- Answer in light mode is " + ANSWER11);

             if (ANSWER1.equals(ANSWER11)) {
            	 clickAndWaitForElementWithXpath1("//*[contains(@text,'Close')]");
                 System.out.println("TC05- Click on close");
            	 
             }
             else
             {
                 clickAndWaitForElementWithXpath1("//*[contains(@text,'Data Saver')]");

             }
             
             
         } else {
             clickAndWaitForElementWithXpath1("//*[contains(@text,'Data Saver')]");
         }

    }
    
    
    
    
    @Test(priority = 9)
    public void WalletFAQ209() throws InterruptedException {
    	
    
 	
    	
    	OpenSideNav();
    	clickAndWaitForElementWithId("com.threesixteen.app:id/iv_wallet");
   		System.out.println("TC02- Open wallet from Side nav");
	 String targetText = "How can I add money to my Wallet?";
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
     
     MobileElement element = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/tv_answer"));
     String ANSWER1 = ((WebElement) element).getText();  // No need to cast to WebElement
     System.out.println("TC03- Answer in dark mode is " + ANSWER1);

     if (ANSWER1.equals("You can add money to your Wallet by going to the Wallet page and clicking on 'Add Money'. You can then enter the amount you wish to add and complete the transaction.")) {
         System.out.println("TC04- Question and Answer test is ok");

         clickAndWaitForElementWithXpath1("//*[contains(@text,'Close')]");
         System.out.println("TC05- Click on close");
         driver.navigate().back();
         OpenHomePage();
         ThemeChange();
     	OpenSideNav();
    	clickAndWaitForElementWithId("com.threesixteen.app:id/iv_wallet");
    		System.out.println("TC06- Open wallet from rewards page");
    		 String targetText1 = "How can I add money to my Wallet?";
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
                 }
             }
             driver.findElement(By.xpath("//*[contains(@text,'" + targetText1 + "')]")).click();
             System.out.println("Clicking on: " + targetText1);
             
             MobileElement element1 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/tv_answer"));
             String ANSWER11 = ((WebElement) element1).getText();  // No need to cast to WebElement
             System.out.println("TC07- Answer in light mode is " + ANSWER11);

         if (ANSWER1.equals(ANSWER11)) {
        	 clickAndWaitForElementWithXpath1("//*[contains(@text,'Close')]");
             System.out.println("TC05- Click on close");        	 
         }
         else
         {
             clickAndWaitForElementWithXpath1("//*[contains(@text,'Data Saver')]");

         } 
         
     } else {
         clickAndWaitForElementWithXpath1("//*[contains(@text,'Data Saver')]");
     }
}



    
    
    @Test(priority = 10)
    public void WalletFAQ310() throws InterruptedException {
    	
    
 	
    	
    	OpenSideNav();
    	clickAndWaitForElementWithId("com.threesixteen.app:id/iv_wallet");
   		System.out.println("TC02- Open wallet from Side nav");
	 String targetText = "Can I earn cashback with my Wallet?";
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
//     /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]
     MobileElement element = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/tv_answer"));
     String ANSWER1 = ((WebElement) element).getText();  // No need to cast to WebElement
     System.out.println("TC03- Answer in dark mode is " + ANSWER1);

     if (ANSWER1.equals("Yes, you can earn cashback on transactions made with your Wallet. The percentage of cashback you can earn varies and is detailed in our 'Promo Codes & Offers' section.")) {
         System.out.println("TC04- Question and Answer test is ok");

         clickAndWaitForElementWithXpath1("//*[contains(@text,'Close')]");
         System.out.println("TC05- Click on close");
         driver.navigate().back();
         OpenHomePage();
         ThemeChange();
         OpenSideNav();
     	clickAndWaitForElementWithId("com.threesixteen.app:id/iv_wallet");
    		System.out.println("TC06- Open wallet from rewards page");
    		 String targetText1 = "Can I earn cashback with my Wallet?";
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
                 }
             }
             driver.findElement(By.xpath("//*[contains(@text,'" + targetText1 + "')]")).click();
             System.out.println("Clicking on: " + targetText1);
             
             MobileElement element1 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/tv_answer"));
             String ANSWER11 = ((WebElement) element1).getText();  // No need to cast to WebElement
             System.out.println("TC07- Answer in light mode is " + ANSWER11);

         if (ANSWER1.equals(ANSWER11)) {
        	 clickAndWaitForElementWithXpath1("//*[contains(@text,'Close')]");
             System.out.println("TC05- Click on close");
        	 
         }
         else
         {
             clickAndWaitForElementWithXpath1("//*[contains(@text,'Data Saver')]");

         }
         
         
     } else {
         clickAndWaitForElementWithXpath1("//*[contains(@text,'Data Saver')]");
     }

}
    
    
    
    
    
    
    
    
    @Test(priority = 11)
    public void WalletFAQ411() throws InterruptedException {
    	
    
 	
    	
    	OpenSideNav();
    	clickAndWaitForElementWithId("com.threesixteen.app:id/iv_wallet");
   		System.out.println("TC02- Open wallet from Side nav");
	 String targetText = "What are the benefits of using the Wallet?";
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
     MobileElement element = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/tv_answer"));
     String ANSWER1 = ((WebElement) element).getText();  
     System.out.println("TC03- Answer in dark mode is " + ANSWER1);

     if (ANSWER1.equals("Using the Wallet allows you to earn cashback, avail of promotional offers, and make secure transactions on our platform.")) {
         System.out.println("TC04- Question and Answer test is ok");

         clickAndWaitForElementWithXpath1("//*[contains(@text,'Close')]");
         System.out.println("TC05- Click on close");
         driver.navigate().back();
         OpenHomePage();
         ThemeChange();    
         OpenSideNav();
     	clickAndWaitForElementWithId("com.threesixteen.app:id/iv_wallet");
    		System.out.println("TC06- Open wallet from rewards page");
    		 String targetText1 = "What are the benefits of using the Wallet?";
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
                 }
             }
             driver.findElement(By.xpath("//*[contains(@text,'" + targetText1 + "')]")).click();
             System.out.println("Clicking on: " + targetText1);
             
        MobileElement element1 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/tv_answer"));
             String ANSWER11 = ((WebElement) element1).getText();  // No need to cast to WebElement
             System.out.println("TC07- Answer in light mode is " + ANSWER11);

         if (ANSWER1.equals(ANSWER11)) {
        	 clickAndWaitForElementWithXpath1("//*[contains(@text,'Close')]");
             System.out.println("TC05- Click on close");
        	 
         }
         else
         {
             clickAndWaitForElementWithXpath1("//*[contains(@text,'Data Saver')]");

         }
         
         
     } 
     else
     {
         clickAndWaitForElementWithXpath1("//*[contains(@text,'Data Saver')]");
     }

}
    
    
    

    
    
    @Test(priority = 12)
    public void WalletFAQ512() throws InterruptedException {
    	
    
 	
    	
    	OpenSideNav();
    	clickAndWaitForElementWithId("com.threesixteen.app:id/iv_wallet");
   		System.out.println("TC02- Open wallet from Side nav");
	 String targetText = "What happens if my cashback or bonus expires?";
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
     MobileElement element = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/tv_answer"));
     String ANSWER1 = ((WebElement) element).getText();  
     System.out.println("TC03- Answer in dark mode is " + ANSWER1);

     if (ANSWER1.equals("If your cashback or bonus expires before you use it, it will be removed from your Wallet balance. We encourage you to use your cashback and bonus before their expiry dates.")) {
         System.out.println("TC04- Question and Answer test is ok");

         clickAndWaitForElementWithXpath1("//*[contains(@text,'Close')]");
         System.out.println("TC05- Click on close");
         driver.navigate().back();
         OpenHomePage();
         ThemeChange();    
         OpenSideNav();
     	clickAndWaitForElementWithId("com.threesixteen.app:id/iv_wallet");
    		System.out.println("TC06- Open wallet from rewards page");
    		 String targetText1 = "What happens if my cashback or bonus expires?";
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
                 }
             }
             driver.findElement(By.xpath("//*[contains(@text,'" + targetText1 + "')]")).click();
             System.out.println("Clicking on: " + targetText1);
             
        MobileElement element1 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/tv_answer"));
             String ANSWER11 = ((WebElement) element1).getText();  // No need to cast to WebElement
             System.out.println("TC07- Answer in light mode is " + ANSWER11);

         if (ANSWER1.equals(ANSWER11)) {
        	 clickAndWaitForElementWithXpath1("//*[contains(@text,'Close')]");
             System.out.println("TC05- Click on close");
        	 
         }
         else
         {
             clickAndWaitForElementWithXpath1("//*[contains(@text,'Data Saver')]");

         }
         
         
     } 
     else
     {
         clickAndWaitForElementWithXpath1("//*[contains(@text,'Data Saver')]");
     }

}
    
    
    
    
    
    
    
    
    @Test(priority = 15)
    public void WalletFAQ615() throws InterruptedException {
    	
    
 	
    	
    	OpenSideNav();
    	clickAndWaitForElementWithId("com.threesixteen.app:id/iv_wallet");
   		System.out.println("TC02- Open wallet from Side nav");
	 String targetText = "Are there any limits on adding money to the Wallet?";
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
     MobileElement element = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/tv_answer"));
     String ANSWER1 = ((WebElement) element).getText();  
     System.out.println("TC03- Answer in dark mode is " + ANSWER1);

     if (ANSWER1.equals("Yes, there might be a maximum limit on the amount you can add at a time to your Wallet. This limit is dictated by your country's financial regulations and our platform's policy.")) {
         System.out.println("TC04- Question and Answer test is ok");

         clickAndWaitForElementWithXpath1("//*[contains(@text,'Close')]");
         System.out.println("TC05- Click on close");
         driver.navigate().back();
         OpenHomePage();
         ThemeChange();    
         OpenSideNav();
     	clickAndWaitForElementWithId("com.threesixteen.app:id/iv_wallet");
    		System.out.println("TC06- Open wallet from rewards page");
    		 String targetText1 = "Are there any limits on adding money to the Wallet?";
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
                 }
             }
             driver.findElement(By.xpath("//*[contains(@text,'" + targetText1 + "')]")).click();
             System.out.println("Clicking on: " + targetText1);
             
        MobileElement element1 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/tv_answer"));
             String ANSWER11 = ((WebElement) element1).getText();  // No need to cast to WebElement
             System.out.println("TC07- Answer in light mode is " + ANSWER11);

         if (ANSWER1.equals(ANSWER11)) {
        	 clickAndWaitForElementWithXpath1("//*[contains(@text,'Close')]");
             System.out.println("TC05- Click on close");
        	 
         }
         else
         {
             clickAndWaitForElementWithXpath1("//*[contains(@text,'Data Saver')]");

         }
         
         
     } 
     else
     {
         clickAndWaitForElementWithXpath1("//*[contains(@text,'Data Saver')]");
     }

}
    
    
    
    
    
    @Test(priority = 14)
    public void WalletFAQ714() throws InterruptedException {
    	
    
 	
    	
    	OpenSideNav();
    	clickAndWaitForElementWithId("com.threesixteen.app:id/iv_wallet");
   		System.out.println("TC02- Open wallet from Side nav");
	 String targetText = "Can I withdraw money from my Wallet?";
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
     MobileElement element = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/tv_answer"));
     String ANSWER1 = ((WebElement) element).getText();  
     System.out.println("TC03- Answer in dark mode is " + ANSWER1);

     if (ANSWER1.equals("No, you can not withdraw money from the Wallet but can use wallet money for doing transactions on the app.")) {
         System.out.println("TC04- Question and Answer test is ok");

         clickAndWaitForElementWithXpath1("//*[contains(@text,'Close')]");
         System.out.println("TC05- Click on close");
         Thread.sleep(1000); 
         driver.navigate().back();
         Thread.sleep(1000); 
         OpenHomePage();
         ThemeChange();    
         OpenSideNav();
     	clickAndWaitForElementWithId("com.threesixteen.app:id/iv_wallet");
    		System.out.println("TC06- Open wallet from rewards page");
    		 String targetText1 = "Can I withdraw money from my Wallet?";
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
                 }
             }
             driver.findElement(By.xpath("//*[contains(@text,'" + targetText1 + "')]")).click();
             System.out.println("Clicking on: " + targetText1);
             
        MobileElement element1 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/tv_answer"));
             String ANSWER11 = ((WebElement) element1).getText();  // No need to cast to WebElement
             System.out.println("TC07- Answer in light mode is " + ANSWER11);

         if (ANSWER1.equals(ANSWER11)) {
        	 clickAndWaitForElementWithXpath1("//*[contains(@text,'Close')]");
             System.out.println("TC05- Click on close");
        	 
         }
         else
         {
             clickAndWaitForElementWithXpath1("//*[contains(@text,'Data Saver')]");

         }
         
         
     } 
     else
     {
         clickAndWaitForElementWithXpath1("//*[contains(@text,'Data Saver')]");
     }

}
    
    
    
    
    
    
    @Test(priority =16)
    public void WalletFromHomePage16() throws InterruptedException {
    	
    	if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView"))
    	 {
    		clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView");
    	 
   		System.out.println("TC02- Open wallet from homepage top bar");
   		Thread.sleep(2000);
    	 }
    	else
    	{
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_menu_item");
       		System.out.println("TC03- Open wallet from homepage top bar");


    	}

   		driver.findElement(By.xpath("//*[contains(@text,'Add Money')]")).click();
   		System.out.println("TC03- Click on Add money");
   		Thread.sleep(1000);
   		driver.navigate().back();
   		Thread.sleep(1000);
   		driver.navigate().back();
    	OpenCentralReeltab();

    }
    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
	@AfterMethod	
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}



