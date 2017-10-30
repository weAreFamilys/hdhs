package com.hs.admin.controller;

import com.hs.admin.model.User;
import com.hs.admin.model.page.Result;
import com.hs.admin.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping("/add")
    public String add() {
        return "/user/add";
    }

    @RequestMapping("/addCommit")
    @ResponseBody
    public Result addCommit(String name,String account,String memo){
        Result result = new Result();

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
