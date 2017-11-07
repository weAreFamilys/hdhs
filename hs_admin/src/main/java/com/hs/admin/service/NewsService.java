package com.hs.admin.service;

import com.hs.admin.model.NewsModel;

import java.util.List;

public interface NewsService {

    List<NewsModel> list();

    void add(NewsModel newsModel);

    void del(String n_id);

    void update(NewsModel newsModel);

    NewsModel getOne(String n_id);
}
