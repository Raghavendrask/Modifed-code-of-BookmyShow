import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.*;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Testcases extends Generic {

    @Test(enabled = true,groups = {"demo01"},retryAnalyzer= Analyzer.RetryAnalyzer.class,dataProvider = "create",
    description ="CHECK WEATHER USER ABLE TO BOOK TICKETS FOR TWO  DIFFERENT MOVIES FROM BANGALORE CITY")
    public void TESTA(String name) throws MalformedURLException {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Login ln = new Login(driver);
        ln.Skipbutton();
        ln.Location();
        ln.CitynameA();

        MobileElement element = driver.findElement(By.xpath(name));
        String moviename =element.getAttribute("text");
        element.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Bookticket bt = new Bookticket(driver);
        bt.Ticketbook();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Infopage in = new Infopage(driver);
        in.Infook();

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Selectdate da = new Selectdate(driver);
        da.Dateoption();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Selectshowtime tm = new Selectshowtime(driver);
        tm.TimeoptionA();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Acceptbuttonpage term = new Acceptbuttonpage(driver);
        term.Acceptbutton();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Numberofseats ns = new Numberofseats(driver);
        ns.Demo();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Selectseat set = new Selectseat(driver);
        set.Seatselect();

        if(moviename.equals("Bangaraju")) {
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            SelectseatNumber num = new SelectseatNumber(driver);
            num.Seatingarragnment(X1, Y1);
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            num.Seatingarragnment(A1, B1);
            driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
            num.Seatingarragnment(C1, D1);
        }
        else {
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            SelectseatNumber num = new SelectseatNumber(driver);
            num.Seatingarragnment(X2, Y2);
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            num.Seatingarragnment(A2, B2);
            driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
            num.Seatingarragnment(C2, D2);
        }

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Paypage pp = new Paypage(driver);
        pp.Paying();

        try {
            driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
            Skippage sk = new Skippage(driver);
            sk.Skippingpopup();
        }
        catch (Exception exp) {
            driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
            Conatactdetails cd = new Conatactdetails(driver);
            cd.Detailentrypage();
        }

        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        Paymentpage pe = new Paymentpage(driver);
        pe.Payableamount();

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Generic gn= new Generic();
        gn.Openapplication();
    }

    @DataProvider (name ="create")
    public Object[][] dpMethod() {
            return new Object[][]{{"//android.widget.TextView[@text='Bangarraju']"},
                                  {"//android.widget.TextView[@text='Badava Rascal']"}};
                                 }


    @Test(enabled = false,groups = {"demo01"},retryAnalyzer= Analyzer.RetryAnalyzer.class,dataProvider = "sample",
    description ="CHECK WEATHER USER ABLE TO BOOK TICKETS FOR TWO  DIFFERENT MOVIES FROM PUNE CITY")
    public void TESTB(String namesec,String moviename) throws MalformedURLException
  {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Login ln = new Login(driver);
        ln.Skipbutton();
        ln.Location();
        ln.CitynameB();

        MobileElement elementsec=driver.findElement(By.xpath(namesec));
       String movienamesec =elementsec.getAttribute("text");
       elementsec.click();


        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Bookticket bt = new Bookticket(driver);
        bt.Ticketbook();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Infopage in = new Infopage(driver);
        in.Infook();

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Selectdate da = new Selectdate(driver);
        da.Dateoption();

        driver.findElement(By.xpath(moviename)).click();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      Acceptbuttonpage term = new Acceptbuttonpage(driver);
        term.Acceptbutton();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Numberofseats ns = new Numberofseats(driver);
        ns.Demo();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Selectseat set = new Selectseat(driver);
        set.Seatselect();

        if(movienamesec.equals("Pushpa: The Rise - Part 01")) {
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            SelectseatNumber num = new SelectseatNumber(driver);
            num.Seatingarragnment(M1, N1);
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            num.Seatingarragnment(E1, F1);
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            num.Seatingarragnment(K1, L1);
        }
        else {
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            SelectseatNumber num = new SelectseatNumber(driver);
            num.Seatingarragnment(M2, N2);
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            num.Seatingarragnment(E2, F2);
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            num.Seatingarragnment(K2, L2);
        }

        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        Paypage pp = new Paypage(driver);
        pp.Paying();

        try {
            driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
            Skippage sk = new Skippage(driver);
            sk.Skippingpopup();
        }
        catch (Exception exp) {
            driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
            Conatactdetails cd = new Conatactdetails(driver);
            cd.Detailentrypage();
        }

        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        Paymentpage pe = new Paymentpage(driver);
        pe.Payableamount();

        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        Generic gn= new Generic();
        gn.Openapplication();

    }
    @DataProvider (name ="sample")
    public Object[][] Method() {
          return new Object[][]{
    {"//android.widget.TextView[@text='Pushpa: The Rise - Part 01']","(//android.widget.TextView[@text='03:15 PM'])[2]"},
    {"//android.widget.TextView[@text='83']","//android.widget.TextView[@text='03:15 PM']"}};
                               }

}







