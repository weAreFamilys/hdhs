package com.hs.admin.service.impl;

import com.hs.admin.mapper.NewsMapper;
import com.hs.admin.model.NewsModel;
import com.hs.admin.service.NewsService;
import com.hs.admin.util.UUIDUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @user :flyxk
 * date :2017/10/28
 */
@Service
public class NewsServiceImpl implements NewsService {

    private final static Logger logger = LoggerFactory.getLogger(NewsServiceImpl.class);

    @Autowired
    private NewsMapper newsMapper;


    @Override
    public List<NewsModel> list() {
        return newsMapper.getAll();
    }

    @Override
    public void add(NewsModel newsModel) {
        if (newsModel == null) {
            throw new NullPointerException("newsModel is null!");
        }
        newsModel.setN_id(UUIDUtil.genUUID());
        newsModel.setN_create_time(new Date());
        newsMapper.insert(newsModel);
    }

    @Override
    public void del(String n_id) {
        newsMapper.delete(n_id);
    }

    @Override
    public void update(NewsModel newsModel) {
        newsMapper.update(newsModel);
    }

    @Override
    public NewsModel getOne(String n_id) {
        return newsMapper.getOne(n_id);
    }
}
