package com.hs.admin.mapper;

import com.hs.admin.mapper.provider.NewsProvider;
import com.hs.admin.model.NewsModel;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.UpdateProvider;

import java.util.List;

public interface NewsMapper {

    @Select("select * from News order by n_create_time desc")
    List<NewsModel> getAll();

    @Insert("insert into News(" +
                "n_id," +
                "n_title," +
                "n_content," +
                "n_type," +
                "n_create_time," +
                "n_is_publish," +
                "n_is_delete," +
                "n_user_id," +
                "n_brief_intro," +
                "n_img," +
                "n_index)" +
            " values(" +
                "#{n_id}," +
                "#{n_title}," +
                "#{n_content}," +
                "#{n_type}," +
                "#{n_create_time}," +
                "#{n_is_publish}," +
                "#{n_is_delete}," +
                "#{n_user_id}," +
                "#{n_brief_intro}," +
                "#{n_img}," +
                "#{n_index}" +
            ")")
    void insert(NewsModel newsModel);

    @Delete("delete from News where n_id = #{n_id}")
    void delete(String n_id);

    @Select("select * from News where n_id = #{n_id}")
    NewsModel getOne(String n_id);

    @UpdateProvider(type = NewsProvider.class, method = "update")
    void update(NewsModel newsModel);
}
