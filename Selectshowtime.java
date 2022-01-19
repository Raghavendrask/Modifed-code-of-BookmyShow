package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Selectshowtime {
    private AppiumDriver<MobileElement> driver;

    public Selectshowtime(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath ="//android.widget.TextView[@text='01:30 PM']")
    private AndroidElement time;
    @AndroidFindBy(xpath ="//android.widget.TextView[@text='03:15 PM']")
    private AndroidElement timeb;
    @AndroidFindBy(xpath ="//android.widget.TextView[@text='03:15 PM']")
    private AndroidElement timec;


    public void TimeoptionA() {

        time.click();
    }
    public void TimeoptionB() {

        timeb.click();
    }
}

