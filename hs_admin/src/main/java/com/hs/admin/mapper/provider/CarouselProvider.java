package com.hs.admin.mapper.provider;

import com.hs.admin.model.CarouselModel;
import org.apache.ibatis.jdbc.SQL;

/**
 * @user :flyxk
 * date :2017/11/5
 */
public class CarouselProvider {

    public String carouselUpdate (final CarouselModel carouselModel) {
        return new SQL(){
            {
                UPDATE("Carousel");
                if (carouselModel.getC_content() != null) {
                    SET("c_content = #{c_content}");
                }
                if (carouselModel.getC_desc() != null) {
                    SET("c_desc = #{c_desc}");
                }
                if (carouselModel.getC_img() != null) {
                    SET("c_img = #{c_img}");
                }
                if (carouselModel.getC_title() != null) {
                    SET("c_title = #{c_title}");
                }
                SET("c_index = #{c_index}");
                SET("c_is_publish = #{c_is_publish}");

                WHERE("c_id = #{c_id}");
            }
        }.toString();
    }
}
