package Trial;


import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

public class Sharecount_Script<MobileElement, Rotatable> extends Functions {


	
  
    


   
    
    
    
    @Test(priority = 01)
    public void ShareCountOnLiveStreamHomePage01() throws InterruptedException, MalformedURLException {

        if (isVisibleWithXPath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button")) {
            clickAndWaitForElementWithXpath1(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
            System.out.println("TC01- Pro stream opened");
            Thread.sleep(1000);

        } 
        else 
        {
            driver.findElement(By.xpath("//*[contains(@text,'Following')]")).click();
            System.out.println("TC02- Following tab opened");
            Thread.sleep(1000);
        }
        

       TestShareCount();
     
    }     
    
    
    
    @Test(priority = 02)
    public void ShareCountOnLiveStreaSearch02() throws InterruptedException, MalformedURLException {

    	 clickAndWaitForElementWithXpath1(
                 "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView");
         System.out.println("TC01- Open Search");
         Thread.sleep(3000);
         clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
         System.out.println("TC02- Click on search box");
         Thread.sleep(3000);
         (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("BGMI");
         System.out.println("TC03- Type BGMI in search");
         Thread.sleep(3000);   
         driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
 		System.out.println("TC05- Click on ENTER");
        Thread.sleep(5000);   
         driver.findElement(By.xpath("//*[contains(@text,'Live')]")).click();
         System.out.println("TC04- Click on Live tab");
         Thread.sleep(5000);
       
        

       TestShareCount();
     
    }     
        
    
    
    
    
    
        
	

}



