package Trial;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class SideNav_Script<MobileElement, Rotatable> extends Functions {


	
 

    @Test(priority = 1)
    public void CreatebtnIRL1() throws InterruptedException, MalformedURLException {

        OpenSideNav();
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Create')]");
        System.out.println("TC02- Click on create");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/layout_irl_live");
        System.out.println("TC03- Click on IRL");
        Thread.sleep(1000);
        if (isVisibleWithXPath1("//*[contains(@text,'Hindi Audio')]")) {
            Thread.sleep(1000);
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Hindi Audio')]");
        System.out.println("TC04- Click on Hindi Audio");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1("//*[contains(@text,'English')]");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Done')]");
        }
        Thread.sleep(1000);
        if (isVisibleWithXPath1("//*[contains(@text,'English Audio')]")) 
            {
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1("//*[contains(@text,'English Audio')]");
            System.out.println("TC05- Click on English Audio");
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1("//*[contains(@text,'Hindi')]");
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1("//*[contains(@text,'Done')]");
            Thread.sleep(1000);
            }
        clickAndWaitForElementWithId("com.threesixteen.app:id/switch_fanrank");
        System.out.println("TC06- Click on Fan rank toggle");
        Thread.sleep(1000);
        if (isVisibleWithXPath1("//*[contains(@text,'Edit')]")) {
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1("//*[contains(@text,'Edit')]");
            System.out.println("TC06A- click on edit fan rank ammount");
            }
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/edt_fankrank_amount");
        System.out.println("TC07- Edit fank rank coin Ammount");
        Thread.sleep(1000);
        (driver).findElement(By.id("com.threesixteen.app:id/edt_fankrank_amount")).sendKeys("11000");
        System.out.println("TC08- send 11000 as count");
        Thread.sleep(1000);
        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[2]")) {
            System.out.println("TC08A- s4435578557 error found");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/cancel");
            System.out.println("TC9- Close fan rank");
            Thread.sleep(1000);
            if (isVisibleWithId("com.threesixteen.app:id/switch_fanrank")) {
                Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/switch_fanrank");
            System.out.println("TC10- Click on Fan rank toggle");
            }
            Thread.sleep(1000);
            if (isVisibleWithXPath1("//*[contains(@text,'Edit')]")) {
                Thread.sleep(1000);
            clickAndWaitForElementWithXpath1("//*[contains(@text,'Edit')]");
            System.out.println("TC11- click on edit fan rank ammount");
            Thread.sleep(1000);
            }
        	(driver).findElement(By.id("com.threesixteen.app:id/edt_fankrank_amount")).sendKeys("400");
            System.out.println("TC12- send 400 as count");
            Thread.sleep(1000);
        }
        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[2]")) 
        {
            Thread.sleep(1000);
        	clickAndWaitForElementWithId("com.threesixteen.app:id/cancel");
            System.out.println("TC13- Close fan rank");
            Thread.sleep(1000);
            if (isVisibleWithId("com.threesixteen.app:id/switch_fanrank")) {
                Thread.sleep(1000);
                clickAndWaitForElementWithId("com.threesixteen.app:id/switch_fanrank");
                System.out.println("TC14- Click on Fan rank toggle");
                }
            Thread.sleep(1000);
                if (isVisibleWithXPath1("//*[contains(@text,'Edit')]")) {
                clickAndWaitForElementWithXpath1("//*[contains(@text,'Edit')]");
                System.out.println("TC15- click on edit fan rank ammount");
                }
                Thread.sleep(1000);
        	(driver).findElement(By.id("com.threesixteen.app:id/edt_fankrank_amount")).sendKeys("500");
            System.out.println("TC16- send 500 as count");
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1("//*[contains(@text,'Done')]");
        }
        Thread.sleep(1000);
        
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Next - IRL Settings')]");
        System.out.println("TC17- Click on Next");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1("//*[contains(@text,'More IRL Settings')]");
        System.out.println("TC18- Click on More IRL setting");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Save & Go Back')]");
        System.out.println("TC19- Click on save and Go back");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Next - Stream Preview')]");
        System.out.println("TC19- Click NEXT Stream Preview");
        Thread.sleep(1000);
        if (isVisibleWithXPath1("//*[contains(@text,'Go Live')]")) {
            Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/img_back");
        System.out.println("TC20- Back from IRL");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().back();
        OpenExplorePage();
        Thread.sleep(1000);
        
        }
        else
        {
            clickAndWaitForElementWithXpath1("//*[contains(@text,'Create')]");
        }

    }
    
    
    
    

    @Test(priority = 2)
    public void SidenNavCreateVideo2() throws InterruptedException {

        OpenSideNav();
        Thread.sleep(500);
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Create')]");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_create");
        System.out.println("TC02- Click on create");
        Thread.sleep(500);
        clickAndWaitForElementWithId("com.threesixteen.app:id/layout_upload");
        System.out.println("TC03- Click on Video upload");
        driver.navigate().back();
        Thread.sleep(500);
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Create')]");

    }
    
    
    
    
    @Test(priority = 3)

    public void SidenNavchnageFavoriteGame3() throws InterruptedException {

        OpenSideNav();
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Setting')]");
//        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.ImageView");
        System.out.println("TC02- Click on Setting");
        Thread.sleep(1000);
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(5)"));
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView");
        System.out.println("TC03- click on select games");
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.GridView/android.widget.FrameLayout[5]/android.view.ViewGroup/android.widget.ImageView");
        System.out.println("TC04- click on GTA-V");
        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_done");
        System.out.println("TC05- click on next");
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
        System.out.println("TC06- click on Done");

    }

    
    
    @Test(priority = 4)
    public void SidenNavDataSaver4() throws InterruptedException {

        OpenSideNav();
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Data Saver')]");
        System.out.println("TC02- Data Saver clicked ");
        Thread.sleep(1000);
        if (isVisibleWithXPath1("//*[contains(@text,'Always On')]")) {
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Always On')]");
        System.out.println("TC03- Click on always On ");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Data Saver')]");
        System.out.println("TC04- Data Saver turn on ");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Only on Mobile Data')]");
        System.out.println("TC05- Click on only on miobile network ");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Data Saver')]");
        System.out.println("TC06- Data Saver clicked ");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Off')]");
        System.out.println("TC07- Click on off");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Data Saver')]");
        System.out.println("TC08- Data Saver clicked ");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_title_settings");
        System.out.println("TC08- Click on dvance setting ");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_down_mode");
        System.out.println("TC08- Click on down button on top ");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Always On')]");
        System.out.println("TC03- Click on always On ");
        Thread.sleep(1000);
        }
        else
        {
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1("//*[contains(@text,'Data Saver')]");
            System.out.println("TC04- Data Saver turn off ");

        }


    }

    @Test(priority = 5)
    public void SideNavContest5() throws InterruptedException {

        OpenSideNav();
        Thread.sleep(2000);
        String targetText = "Contests";
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
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_history");
        System.out.println("TC03- open Contest history");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
        System.out.println("TC04- Exist from Contest history");

    }

    @Test(priority = 6)
    public void SideNavcreateBtn6() throws InterruptedException {

        OpenSideNav();
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Create')]");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_create");
        System.out.println("TC02- Click on create");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/layout_esports");
        System.out.println("TC03- Click on lIVE STREAM");
        Thread.sleep(3000);
//        clickAndWaitForElementWithXpath1("//*[contains(@text,'Next - Stream Settings')]");

        clickAndWaitForElementWithXpath1("//*[contains(@text,'Next - Stream Settings')]");
        Thread.sleep(3000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/img_back");
        Thread.sleep(3000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/img_back");
        System.out.println("TC04- Back from live stream");
        Thread.sleep(2000);
        OpenSideNav();
        Thread.sleep(2000);
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Create')]");
        System.out.println("TC06- Click on create");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/layout_irl_live");
        System.out.println("TC07- Click on IRL");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/img_back");
        System.out.println("TC08- Back from IRL");
        driver.navigate().back();
        Thread.sleep(1000);
        OpenExplorePage();
    }

    
    
    @Test(priority = 7)
    public void SidenNavImageupload7() throws InterruptedException {

        OpenSideNav();
        Thread.sleep(2000);
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Create')]");
        System.out.println("TC02- Click on create");
        clickAndWaitForElementWithId("com.threesixteen.app:id/layout_post");
        System.out.println("TC03- Click on Image upload");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        OpenExplorePage();

    }
    
    
    
    

    @Test(priority = 9)
    public void SideNavRewards9() throws InterruptedException {

        OpenSideNav();
        Thread.sleep(1000);
        String targetText = "Rewards";
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
        SkipSurvey();
       SkipAd();
       SkipAd();
//        clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"Redeemed\"]");
//        System.out.println("TC13- Redemmed section  open in Rewards");
//        Thread.sleep(1000);

//        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.GridView/android.widget.FrameLayout[1]");
       clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View");
        System.out.println("TC02- Gaming section  open in Rewards");
       
     
       clickAndWaitForElementWithId("com.threesixteen.app:id/tv_user_coins");
       System.out.println("TC03- Coins count is coming on reward page");
//        
       
//        driver.findElement(By.xpath("//*[contains(@text,'BGMI')]")).click();
//        System.out.println("TC05- Click on BGMI");
//        if (isVisibleWithId("com.threesixteen.app:id/redeem_now"))
//        {
//        System.out.println("TC06- Coupons Available in BGMI section");
//        driver.findElement(By.xpath("//*[contains(@text,'LEAF')]")).click();
//        System.out.println("TC07- Click on LEAF");
//        }
//        if (isVisibleWithId("com.threesixteen.app:id/redeem_now"))
//        {
//        System.out.println("TC08- Coupons Available in LEAF section");
//        driver.findElement(By.xpath("//*[contains(@text,'Myntra')]")).click();
//        System.out.println("TC09- Click on Myntra");
//        }
//        if (isVisibleWithId("com.threesixteen.app:id/redeem_now"))
//        {
//        System.out.println("TC10- Coupons Available in Myntra section");
//        driver.findElement(By.xpath("//*[contains(@text,'All')]")).click();
//        System.out.println("TC11- Click on All");
//        }
//        
//        if (isVisibleWithId("com.threesixteen.app:id/redeem_now"))
//        {
//            System.out.println("TC12- Coupons Available in All section");
//       
//        }
    }
  
    
        

    @Test(priority = 10)
    public void SidenNavOffersTask10() throws InterruptedException {
    	
    	
        OpenSideNav();
        Thread.sleep(1000);
        String targetText = "Tasks";
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
        
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_user_coins");
        System.out.println("TC03- Coin log coming ");
        SkipAd();
        Thread.sleep(30000);
        driver.navigate().back();

        System.out.println("TC03- Back from Coin log ");
        Thread.sleep(1000);

//          clickAndWaitForElementWithId("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView");
//          System.out.println("TC04- Title coming for task page");
//          Thread.sleep(1000);

          
    }
    
    

    private boolean isvisibleithXpath1(String string) {

		return false;
	}
    
    

	@Test(priority = 11)
    public void SidenNavInviteAndWin11() throws InterruptedException {

        OpenSideNav();
        Thread.sleep(1000);
        String targetText = "Invite & Win";
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
        Thread.sleep(2000); 
//        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.GridView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[1]");
//        System.out.println("TC34- open Invite & WIn page");
////	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_see_invited_iib");
////	System.out.println("TC35- open See all invites");
////	driver.findElement(AppiumBy.androidUIAutomator(
////		    "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
////	clickAndWaitForElementWithId("com.threesixteen.app:id/backIV");
////	System.out.println("TC36- Back from all invites");
////   driver.navigate().back();
//        clickAndWaitForElementWithId("com.threesixteen.app:id/backIV");
//        System.out.println("TC37- Back from invite & Win  page");
        driver.navigate().back();

    }

    @Test(priority = 12)
    public void SidenNavWatccchHistory12() throws InterruptedException {
    	
    	
        OpenSideNav();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Watch History')]")).click();
        System.out.println("TC01- open Watch history");
        Thread.sleep(1000);
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ImageView");
        System.out.println("TC02- open watch history feed");
        Thread.sleep(1500);
        SkipAd();
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().back();

        System.out.println("TC03- Back from feed");
        Thread.sleep(5000);
        if (isVisibleWithId("com.threesixteen.app:id/iv_profile_image")) {
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_profile_image");
        System.out.println("TC034- open profile page");
        Thread.sleep(1000);
        }
        else
        {
            Thread.sleep(1000);
            driver.navigate().back();
            System.out.println("TC05- Clicked back again");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_profile_image");
            System.out.println("TC06- open profile page");

            Thread.sleep(1000);

        }
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Watch History')]")).click();
        System.out.println("TC07- open Watch history Again");
        Thread.sleep(1000);
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));
        Thread.sleep(1000);
        
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ImageView");
        System.out.println("TC08- open watch history feed");
        Thread.sleep(1500);

    }
    
    

    @Test(priority = 13)
    public void SidenNavcChangeProfileName13() throws InterruptedException {

        OpenSideNav();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        Thread.sleep(1000);
//        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.ImageView");
        System.out.println("TC02- Click on Setting");
        Thread.sleep(1000);

        MobileElement element = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/et_name"));
	     String UserName = ((WebElement) element).getText();
	     System.out.println("TC03- Current user Name is " + UserName);  
	        Thread.sleep(1000);
	        if (UserName.equals("Idali vlambir"))
	        {
        clickAndWaitForElementWithId("com.threesixteen.app:id/et_name");
        Thread.sleep(1000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_name")).sendKeys("Idali vlambir1");
        System.out.println("TC04- changed the user name to Idali vlambir1");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
        System.out.println("TC05- click on done");
        Thread.sleep(1000);
        OpenSideNav();
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/txt_name");
        System.out.println("TC02- opens self profile");
        Thread.sleep(1000);
        MobileElement element1 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.widget.TextView[1]"));
	     String UserName1 = ((WebElement) element1).getText();
	        Thread.sleep(1000);
	     System.out.println("TC08- Updated user Name is " + UserName1);  
	        Thread.sleep(1000);
	        
	        if (UserName1.equals("Idali vlambir1"))
	        {
	            System.out.println("TC09- User Name sucessfully updated");
	        }
	        else
	        {
	            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
	            System.out.println("TC10- User Name Not updated");
	        }
	      }
	        else
	        {
	        	 clickAndWaitForElementWithId("com.threesixteen.app:id/et_name");
	             Thread.sleep(1000);
	             (driver).findElement(By.id("com.threesixteen.app:id/et_name")).sendKeys("Idali vlambir");
	             System.out.println("TC11- changed the user name to Idali vlambir ");
	             Thread.sleep(1000);
	             clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
	             System.out.println("TC12- click on done");
	             Thread.sleep(1000);
	             OpenSideNav();
	             Thread.sleep(1000);
	             clickAndWaitForElementWithId("com.threesixteen.app:id/txt_name");
	             System.out.println("TC02- opens self profile");
	             Thread.sleep(1000);
	             MobileElement element11 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.widget.TextView[1]"));
	     	     String UserName11 = ((WebElement) element11).getText();
	             Thread.sleep(1000);
	     	     System.out.println("TC15- Updated user Name is " + UserName11);  
	     	        Thread.sleep(1000);
	     	        
	     	        if (UserName11.equals("Idali vlambir"))
	     	        {
	     	            System.out.println("TC16- User Name sucessfully updated");
	     	        }
	     	        else
	     	        {
	     	            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
	     	            System.out.println("TC17- User Name Not updated");
	     	        }
	     	      }
	        }
	        
    

    
    
    @Test(priority = 14)

    public void SidenNavChangeLocation14() throws InterruptedException {

        OpenSideNav();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC02- Click on Setting");
        Thread.sleep(1000);
        MobileElement element = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/et_location"));
	     String Location = ((WebElement) element).getText();
	        Thread.sleep(1000);
	     System.out.println("TC03- Current Location is " + Location);  
	        Thread.sleep(1000);
	        if (Location.equals("Delhi"))
	        {
        clickAndWaitForElementWithId("com.threesixteen.app:id/et_location");
        Thread.sleep(1000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_location")).sendKeys("Mumbai");
        System.out.println("TC04- Location chnaged to Mumbai");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
        System.out.println("TC05- click on done");
        Thread.sleep(1000);
        OpenSideNav();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC07- Click on Setting");
        Thread.sleep(1000);
        MobileElement element1 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/et_location"));
	     String Location1 = ((WebElement) element1).getText();
	     System.out.println("TC08- Updated Location is " + Location1);  
	        Thread.sleep(1000);
        if (Location1.equals("Mumbai"))
        {
   	     System.out.println("TC09- Location sucessfully updated");  
        }
        else
        {
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
      	     System.out.println("TC10- Location not updated");  

        }
   
	        }
	        else
	        {
	        	 clickAndWaitForElementWithId("com.threesixteen.app:id/et_location");
	             Thread.sleep(1000);
	             (driver).findElement(By.id("com.threesixteen.app:id/et_location")).sendKeys("Delhi");
	             System.out.println("TC11- Location chnaged to Delhi");
	             Thread.sleep(1000);
	             clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
	             System.out.println("TC12- click on done");
	             Thread.sleep(1000);
	             OpenSideNav();
	             Thread.sleep(1000);
	             driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
	             System.out.println("TC14- Click on Setting");
	             Thread.sleep(1000);
	             MobileElement element11 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/et_location"));
	     	     String Location11 = ((WebElement) element11).getText();
	     	     System.out.println("TC15- Updated Location is " + Location11); 
	             Thread.sleep(1000);
	             if (Location11.equals("Delhi"))
	             {
	        	     System.out.println("TC16- Location sucessfully updated");  
	             }
	             else
	             {
	                 clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
	           	     System.out.println("TC17- Location not updated");  

	             }
	        }
	        	
    }
    
    
    
    
    

    @Test(priority = 15)

    public void SidenNavChangeBio15() throws InterruptedException {

        OpenSideNav();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC02- Click on Setting");
        Thread.sleep(1000);
         MobileElement element = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/et_bio"));
	     String Bio = ((WebElement) element).getText();
	     System.out.println("TC03- Current Bio is " + Bio); 
	        Thread.sleep(1000);
	        if (Bio.equals("Pro BGMI content Creator"))
	        {
        clickAndWaitForElementWithId("com.threesixteen.app:id/et_bio");
        Thread.sleep(1000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_bio")).sendKeys("Sigma BGMI content Creator");
        System.out.println("TC04- changed Location");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
        System.out.println("TC05- click on done");
        Thread.sleep(1000);
        OpenSideNav();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC07- Click on Setting");   
        Thread.sleep(1000);
        
        MobileElement element1 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/et_bio"));
	     String Bio1 = ((WebElement) element1).getText();
	     System.out.println("TC08- updated Bio is " + Bio1);  
	        Thread.sleep(1000);
	        if (Bio1.equals("Sigma BGMI content Creator"))
	        {
	   	     System.out.println("TC09- Updated Bio is Sigma BGMI content Creator");  
	        }
	        else 	
	        {
	             clickAndWaitForElementWithXpath1("//*[contains(@text,'720p')]");
		   	     System.out.println("TC10- Changes BIo doesnt get updated");  
	        }
	     }
	        else
	        {
	        	clickAndWaitForElementWithId("com.threesixteen.app:id/et_bio");
	            Thread.sleep(1000);
	            (driver).findElement(By.id("com.threesixteen.app:id/et_bio")).sendKeys("Pro BGMI content Creator");
	            System.out.println("TC11- changed Location");
	            Thread.sleep(1000);
	            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
	            System.out.println("TC12- click on done");
	            Thread.sleep(1000);
	            OpenSideNav();
	            Thread.sleep(1000);
	            driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
	            System.out.println("TC14- Click on Setting");
	            Thread.sleep(1000);
	            MobileElement element11 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/et_bio"));
	    	     String Bio11 = ((WebElement) element11).getText();
	    	     System.out.println("TC15- updated Bio is " + Bio11); 
	    	        Thread.sleep(1000);
	    	        if (Bio11.equals("Pro BGMI content Creator"))
	    	        {
	    	   	     System.out.println("TC16- Updated Bio is pro BGMI content Creator");  
	    	        }
	    	        else 	
	    	        {
	    	             clickAndWaitForElementWithXpath1("//*[contains(@text,'720p')]");
	    		   	     System.out.println("TC17- Changes BIo doesnt get updated");  
	    	        } 	        
	    	     }
	        }

    
    
    
    
    
    
    @Test(priority = 16)
    public void SidenNavlightTheme16() throws InterruptedException {

        OpenSideNav();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Theme')]")).click();
//        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.GridView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[1]");
        System.out.println("TC02- Click on themes");
        clickAndWaitForElementWithId("com.threesixteen.app:id/txt_lite_mode");
        System.out.println("TC03- Switch to Light Mode");

    }
    
    

    
    @Test(priority = 17)
    public void SidenNavDarkTheme17() throws InterruptedException {

        OpenSideNav();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Theme')]")).click();
        System.out.println("TC02- Click on themes");
        clickAndWaitForElementWithId("com.threesixteen.app:id/txt_dark_mode");
        System.out.println("TC03- Switch to dark Mode");
        Thread.sleep(1000);
    }
    
    
        
    @Test(priority = 18)
    public void NormalLiveStream18() throws InterruptedException {

        OpenSideNav();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Create')]")).click();
//        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_create");
        System.out.println("TC02- Click on create");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/layout_esports");
        System.out.println("TC03- Click on lIVE STREAM");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.GridView/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.ImageView");
        System.out.println("TC04- Select BGMI game");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/rl_select_tag");
        System.out.println("TC05- click on select tag");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Gameplay')]")).click();
        System.out.println("TC06- select tag 1");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'OP Moments')]")).click();
        System.out.println("TC07- select tag 2");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_next");
        System.out.println("TC08- click on done");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/rl_video_quality");
        System.out.println("TC09- click on Video quality");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[5]/android.widget.LinearLayout/android.widget.TextView[1]");
        System.out.println("TC10- click on Video quality 1080p");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/img_add_thumbnail");
        System.out.println("TC11- click on Thumbnail");
        Thread.sleep(1000);
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
        driver.findElement(AppiumBy
                .androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(3)"));
        Thread.sleep(1000);
        System.out.println("TC12- Thumbnail scrolled");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_buy");
        System.out.println("TC13- click on next");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/card_thumbnail_container");
        System.out.println("TC14- click on Edit thumbnail");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]");
        System.out.println("TC15- Remove thumbnail");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_next");
        System.out.println("TC16- click on next");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/img_add_overlay");
        System.out.println("TC17- Click on overlay");
        Thread.sleep(1000);
        if (isVisibleWithId("com.threesixteen.app:id/btn_buy")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/btn_buy");
            System.out.println("TC18- Click on Done");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/img_add_overlay");
            System.out.println("TC19- Click on Edit overlay");
            Thread.sleep(1000);

        }
        driver.findElement(By.xpath("//*[contains(@text,'Change Overlay')]")).click();
//        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");
        System.out.println("TC20- Click on change overlay");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_buy");
        System.out.println("TC21- Select an overlay");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/img_more_settings");
        System.out.println("TC22- Click on more setting");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/switch_shield_mode");
        System.out.println("TC21- Switch to sheild mode");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/switch_stream_delay");
        System.out.println("TC22- Click on stream delay");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/container_stream_delay");
        System.out.println("TC23- Apply 60s stream delay");
        Thread.sleep(1000);
        if (isVisibleWithId("com.threesixteen.app:id/btn_select")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/btn_select");
            System.out.println("TC24- Clicked on Done");
            Thread.sleep(1000);
        }
        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_next");
        System.out.println("TC25- Click on Save & go Back");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_next");
        System.out.println("TC26- Click on Next-Select Channels");
        Thread.sleep(1000);

    }

    
    @Test(priority = 20)
    public void SideNavCreateBtnReel20() throws InterruptedException, MalformedURLException {

        OpenSideNav();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Create')]")).click();
        System.out.println("TC02- Click on create");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Reel')]")).click();
        System.out.println("TC03- Click on Reel upload");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        OpenExplorePage();        

    }

    
    
    @Test(priority = 21)
    public void GooglePlayCouponRedeem21() throws InterruptedException {

//        OpenSideNav();
//        String targetText = "Rewards";
//        boolean textFound = false;
//        int maxScrolls = 3; 
//
//        for (int i = 0; i < maxScrolls && !textFound; i++) {
//            try {
//                driver.findElement(
//                    AppiumBy.androidUIAutomator(
//                        "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"" + targetText + "\"))"));
//                textFound = true;
//                System.out.println("TC02- Product description scrolled and found");
//            } catch (Exception e) {
//                // If the element is not found, scroll forward
//                driver.findElement(
//                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
//                Thread.sleep(1000); // Pause between scrolls
//            }
//        }
//
//        // Click the element if it has been found
//            driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
//            System.out.println("Clicking on: " + targetText);
//        	
//        
//
//        clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"Gaming\"]");
//        System.out.println("TC04- click on Gaming tab");
//
//        Thread.sleep(2000); 
//
//        clickAndWaitForElementWithId("com.threesixteen.app:id/swipe_refresh");
//        System.out.println("TC04- click on coupons");
//        
//        
//        Thread.sleep(2000); 
//        String targetText1 = "₹ 10";
//        boolean textFound1 = false;
//        int maxScrolls1 = 3; 
//
//        for (int i = 0; i < maxScrolls1 && !textFound1; i++) {
//            try {
//                // Try to scroll to the target text
//                driver.findElement(
//                    AppiumBy.androidUIAutomator(
//                        "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"" + targetText1 + "\"))"));
//                textFound1 = true;
//                System.out.println("TC02 - Product description scrolled and found");
//            } catch (Exception e) {
//                // If the element is not found, scroll forward
//                driver.findElement(
//                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
//                System.out.println("TC02 - Product description not found, scrolling forward...");
//                Thread.sleep(1000); // Pause between scrolls
//            }
//        }
//
//        if (textFound1) {
//            System.out.println("TC02 - Click on the product with description ₹ 10");
//            // Optionally click on the element here if needed
//        } else {
//            System.out.println("TC02 - Product description not found after " + maxScrolls1 + " scroll attempts.");
//        }
//
//
//            driver.findElement(By.xpath("//*[contains(@text,'" + targetText1 + "')]")).click();
//            System.out.println("Clicking on: " + targetText1);
//       
//        
//
//        if (isVisibleWithId("com.threesixteen.app:id/et_mobile")) {
//            clickAndWaitForElementWithId("com.threesixteen.app:id/et_mobile");
//            System.out.println("TC07- Clicked on box");
//            clickAndWaitForElementWithId("com.google.android.gms:id/cancel");
//            (driver).findElement(By.id("com.threesixteen.app:id/et_mobile")).sendKeys("8285655501");
//            System.out.println("TC08- Typed a Mobile number");
//            clickAndWaitForElementWithId("com.threesixteen.app:id/layout_btn");
//            System.out.println("TC09- Click on continue");
//            
//        } 
//        else
//        {
//            driver.navigate().back();
//            System.out.println("TC10- This coupon is not Valid for mobile numbers");
//           
//        }
        }
    
    
   
    @Test(priority = 22)
     public void RedeemCouponCopy22() throws InterruptedException {

//        OpenSideNav();
//        Thread.sleep(1000);
//        String targetText = "Rewards";
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
//        driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
//        System.out.println("Clicking on: " + targetText);   
//        SkipSurvey();
//         SkipAd();
//         SkipAd();
//
//        clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"Redeemed\"]");
//        System.out.println("TC03- Redemmed section  open in Rewards");
//        if (isvisibleithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button"))
//        {
//        	clickAndWaitForElementWithXpath1(
//        
//                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button");
//        System.out.println("TC04- clicked on copy button");
//        }

    }
    
    

    @Test(priority = 23)
    public void SideNavCouponPageTopCarousal23() throws InterruptedException {

        OpenSideNav();
        Thread.sleep(1000);

        String targetText = "Rewards";
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
        SkipSurvey();
         SkipAd();
//        clickAndWaitForElementWithXpath1(
//                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageView");
//        System.out.println("TC04- Top carousal is working");
//        Thread.sleep(1000);

    }
    
    
    

    @Test(priority = 24)
    public void SideNavBuyyPro24() throws InterruptedException {

        OpenSideNav();
        Thread.sleep(1000);
        if (isVisibleWithXPath1("//android.widget.ImageView[@content-desc=\"Pro\"]")) 
        {
            if (isvisibleithXpath1("//*[contains(@text,'Extend Pro')]")) 
            {
            driver.findElement(By.xpath("//*[contains(@text,'Extend Pro')]")).click();
            System.out.println("TC02- Click onn Extend pro");
            Thread.sleep(1000);
            driver.navigate().back();
            Thread.sleep(1000);
            driver.navigate().back();
            System.out.println("TC03- Back from Extend pro");
            Thread.sleep(1000);
            OpenSideNav();

            clickAndWaitForElementWithId("com.threesixteen.app:id/txt_name");
            System.out.println("TC05- opens self profile");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/pro_user_icon");
            System.out.println("TC06- Profile badges present on profile page");
            }
        } 
        else 
        {
            if (isvisibleithXpath1("//*[contains(@text,'Buy Pro')]"))  
            {

            driver.findElement(By.xpath("//*[contains(@text,'Buy Pro')]")).click();
            System.out.println("TC07- Click on Buy pro");
            Thread.sleep(1000);
            driver.navigate().back();
            System.out.println("TC08- Back from Buy pro");
            Thread.sleep(1000);
            }
        }

    }

    @Test(priority = 25)
    public void SideNavRooterShop25() throws InterruptedException {

        OpenSideNav();
        Thread.sleep(1000);
        String targetText = "Rooter Shop";
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
        driver.navigate().back();
        System.out.println("TC03- Back from shop by clicking on android navigation button");
        Thread.sleep(1000);
        OpenSideNav();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Data Saver')]")).click();
        System.out.println("TC05- Click on data saver");

    }

    
    
    @Test(priority = 26)

    public void ChangeCommunicationEmailId26() throws InterruptedException {

        OpenSideNav();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC02- Click on Setting");  
        Thread.sleep(1000);
	   	 MobileElement element = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/et_comm_email"));
	     String communicationemail = ((WebElement) element).getText();
	        Thread.sleep(1000);
	     System.out.println("TC03- Initial communication email is " + communicationemail);
	        Thread.sleep(1000);
	  
	        if (communicationemail.equals("EFGH123@gmail.com"))
	     {
	            Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/et_comm_email");
        Thread.sleep(1000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_comm_email")).sendKeys("ABCD123@Gmail.com");
        System.out.println("TC04- changed communication email id is ABCD123@Gmail.com");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
        System.out.println("TC05- click on done");
        Thread.sleep(1000);
        OpenSideNav();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC07- Click on Setting");
        Thread.sleep(1000);
        MobileElement element1 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/et_comm_email"));
	     String communicationemail1 = ((WebElement) element1).getText();
	     System.out.println("TC08- Updated communication email is " + communicationemail1);  
	        Thread.sleep(1000);
	        if (communicationemail1.equals("ABCD123@Gmail.com"))
        {
            System.out.println("TC09- Communication Email id sucessfully updated");
        }
        else
        {
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_comment");
            System.out.println("TC10- Communication Email id not updated");
        }
        
	     }
	     else
	     {
	         Thread.sleep(1000);
	        
	        clickAndWaitForElementWithId("com.threesixteen.app:id/et_comm_email");
	        Thread.sleep(1000);
	        (driver).findElement(By.id("com.threesixteen.app:id/et_comm_email")).sendKeys("EFGH123@gmail.com");
	        System.out.println("TC11- changed communication email id is EFGH123@gmail.com");
	        Thread.sleep(1000);
	        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
	        System.out.println("TC12- click on done");
	        Thread.sleep(1000);
	        OpenSideNav();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
	        System.out.println("TC14- Click on Setting");
	        Thread.sleep(1000);
		   	 MobileElement element11 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/et_comm_email"));
		     String communicationemail11 = ((WebElement) element11).getText();
		     System.out.println("TC15- Updated communication email is " + communicationemail11);  
		        Thread.sleep(1000);
	        if (communicationemail11.equals("EFGH123@gmail.com"))
	        {
	            System.out.println("TC16- Communication Email id sucessfully updated");
	        }
	        else
	        {
	            Thread.sleep(1000);
	            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_comment");
	            System.out.println("TC17- Communication Email id not updated");
	        }
	     }

      }
    
    

    
    @Test(priority = 27)

    public void SideNavCoinandDiamondlog27() throws InterruptedException {

        OpenSideNav();
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/txt_diamonds");
        System.out.println("TC02- Opened Diamond log");
        if (isVisibleWithId("com.threesixteen.app:id/iv_back"))
        {
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
        System.out.println("TC03- Back Diamond log"); }
        else
        {
            Thread.sleep(1000);
            driver.navigate().back();   
        	System.out.println("TC03- Back Diamond log");
        	}
        Thread.sleep(1000);
        
        OpenHomePage();
        Thread.sleep(1000);
        OpenSideNav();

        clickAndWaitForElementWithId("com.threesixteen.app:id/txt_coins");
        System.out.println("TC05- Opened Coin log");
        Thread.sleep(1000);
        SkipAd();
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
        System.out.println("TC05- back from coin log");

    
    }
    
    
    @Test(priority = 28)

    public void SidenNavcChangeContentlocaleTamil28() throws InterruptedException {

        OpenSideNav();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC02- Click on Setting");
        Thread.sleep(1000);
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)")); 
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/et_content_locale");
        System.out.println("TC03- Click on Content locale");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.ImageView")).click();
        System.out.println("TC04- Click on tamil video");
        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_continue");
        System.out.println("TC05- click on done");
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
        System.out.println("TC06- click on done");
        OpenSideNav();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC08- Click on Setting");
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));             
        MobileElement element = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/et_content_locale"));
        String ContentLocale = ((WebElement) element).getText();
        System.out.println("TC09- Updated Content locale is " + ContentLocale);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
        System.out.println("TC10- click on done");
        
        if (ContentLocale.equals("Tamil"))
        {
        
        	if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button"))
        	{ clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
    	        System.out.println("TC01- Pro stream tab opened");
        	}
        	else
        	{
                clickAndWaitForElementWithXpath1("//*[contains(@text,'Pro Streams')]");
    	        System.out.println("TC01- Pro stream tab opened");
        	}   
        	if(isvisibleithXpath1("com.threesixteen.app:id/player_layout")) {
        		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
        		System.out.println("TC12- stream opened");   
        	    SkipSurvey();
        	            }
        	            else
        	            {
        	            	OpenLivetStream();
        	            }
        	            

    }
        else
        	
        {
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
        	System.out.println("TC13- Content Locale not updated");
        }
    }
    
    
    
    @Test(priority = 29)

    public void SidenNavcChangeContentlocaleTelugu29() throws InterruptedException {

        OpenSideNav();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC02- Click on Setting");
        Thread.sleep(1000);
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));  
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/et_content_locale");
        System.out.println("TC03- Click on Content locale");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.widget.FrameLayout[3]/android.view.ViewGroup/android.widget.ImageView")).click();
        System.out.println("TC04- Click on telugu video");
        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_continue");
        System.out.println("TC05- click on done");
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
        System.out.println("TC06- click on done");
        Thread.sleep(1000);
        OpenSideNav();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC08- Click on Setting");
        Thread.sleep(1000);
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));      
        Thread.sleep(1000);
        MobileElement element = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/et_content_locale"));
        String ContentLocale = ((WebElement) element).getText();
        System.out.println("TC09- Updated Content locale is " + ContentLocale);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
        System.out.println("TC10- click on done");

        if (ContentLocale.equals("Telugu"))
        {
        
        	if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button"))
        	{ clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
    	        System.out.println("TC01- Pro stream tab opened");
        	}
        	else
        	{
                clickAndWaitForElementWithXpath1("//*[contains(@text,'Pro Streams')]");
    	        System.out.println("TC01- Pro stream tab opened");
        	}   
        	if(isvisibleithXpath1("com.threesixteen.app:id/player_layout")) {
        		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
        		System.out.println("TC12- stream opened");   
        	    SkipSurvey();
        	            }
        	            else
        	            {
        	            	OpenLivetStream();
        	            }
        	            

    SkipSurvey();

    
    }
        else
        	
        {
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
        	System.out.println("TC13- Content Locale not updated");

        }
    }
    
    
    
    
    
    
    @Test(priority = 30)

    public void SidenNavcChangeContentlocaleBengali30() throws InterruptedException {

        OpenSideNav();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC02- Click on Setting");
        Thread.sleep(1000);
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)")); 
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/et_content_locale");
        System.out.println("TC03- Click on Content locale");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView")).click();
        System.out.println("TC04- Click on Bengali video");
        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_continue");
        System.out.println("TC05- click on done");
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
        System.out.println("TC06- click on done");
        OpenSideNav();
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC08- Click on Setting");
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));      
        MobileElement element = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/et_content_locale"));
        String ContentLocale = ((WebElement) element).getText();
        System.out.println("TC09- Updated Content locale is " + ContentLocale);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
        System.out.println("TC10- click on done");
        if (ContentLocale.equals("Bengali"))
        {
        
        	if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button"))
        	{ clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
    	        System.out.println("TC01- Pro stream tab opened");
        	}
        	else
        	{
                clickAndWaitForElementWithXpath1("//*[contains(@text,'Pro Streams')]");
    	        System.out.println("TC01- Pro stream tab opened");
        	}   
        	if(isvisibleithXpath1("com.threesixteen.app:id/player_layout")) {
        		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
        		System.out.println("TC12- stream opened");   
        	    SkipSurvey();
        	            }
        	            else
        	            {
        	            	OpenLivetStream();
        	            }
        	            


    
    }
        else
        	
        {
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
        	System.out.println("TC13- Content Locale not updated");

        }
    }
    
    
    
    
    @Test(priority = 31)

    public void SidenNavcChangeContentlocaleMarathi31() throws InterruptedException {

        OpenSideNav();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC02- Click on Setting");
        Thread.sleep(1000);
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/et_content_locale");
        System.out.println("TC03- Click on Content locale");
        Thread.sleep(1000);
        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.widget.FrameLayout[5]/android.view.ViewGroup"))
        {  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.widget.FrameLayout[5]/android.view.ViewGroup")).click();
        System.out.println("TC04- Click on Marathi video");
        Thread.sleep(1000);
        }
        else
        {
            Thread.sleep(1000);
        	clickAndWaitForElementWithId("com.threesixteen.app:id/et_content_locale");
            System.out.println("TC03- Click on Content locale");
            Thread.sleep(2000);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.widget.FrameLayout[5]/android.view.ViewGroup")).click();
            System.out.println("TC04- Click on Marathi video");
        }
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_continue");
        System.out.println("TC05- click on done");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
        System.out.println("TC06- click on done");
        Thread.sleep(1000);
        OpenSideNav();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC08- Click on Setting");
        Thread.sleep(1000);
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));      
        Thread.sleep(1000);
        MobileElement element = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/et_content_locale"));
        String ContentLocale = ((WebElement) element).getText();
        System.out.println("TC09- Updated Content locale is " + ContentLocale);
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
        System.out.println("TC10- click on done");
        Thread.sleep(1000);

        if (ContentLocale.equals("Marathi"))
        {
            Thread.sleep(1000);
        	if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button"))
        	{ clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
    	        System.out.println("TC01- Pro stream tab opened");
    	        Thread.sleep(1000);
        	}
        	else
        	{
                Thread.sleep(1000);
                clickAndWaitForElementWithXpath1("//*[contains(@text,'Pro Streams')]");
    	        System.out.println("TC01- Pro stream tab opened");
        	}   
            Thread.sleep(1000);
            if(isvisibleithXpath1("com.threesixteen.app:id/player_layout")) {
            	if(isvisibleithXpath1("com.threesixteen.app:id/player_layout")) {
            		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
            		System.out.println("TC12- stream opened");   
            	    SkipSurvey();
            	            }
            	            else
            	            {
            	            	OpenLivetStream();
            	            }
            	            

            }
            else
            {
            	OpenLivetStream();
            }
            

    }
        else
        	
        {
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
        	System.out.println("TC13- Content Locale not updated");

        }
    }
	
    
    
    
    @Test(priority = 32)

    public void SidenNavcChangeContentlocaleKannda32() throws InterruptedException {

    	
        OpenSideNav();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC02- Click on Setting");
        Thread.sleep(1000);
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));     
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/et_content_locale");
        System.out.println("TC03- Click on Content locale");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.widget.FrameLayout[6]/android.view.ViewGroup/android.widget.ImageView")).click();
        System.out.println("TC04- Click on Kannda video");
        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_continue");
        System.out.println("TC05- click on done");
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
        System.out.println("TC06- click on done");
        Thread.sleep(1000);
        OpenSideNav();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC08- Click on Setting");
        Thread.sleep(1000);
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));  
        Thread.sleep(1000);
        MobileElement element = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/et_content_locale"));
        String ContentLocale = ((WebElement) element).getText();
        System.out.println("TC09- Updated Content locale is " + ContentLocale);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
        System.out.println("TC10- click on done");
        
        if (ContentLocale.equals("Kannada"))
        {
        	if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button"))
        	{ clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
    	        System.out.println("TC01- Pro stream tab opened");
        	}
        	else
        	{
                clickAndWaitForElementWithXpath1("//*[contains(@text,'Pro Streams')]");
    	        System.out.println("TC01- Pro stream tab opened");
        	}   
        	if(isvisibleithXpath1("com.threesixteen.app:id/player_layout")) {
        		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
        		System.out.println("TC12- stream opened");   
        	    SkipSurvey();
        	            }
        	            else
        	            {
        	            	OpenLivetStream();
        	            }
        	            


    
    }
        else
        	
        {
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
        	System.out.println("TC13- Content Locale not updated");

        }
    }
    
    
    
    
    @Test(priority = 33)

    public void SidenNavcChangeContentlocaleHindi33() throws InterruptedException {

        OpenSideNav();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC02- Click on Setting");
        Thread.sleep(1000);
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)")); 
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/et_content_locale");
        
        System.out.println("TC03- Click on Content locale");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ImageView")).click();
        System.out.println("TC04- Click on Hindi video");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_continue");
        System.out.println("TC05- click on done");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
        System.out.println("TC06- click on done");
        Thread.sleep(1000);
        OpenSideNav();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC08- Click on Setting");
        Thread.sleep(1000);
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));  
        Thread.sleep(1000);
        MobileElement element = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/et_content_locale"));
        String ContentLocale = ((WebElement) element).getText();
        System.out.println("TC09- Updated Content locale is " + ContentLocale);
        Thread.sleep(1000);

        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
        System.out.println("TC10- click on done");
        Thread.sleep(1000);
        if (ContentLocale.equals("Hindi"))
        {
        
        	if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button"))
        	{ clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
    	        System.out.println("TC01- Pro stream tab opened");
    	        Thread.sleep(1000);
        	}
        	else
        	{
                Thread.sleep(1000);
                clickAndWaitForElementWithXpath1("//*[contains(@text,'Pro Streams')]");
    	        System.out.println("TC01- Pro stream tab opened");
        	}   
            Thread.sleep(1000);
            if(isvisibleithXpath1("com.threesixteen.app:id/player_layout")) {
            	clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
            	System.out.println("TC12- stream opened");   
                SkipSurvey();
                        }
                        else
                        {
                        	OpenLivetStream();
                        }
                        


    
    }
        else
        	
        {
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
        	System.out.println("TC13- Content Locale not updated");

        }
    }
    
    
    
    
