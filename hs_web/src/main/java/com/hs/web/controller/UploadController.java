package com.hs.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @user :flyxk
 * date :2017/11/13
 */
@Controller
@RequestMapping("/upload")
public class UploadController {

    @RequestMapping("/index")
    public String upload() {
        return "/upload/index";
    }
}
