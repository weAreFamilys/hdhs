package com.hs.admin.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hs.admin.constants.Page;
import com.hs.admin.model.UserModel;
import com.hs.admin.model.page.Result;
import com.hs.admin.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public Result list(@RequestBody Map<String, Integer> reqMap) {
        int pageNum = reqMap.get("pageNum") == null ? Page.PAGE_NUM : reqMap.get("pageNum");
        int pageSize = reqMap.get("pageSize") == null ? Page.PAGE_SIZE : reqMap.get("pageSize");

        Result result = new Result();
        PageHelper.startPage(pageNum, pageSize);
        List<UserModel> userModelList = userService.userList();

        PageInfo<UserModel> pageInfo = new PageInfo<UserModel>(userModelList);

        Map<String, Object> dataMap = new LinkedHashMap<String, Object>();
        dataMap.put("page", pageInfo);
        dataMap.put("users", userModelList);
        result.setSuccess(true);
        result.setObj(dataMap);
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

        UserModel userModel = new UserModel();
        userModel.setName(name);
        userModel.setAccount(account);
        userModel.setMemo(memo);
        UserModel isHave = userService.getUserByAccount(account);
        if (isHave != null) {
            result.setSuccess(false);
            result.setMsg("账户已存在");
            return result;
        }
        userService.addUser(userModel);
        result.setSuccess(true);
        return result;
    }
}
