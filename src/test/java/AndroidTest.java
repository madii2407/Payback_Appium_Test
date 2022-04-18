import io.appium.java_client.AppiumDriver;
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

    @Test()
    public void setUp() throws MalformedURLException {
        DesiredCapabilities cap =new DesiredCapabilities();

        cap.setCapability("deviceName", "emulator-5554");
        cap.setCapability("platformName", "android");
        cap.setCapability("appPackage", "de.payback.client.android");
        cap.setCapability("appActivity", "de.payback.app.deeplinks.StarterActivity");

//        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
    }


}
