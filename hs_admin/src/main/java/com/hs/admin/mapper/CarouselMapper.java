package com.hs.admin.mapper;

import com.hs.admin.model.CarouselModel;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CarouselMapper {

    @Select("select * from Carousel order by c_index asc")
    List<CarouselModel> getAll();


}