//    @Test(priority = 34)
//
//    public void SideNavAddsocialmedialinkYoutube34() throws InterruptedException {
//
//        OpenSideNav();
//
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
//        System.out.println("TC02- Click on Setting");
//        driver.findElement(
//                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
//        clickAndWaitForElementWithId("com.threesixteen.app:id/et_youtube");
//        (driver).findElement(By.id("com.threesixteen.app:id/et_youtube")).sendKeys("https://www.youtube.com/@Rooter");
//        System.out.println("TC03- added Youtube link to profile");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
//        System.out.println("TC04- click on done");
//        OpenSideNav();
//
//        clickAndWaitForElementWithId("com.threesixteen.app:id/txt_name");
//        System.out.println("TC06- opens self profile");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_youtube");
//        System.out.println("TC07- Click on Youtube icon");
//        driver.findElement(By.xpath("//*[contains(@text,'Youtube')]")).click();
//        System.out.println("TC08- Opoen Youtube");
//        Thread.sleep(1000);
//        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.HOME));
//        System.out.println("TC03- Switched to PIP");
//        Thread.sleep(5000);
//        driver.navigate().back();
//        Thread.sleep(1000);
//        driver.navigate().back();
//        Thread.sleep(1000);
//        System.out.println("TC10- Youtube link added sucessfully");
//        driver.navigate().back();
//        Thread.sleep(1000);
//        driver.navigate().back();
//        Thread.sleep(1000);
//        driver.navigate().back();
//
//    }
//    
//    
//    
//
//    @Test(priority = 35)
//
//    public void SideNavAddsocialmedialinkinstagram35() throws InterruptedException {
//
//        OpenSideNav();
//
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
//        System.out.println("TC02- Click on Setting");
//        driver.findElement(
//                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
//        clickAndWaitForElementWithId("com.threesixteen.app:id/et_instagram");
//        (driver).findElement(By.id("com.threesixteen.app:id/et_instagram")).sendKeys("123");
//        System.out.println("TC03- added insta link to profile");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
//        System.out.println("TC04- click on done");
//        OpenSideNav();
//
//        clickAndWaitForElementWithId("com.threesixteen.app:id/txt_name");
//        System.out.println("TC06- opens self profile");
//        clickAndWaitForElementWithXpath1(
//                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.widget.LinearLayout[1]/android.widget.ImageView");
//        System.out.println("TC07- Click on instagram icon");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[contains(@text,'Instagram')]")).click();
//        System.out.println("TC08- Opoen instagram");
//        Thread.sleep(1000);
//        clickAndWaitForElementWithXpath1("//android.widget.ImageButton[@content-desc=\"Close tab\"]");
//        System.out.println("TC09- Close browser");
//        Thread.sleep(1000);
//        clickAndWaitForElementWithXpath1(
//                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.widget.LinearLayout[1]/android.widget.ImageView");
//        System.out.println("TC10- instagram link added sucessfully");
//        Thread.sleep(1000);
//        driver.navigate().back();
//        Thread.sleep(1000);
//        driver.navigate().back();
//        Thread.sleep(1000);
//        driver.navigate().back();
//
//
//    }
    
    
    
    
    
    @Test(priority = 36)
    public void day1buypro36() throws InterruptedException {

        OpenSideNav();
        Thread.sleep(1000);
        if (isvisibleithXpath1("//*[contains(@text,'Buy Pro')]")) {
        String targetText = "Buy Pro";
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


//        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]/android.widget.Button[1]");
//      System.out.println("TC03- click on buy button for 7 day");
//      Thread.sleep(3000);  

      clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]/android.view.View[1]/android.widget.Button[1]");
      System.out.println("TC03- click on buy button for 1 day");
      Thread.sleep(3000);  
      clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]/android.widget.Button[1]");
      System.out.println("TC03- click on buy button for 1 day");
      Thread.sleep(3000);  
      
