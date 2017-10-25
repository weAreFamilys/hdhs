package com.hs.web.controller;

import com.hs.web.config.TestConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @user :flyxk
 * date :2017/10/24
 */
@RestController
public class TestController {
    private final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private TestConfig testConfig;

    @RequestMapping("/test")
    public String test() {
        System.out.println("name=" + testConfig.getName());
        return "test in ....";
    }
}
