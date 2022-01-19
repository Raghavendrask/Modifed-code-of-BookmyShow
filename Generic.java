import com.bookmyshow.qa.Configconstants;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.net.MalformedURLException;
import java.net.URL;


public class Generic extends Configconstants {
    static AppiumDriver<MobileElement> driver;

    @BeforeTest()
    public void Openapplication() throws MalformedURLException {
        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,Platform);
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,Automation);
        caps.setCapability("appPackage",Apppackage);
        caps.setCapability("appActivity",AppActivity);
        URL url = new URL(SERVER_URL);
        driver = new AppiumDriver<MobileElement>(url,caps);
    }

    @AfterTest
    public void Closeapplication() {

        driver.quit();
    }

}

