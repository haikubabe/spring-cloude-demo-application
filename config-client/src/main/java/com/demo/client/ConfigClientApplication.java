package com.demo.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClientApplication {

    @Autowired
    private ConfigClientConfiguration properties;

    @Value("${some.other.property}")
    private String otherProperty;

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

    public String printConfigProperty() {
        StringBuilder sb = new StringBuilder();
        sb.append(properties.getProperty());
        sb.append(" || ");
        sb.append(otherProperty);
        return sb.toString();
    }
}
