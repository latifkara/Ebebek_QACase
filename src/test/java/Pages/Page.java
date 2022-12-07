package Pages;

import framework.DriverSetup;
import framework.Helper;
import framework.Hooks;
import lombok.NoArgsConstructor;
import org.openqa.selenium.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Page {
    By searchBar = new By.ByCssSelector("input#txtSearchBox");
    By lastItem = new By.ByXPath("/html/body/app-root/cx-storefront/main/cx-page-layout/cx-page-slot[3]/eb-product-list/div/section/div/div/div/div[2]/eb-product-scroll/div/div/eb-product-list-item[43]/div/eb-generic-link/a");
    By allProduct = new By.ByXPath("/html/body/app-root/cx-storefront/main/cx-page-layout/cx-page-slot[3]/eb-product-list/div/section/div/div/div/div[2]/eb-product-scroll/div/div/eb-product-list-item");
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
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) this.helper.getDriver();
        this.helper.getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        this.helper.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        javascriptExecutor.executeScript("window.scrollBy(0,1000)");
        List<WebElement> productList = this.helper.findElements(allProduct);
        System.out.println(productList.size());
        int lastElement = (productList.size() - 1);
        String last = productList.get(lastElement).getTagName();
        System.out.println(last);
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", lastItem);
        //this.helper.click(lastItem);

    }
}
