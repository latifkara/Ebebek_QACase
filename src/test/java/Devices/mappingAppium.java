package Devices;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class mappingAppium {
    public AppiumDriver driver;
    public AppiumDriver setMobile() throws MalformedURLException {

        DesiredCapabilities desired = new DesiredCapabilities();
        desired.setCapability(CapabilityType.BROWSER_NAME, "");
        desired.setCapability("appium:deviceName", "Pixel 4 API 30");
        desired.setCapability("appium:automationName", "uiautomator2");
        desired.setCapability("appium:platformVersion", "11.0");
        desired.setCapability("appium:platformName", "Android");
        desired.setCapability("appium:skipUnlock", "true");
//        desired.setCapability("appium:fullReset", "true");
//        desired.setCapability("appium:noReset", "false");
        desired.setCapability("appium:newCommandTimeout", 3600);
        desired.setCapability("appium:connectHardwareKeyboard", true);

       // desired.setCapability("appium:app", System.getProperty("user.dir") + "\\src\\test\\resource\\App\\ebebek.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), desired);
        return driver;

    }
}
