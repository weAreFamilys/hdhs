package com.hs.admin.mapper;

import com.hs.admin.mapper.provider.CarouselProvider;
import com.hs.admin.model.CarouselModel;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface CarouselMapper {

    @Select("select * from Carousel order by c_index asc")
    List<CarouselModel> getAll();

    @Insert("insert into Carousel(c_id,c_index,c_title,c_desc,c_content,c_is_publish,c_create_time,c_img) values(#{c_id},#{c_index},#{c_title},#{c_desc},#{c_content}, #{c_is_publish}, #{c_create_time}, #{c_img})")
    void insert(CarouselModel carouselModel);

    @Delete("delete from Carousel where c_id = #{c_id}")
    void delete(String c_id);

    @Select("select * from Carousel where c_id = #{c_id}")
    CarouselModel getOne(String c_id);

    @UpdateProvider(type = CarouselProvider.class, method = "carouselUpdate")
    void update(CarouselModel carouselModel);

}
