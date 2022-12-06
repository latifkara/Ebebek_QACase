package Pages;

import framework.DriverSetup;
import framework.Helper;
import framework.Hooks;
import lombok.NoArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Page {
    By searchBar = new By.ByCssSelector("input#txtSearchBox");
    By lastItem = new By.ByXPath("/html/body/app-root/cx-storefront/main/cx-page-layout/cx-page-slot[3]/eb-product-list/div/section/div/div/div/div[2]/eb-product-scroll/div/div/eb-product-list-item[43]/div/eb-generic-link/a");
    Hooks hooks;
    WebDriver driver;
    Helper helper;
    public Page(){
        this.hooks = new Hooks();
        this.driver = this.hooks.setAndGetChrome();
        helper = new Helper(this.driver);
    }
    public void searchElement() throws InterruptedException {
        this.helper.click(searchBar);
        this.helper.sendKeys(searchBar, "kaşık maması");
        this.helper.sendKeys(searchBar, Keys.ENTER);
        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        //this.helper.waitUntil(lastItem);
        this.helper.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        jsx.executeScript("window.scrollBy(0,1000)", "");
        this.helper.click(lastItem);
    }
}
