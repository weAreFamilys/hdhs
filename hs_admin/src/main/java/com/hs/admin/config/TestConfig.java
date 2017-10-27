package com.hs.admin.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @user :flyxk
 * date :2017/10/24
 */

@Configuration
@ConfigurationProperties(prefix = "test")
@PropertySource("classpath:config/test.properties")
@Component
public class TestConfig {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
