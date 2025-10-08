package Trial;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.*;

public class Subscription_Script<MobileElement, Rotatable> extends Functions {


	




//
//
//	@Test(priority =1)
//    public void CancelleduserSubscriptionPack1Dupgrade1() throws InterruptedException {
//
//        OpenSideNav();
//        Thread.sleep(1000); 
//        String targetText = "Upgrade Pro";
//        boolean textFound = false;
//        int maxScrolls = 5; 
//
//        for (int i = 0; i < maxScrolls && !textFound; i++) {
//            try {
//                driver.findElement(
//               		 AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + targetText + "\"))"));         
//                textFound = true;
//                System.out.println("TC02- Product description scrolled and found");
//            } catch (Exception e) {
//                driver.findElement(
//                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
//                Thread.sleep(5000); 
//            }
//        }
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
//        System.out.println("Clicking on: " + targetText);
//        Thread.sleep(1000); 
//        clickAndWaitForElementWithXpath1("//*[contains(@text,'Current Plan')]");
//        System.out.println("TC03- current plan text is visible");
//        Thread.sleep(1000); 
//        clickAndWaitForElementWithXpath1("//*[contains(@text,'Next payment date')]");
//        System.out.println("TC04- Next payment is visible");
//        Thread.sleep(1000);   
//        if (isVisibleWithXPath1("//*[contains(@text,'Subscribe Again')]")) {
//        clickAndWaitForElementWithXpath1("//*[contains(@text,'Subscribe Again')]");
//        }
//        else
//        {
//        Thread.sleep(1000);
//        clickAndWaitForElementWithXpath1("//android.view.View[@content-desc=\"Rooter Upgrade Plan Rooter\"]");
//        }
//        System.out.println("TC06- Click on Subscribe Again");
//        Thread.sleep(1000);  
//        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]/android.view.View[1]/android.widget.Button[1]")) {
//            Thread.sleep(1000);
//	        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]/android.view.View[1]/android.widget.Button[1]")).click(); 
//            Thread.sleep(1000);
//	        driver.findElement(By.xpath("//*[contains(@text,'Buy for ₹39')]")).click(); 
//	        }
//	        	else
//	        	{
//	                Thread.sleep(1000); 
//	                clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]/android.widget.Button[1]");
//	        	}
//	             System.out.println("TC09- click on buy for 1Day pack");
//	         }
//    
//	
//	
//	 
//
//	  @Test(priority = 2)
//	  public void CancelleUsercanSubscription7dPack02() throws InterruptedException {
//
//	      OpenSideNav();
//	    	  String targetText1 = "Pro";
//	          boolean textFound1 = false;
//	          int maxScrolls1 = 3; 
//
//	          for (int i = 0; i < maxScrolls1 && !textFound1; i++) {
//	              try {
//	                  driver.findElement(
//	                 		 AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + targetText1 + "\"))"));         
//	                  textFound1 = true;
//	                  System.out.println("TC02- Product description scrolled and found");
//	              } catch (Exception e) {
//	                  driver.findElement(
//	                      AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
//	                  Thread.sleep(1000); 
//	              }
//	          }
//	          driver.findElement(By.xpath("//*[contains(@text,'" + targetText1 + "')]")).click();
//	          System.out.println("Clicking on: " + targetText1);
//	          Thread.sleep(1000);
//	          clickAndWaitForElementWithXpath1("//*[contains(@text,'Current Plan')]");
//	          System.out.println("TC03- current plan text is visible");
//	          Thread.sleep(1000); 
//	          clickAndWaitForElementWithXpath1("//*[contains(@text,'Next payment date')]");
//	          System.out.println("TC04- Next payment is visible");
//	          Thread.sleep(1000);   
//	          if (isVisibleWithXPath1("//*[contains(@text,'Subscribe Again')]")) {
//	          clickAndWaitForElementWithXpath1("//*[contains(@text,'Subscribe Again')]");
//	          }
//	          else
//	          {
//	          Thread.sleep(1000);
//	          clickAndWaitForElementWithXpath1("//android.view.View[@content-desc=\"Rooter Upgrade Plan Rooter\"]");
//	          }
//	          System.out.println("TC05- Click on Subscribe Again");
//	          Thread.sleep(1000); 
//		    	
//	          if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]/android.view.View[1]/android.widget.Button[2]")) {
//	              Thread.sleep(1000);
//	  	        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]/android.view.View[1]/android.widget.Button[2]")).click(); 
//	              Thread.sleep(1000);
//	  	        driver.findElement(By.xpath("//*[contains(@text,'Buy for ₹59')]")).click(); 
//	  	        }
//	  	        	else
//	  	        	{
//	  	                Thread.sleep(1000); 
//	  	                clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]/android.widget.Button[1]");
//	  	        	}
//	  	             System.out.println("TC06- click on buy for 7Day pack");
//	  	         }
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  private boolean isvisibleWithXpath1(String string) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//
//
//
//	@Test(priority =3)
//	  public void CancelledUserSubscription30daysPack03() throws InterruptedException {
//
//
//	      OpenSideNav();
//	      String targetText = "Pro";
//	      boolean textFound = false;
//	      int maxScrolls = 3; 
//
//	      for (int i = 0; i < maxScrolls && !textFound; i++) {
//	          try {
//	              driver.findElement(
//	             		 AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + targetText + "\"))"));         
//	              textFound = true;
//	              System.out.println("TC02- Product description scrolled and found");
//	          } catch (Exception e) {
//	              driver.findElement(
//	                  AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
//	              Thread.sleep(1000); 
//	          }
//	      }
//	      if (isVisibleWithXPath1("//*[contains(@text,'" + targetText + "')]")) {
//	      driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
//	      System.out.println("Clicking on: " + targetText);
//	      Thread.sleep(1000); 
//	      clickAndWaitForElementWithXpath1("//*[contains(@text,'Current Plan')]");
//          System.out.println("TC03- current plan text is visible");
//          Thread.sleep(1000); 
//          clickAndWaitForElementWithXpath1("//*[contains(@text,'Next payment date')]");
//          System.out.println("TC04- Next payment is visible");
//          Thread.sleep(1000); 
//	      if (isVisibleWithXPath1("//*[contains(@text,'Subscribe Again')]")) {
//	          clickAndWaitForElementWithXpath1("//*[contains(@text,'Subscribe Again')]");
//	          }
//	          else
//	          {
//	          Thread.sleep(1000);
//	          clickAndWaitForElementWithXpath1("//android.view.View[@content-desc=\"Rooter Upgrade Plan Rooter\"]");
//	          }
//	          System.out.println("TC05- Click on Subscribe Again");
//	          Thread.sleep(1000); 
//		    	
//		    	
//	          if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]/android.view.View[1]/android.widget.Button[3]")) 
//	          {
//	              Thread.sleep(1000);
//	  	        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]/android.view.View[1]/android.widget.Button[3]")).click(); 
//	              Thread.sleep(1000);
//	  	        driver.findElement(By.xpath("//*[contains(@text,'Buy for ₹110 129 15% Off')]")).click(); 
// 	             System.out.println("TC07- click on buy for 30Day pack");
//
//	  	        }
//	  	        	else
//	  	        	{
//	  	                Thread.sleep(1000); 
//	  	              clickAndWaitForElementWithXpath1("//*[contains(@text,'Missed')]");
//	  	             System.out.println("TC07- click on buy for 1Day pack");
//	  	         }
//	          }
//	      
//	      }
//
//	 
//	  
//	  @Test(priority =4)
//	  public void CancelledUserSubscription365DayPack04() throws InterruptedException {
//
//	      OpenSideNav();
//	      String targetText = "Pro";
//	      boolean textFound = false;
//	      int maxScrolls = 3; 
//
//	      for (int i = 0; i < maxScrolls && !textFound; i++) {
//	          try {
//	              driver.findElement(
//	             		 AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + targetText + "\"))"));         
//	              textFound = true;
//	              System.out.println("TC02- Product description scrolled and found");
//	          } catch (Exception e) {
//	              driver.findElement(
//	                  AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
//	              Thread.sleep(1000); 
//	          }
//	      }
//	      if (isVisibleWithXPath1("//*[contains(@text,'" + targetText + "')]")) {
//	      driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
//	      System.out.println("Clicking on: " + targetText);
//	      Thread.sleep(1000); 
//	      clickAndWaitForElementWithXpath1("//*[contains(@text,'Current Plan')]");
//          System.out.println("TC03- current plan text is visible");
//          Thread.sleep(1000); 
//          clickAndWaitForElementWithXpath1("//*[contains(@text,'Next payment date')]");
//          System.out.println("TC04- Next payment is visible");
//          Thread.sleep(1000); 
//	    
//	          if (isVisibleWithXPath1("//*[contains(@text,'Subscribe Again')]")) {
//		          clickAndWaitForElementWithXpath1("//*[contains(@text,'Subscribe Again')]");
//		          }
//		          else
//		          {
//		          Thread.sleep(1000);
//		          clickAndWaitForElementWithXpath1("//android.view.View[@content-desc=\"Rooter Upgrade Plan Rooter\"]");
//		          }
//		          System.out.println("TC06- Click on Subscribe Again");
//		          Thread.sleep(1000); 
//			    	
//		          driver.findElement(AppiumBy.androidUIAutomator(
//		            	    "new UiScrollable(new UiSelector().text(\"Buy for ₹110 129 15% Off\")).setAsHorizontalList().scrollForward(3)"));
//		            	System.out.println("TC04- scroll left for more packs ");
//		            	Thread.sleep(2000);
//		     
//		          if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]/android.view.View[1]/android.widget.Button[3]")) {
//		              Thread.sleep(1000);
//		  	        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]/android.view.View[1]/android.widget.Button[3]")).click(); 
//		              Thread.sleep(1000);
//		  	        driver.findElement(By.xpath("//*[contains(@text,'Buy for ₹1299')]")).click(); 
//	  	             System.out.println("TC05- click on buy for 365Day pack");
//
//		  	        }
//		  	        	else
//		  	        	{
//		  	                Thread.sleep(1000); 
//			  	              clickAndWaitForElementWithXpath1("//*[contains(@text,'Missed')]");		  	        	
//		  	             System.out.println("TC06- 365D Pack no found");
//		  	         }
//		          }
//		      
//		      }
//	  
//	  
	  
	
    
    
//    
//    
//    @Test(priority =5)
//    public void LogoutandLoginwithweeklysubscritpionpackuse05() throws InterruptedException 
//    
//    
//    {
//    	
//        OpenSideNav();
//        Thread.sleep(2000); 
//        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_arrow_username_lrps");
//        System.out.println("TC02- open profile");
//        Thread.sleep(2000); 
//        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView")) {
//        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView")).click();
//        Thread.sleep(2000); 
//        driver.findElement(By.xpath("//*[contains(@text,'Edit Channel')]")).click();
//        System.out.println("TC04- Click on Edit channel");
//        Thread.sleep(2000); 
//
//        }
//        else
//        {
//            Thread.sleep(2000); 
//        	   clickAndWaitForElementWithId(
//                       "com.threesixteen.app:id/iv_settings");
//               System.out.println("TC03- Click on three dots");
//               Thread.sleep(2000); 
//            driver.findElement(By.xpath("//*[contains(@text,'Edit Channel')]")).click();
//            System.out.println("TC04- Click on Edit channel");
//            Thread.sleep(2000); 
//        }
//        Thread.sleep(2000); 
//        driver.findElement(AppiumBy.androidUIAutomator(
//	            "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));
//        Thread.sleep(2000); 
//        driver.findElement(By.xpath("//*[contains(@text,'Logout')]")).click();
//        System.out.println("TC05- Click on Logout");
//        Thread.sleep(2000); 
//        driver.findElement(By.xpath("//*[contains(@text,'Yes')]")).click();
//        Thread.sleep(2000); 
//        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView");
//        Thread.sleep(5000); 
//
//        driver.findElement(By.xpath("//*[contains(@text,'harshitmishra382@gmail.com')]")).click();
//        System.out.println("TC06- Click on Gmail");
//        Thread.sleep(5000); 
//        if (isVisibleWithXPath1("//*[contains(@text,'Spin & Win')]")) 
//        {
//        driver.findElement(By.xpath("//*[contains(@text,'Spin & Win')]")).click();
//        System.out.println("TC06- Click on spin wheel");
//        Thread.sleep(20000);
//        driver.navigate().back();
//        Thread.sleep(2000); 
//        }
//        
//    }
//    
//    
//    
//    
//    
//    
//    @Test(priority = 6)
//    public void SubscriptionUpgradeFromWeeklyPack06() throws InterruptedException {
//
//        OpenSideNav();
//        Thread.sleep(1000); 
//        String targetText = "Upgrade Pro";
//        boolean textFound = false;
//        int maxScrolls = 5; 
//        Thread.sleep(1000); 
//        for (int i = 0; i < maxScrolls && !textFound; i++) {
//            try {
//                driver.findElement(
//               		 AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + targetText + "\"))"));         
//                textFound = true;
//                System.out.println("TC02- Product description scrolled and found");
//            } catch (Exception e) {
//                driver.findElement(
//                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
//                Thread.sleep(1000); 
//            }
//        }
//        Thread.sleep(1000); 
//        driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
//        System.out.println("Clicking on: " + targetText);
//        Thread.sleep(3000); 
//        
//     		if( isVisibleWithXPath1("//android.view.View[@content-desc=\"Rooter Upgrade Plan Rooter\"]")) {
//        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Rooter Upgrade Plan Rooter\"]")).click();
//        System.out.println("TC06- Click on upgrade plan");
//     		}
//     		else
//     		{
//     			 driver.findElement(By.xpath("//android.view.View[@content-desc=\"Rooter Upgrade Plan Rooter\"]/android.widget.Image[2]")).click();
//     	        System.out.println("TC06- Click on upgrade plan by arrow");
//     		}
//        Thread.sleep(1000); 
//
//        if (isVisibleWithXPath1("//*[contains(@text,'Rooter ₹99/month Subscription')]")) 
//           {
//               driver.findElement(By.xpath("//*[contains(@text,'Rooter ₹99/month Subscription')]")).click(); 
//               Thread.sleep(1000); 
//               driver.findElement(By.xpath("//*[contains(@text,'Buy for ₹99 129 23% Off')]")).click(); 
//
//               System.out.println("TC09- click on buy for 1 Month pack");
//
//        	}
//        	else
//        	{
//                clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//        	}
//        }
//   
//   
//    
//    
//    
//    @Test(priority =7)
//    public void Subscriptionupgrade6monthfromweeklyPack7() throws InterruptedException {
//    	
//
//        OpenSideNav();
//        Thread.sleep(1000); 
//        String targetText = "Upgrade Pro";
//        boolean textFound = false;
//        int maxScrolls = 5; 
//
//        for (int i = 0; i < maxScrolls && !textFound; i++) {
//            try {
//                driver.findElement(
//               		 AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + targetText + "\"))"));         
//                textFound = true;
//                System.out.println("TC02- Product description scrolled and found");
//            } catch (Exception e) {
//                driver.findElement(
//                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
//                Thread.sleep(1000); 
//            }
//        }
//        Thread.sleep(1000); 
//        driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
//        System.out.println("Clicking on: " + targetText);
//        Thread.sleep(2000); 
//    
//        if( isVisibleWithXPath1("//android.view.View[@content-desc=\"Rooter Upgrade Plan Rooter\"]")) {
//            driver.findElement(By.xpath("//android.view.View[@content-desc=\"Rooter Upgrade Plan Rooter\"]")).click();
//            System.out.println("TC06- Click on upgrade plan");
//         		}
//         		else
//         		{
//         			 driver.findElement(By.xpath("//android.view.View[@content-desc=\"Rooter Upgrade Plan Rooter\"]/android.widget.Image[2]")).click();
//         	        System.out.println("TC06- Click on upgrade plan by arrow");
//         		}
//        Thread.sleep(1000); 
//
//        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]/android.view.View[1]/android.widget.Button[2]")) 
//           {
//               driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]/android.view.View[1]/android.widget.Button[2]")).click(); 
//               Thread.sleep(1000); 
//               Thread.sleep(1000); 
//               driver.findElement(By.xpath("//*[contains(@text,'Buy for ₹499 599 17% Off')]")).click(); 
//               System.out.println("TC09- click on buy for 6 Month pack");
//        	}
//        	else
//        	{
//                clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//        	}
//        }
//       
//
//    
//
//    
//    
//  
//    
//    
// 
//    
//    
//  
    
    
    
//    
//    @Test(priority = 8)
//    public void Logout8() throws InterruptedException 
//    
//    
//    {
//    	
//        OpenSideNav();
//       
//            driver.findElement(By.xpath("//*[contains(@text,'Settings')]")).click();
//            System.out.println("TC04- Click on Settings");
//            Thread.sleep(5000); 
//        driver.findElement(AppiumBy.androidUIAutomator(
//	            "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));
//        Thread.sleep(2000); 
//        driver.findElement(By.xpath("//*[contains(@text,'Logout')]")).click();
//        System.out.println("TC05- Click on Logout");
//        Thread.sleep(2000); 
//        driver.findElement(By.xpath("//*[contains(@text,'Yes')]")).click();
//        Thread.sleep(2000); 
//        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView");
//        System.out.println("TC06- Click on Gmail");
//        Thread.sleep(2000); 
//        driver.navigate().back();
//
//       
//        
//    }
//    
    
    
    @Test(priority = 9)
    public void LoginWithNewUser9() throws InterruptedException 
    
