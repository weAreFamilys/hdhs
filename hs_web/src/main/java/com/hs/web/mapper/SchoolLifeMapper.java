package com.hs.web.mapper;

import com.hs.web.model.SchoolLifeModel;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SchoolLifeMapper {

    @Select("select * from SchoolLife where s_is_publish = 1 order by s_index asc limit 3")
    List<SchoolLifeModel> get();

}
