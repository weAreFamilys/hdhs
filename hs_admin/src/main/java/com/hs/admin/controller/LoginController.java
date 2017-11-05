package com.hs.admin.controller;

import com.hs.admin.model.UserModel;
import com.hs.admin.model.page.Result;
import com.hs.admin.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @user :flyxk
 * date :2017/10/26
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    private final static Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String index() {
        return "/login/login";
    }

    @RequestMapping("/checkUser")
    @ResponseBody
    public Result checkUser(@RequestBody Map<String,String> reqMap) {
        Result result = new Result();
        result.setSuccess(false);
        UserModel userModel = userService.checkUser(reqMap.get("account"), reqMap.get("password"));
        if (userModel == null) {
            result.setSuccess(false);
            result.setMsg("用户名或密码错误");
        } else {
            result.setSuccess(true);
            result.setMsg("成功");
        }
        return result;
    }

}