//    driver.findElement(By.xpath("//*[contains(@text,'Continue')]")).click();
//    System.out.println("TC03- click on continue");
//    Thread.sleep(3000);  
        }
       
    }
    
    
    
    
    @Test(priority = 37)
    public void day7buypro37() throws InterruptedException {

        OpenSideNav();
        Thread.sleep(1000);
        if (isvisibleithXpath1("//*[contains(@text,'Buy Pro')]")) {
        String targetText = "Buy Pro";
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


        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]/android.widget.Button[1]");
      System.out.println("TC03- click on buy button for 7 day");
      Thread.sleep(3000);  
        }
      
//    driver.findElement(By.xpath("//*[contains(@text,'Continue')]")).click();
//    System.out.println("TC03- click on continue");
//    Thread.sleep(3000);  

       
    }
    
    
    
    
    
    @Test(priority = 38)
    public void day7buypro338() throws InterruptedException {

        OpenSideNav();
        if (isvisibleithXpath1("//*[contains(@text,'Buy Pro')]")) {
        Thread.sleep(3000);  
        String targetText = "Buy Pro";
        boolean textFound = false;
        int maxScrolls = 5; 

        for (int i = 0; i < maxScrolls && !textFound; i++) {
            try {
                driver.findElement(
               		 AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + targetText + "\"))"));         
                textFound = true;
//                System.out.println("TC02- Product description scrolled and found");
            } catch (Exception e) {
                driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
                Thread.sleep(1000); 
            }
        }
        Thread.sleep(3000);  
        driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
        System.out.println("Clicking on: " + targetText);
        Thread.sleep(5000);  
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]/android.view.View[1]/android.widget.Button[2]")).click();    
        System.out.println("TC03- click on buy button for week subscription day");
        Thread.sleep(3000);  
          }
      
