package framework;

import lombok.Getter;
import lombok.Setter;

import java.util.Properties;

@Getter
@Setter
public class EnvConfiguration {
    private Properties properties;
    private String url;
    private int implicityWait;
    private int pageLoadTimeout;
    private String browser;

    public EnvConfiguration() {
        mappingToObject();
    }

    public void mappingToObject(){
        properties = ConfigReader.getProperties();
        this.setUrl(properties.getProperty("url"));
        this.setImplicityWait(Integer.parseInt(properties.getProperty("implicityWait")));
        this.setPageLoadTimeout(Integer.parseInt(properties.getProperty("pageLoadTimeout")));
        this.setBrowser(properties.getProperty("browser"));
    }

}
