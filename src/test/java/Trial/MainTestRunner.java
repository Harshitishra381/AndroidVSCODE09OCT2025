package Trial;
import org.testng.TestNG;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MainTestRunner {

    public static void main(String[] args) throws InterruptedException {
        TestNG testng = new TestNG(); // Step 1: Create a TestNG object
        List<String> suites = new ArrayList<>();
        
        
        
        // Step 2: Add your main suite XML file (which includes all test classes)
        suites.add("testng.xml"); // Replace with your actual XML filename
        testng.setTestSuites(suites);
        testng.run(); // Step 3: Run the main suite

        
        
        Thread.sleep(30000);
        
        
        
        
        // Step 4: Check if failed test suite was generated
        File failedXml = new File("test-output/testng-failed.xml");
        if (failedXml.exists()) {
            System.out.println("Re-running failed tests...");
            TestNG retryTestNG = new TestNG();
            List<String> failedSuites = new ArrayList<>();
            failedSuites.add(failedXml.getAbsolutePath());
            retryTestNG.setTestSuites(failedSuites);
            retryTestNG.run(); // Step 5: Run the failed suite automatically
        }
    }
}
