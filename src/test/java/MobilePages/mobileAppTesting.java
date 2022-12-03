package MobilePages;


import Devices.mappingAppium;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class mobileAppTesting {
    public AppiumDriver driver;
    mappingAppium appium = new mappingAppium();

    @Test
    public void mobileAppTest() throws MalformedURLException {
        driver = appium.setMobile();
        driver.get("https://www.google.com");
    }
}
