package com.hs.admin.controller;

import com.alibaba.fastjson.JSONObject;
import com.hs.admin.model.User;
import com.hs.admin.model.page.Result;
import com.hs.admin.service.UserService;
import com.hs.admin.util.UUIDUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;
import java.util.UUID;

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
        User user = userService.checkUser(reqMap.get("account"), reqMap.get("password"));
        if (user == null) {
            result.setSuccess(false);
            result.setMsg("用户名或密码错误");
        } else {
            result.setSuccess(true);
            result.setMsg("成功");
        }
        return result;
    }

}
