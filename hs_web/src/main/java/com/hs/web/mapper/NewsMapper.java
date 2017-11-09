package com.hs.web.mapper;

import com.hs.web.mapper.provider.NewsProvider;
import com.hs.web.model.NewsModel;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface NewsMapper {

    @Select("select * from News where n_is_publish = 1 order by n_create_time desc")
    List<NewsModel> getNews();

    @SelectProvider(type = NewsProvider.class,method = "select")
    List<NewsModel> getHomeNews(int type, int limit);

}
