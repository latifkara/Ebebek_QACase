package framework;

import lombok.Getter;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

@Getter
public class Hooks {
    static WebDriver driver;
    static Properties properties;
    @Before
    public void setChrome(){
       driver = DriverSetup.initialize_Driver(properties.getProperty("browser"));
    }

    @After
    public void closeBrowser(){
        driver.quit();
    }
}
