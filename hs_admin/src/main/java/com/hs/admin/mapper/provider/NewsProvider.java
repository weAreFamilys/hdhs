package com.hs.admin.mapper.provider;

import com.hs.admin.model.NewsModel;
import org.apache.ibatis.jdbc.SQL;


public class NewsProvider {

    public String update (final NewsModel newsModel) {
        return new SQL(){
            {
                UPDATE("News");
                if (newsModel.getN_title() != null) {
                    SET("n_title = #{n_title}");
                }
                if (newsModel.getN_content() != null) {
                    SET("n_content = #{n_content}");
                }
                if (newsModel.getN_img() != null) {
                    SET("n_img = #{n_img}");
                }
                if (newsModel.getN_brief_intro() != null) {
                    SET("n_brief_intro = #{n_brief_intro}");
                }
                SET("n_type = #{n_type}");
                SET("n_is_publish = #{n_is_publish}");
                SET("n_is_delete = #{n_is_delete}");

                WHERE("n_id = #{n_id}");
            }
        }.toString();
    }
}
