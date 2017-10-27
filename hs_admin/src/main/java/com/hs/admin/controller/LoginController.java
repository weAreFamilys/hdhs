package com.hs.admin.controller;

import com.hs.admin.model.page.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @user :flyxk
 * date :2017/10/26
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("/index")
    public String index() {
        return "/login/login";
    }

    @RequestMapping("/checkUser")
    @ResponseBody
    public Result checkUser(HttpServletRequest request) {
        System.out.println("userName:"+request.getParameter("userName"));
        Result result = new Result(true, "成功");
        return result;
    }

}
