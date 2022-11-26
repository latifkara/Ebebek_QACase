package framework;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class Hooks {
    private Properties properties;
    private WebDriver driver;
    @Before
    public void setBrowser(){
       driver = DriverSetup.initialize_Driver(ConfigReader.initialize_Properties().getProperty("browser"));
    }

    @After
    public void closeBrowser(){
        driver.quit();
    }
}
