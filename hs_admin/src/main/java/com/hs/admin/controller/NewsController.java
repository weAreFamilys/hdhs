package com.hs.admin.controller;

import com.hs.admin.model.News;
import com.hs.admin.model.page.Result;
import com.hs.admin.service.NewsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @user :flyxk
 * date :2017/10/29
 */
@Controller
@RequestMapping("/news")
public class NewsController {
    private final static Logger logger = LoggerFactory.getLogger(NewsController.class);

    @Autowired
    private NewsService newsService;

    @RequestMapping("/list")
    public String index() {
        return "/news/list";
    }

    @RequestMapping("/add")
    public String add() {
        return "/news/add";
    }

    @RequestMapping("/addCommit")
    @ResponseBody
    public Result addCommit(News news) {
        Result result = new Result();
        logger.info(news.toString());
        newsService.addNews(news);
        result.setSuccess(true);
        result.setMsg("操作成功!");
        return result;
    }
}
