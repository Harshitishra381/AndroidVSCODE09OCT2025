package IOS;

import org.testng.annotations.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Capabilities;
import org.testng.annotations.BeforeMethod;

public class Login_ProUser  {


   
   

    static AppiumDriver driver;
    private Capabilities cap;


    @BeforeMethod
    public void setup() throws MalformedURLException, InterruptedException {

    	   DesiredCapabilities cap = new DesiredCapabilities();  		
   		 
           cap.setCapability("platformName", "IOS");
           cap.setCapability("platformVersion", "17.5");
           cap.setCapability("App", "/Users/rooter/Desktop/Rooter.app");
           cap.setCapability("UDID", "A5F83732-933C-4AC9-9B1C-F4CEF01742D5");
           cap.setCapability("autoGrantPermissions", true);
           cap.setCapability("ignoreHiddenApiPolicyError", true);
           cap.setCapability("noReset", false);
           cap.setCapability("deviceName", "iPhone Simulator");

           URL url = new URL("http://127.0.0.1:4723/wd/hub/");
           driver = new AppiumDriver(url, cap);
           System.out.println("Application started");
           Thread.sleep(5000);


        }

    
    
    
    @Test(priority = 1)
    public void Dummytest01() throws InterruptedException {

//     OpenCentralReeltab();
        Thread.sleep(500);
}


	
    }
