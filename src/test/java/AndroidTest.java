import com.tngtech.jgiven.junit.ScenarioTest;

import com.tngtech.jgiven.Stage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
//import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidTest {

    AppiumDriver driver;

    public class beforeAddingCapabilities extends Stage<beforeAddingCapabilities> {
        public beforeAddingCapabilities beforeTest() {
            return self();
        }
    }

    @BeforeAll()
    public void setUp() throws MalformedURLException {
        DesiredCapabilities cap =new DesiredCapabilities();

        cap.setCapability("deviceName", "emulator-5554");
        cap.setCapability("platformName", "android");
        cap.setCapability("appPackage", "de.payback.client.android");
        cap.setCapability("appActivity", "de.payback.app.deeplinks.StarterActivity");

//        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
    }

    public class locateElements extends Stage<locateElements> {
        public locateElements Locators() {
            return self();
        }
    }

    @Test
    public void elementTest(){

        MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[6]/android.view.View[3]/android.view.View[11]/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View/android.widget.EditText");
        el6.sendKeys("m.mahadkhurshid@hotmail.com");
        el6.click();
        MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout");
        el7.click();
        MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[6]/android.view.View[3]/android.view.View[20]/android.view.View[5]/android.widget.Button");
        el8.click();
        MobileElement el9 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[6]/android.view.View[3]/android.view.View[17]/android.view.View[2]/android.view.View[3]/android.view.View[1]");
        el9.click();
        MobileElement el10 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[6]/android.view.View[3]/android.view.View[20]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText");
        el10.sendKeys("Mahad");
        MobileElement el11 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[6]/android.view.View[3]/android.view.View[20]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText");
        el11.sendKeys("Khurshid");
        MobileElement el12 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[6]/android.view.View[3]/android.view.View[23]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText");
        el12.sendKeys("Pappelallee 18");
        MobileElement el13 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[6]/android.view.View[3]/android.view.View[26]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText");
        el13.sendKeys("36416");
        MobileElement el14 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[6]/android.view.View[3]/android.view.View[26]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText");
        el14.sendKeys("Frankfurt");
        MobileElement el15 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[6]/android.view.View[3]/android.view.View[23]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[1]");
        el15.sendKeys("24");
        MobileElement el16 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[6]/android.view.View[3]/android.view.View[23]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[2]");
        el16.sendKeys("07");
        MobileElement el17 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[6]/android.view.View[3]/android.view.View[23]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[3]");
        el17.sendKeys("1998");
        MobileElement el18 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[6]/android.view.View[3]/android.view.View[24]/android.view.View[2]/android.widget.Button");
        el18.click();
        MobileElement el19 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[6]/android.view.View[3]/android.view.View[20]/android.view.View[5]/android.view.View/android.view.View[3]/android.view.View/android.widget.EditText");
        el19.sendKeys("Testing123");
        el19.click();
        MobileElement el20 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[6]/android.view.View[3]/android.view.View[23]/android.view.View[2]/android.widget.Button");
        el20.click();
        MobileElement el21 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[6]/android.view.View[3]/android.view.View[21]/android.view.View[6]/android.widget.Button[1]");
        el21.click();
        MobileElement el22 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Coupons\"]/android.widget.FrameLayout/android.widget.ImageView");
        el22.click();
        MobileElement el23 = (MobileElement) driver.findElementById("de.payback.client.android:id/filter_button");
        el23.click();
        MobileElement el24 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[10]/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup");
        el24.click();
        MobileElement el25 = (MobileElement) driver.findElementById("de.payback.client.android:id/done");
        el25.click();
        MobileElement el26 = (MobileElement) driver.findElementById("de.payback.client.android:id/not_activated_button");
        el26.click();
    }

    public class runApp extends Stage<runApp> {
    public runApp apprunning() {
        return self();
    }
}
    @AfterTest
    public void tearDown(){
        if(null != driver){
            driver.quit();
        }

        System.out.println("Application started");
    }

}
