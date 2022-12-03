package Devices;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class mappingAppium {
    public AppiumDriver driver;
    public void setMobile() throws MalformedURLException {

        DesiredCapabilities desired = new DesiredCapabilities();
        desired.setCapability(CapabilityType.BROWSER_NAME, "");
        desired.setCapability("deviceName", "Galaxy S5");
        desired.setCapability("platformVersion", "4.4");
        desired.setCapability("platformName", "Android");
        desired.setCapability("skipUnlock", "true");
        desired.setCapability("app", System.getProperty("user.dir") + "/src/test/resource/App/ebebek.apk");
        desired.setCapability("fullReset", "true");
        desired.setCapability("noReset", "true");

        driver = new AndroidDriver(new URL("http:/0.0.0.0:4723"), desired);


    }
}
