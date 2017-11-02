package com.hs.admin.controller;

import com.hs.admin.model.User;
import com.hs.admin.model.page.Result;
import com.hs.admin.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @user :flyxk
 * date :2017/10/28
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public Result list(HttpServletRequest request) {
        Result result = new Result();
        List<User> userList = userService.userList();
        Map<String, Object> userMap = new LinkedHashMap<String, Object>();
        userMap.put("total", (userList == null) ? 0 : userList.size());
        userMap.put("users", userList);
        result.setSuccess(true);
        result.setObj(userMap);
        return result;
    }

    @RequestMapping("/del")
    public Result del(@RequestBody Map<String, String> reqMap) {
        Result result = new Result();
        String userId = reqMap.get("userId");
        if (StringUtils.isBlank(StringUtils.trim(userId))) {
            result.setSuccess(false);
            result.setMsg("用户ID获取失败");
            return result;
        }
        userService.delUser(userId);
        result.setSuccess(true);
        return result;
    }

    @RequestMapping("/add")
    public Result add(@RequestBody Map<String, String> reqMap) {
        Result result = new Result();
        String account = reqMap.get("account");
        String name = reqMap.get("name");
        String memo = reqMap.get("memo");
        if (StringUtils.isBlank(StringUtils.trim(account))) {
            result.setSuccess(false);
            result.setMsg("登录账户不能为空");
            return result;
        }
        if (StringUtils.isBlank(StringUtils.trim(name))) {
            result.setSuccess(false);
            result.setMsg("用户姓名不能为空");
            return result;
        }

        User user = new User();
        user.setName(name);
        user.setAccount(account);
        user.setMemo(memo);
        User isHave = userService.getUserByAccount(account);
        if (isHave != null) {
            result.setSuccess(false);
            result.setMsg("账户已存在");
            return result;
        }
        userService.addUser(user);
        result.setSuccess(true);
        return result;
    }
}