//    driver.findElement(By.xpath("//*[contains(@text,'Continue')]")).click();
//    System.out.println("TC03- click on continue");
//    Thread.sleep(3000);  

       
    }
    
    
    
    @Test(priority = 39)
    public void DonationLeaderbaord39() throws InterruptedException {

    
    OpenSideNav();
    Thread.sleep(2000); 

    
    String targetText = "Donation Leaderboard";
    boolean textFound = false;
    int maxScrolls = 5; 

    for (int i = 0; i < maxScrolls && !textFound; i++) {
        try {
            driver.findElement(
           		 AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + targetText + "\"))"));         
            textFound = true;
            } catch (Exception e) {
            driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
        }
    }
    driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
    System.out.println("Clicking on: " + targetText);
    Thread.sleep(2000); 
    driver.findElement(
            AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(5)"));
    System.out.println("TC02- Scoll down ");
//    clickAndWaitForElementWithXpath1("//*[contains(@text,'Delete Account')]");
//    System.out.println("TC02- Click on delete account");
//    


}


    
    
    @Test(priority = 40)
    public void RedeemedSectionBackRedirection40() throws InterruptedException {

        OpenSideNav();
        Thread.sleep(1000);
        String targetText = "Rewards";
        boolean textFound = false;
        int maxScrolls = 2; 

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
        Thread.sleep(10000);

        SkipSurvey();
         SkipAd();
         SkipAd();

//        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.GridView/android.widget.FrameLayout[1]");
        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View");
        System.out.println("TC02- Gaming section  open in Rewards");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[5]");
        System.out.println("TC03- Redemmed hHistory section  open in Rewards");
        Thread.sleep(1000);

        String targetText1 = "Google Play Gift Card Rs 25";
        boolean textFound1 = false;
        int maxScrolls1 = 2; 

        for (int i = 0; i < maxScrolls1 && !textFound1; i++) {
            try {
                driver.findElement(
               		 AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + targetText1 + "\"))"));         
                textFound1 = true;
                System.out.println("Found item: " + targetText1);
//                System.out.println("TC04- Product description scrolled and found");
            } catch (Exception e) {
                driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
            }
        }
        
        if (isVisibleWithXPath1("//*[contains(@text,'" + targetText1 + "')]")) {
        driver.findElement(By.xpath("//*[contains(@text,'" + targetText1 + "')]")).click();
        System.out.println("Clicking on: " + targetText1);
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
//        driver.navigate().back();
        Thread.sleep(2000);

        System.out.println("TC04- Back from Redemmed  history section");
        Thread.sleep(10000);
        
        
        String targetText11 = "Google Play Gift Card Rs 25";
        boolean textFound11 = false;
        int maxScrolls11 = 2; 

        for (int i = 0; i < maxScrolls11 && !textFound11; i++) {
            try {
                driver.findElement(
               		 AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + targetText11 + "\"))"));         
                textFound11 = true;
                System.out.println("Found item: " + targetText11);
            } catch (Exception e) {
                driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
            }
        }
//        if (isvisibleithXpath1("//*[contains(@text,'" + targetText11 + "')]")) {
        driver.findElement(By.xpath("//*[contains(@text,'" + targetText11 + "')]")).click();
        System.out.println("Clicking on: " + targetText11);
        Thread.sleep(2000);
        driver.navigate().back();
        System.out.println("TC05- Back from redeem history");
        Thread.sleep(2000);
        
        
     
        }


        }
    
    
    
   
    
    
    
    
	
    }