     {
    	if (isVisibleWithId("com.threesixteen.app:id/et_mobile")) {
        clickAndWaitForElementWithId("com.threesixteen.app:id/et_mobile");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Choose an Account\"]/android.widget.LinearLayout/android.widget.Button")).click();
        Thread.sleep(10000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_mobile")).sendKeys("3333333404");
		System.out.println("TC03- Type Phone Number in box");
        Thread.sleep(10000);
	    driver.findElement(By.xpath("//*[contains(@text,'Continue')]")).click();
		System.out.println("TC03- Click on continue");
        Thread.sleep(10000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/et_otp");
        Thread.sleep(10000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_otp")).sendKeys("000000");
		System.out.println("TC03- Type OTP in box");
        Thread.sleep(10000);
        if( isVisibleWithId("com.threesixteen.app:id/btn_verify"))
        {
        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_verify");
		System.out.println("TC03- Click on verifi now");
        Thread.sleep(10000);
        }
        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.GridView/android.widget.FrameLayout[3]/android.view.ViewGroup/android.widget.ImageView")) 
        {
		clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.GridView/android.widget.FrameLayout[3]/android.view.ViewGroup/android.widget.ImageView");
        System.out.println("TC06- Select game");
        Thread.sleep(10000);
        }
        if  (isVisibleWithXPath1("//*[contains(@text,'Done')]"))  {
	    driver.findElement(By.xpath("//*[contains(@text,'Done')]")).click();
        System.out.println("TC06- Click on Done");
        Thread.sleep(10000);
        }
        if (isVisibleWithXPath1("//*[contains(@text,'Spin & Win')]")) 
        {
        driver.findElement(By.xpath("//*[contains(@text,'Spin & Win')]")).click();
        System.out.println("TC06- Click on spin wheel");
        Thread.sleep(20000);
        driver.navigate().back();
        driver.navigate().back();

        Thread.sleep(10000);
        driver.navigate().back();

        System.out.println("TC06- exist from spin wheel loop");

        }
        OpenSideNav();
    	}
    	else 
    	{
    		 OpenSideNav();
    	        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_arrow_username_lrps");
    	        System.out.println("TC02- open profile");
    	        Thread.sleep(1000); 
    	 
    	        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView")) {
    	        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView")).click();
    	        driver.findElement(By.xpath("//*[contains(@text,'Edit Channel')]")).click();
    	        System.out.println("TC04- Click on Edit channel");
    	        Thread.sleep(1000); 
    	        }
    	        else
    	        {
    	        	   clickAndWaitForElementWithId(
    	                       "com.threesixteen.app:id/iv_settings");
    	               System.out.println("TC03- Click on three dots");
    	               Thread.sleep(5000); 
    	            driver.findElement(By.xpath("//*[contains(@text,'Edit Channel')]")).click();
    	            System.out.println("TC04- Click on Edit channel");
    	            Thread.sleep(5000); 
    	        }
    	        driver.findElement(AppiumBy.androidUIAutomator(
    		            "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));
    	        Thread.sleep(2000); 
    	        driver.findElement(By.xpath("//*[contains(@text,'Logout')]")).click();
    	        System.out.println("TC05- Click on Logout");
    	        Thread.sleep(2000); 
    	        clickAndWaitForElementWithId("com.threesixteen.app:id/et_mobile");
    	        Thread.sleep(10000);
	    driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Choose an Account\"]/android.widget.LinearLayout/android.widget.Button")).click();
        Thread.sleep(10000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_mobile")).sendKeys("3333333403");
		System.out.println("TC03- Type Phone Number in box");
        Thread.sleep(10000);
	    driver.findElement(By.xpath("//*[contains(@text,'Continue')]")).click();
		System.out.println("TC03- Click on continue");
        Thread.sleep(10000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/et_otp");
        Thread.sleep(10000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_otp")).sendKeys("000000");
		System.out.println("TC03- Type OTP in box");
        Thread.sleep(10000);
        if( isVisibleWithId("com.threesixteen.app:id/btn_verify"))
        {
        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_verify");
		System.out.println("TC03- Click on verifi now");
        Thread.sleep(10000);
        }
        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.GridView/android.widget.FrameLayout[3]/android.view.ViewGroup/android.widget.ImageView")) 
        {
		clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.GridView/android.widget.FrameLayout[3]/android.view.ViewGroup/android.widget.ImageView");
        System.out.println("TC06- Select game");
        Thread.sleep(10000);
        }
        if  (isVisibleWithXPath1("//*[contains(@text,'Done')]"))  {
	    driver.findElement(By.xpath("//*[contains(@text,'Done')]")).click();
        System.out.println("TC06- Click on Done");
        Thread.sleep(10000);
        }
        if (isVisibleWithXPath1("//*[contains(@text,'Spin & Win')]")) 
        {
        driver.findElement(By.xpath("//*[contains(@text,'Spin & Win')]")).click();
        System.out.println("TC06- Click on spin wheel");
        Thread.sleep(20000);
        driver.navigate().back();
        }
//        OpenSideNav();
        
    	}

   }
    
    
    
    
    @SuppressWarnings("unchecked")
//   	@Test(priority = 10)
//       public void NewUserSubscription1DayPack10() throws InterruptedException  {
//
//       	
//       OpenSideNav();
//       Thread.sleep(1000); 
//       String targetText = "Buy Pro";
//       boolean textFound = false;
//       int maxScrolls = 5; 
//       for (int i = 0; i < maxScrolls && !textFound; i++) {
//           try {
//               driver.findElement(	
//              		 AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + targetText + "\"))"));         
//               textFound = true;
//               System.out.println("TC02- Product description scrolled and found");
//           } catch (Exception e) {
//               driver.findElement(
//                   AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
//               Thread.sleep(1000); 
//           }
//       }
//       Thread.sleep(1000); 
//       driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
//       System.out.println("Clicking on: " + targetText);
//       Thread.sleep(3000); 
//       
//       if (isVisibleWithXPath1("//*[contains(@text,'₹39 1 day')]"))
//       		{
//           System.out.println("TC09- 1d pack found ");
//           driver.findElement(By.xpath("//*[contains(@text,'₹39 1 day')]")).click(); 
//           Thread.sleep(1000); 
//       driver.findElement(By.xpath("//*[contains(@text,'Buy for ₹39')]")).click(); 
//       System.out.println("TC09- click on buy for 1Day pack");
//       Thread.sleep(1000); 
//
//       }
//       	else
//       	{
//       	 if (isVisibleWithXPath1("//*[contains(@text,'Rooter ₹99/month Subscription')]")) 
//         {
//             driver.findElement(By.xpath("//*[contains(@text,'Rooter ₹99/month Subscription')]")).click(); 
//             Thread.sleep(1000); 
//             driver.findElement(By.xpath("//*[contains(@text,'Buy for ₹99 129 23% Off')]")).click(); 
//
//             System.out.println("TC09- click on buy for 1 Month pack");
//
//      	}
//      	else
//      	{
//              clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//      	}
//      }
//       	
//           }
//       
//    
//        
//    
//    
//
//    
//    
    
 @Test(priority = 11)
    
    
    public void NonProNewUserHomepageTabsDataCheck11() throws InterruptedException 
    
  {	     
	    Thread.sleep(1000); 

//        if(isVisibleWithXPath1("//*[contains(@text,'Following')]")) {
//              clickAndWaitForElementWithXpath1("//*[contains(@text,'Following')]");
//  	        System.out.println("TC01- Following tab opened");
//  	      	Thread.sleep(5000);
//  	  		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
//            System.out.println("TC02- Feed Present in Follwoing Tab");
//  	      	Thread.sleep(5000);
//  	      	driver.navigate().back();
//  	      	Thread.sleep(5000);

        if (isVisibleWithXPath1("//*[contains(@text,'Missed')]")) {
        
          clickAndWaitForElementWithXpath1("//*[contains(@text,'Pro Streams')]");
      	    System.out.println("TC01- Pro tab opened");
      	    Thread.sleep(1000); 
	  		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
            System.out.println("TC02- Feed Present in Tab");
      	    Thread.sleep(1000); 
	      	driver.navigate().back();
      	    Thread.sleep(1000); 
	      	
	          clickAndWaitForElementWithXpath1("//*[contains(@text,'Following')]");
	      	    System.out.println("TC03- Following tab opened");
	      	    Thread.sleep(1000); 
	      	    
	      	    
	      	  if (isVisibleWithId("com.threesixteen.app:id/player_layout")) {
				    clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
		            System.out.println("TC12- Feed Present in Tab");
			      	Thread.sleep(1000);
			      	driver.navigate().back();
			      	Thread.sleep(1000);
				    }
				    else
				    {
				      	Thread.sleep(1000);
					    clickAndWaitForElementWithId("com.threesixteen.app:id/btn_try_again");
			            System.out.println("TC13- click on watch other streanms ");

				    }
		      
		      	
		          clickAndWaitForElementWithXpath1("//*[contains(@text,'Videos')]");
	      	    System.out.println("TC05- Videos tab opened");
	      	    Thread.sleep(1000); 
		  		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
	            System.out.println("TC06- Feed Present in  Tab");
	      	    Thread.sleep(2000); 
		      	driver.navigate().back();
	      	    Thread.sleep(2000); 
		      	driver.navigate().back();
	      	    Thread.sleep(7000); 

		      	
	      	  driver.findElement(AppiumBy.androidUIAutomator(
			            "new UiScrollable(new UiSelector().text(\"Missed\")).setAsHorizontalList().scrollForward()"));
	            System.out.println("TC06- scrolled missed");

	      	    driver.findElement(AppiumBy.androidUIAutomator(
	      	            "new UiScrollable(new UiSelector().text(\"Videos\")).setAsHorizontalList().scrollForward(2)"));
	            System.out.println("TC06- scrolled videos");
		    driver.findElement(AppiumBy.androidUIAutomator(
		            "new UiScrollable(new UiSelector().text(\"Esports\")).setAsHorizontalList().scrollForward()"));

				    System.out.println("TC07- scroll Top Bar");
	    
				    
			          clickAndWaitForElementWithXpath1("//*[contains(@text,'Missed')]");
		      	    System.out.println("TC08- Missed tab opened");
		      	    Thread.sleep(1000); 
			  		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
		            System.out.println("TC09- Feed Present in Tab");
		      	    Thread.sleep(1000); 
			      	driver.navigate().back();
		      	    Thread.sleep(1000); 
			      	
		      	  driver.findElement(AppiumBy.androidUIAutomator(
				            "new UiScrollable(new UiSelector().text(\"Missed\")).setAsHorizontalList().scrollForward()"));
			      	  driver.findElement(AppiumBy.androidUIAutomator(
					            "new UiScrollable(new UiSelector().text(\"Missed\")).setAsHorizontalList().scrollForward()"));
//				      	  driver.findElement(AppiumBy.androidUIAutomator(
//						            "new UiScrollable(new UiSelector().text(\"Giveaways 💎\")).setAsHorizontalList().scrollForward()"));
//				      	 driver.findElement(AppiumBy.androidUIAutomator(
//						            "new UiScrollable(new UiSelector().text(\"Giveaways 💎\")).setAsHorizontalList().scrollForward()"));
//				      	 driver.findElement(AppiumBy.androidUIAutomator(
//						            "new UiScrollable(new UiSelector().text(\"Giveaways 💎\")).setAsHorizontalList().scrollForward()"));
//				      	 driver.findElement(AppiumBy.androidUIAutomator(
//						            "new UiScrollable(new UiSelector().text(\"Giveaways 💎\")).setAsHorizontalList().scrollForward()"));
							    System.out.println("TC10- scroll Top Bar");
					      	    Thread.sleep(2000); 
				    
			      	
//			      	
//			      	 driver.findElement(AppiumBy.androidUIAutomator(
//					            "new UiScrollable(new UiSelector().text(\"Indoneisa\")).setAsHorizontalList().scrollForward()"));
//			      	    Thread.sleep(2000); 
               if (isVisibleWithXPath1("//*[contains(@text,'Indonesia')]")) {
						    clickAndWaitForElementWithXpath1("//*[contains(@text,'Indonesia')]");
				      	    System.out.println("TC11- indonesia tab opened");
				      	    Thread.sleep(1000); 
						    
						    if (isVisibleWithId("com.threesixteen.app:id/player_layout")) {
						    clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
				            System.out.println("TC12- Feed Present in Tab");
					      	Thread.sleep(1000);
					      	driver.navigate().back();
					      	Thread.sleep(1000);
						    }
						    else
						    {
						      	Thread.sleep(1000);
							    clickAndWaitForElementWithId("com.threesixteen.app:id/btn_try_again");
					            System.out.println("TC13- click on watch other streanms ");

						    }
               }
		    
						    
						    
						    driver.findElement(AppiumBy.androidUIAutomator(
						             "new UiScrollable(new UiSelector().text(\"Videos\")).setAsHorizontalList().scrollForward()"));
						     driver.findElement(AppiumBy.androidUIAutomator(
						              "new UiScrollable(new UiSelector().text(\"Videos\")).setAsHorizontalList().scrollForward()"));
						     driver.findElement(AppiumBy.androidUIAutomator(
						             "new UiScrollable(new UiSelector().text(\"Videos\")).setAsHorizontalList().scrollForward()"));
						     driver.findElement(AppiumBy.androidUIAutomator(
						              "new UiScrollable(new UiSelector().text(\"Videos\")).setAsHorizontalList().scrollForward()"));
						     driver.findElement(AppiumBy.androidUIAutomator(
						             "new UiScrollable(new UiSelector().text(\"Videos\")).setAsHorizontalList().scrollForward()"));
						     driver.findElement(AppiumBy.androidUIAutomator(
						              "new UiScrollable(new UiSelector().text(\"Videos\")).setAsHorizontalList().scrollForward()"));
						     driver.findElement(AppiumBy.androidUIAutomator(
							            "new UiScrollable(new UiSelector().text(\"Missed\")).setAsHorizontalList().scrollForward()"));
						      	  driver.findElement(AppiumBy.androidUIAutomator(
								            "new UiScrollable(new UiSelector().text(\"Missed\")).setAsHorizontalList().scrollForward()"));
						 	    driver.findElement(AppiumBy.androidUIAutomator(
						 	            "new UiScrollable(new UiSelector().text(\"Esports\")).setAsHorizontalList().scrollForward()"));
						 		    driver.findElement(AppiumBy.androidUIAutomator(
						 		            "new UiScrollable(new UiSelector().text(\"Esports\")).setAsHorizontalList().scrollForward()"));
						 			    driver.findElement(AppiumBy.androidUIAutomator(
						 			            "new UiScrollable(new UiSelector().text(\"Missed\")).setAsHorizontalList().scrollForward()"));
						 				   
//										      	  driver.findElement(AppiumBy.androidUIAutomator(
//												            "new UiScrollable(new UiSelector().text(\"Giveaways 💎\")).setAsHorizontalList().scrollForward()"));
//										      	 driver.findElement(AppiumBy.androidUIAutomator(
//												            "new UiScrollable(new UiSelector().text(\"Giveaways 💎\")).setAsHorizontalList().scrollForward()"));
//										      	 driver.findElement(AppiumBy.androidUIAutomator(
//												            "new UiScrollable(new UiSelector().text(\"Giveaways 💎\")).setAsHorizontalList().scrollForward()"));
//										      	 driver.findElement(AppiumBy.androidUIAutomator(
//												            "new UiScrollable(new UiSelector().text(\"Giveaways 💎\")).setAsHorizontalList().scrollForward()"));
													    System.out.println("TC14- scroll Top Bar");
											      	    Thread.sleep(1000); 
											      	    
											      	if (isVisibleWithXPath1("//*[contains(@text,'All Streams')]"))   {
											      	    
											      	  clickAndWaitForElementWithXpath1("//*[contains(@text,'All Streams')]");
											      	    System.out.println("TC15- All streams tab opened");
											      	    Thread.sleep(1000); 
											      	    
											      	    
											      	  driver.findElement(
											                  AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(5)"));
											      	    System.out.println("TC12- All streams scrolled");
											      	  clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
											            System.out.println("TC13- Feed Present in Tab");

					                       	    Thread.sleep(1000);
											      	}
        }
        
        else
        {
            System.out.println("TC14- This is Old Homepage so test stopped ");

        }
        }
        
      
    
    
    
    
 @Test(priority =12)
 public void CreateWalletForNewUser12() throws InterruptedException {
 	
 	    OpenTaskPage();
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_wallet");
		System.out.println("TC02- Open wallet from rewards page");
		Thread.sleep(5000);

		if (isVisibleWithXPath1("//*[contains(@text,'Rooter Wallet')]")) 
		{
		System.out.println("TC03- Create wallet button is visible");
		Thread.sleep(1000);
		driver.navigate().back();
		System.out.println("TC04- Back from walllet");		
		}
		else
		{
    		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
    		System.out.println("TC05- Create wallet button is not  visible");
		}
 }
    
 
 
 
 
 
 
  
	
	@AfterMethod
	
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}



