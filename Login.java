package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Login {
    private AppiumDriver<MobileElement> driver;

    public Login(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath="(//android.widget.TextView)[1]")
    private AndroidElement skip;
    @AndroidFindBy(xpath ="//android.widget.Button[@text='Select Manually']")
    private AndroidElement loc;
    @AndroidFindBy(xpath="//android.widget.TextView[@text='Bengaluru']")
    private AndroidElement bangaluru;
    @AndroidFindBy(xpath="//android.widget.TextView[@text='Pune']")
    private AndroidElement pune;


    public void Skipbutton(){

        skip.click();

    }
    public void Location() {
        loc.click();

    }

     public void CitynameA() {

       bangaluru.click();

}
    public void CitynameB() {

        pune.click();

    }


    }

