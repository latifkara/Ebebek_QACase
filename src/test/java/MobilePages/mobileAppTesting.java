package MobilePages;


import Devices.mappingAppium;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.security.Key;
import java.util.concurrent.TimeUnit;

public class mobileAppTesting {
    By search = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText");
    By path = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView[2]");
    By searchElement = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View[3]/android.view.View[2]/android.view.View/android.widget.EditText");
    By searchByPath = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View[4]/android.view.View[2]/android.view.View/android.widget.EditText");

    public AppiumDriver driver;
    mappingAppium appium = new mappingAppium();

    @Test
    public void mobileAppTest() throws MalformedURLException, InterruptedException {
        driver = appium.setMobile();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Chrome']")).click();
        Thread.sleep(4000);
        driver.findElement(search).click();
        driver.findElement(new By.ById("com.android.chrome:id/url_bar")).clear();
        driver.findElement(new By.ById("com.android.chrome:id/url_bar")).sendKeys("https://www.ebebek.com");
        driver.findElement(path).click();

    }

    @Test
    public void searchElement() throws MalformedURLException, InterruptedException {
        driver = appium.setMobile();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(searchElement).click();
        Thread.sleep(2000);
        driver.findElement(searchByPath).sendKeys("kaşık maması");
        driver.findElement(searchByPath).sendKeys();
    }
}
