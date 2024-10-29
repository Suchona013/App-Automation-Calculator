import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Setup {
    AndroidDriver driver;
    ExtentReports extent;  // Shared ExtentReports instance
    ExtentTest test;

    // Set up Extent Report once for the entire suite
    @BeforeSuite
    public void setUpReport() {
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("./reports/extent-report.html");
        sparkReporter.config().setTheme(Theme.STANDARD);
        sparkReporter.config().setDocumentTitle("Appium Automation Report");
        sparkReporter.config().setReportName("Test Execution Report");

        // Initialize ExtentReports and attach the SparkReporter
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        // Optional: Set system info
        extent.setSystemInfo("Platform", "Android");
        extent.setSystemInfo("Tester", "QA Team");
    }

    // Initialize the Android driver before each test
    @BeforeTest
    public AndroidDriver setup() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:udid", "FYQCLVIV7HZP7XF6");
        capabilities.setCapability("appium:platformVersion", "12");
        capabilities.setCapability("appium:appPackage", "com.bng.calculator");
        capabilities.setCapability("appium:appActivity", "com.bng.calc.MainActivity");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:automationName", "UiAutomator2");
        capabilities.setCapability("appium:autoGrantPermissions", "true");
        capabilities.setCapability("appium:ensureWebviewsHavePages", true);
        capabilities.setCapability("appium:nativeWebScreenshot", true);
        capabilities.setCapability("appium:newCommandTimeout", 3600);
        capabilities.setCapability("appium:connectHardwareKeyboard", true);

        // Connect to Appium server
        URL url = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(url, capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Log driver setup in the report
        test = extent.createTest("Driver Setup", "Initialize the Android Driver");
        test.pass("Driver initialized successfully");
        return driver;
    }

    @AfterTest
    public void appClose(){
        driver.quit();
    }

    @AfterSuite
    public void tearDownReport() {
        if (extent != null) {
            extent.flush();  // This ensures the report is written to disk
        }
    }
}
