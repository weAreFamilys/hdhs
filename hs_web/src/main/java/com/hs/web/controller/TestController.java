package com.hs.web.controller;

import com.hs.web.config.TestConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @user :flyxk
 * date :2017/10/24
 */
@Controller
public class TestController {
    private final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private TestConfig testConfig;

    @RequestMapping("/test")
    public String test(HttpServletRequest request) {
        request.setAttribute("name", "zk");
        return "/index";
    }
}
