package framework;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = {"classpath:application.properties"})
@EnableConfigurationProperties(ConfigReader.class)
public class EnvConfiguration {
    public static void main(String[] args){
        SpringApplication.run(EnvConfiguration.class, args);
    }

    @Bean
    ApplicationRunner applicationRunner(ConfigReader properties){
        return args -> {
            System.out.println(properties.getUrl());
        };
    }

}
