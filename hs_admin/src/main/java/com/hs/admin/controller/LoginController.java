package com.hs.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @user :flyxk
 * date :2017/10/26
 */
@Controller
public class LoginController {

    @RequestMapping(value = {"/", "/login"})
    public String index() {
        return "/login/login";
    }

}
