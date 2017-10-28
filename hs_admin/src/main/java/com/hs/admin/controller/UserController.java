package com.hs.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @user :flyxk
 * date :2017/10/28
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/list")
    public String list() {
        return "/user/list";
    }
}
