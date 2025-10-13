package Trial;


import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GiftStickerandMagicChat_Script<MobileElement, Rotatable>  extends Functions {


  
  
    
    
    @Test(priority = 01)
    public void GiftStickerUI1() throws InterruptedException, MalformedURLException {

    
    	OpenLivetStream();
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_gift_donation");
        System.out.println("TC03- Open donation box");
        Thread.sleep(1000);
        MobileElement element1 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/tv_diamonds"));
        String DiamondCount1 = ((WebElement) element1).getText();
        System.out.println("TC04- Donation Diamond count is " + DiamondCount1);
        Thread.sleep(500);

        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_diamonds");
        System.out.println("TC05- Click on Diamond count");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        if (isVisibleWithId("com.threesixteen.app:id/donation_progress"))  {
        clickAndWaitForElementWithId("com.threesixteen.app:id/donation_progress");
        System.out.println("TC06- Donation progress bar is visible");   
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/txt_donation_goal_amount");
        System.out.println("TC07- Donation Goal count is visible");  
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/txt_donated_amount");
        System.out.println("TC08- Donation given coount is visible"); 
        Thread.sleep(1000);
        }
        else
        {
            System.out.println("TC07A- Donation Goal Not defined");  

        }
     
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_arrow_sticker");
            System.out.println("TC09- Click on Gift Sticker");        	
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_diamonds");
            System.out.println("TC10- Diamond count coming");        	
            Thread.sleep(1000);        
            driver.navigate().back();
            Thread.sleep(1000);
            
            
            MobileElement element2 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/tv_diamonds"));
            String DiamondCount11 = ((WebElement) element2).getText();
            System.out.println("TC11- GS Diamond count is " + DiamondCount11);
            Thread.sleep(1000);


            int difference1 = Integer.parseInt(DiamondCount1) - Integer.parseInt(DiamondCount11);
            if (difference1 == 0) {
                System.out.println("TC12- Diamond count is matching Between Gift sticker and donation box bottom sheet");        	

            }
            else
            {
            	
            	  clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
                  System.out.println("TC13- Share count count mismatched Between Gift sticker and donation box bottom sheet");
            }

            
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_diamonds");
            System.out.println("TC14- Diamond count coming");
            Thread.sleep(1000);

            MobileElement element21 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/tv_gems"));
            String DiamondCount111 = ((WebElement) element21).getText();
            System.out.println("TC15-  Diamond count is " + DiamondCount111);
            Thread.sleep(1000);
            driver.navigate().back();
            
            
            int difference11 = Integer.parseInt(DiamondCount1) - Integer.parseInt(DiamondCount111);
            if (difference11 == 0) {
            	
                System.out.println("TC16- Gift sticker Diamond count is matching from Buy diamond page Diamond log");        	

            }
            else
            {
            	
            	  clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
                  System.out.println("TC17-Share count count mismatched from Buy diamond page Diamond log");
            }
         
        	  clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.GridView/android.view.ViewGroup[1]/android.widget.ImageView");
        	  System.out.println("TC18- Gift sticker coming from BE");
              Thread.sleep(1000);
        	  if (isVisibleWithId("com.threesixteen.app:id/btn_buy"))
        	  {
	               System.out.println("TC19- Gift Button is visible");
	              Thread.sleep(1000);
	        	  driver.navigate().back();
	              Thread.sleep(1000);
	               System.out.println("TC20- Exist from gift sticker");

              }
        	  clickAndWaitForElementWithId("com.threesixteen.app:id/iv_gift_donation");
              System.out.println("TC21- Click on Donation box");
              Thread.sleep(1000);
              clickAndWaitForElementWithId("com.threesixteen.app:id/iv_arrow_magic_chat");
              System.out.println("TC22- Click on Gift Magic chat");
              Thread.sleep(1000);

              
              MobileElement element211 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/tv_diamonds"));
              String DiamondCount1111 = ((WebElement) element211).getText();
              System.out.println("TC23-  Magic chat Diamond count is " + DiamondCount1111);
              Thread.sleep(1000);
              driver.navigate().back();
              Thread.sleep(1000);
              
              
              int difference111 = Integer.parseInt(DiamondCount1) - Integer.parseInt(DiamondCount1111);
              if (difference111 == 0) {
              	
                  System.out.println("TC24- Magic chat Diamond count is matching from Gift sticker & Buy diamond page Diamond log");        	

              }
              else
              {
                  Thread.sleep(1000);
              	  clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
                    System.out.println("TC25- Magic chat count mismatched from Gift sticker & Buy diamond page Diamond log");
              }
           

    }
    
    
    
    
    
    
    
    
    
    
    
    
    @Test(priority = 02)
    public void MagicChatUI02() throws InterruptedException, MalformedURLException {
    	
    	OpenLivetStream();
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_gift_donation");
        System.out.println("TC01- Click on Donation box");
        Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_arrow_magic_chat");
            System.out.println("TC02- Click on Gift Magic chat");
            Thread.sleep(1000);
//            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_magicChatGif");
//            System.out.println("TC04- Click on Magic chat Preview image");

            MobileElement element2 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView"));
            String DiamondCount2 = ((WebElement) element2).getText();
//            System.out.println("TC05- 1st Magic chat's Diamond count is " + DiamondCount2);
            Thread.sleep(1000);
            if (Integer.parseInt(DiamondCount2) == 250) {
                System.out.println("TC03- 1st magic chat is 250 Diamond's Magic chat");        	
            }
            else
            {        	
            	  clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
                  System.out.println("TC03- 1st is not 250 Diamond's Magic chat");
            }
            Thread.sleep(1000);
            
            MobileElement element21 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView"));
            String DiamondCount21 = ((WebElement) element21).getText();
//            System.out.println("TC08- 2nd Magic chat's Diamond count is " + DiamondCount21);
            
            Thread.sleep(1000);
            if (Integer.parseInt(DiamondCount21) == 400) {
                System.out.println("TC04- 2nd is 400 Diamond's Magic chat");        	
            }
            else
            {        
                Thread.sleep(1000);
            	  clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
                  System.out.println("TC04- 2nd is 400 Diamond's Magic chat");
            }     
            Thread.sleep(1000);
            MobileElement element22 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView"));
            String DiamondCount22 = ((WebElement) element22).getText();
//            System.out.println("TC11- 3rd Magic chat Diamond count is " + DiamondCount22);
            Thread.sleep(1000);

            if (Integer.parseInt(DiamondCount22) == 500) {
                System.out.println("TC05- 3rd is 500 Diamond's Magic chat");        	
            }
            else
            {        	
                Thread.sleep(1000);
            	  clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
                  System.out.println("TC05- 3rd is 500 Diamond's Magic chat");
            }
            Thread.sleep(1000);
            MobileElement element23 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView"));
            String DiamondCount23 = ((WebElement) element23).getText();
//            System.out.println("TC11- 4th Magic chat Diamond count is " + DiamondCount23);
        
            Thread.sleep(1000);

            if (Integer.parseInt(DiamondCount23) == 750) {
                System.out.println("TC06- 4th is 750 Diamond's Magic chat");        	
            }
            else
            {        	
            	  clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
                  System.out.println("TC06- 4th is 750 Diamond's Magic chat");
            }
            
            Thread.sleep(1000);

            MobileElement element24 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView"));
            String DiamondCount24 = ((WebElement) element24).getText();
//            System.out.println("TC11- 45h Magic chat Diamond count is " + DiamondCount24);
            
            Thread.sleep(1000);

            if (Integer.parseInt(DiamondCount24) == 1000) {
                System.out.println("TC07- 5th is 1000 Diamond's Magic chat");        	
            }
            else
            {        
                Thread.sleep(1000);
            	  clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
                  System.out.println("TC07- 5th is 1000 Diamond's Magic chat");
            }
    }
    
        
    
    
    
    
    
        
	
	
	
    }




