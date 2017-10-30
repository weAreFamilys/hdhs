package com.hs.admin.service.impl;

import com.hs.admin.mapper.NewsMapper;
import com.hs.admin.model.News;
import com.hs.admin.service.NewsService;
import com.hs.admin.util.UUIDUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public void addNews(News news) {
        news.setNewsId(UUIDUtil.genUUID());
        newsMapper.insert(news);
    }

}
