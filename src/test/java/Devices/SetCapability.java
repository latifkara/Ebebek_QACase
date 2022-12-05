package Devices;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.URL;

public class SetCapability {
    public AppiumDriver driver;
    public AppiumDriver setMobile() throws IOException {
        MappingAppium map = new MappingAppium();
        MobileDevices devices = map.convertToObject();
        DesiredCapabilities desired = new DesiredCapabilities();
        desired.setCapability(CapabilityType.BROWSER_NAME, "");
        desired.setCapability("appium:deviceName", devices.getDeviceName());
        desired.setCapability("appium:automationName", devices.getAutomationName());
        desired.setCapability("appium:platformVersion", devices.getPlatformVersion());
        desired.setCapability("appium:platformName", devices.getPlatformName());
        desired.setCapability("appium:skipUnlock", devices.getSkipUnlock());
        desired.setCapability("appium:newCommandTimeout", devices.getNewCommandTimeout());
        desired.setCapability("appium:connectHardwareKeyboard", devices.getConnectHardwareKeyboard());
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), desired);
        return driver;
    }
}
