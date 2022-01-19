package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;


public class Numberofseats {
    private AppiumDriver<MobileElement> driver;

    public Numberofseats(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void Demo() {

        MobileElement seek_bar = driver.findElement(By.xpath("//android.widget.SeekBar"));
        int start=seek_bar.getLocation().getX();
        int y=seek_bar.getLocation().getY();
        int end= (start+seek_bar.getSize().getWidth());
        int moveTo=(int) (start+(seek_bar.getSize().getWidth())*0.20);
        AndroidTouchAction action=new AndroidTouchAction(driver);
        action.press(PointOption.point(start,y)).moveTo(PointOption.point(moveTo,y)).release().perform();
    }

}
