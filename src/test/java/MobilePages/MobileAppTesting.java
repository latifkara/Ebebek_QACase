package MobilePages;


import Devices.MappingAppium;
import Devices.MobileDevices;
import Devices.SetCapability;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class MobileAppTesting {
    By search = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText");
    By path = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView[2]");
    By searchElement = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View[3]/android.view.View[2]/android.view.View/android.widget.EditText");
    By searchByPath = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View[4]/android.view.View[2]/android.view.View/android.widget.EditText");

    public AppiumDriver driver;
    SetCapability capability = new SetCapability();

    @Test
    public void TestDevices(){
        MappingAppium mapping = new MappingAppium();
        try {
            mapping.convertToObject();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void mobileAppTest() throws IOException, InterruptedException {
        driver = capability.setMobile();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Chrome']")).click();
        Thread.sleep(4000);
        driver.findElement(search).click();
        driver.findElement(new By.ById("com.android.chrome:id/url_bar")).clear();
        driver.findElement(new By.ById("com.android.chrome:id/url_bar")).sendKeys("https://www.ebebek.com");
        driver.findElement(path).click();

    }

    @Test
    public void searchElement() throws IOException, InterruptedException {
        driver = capability.setMobile();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(searchElement).click();
        Thread.sleep(2000);
        driver.findElement(searchByPath).sendKeys("kaşık maması");
        driver.findElement(searchByPath).sendKeys();
    }
}
