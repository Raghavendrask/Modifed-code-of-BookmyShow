package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Acceptbuttonpage {
    private AppiumDriver<MobileElement> driver;

    public Acceptbuttonpage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }
    @AndroidFindBy(xpath = "(//android.widget.LinearLayout)[4]/android.widget.Button[2]")
    private AndroidElement accept;

    public void Acceptbutton() {

        accept.click();

    }
}






