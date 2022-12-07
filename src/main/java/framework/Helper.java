package framework;

import lombok.Getter;
import org.junit.jupiter.api.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.crypto.Data;
import java.sql.Date;
import java.sql.Time;
import java.time.Duration;
import java.util.List;

@Getter
public class Helper {

    private WebDriver driver;
    private WebDriverWait wait;

    public Helper(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebElement findElement(By element){
        this.waitUntil(element);
        return this.driver.findElement(element);
    }

    public List<WebElement> findElements(By element){
        this.waitUntil(element);
        return this.driver.findElements(element);
    }

    public void click(By element){
        this.findElement(element).click();
    }

    public void sendKeys(By element, CharSequence keys){
        this.findElement(element).sendKeys(keys);
    }

    public void waitUntil(By element){
        this.wait.until(ExpectedConditions.elementToBeClickable(element));
    }


}
