package framework;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties(prefix = "my-properties.test")
@Data
@AllArgsConstructor
public class ConfigReader {

    private String url;
    private Integer implicityWait;
    private Integer pageLoadTimeout;
    private List<String> browser;


}