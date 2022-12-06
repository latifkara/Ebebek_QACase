package framework;

import lombok.Getter;
import lombok.Setter;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

@Getter
public class Hooks {
    public static WebDriver driver;
    public EnvConfiguration properties;

    public Hooks(){
        properties = new EnvConfiguration();
    }
    public WebDriver setAndGetChrome(){
        System.out.println("Hooks");
        System.out.println(properties.getUrl());
        driver = DriverSetup.initialize_Driver(properties);
        return driver;
    }

    public void closeBrowser(){
        driver.quit();
    }
}
