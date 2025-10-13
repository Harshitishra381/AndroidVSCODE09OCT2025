package Trial;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class SelfProfile_Script<MobileElement, Rotatable> extends Functions {


	
   
 






	@Test(priority = 1)
   public void Threedotsonnprofilepage1() throws InterruptedException {

        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_profile_image");
        System.out.println("TC01- opens side nav");
        clickAndWaitForElementWithId("com.threesixteen.app:id/txt_name");
        System.out.println("TC02- opens self profile");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_profile_share");
        System.out.println("TC03- Click on share icon");
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");
        System.out.println("TC04- Copy profile link");
        clickAndWaitForElementWithId(
                "com.threesixteen.app:id/iv_settings");
        System.out.println("TC05- Click on three dots");
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView");
        System.out.println("TC06- View details stats");
        driver.navigate().back();

    }
    
    
    

    @Test(priority = 2)
    public void SelfprofilefollowerandfollowigllistandUICheck2() throws InterruptedException {

        OpenSideNav();
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/txt_name");
        System.out.println("TC02- opens self profile");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_city");
        System.out.println("TC03- City Name is comming on Profile page");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_since");
        System.out.println("TC04- Channel starting date is comming on Profile page");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/coupon_desc");
        System.out.println("TC05- Profile page Coupons carousal are comming on Profile page");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        if (isVisibleWithXPath1("//*[contains(@text,'Pro Creator')]")) {
        driver.findElement(By.xpath("//*[contains(@text,'Pro Creator')]")).click();
        System.out.println("TC06- Pro creator coming on self profile");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        }
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_followers");
        System.out.println("TC07- Open followers list");
        Thread.sleep(1000);
        driver.findElement(AppiumBy
                .androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(5)"));
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
        System.out.println("TC08- Open profile");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
        System.out.println("TC09- Back from Profile");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Following')]")).click();
        System.out.println("TC10- Open following list");
        Thread.sleep(1000);
        driver.findElement(AppiumBy
                .androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(5)"));
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
        System.out.println("TC11- Open profile");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
        System.out.println("TC12- Back from Profile");
        Thread.sleep(1000);
        driver.navigate().back();

    }

    
    
    
    @Test(priority = 3)
    public void SelfprofileGamePage3() throws InterruptedException {
    	
    	
    	

        OpenSideNav();

        clickAndWaitForElementWithId("com.threesixteen.app:id/txt_name");
        System.out.println("TC02- opens self profile");
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.TextView");
        System.out.println("TC03- Open first game");
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
        System.out.println("TC04-Open profile");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
        System.out.println("TC05- Back from Profile");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
        System.out.println("TC06- Back from frist game");

    }

  
 


    @Test(priority = 4)
    public void SelfProfileGamePage4() throws InterruptedException {

        OpenSideNav();

        clickAndWaitForElementWithId("com.threesixteen.app:id/txt_name");
        System.out.println("TC02- opens self profile");
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView");
        System.out.println("TC03- Open Second game");
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
        System.out.println("TC04-Open profile");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
        System.out.println("TC05- Back from Profile");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
        System.out.println("TC06- Back from Second game");
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView");
        System.out.println("TC07- Open 3rd game");
        Thread.sleep(1000);
        driver.navigate().back();

    }
    
    
    


    @Test(priority = 5)
    public void SelfProfileChangeAppLanguage5() throws InterruptedException, MalformedURLException {

        OpenSideNav();
        clickAndWaitForElementWithId("com.threesixteen.app:id/txt_name");
        System.out.println("TC02- opens self profile");
        clickAndWaitForElementWithId(
                "com.threesixteen.app:id/iv_settings");
        System.out.println("TC05- Click on three dots");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.TextView");
        System.out.println("TC04- Click on Change app language");
        Thread.sleep(1000);
//        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView");
//        System.out.println("TC13- Click on Hindi");
//        Thread.sleep(1000);
//        driver.navigate().back();
//        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_profile_image");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_arrow");
//        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView");
//        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.TextView");
//        System.out.println("TC13A- Click on Change app language");
//        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.TextView");
        System.out.println("TC05- Click on English");
        driver.navigate().back();

    }

  

   
    

   
    

    @Test(priority = 6)
    public void DonationLink6() throws InterruptedException, MalformedURLException {

    	
        OpenSideNav();
        clickAndWaitForElementWithId("com.threesixteen.app:id/txt_name");
        System.out.println("TC02- opens self profile");
        clickAndWaitForElementWithId(
                "com.threesixteen.app:id/iv_settings");
        System.out.println("TC05- Click on three dots");
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.TextView");
        System.out.println("TC04- Click on Donation link");
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout");
        System.out.println("TC05- Copy Donation link");
    }

    
    
    @Test(priority = 7)
    public void ChangeAppLanguage7() throws InterruptedException, MalformedURLException {

    	
        OpenSideNav();
        clickAndWaitForElementWithId("com.threesixteen.app:id/txt_name");
        System.out.println("TC02- opens self profile");
        clickAndWaitForElementWithId(
                "com.threesixteen.app:id/iv_settings");
        System.out.println("TC05- Click on three dots");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.TextView");
        System.out.println("TC12- Click on Change app language");
        Thread.sleep(1000);
//        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView");
//        System.out.println("TC13- Click on Hindi");
//        Thread.sleep(1000);
//        driver.navigate().back();
//        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_profile_image");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_arrow");
//        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView");
//        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.TextView");
//        System.out.println("TC13A- Click on Change app language");
//        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.TextView");
        System.out.println("TC13B- Click on English");
        Thread.sleep(1000);
        driver.navigate().back();

    }


    
    @Test(priority = 8)
    public void SelfProfieReelLandingTest8() throws InterruptedException {

    	
        OpenSideNav();
        clickAndWaitForElementWithId("com.threesixteen.app:id/txt_name");
        Thread.sleep(3000);
        System.out.println("TC02- opens self profile");
        if (isVisibleWithXPath1("//android.widget.LinearLayout[@content-desc=\"9\"]")) 
        {
        clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"8\"]"); 
        }
        if (isVisibleWithXPath1("//android.widget.LinearLayout[@content-desc=\"8\"]")) 
        {
        clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"8\"]"); 
        }
        Thread.sleep(3000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.view.ViewGroup[1]/android.widget.ImageView");
        System.out.println("TC03- Open First reel");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        System.out.println("TC04- Back from Reel");
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView");
        System.out.println("TC05- Reel Landed on self profile");
        Thread.sleep(1000);
        
        
    }
    
    
    
    
    @Test(priority = 9)
    public void followOrUnfollow() throws InterruptedException {
    	
        OpenSideNav();
        Thread.sleep(3000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/txt_name");
        System.out.println("TC02- opens self profile");
        Thread.sleep(3000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_followers");
        System.out.println("TC07- Open followers list");
        Thread.sleep(3000);
        MobileElement element1 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.Button"));
        String CurrentButtonCTA = ((WebElement) element1).getText();
        System.out.println("TC07- Current status is " + CurrentButtonCTA);
        Thread.sleep(3000);

        if (CurrentButtonCTA.equals("+ Follow")) {
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[contains(@text,'+ Follow')]")).click();
            System.out.println("TC08- Clicked on follow button");
            Thread.sleep(3000);
            MobileElement element11 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.Button"));
            String UpdatedButtonCTA = ((WebElement) element11).getText();
            System.out.println("TC07- Updated status is " + UpdatedButtonCTA);
            Thread.sleep(3000);
            if (UpdatedButtonCTA.equals("Following")) {
                clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
                System.out.println("TC08- Open profile");
                Thread.sleep(1000);
            } else {
                Thread.sleep(3000);
                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
                System.out.println("TC08- Follow/unfollow button not working");
                Thread.sleep(3000);

            }
        } else {
            Thread.sleep(3000);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.Button")).click();
            System.out.println("TC08- Clicked on following button");
            Thread.sleep(5000);
            MobileElement element11 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.Button"));
            String CurrentButtonCTA1 = ((WebElement) element11).getText();
            System.out.println("TC07- Updated status is " + CurrentButtonCTA1);
            Thread.sleep(3000);
            if (CurrentButtonCTA1.equals("+ Follow")) {
                clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
                System.out.println("TC08- Open profile");
                Thread.sleep(1000);
            } else {
                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
                System.out.println("TC08- Follow/unfollow button not working");
                Thread.sleep(3000);
            }
        }
    }


    
    

}



