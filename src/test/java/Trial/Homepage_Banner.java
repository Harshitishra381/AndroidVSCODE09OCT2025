package Trial;

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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.SupportsRotation;

import org.apache.commons.io.comparator.DefaultFileComparator;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.image.BufferedImage;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import javax.imageio.ImageIO;

public class Homepage_Banner<MobileElement, Rotatable> extends Functions {


	

	  private static final String ImageComparator = null;
	private Object image1;
	private Object image2;





	@Test(priority = 1)
		public void Homepagebanner01() throws InterruptedException, MalformedURLException {

		    Thread.sleep(1000);
		    if (isVisibleWithId("com.threesixteen.app:id/layout_google_ad_banner")) {
		    	
		    	System.out.println("TC01- Homepage Banner is coming");
		    }

		    else
		    {
	            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_banner");
		    	System.out.println("TC02- Homepage Banner is not coming");

		    }
	  }
	     

	  
	  

		    @Test(priority = 2)
			public void TaskPagebanner02() throws InterruptedException, MalformedURLException {

			    Thread.sleep(1000);
			    OpenTaskPage();
			    Thread.sleep(3000);

			    if (isVisibleWithId("com.threesixteen.app:id/iv_banner")) {
			    	
			    	System.out.println("TC01- Task page Banner is coming");
			    }

			    else
			    {
		           
			    	System.out.println("TC02- Task Page Banner is not coming right now , another layout is visible");

			    }
		     

	  }
		    
		    
		    
		
		
		    
		    

	@AfterMethod
	
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}



