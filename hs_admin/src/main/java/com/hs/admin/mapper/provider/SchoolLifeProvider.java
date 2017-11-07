package com.hs.admin.mapper.provider;

import com.hs.admin.model.SchoolLifeModel;
import org.apache.ibatis.jdbc.SQL;

/**
 * @user :flyxk
 * date :2017/11/5
 */
public class SchoolLifeProvider {

    public String update (final SchoolLifeModel schoolLifeModel) {
        return new SQL(){
            {
                UPDATE("SchoolLife");
                if (schoolLifeModel.getS_content() != null) {
                    SET("s_content = #{s_content}");
                }
                if (schoolLifeModel.getS_desc() != null) {
                    SET("s_desc = #{s_desc}");
                }
                if (schoolLifeModel.getS_img() != null) {
                    SET("s_img = #{s_img}");
                }
                if (schoolLifeModel.getS_title() != null) {
                    SET("s_title = #{s_title}");
                }
                SET("s_index = #{s_index}");
                SET("s_is_publish = #{s_is_publish}");

                WHERE("s_id = #{s_id}");
            }
        }.toString();
    }
}
