package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Helper {

    private WebDriver driver;

    public Helper(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement findElement(By element){
        return this.driver.findElement(element);
    }
    public void click(By element){
        this.findElement(element).click();
    }


}
