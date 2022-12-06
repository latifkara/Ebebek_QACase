package Pages;

import framework.DriverSetup;
import framework.Helper;
import framework.Hooks;
import lombok.NoArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Page {
    By searchBar = new By.ByCssSelector("input#txtSearchBox");
    Hooks hooks;
    WebDriver driver;
    Helper helper;
    public Page(){
        this.hooks = new Hooks();
        this.driver = this.hooks.setAndGetChrome();
        helper = new Helper(this.driver);
    }
    public void searchElement(){
        this.helper.click(searchBar);
        this.helper.sendKeys(searchBar, "kaşık maması");
        this.helper.sendKeys(searchBar, Keys.ENTER);
    }
}
