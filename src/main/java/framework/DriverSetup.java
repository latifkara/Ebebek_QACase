package framework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverSetup {
    static By closePage = new By.ByXPath("/html/body/div[3]/div/div[1]/img");
    static WebDriver driver;
    //static EnvConfiguration properties;

    public static WebDriver initialize_Driver(EnvConfiguration properties){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.setExperimentalOption("excludeSwitches", "disable-popup-blocking");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); //removes the banner
        switch (properties.getBrowser()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(options);
                break;
            case "Firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
        }
        System.out.println(properties.getUrl());
        String url = properties.getUrl();
        int impWait = properties.getImplicityWait();
        int pageWait = properties.getPageLoadTimeout();
        driver.get(url);
        driver.manage().window().maximize();
//        System.out.println(driver.findElement(closePage).isDisplayed());
//        if (driver.findElement(closePage).isEnabled()){
//            driver.findElement(closePage).click();
//        }
        driver.manage().timeouts().pageLoadTimeout(impWait, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(pageWait, TimeUnit.SECONDS);
        return getDriver();
    }

    public static WebDriver getDriver(){
//        Hooks hooks = new Hooks();
//        hooks.setChrome();
        return driver;
    }


}