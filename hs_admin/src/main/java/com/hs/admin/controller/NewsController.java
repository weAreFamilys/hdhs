package com.hs.admin.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hs.admin.constants.Page;
import com.hs.admin.model.NewsModel;
import com.hs.admin.model.page.Result;
import com.hs.admin.service.NewsService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @user :flyxk
 * date :2017/10/29
 */
@RestController
@RequestMapping("/news")
public class NewsController {
    private final static Logger logger = LoggerFactory.getLogger(NewsController.class);

    @Autowired
    private NewsService newsService;

    @RequestMapping("/list")
    public Result list(@RequestBody Map<String, Integer> reqMap) {
        int pageNum = reqMap.get("pageNum") == null ? Page.PAGE_NUM : reqMap.get("pageNum");
        int pageSize = reqMap.get("pageSize") == null ? Page.PAGE_SIZE : reqMap.get("pageSize");

        Result result = new Result();

        PageHelper.startPage(pageNum, pageSize);
        List<NewsModel> list = newsService.list();

        PageInfo<NewsModel> pageInfo = new PageInfo<NewsModel>(list);

        Map<String, Object> dataMap = new HashMap<String, Object>();
        dataMap.put("page", pageInfo);
        result.setSuccess(true);
        result.setObj(dataMap);
        return result;
    }

    @RequestMapping("/add")
    public Result add(@RequestBody NewsModel newsModel) {
        Result result = new Result();
//        if (StringUtils.isBlank(StringUtils.trim(newsModel.getN_img()))) {
//            result.setSuccess(false);
//            result.setMsg("图片不能为空");
//            return result;
//        }
        newsService.add(newsModel);
        result.setSuccess(true);
        return result;
    }

    @RequestMapping("/del")
    public Result del(@RequestBody Map<String, String> reqMap) {
        Result result = new Result();
        String n_id = reqMap.get("n_id");
        if (StringUtils.isBlank(StringUtils.trim(n_id))) {
            result.setSuccess(false);
            result.setMsg("ID获取失败");
            return result;
        }
        newsService.del(n_id);
        result.setSuccess(true);
        return result;
    }

    @RequestMapping("/edit")
    public Result edit(@RequestBody NewsModel newsModel) {
        Result result = new Result();
        String n_id = newsModel.getN_id();
        if (StringUtils.isBlank(StringUtils.trim(n_id))) {
            result.setSuccess(false);
            result.setMsg("ID获取失败");
            return result;
        }
        newsService.update(newsModel);
        result.setSuccess(true);
        return result;
    }

    @RequestMapping("/getById")
    public Result getById(@RequestBody Map<String, String> reqMap) {
        Result result = new Result();
        String n_id = reqMap.get("n_id");
        if (StringUtils.isBlank(StringUtils.trim(n_id))) {
            result.setSuccess(false);
            result.setMsg("ID获取失败");
            return result;
        }
        NewsModel newsModel = newsService.getOne(n_id);
        if (newsModel == null) {
            result.setSuccess(false);
            result.setMsg("未查到数据");
            return result;
        }
        result.setSuccess(true);
        result.setObj(newsModel);
        return result;
    }
}
