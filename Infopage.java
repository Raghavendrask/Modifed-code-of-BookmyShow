package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Infopage {
    private AppiumDriver<MobileElement> driver;

    public Infopage(AppiumDriver<MobileElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath="(//android.widget.TextView[@text='INFO'])[1]")
    private AndroidElement info;
    public void Infook(){

        info.click();
    }

}
