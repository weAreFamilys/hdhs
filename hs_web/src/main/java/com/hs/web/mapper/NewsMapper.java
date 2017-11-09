package com.hs.web.mapper;

import com.hs.web.model.NewsModel;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface NewsMapper {

    @Select("select * from News where n_is_publish = 1 order by n_create_time desc")
    List<NewsModel> getNews();

    @Select("select n_id,n_title,n_create_time from News where n_is_publish = 1 and n_type = 0 order by n_create_time desc limit 10")
    List<NewsModel> getHomeNews();

}
