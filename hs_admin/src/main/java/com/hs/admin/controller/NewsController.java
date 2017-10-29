package com.hs.admin.controller;

import com.hs.admin.model.News;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @user :flyxk
 * date :2017/10/29
 */
@Controller
@RequestMapping("/news")
public class NewsController {
    private final static Logger logger = LoggerFactory.getLogger(NewsController.class);

    @RequestMapping("/list")
    public String index(){
        return "/news/list";
    }
    @RequestMapping("/add")
    public String add(){
        return "/news/add";
    }

    @RequestMapping("/addCommit")
    public String addCommit(News news){
        return "";
    }
}
