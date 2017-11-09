package com.hs.web.service;

import com.hs.web.mapper.NewsMapper;
import com.hs.web.model.NewsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @user :flyxk
 * date :2017/11/5
 */
@Service
public class NewsService {

    @Autowired
    NewsMapper mapper;

    public List<NewsModel> getHomeNews() {
        return mapper.getHomeNews();
    }
}
