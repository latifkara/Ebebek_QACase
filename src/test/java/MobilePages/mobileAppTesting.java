package MobilePages;


import Devices.mappingAppium;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.security.Key;

public class mobileAppTesting {
    By search = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText");
    public AppiumDriver driver;
    mappingAppium appium = new mappingAppium();

    @Test
    public void mobileAppTest() throws MalformedURLException, InterruptedException {
        driver = appium.setMobile();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Chrome']")).click();
        Thread.sleep(4000);
        driver.findElement(search).click();
        driver.findElement(search).clear();
        driver.findElement(search).sendKeys("https://ebebek.com");
        driver.findElement(search).sendKeys(Keys.ENTER);

    }
}
