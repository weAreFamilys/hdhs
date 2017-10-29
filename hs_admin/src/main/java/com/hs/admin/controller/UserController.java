package com.hs.admin.controller;

import com.hs.admin.model.User;
import com.hs.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @user :flyxk
 * date :2017/10/28
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public String list(HttpServletRequest request) {
        List<User> userList = userService.userList();
        request.setAttribute("userList", userList);
        return "/user/list";
    }
}
