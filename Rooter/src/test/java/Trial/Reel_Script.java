package Trial;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import org.openqa.selenium.By;

public class Reel_Script extends Functions {

    @BeforeMethod
    public void setUp() {
        // Setup code for initializing Appium driver and other configurations
    }

    @Test(priority = 1)
    public void CentralReelTest1() throws InterruptedException {
        OpenCentralReeltab();
        ReelTest();
    }

    @Test(priority = 2)
    public void SearchReelTest2() throws InterruptedException {
        OpenSearch();
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        Thread.sleep(1000);
        driver.findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("bgmi");
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(@text,'Reels')]")).click();
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.GridView/android.view.ViewGroup[1]");
        Thread.sleep(2000);
        ReelTest();
    }

    @Test(priority = 3)
    public void SelfProfieReelTest3() throws InterruptedException {
        OpenSideNav();
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/txt_name");
        Thread.sleep(1000);
        // Additional logic for opening reels from profile
        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.view.ViewGroup[1]/android.widget.ImageView");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_comment");
        Thread.sleep(1000);
        // Additional logic for commenting on reels
    }

    // Additional test methods...

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}