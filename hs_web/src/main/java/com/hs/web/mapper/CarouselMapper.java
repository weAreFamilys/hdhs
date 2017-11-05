package com.hs.web.mapper;

import com.hs.web.model.CarouselModel;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CarouselMapper {

    @Select("select * from Carousel where c_is_publish = 1 order by c_index asc")
    List<CarouselModel> getAll();

}
