package com.hs.web.mapper.provider;

import org.apache.ibatis.jdbc.SQL;

/**
 * @user :flyxk
 * date :2017/11/9
 */
public class NewsProvider {

    public String select(final int type, final int limit) {
        String sql = new SQL() {
            {
                SELECT("n_id,n_title,n_create_time,n_desc,n_img");
                FROM("News");
                WHERE("n_is_publish = 1");

                if (type >= 0) {
                    WHERE("n_type = " + type);
                }

                ORDER_BY("n_create_time desc");
            }
        }.toString();

        if (limit > 0) {
            sql += " limit " + limit;
        }
        return sql;
    }
}
