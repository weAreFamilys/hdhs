package com.hs.web.controller;

import com.hs.web.model.NewsModel;
import com.hs.web.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @user :flyxk
 * date :2017/11/9
 */
@Controller
@RequestMapping("/news")
public class NewsController {

    @Autowired
    NewsService newsService;

    @RequestMapping("/detail")
    public String detail(String id, HttpServletRequest req) {
        NewsModel newsModel = newsService.getNewsById(id);
        req.setAttribute("news", newsModel);
        return "/news/news-detail";
    }
}
