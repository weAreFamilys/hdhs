package com.hs.web.controller;

import com.hs.web.Util.Constants;
import com.hs.web.model.UserTeacher;
import com.hs.web.model.page.Result;
import com.hs.web.service.UserTeacherService;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @user :flyxk
 * date :2017/11/12
 */
@Controller
@RequestMapping("/user")
public class UserTeacherController {
    private static final Logger logger = LoggerFactory.getLogger(UserTeacherController.class);
    @Autowired
    UserTeacherService userTeacherService;

    @RequestMapping(value = "/regist", method = RequestMethod.POST)
    @ResponseBody
    public Result regist(UserTeacher userTeacher) {
        logger.info(userTeacher.toString());
        String account = userTeacher.getAccount();
        Result result = new Result();
        if (StringUtils.isBlank(account) || StringUtils.isBlank(userTeacher.getPwd())) {
            result.setSuccess(false);
            result.setMsg("用户名或密码错误!");
            return result;
        }

        UserTeacher resUser = userTeacherService.getUserByAccount(account);
        if (resUser != null) {
            result.setSuccess(false);
            result.setMsg("用户名已存在!");
            return result;
        }

        userTeacherService.add(userTeacher);

        result.setSuccess(true);
        result.setMsg("成功");
        return result;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Result login(String account, String pwd, HttpServletRequest req) {
        Result result = new Result();
        UserTeacher userTeacher = userTeacherService.getUserByAccount(account);
        if (userTeacher == null) {
            result.setSuccess(false);
            result.setMsg("用户名不存在!");
        } else {
            if (DigestUtils.md5Hex(pwd).equals(userTeacher.getPwd())) {
                result.setSuccess(true);
                result.setMsg("成功");
                req.getSession().setAttribute(Constants.LOGIN_USER, userTeacher);
                result.setObj(userTeacher);
            } else {
                result.setSuccess(false);
                result.setMsg("密码错误!");
            }
        }
        return result;
    }

    @RequestMapping("/logout")
    public String logout(HttpServletRequest request) {
        request.getSession().removeAttribute(Constants.LOGIN_USER);
        return "redirect:/index";
    }
}
