package Trial;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;



public class Scroll_Script<MobileElement, Rotatable> extends Functions {


	
  
    
    
   
    
    
    @Test(priority = 1)
    
    
    public void BGMiSearchCreatorListScroll1() throws InterruptedException, MalformedURLException {

        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView");
        System.out.println("TC01- Open Search");
		Thread.sleep(2000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
		Thread.sleep(2000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("BGMI");
        System.out.println("TC03- Type BGMI in search");
		Thread.sleep(2000);
    	 driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(@text,'Creators')]")).click();
        System.out.println("TC05- Click on creator tab");
		Thread.sleep(2000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
        System.out.println("TC06- open profile");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));
        Thread.sleep(1000);
        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]"))
        { clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
        System.out.println("TC07- open profile");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        }
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));
        Thread.sleep(1000);
        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]"))
        { clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
        System.out.println("TC08- open profile");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        }
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));
        Thread.sleep(1000);
        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]"))
        { clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
        System.out.println("TC09- open profile");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        }
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));
        Thread.sleep(1000);
        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]"))
        { clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
        System.out.println("TC10- open profile");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        }
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(4)"));
        Thread.sleep(1000);
        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]"))
        { clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
        System.out.println("TC11- open profile");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        }
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(4)"));
        System.out.println("TC12- Creator List Scrolled");
        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]"))
        { clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
        System.out.println("TC13- open profile");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(4)"));
        System.out.println("TC14- Creator List Scrolled");
        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]"))
        { clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
        System.out.println("TC15- open profile");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        }
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(4)"));
        System.out.println("TC16- Creator List Scrolled");
        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]"))
        { clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
        System.out.println("TC17- open profile");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        }
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(4)"));
        System.out.println("TC18- Creator List Scrolled");
        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]"))
        { clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
        System.out.println("TC19- open profile");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        }
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(4)"));
        System.out.println("TC20- Creator List Scrolled");
        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]"))
        { clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
        System.out.println("TC21- open profile");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        }
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(4)"));
        System.out.println("TC22- Creator List Scrolled");
        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]"))
        { clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
        System.out.println("TC23- open profile");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        }
        }

    }
	
    
    
   

    @Test(priority = 2)
    
    public void MinecraftSearchReelScroll2() throws InterruptedException, MalformedURLException {

        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView");
        System.out.println("TC01- Open Search");
		Thread.sleep(2000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
		Thread.sleep(2000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Minecraft");
        System.out.println("TC02- Type Minecraft in search");
		Thread.sleep(2000);
   	    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(@text,'Reels')]")).click();
        System.out.println("TC05- open reels tab from search");
		Thread.sleep(2000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.GridView/android.view.ViewGroup[1]");
        System.out.println("TC06- Open first reel from search");
        Thread.sleep(1000);
        if (isVisibleWithId("com.threesixteen.app:id/iv_like")) {
        	 driver.findElement(
                     AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
            Thread.sleep(1000);
            System.out.println("TC07-  Reel from search Scrolled");
        }
        if (isVisibleWithId("com.threesixteen.app:id/iv_like")) {
       	 driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
           Thread.sleep(1000);
           System.out.println("TC08-  Reel from search Scrolled");
       }
        if (isVisibleWithId("com.threesixteen.app:id/iv_like")) {
       	 driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
           Thread.sleep(1000);
           System.out.println("TC09-  Reel from search Scrolled");
       }

        if (isVisibleWithId("com.threesixteen.app:id/iv_like")) {
       	 driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
           Thread.sleep(1000);
           System.out.println("TC10-  Reel from search Scrolled");
       }

        if (isVisibleWithId("com.threesixteen.app:id/iv_like")) {
       	 driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
           Thread.sleep(1000);
           System.out.println("TC11-  Reel from search Scrolled");
       }

        if (isVisibleWithId("com.threesixteen.app:id/iv_like")) {
       	 driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
           Thread.sleep(1000);
           System.out.println("TC12-  Reel from search Scrolled");
       }
        if (isVisibleWithId("com.threesixteen.app:id/iv_like")) {
       	 driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
           Thread.sleep(1000);
           System.out.println("TC13-  Reel from search Scrolled");
       }


        
    }
    
    
    
	
    @Test(priority = 03)

    public void SearchVideoScroll03() throws InterruptedException {

        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView");
        System.out.println("TC01- Open Search");
		Thread.sleep(2000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
		Thread.sleep(2000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("bgmi");
        System.out.println("TC03- Type bgmi in search");
		Thread.sleep(2000);
	    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(@text,'Videos')]")).click();
        System.out.println("TC05- Click on Videos tab");
        Thread.sleep(3000);
        if (isVisibleWithId("com.threesixteen.app:id/video_timer")) {
        	driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
           Thread.sleep(1000);   
           System.out.println("TC06- Video page Page scrolled");
           }
        if (isVisibleWithId("com.threesixteen.app:id/video_timer")) {
        	driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
           Thread.sleep(1000);   
           System.out.println("TC07- Video page Page scrolled");
           }
        if (isVisibleWithId("com.threesixteen.app:id/video_timer")) {
        	driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
           Thread.sleep(1000);   
           System.out.println("TC08- Video page Page scrolled");
           }
        if (isVisibleWithId("com.threesixteen.app:id/video_timer")) {
        	driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
           Thread.sleep(1000);   
           System.out.println("TC09- Video page Page scrolled");
           }
        if (isVisibleWithId("com.threesixteen.app:id/video_timer")) {
        	driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
           Thread.sleep(1000);   
           System.out.println("TC10- Video page Page scrolled");
           }
        if (isVisibleWithId("com.threesixteen.app:id/video_timer")) {
        	driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
           Thread.sleep(1000);   
           System.out.println("TC11- Video page Page scrolled");
           }
        if (isVisibleWithId("com.threesixteen.app:id/video_timer")) {
        	driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
           Thread.sleep(1000);   
           System.out.println("TC12- Video page Page scrolled");
           }
        if (isVisibleWithId("com.threesixteen.app:id/video_timer")) {
        	driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
           Thread.sleep(1000);   
           System.out.println("TC13- Video page Page scrolled");
           }
        if (isVisibleWithId("com.threesixteen.app:id/video_timer")) {
        	driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
           Thread.sleep(1000);   
           System.out.println("TC14- Video page Page scrolled");
           }
        if (isVisibleWithId("com.threesixteen.app:id/video_timer")) {
        	driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
           Thread.sleep(1000);   
           System.out.println("TC15- Video page Page scrolled");
           }
        if (isVisibleWithId("com.threesixteen.app:id/video_timer")) {
        	driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
           Thread.sleep(1000);   
           System.out.println("TC16- Video page Page scrolled");
           }
        if (isVisibleWithId("com.threesixteen.app:id/video_timer")) {
        	driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
           Thread.sleep(1000);   
           System.out.println("TC17- Video page Page scrolled");
           }
       
        
    }
    
 
 
 
 
 
 

	@AfterMethod
	
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}



