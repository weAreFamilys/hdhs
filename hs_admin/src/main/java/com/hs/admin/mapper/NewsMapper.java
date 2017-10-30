package com.hs.admin.mapper;

import com.hs.admin.model.News;
import org.apache.ibatis.annotations.Insert;

public interface NewsMapper {

    @Insert("insert into news(newsid, title, content, type, brief_intro, publish,del) values(#{newsId},#{title},#{content},#{type},#{briefIntro},#{publish},#{del})")
    void insert(News news);
}
