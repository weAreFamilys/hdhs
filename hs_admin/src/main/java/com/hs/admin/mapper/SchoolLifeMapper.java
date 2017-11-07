package com.hs.admin.mapper;

import com.hs.admin.mapper.provider.SchoolLifeProvider;
import com.hs.admin.model.SchoolLifeModel;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.UpdateProvider;

import java.util.List;

public interface SchoolLifeMapper {

    @Select("select * from SchoolLife order by s_index asc")
    List<SchoolLifeModel> getAll();

    @Insert("insert into SchoolLife(s_id,s_index,s_title,s_desc,s_content,s_is_publish,s_create_time,s_img) values(#{s_id},#{s_index},#{s_title},#{s_desc},#{s_content}, #{s_is_publish}, #{s_create_time}, #{s_img})")
    void insert(SchoolLifeModel schoolLifeModel);

    @Delete("delete from SchoolLife where s_id = #{s_id}")
    void delete(String s_id);

    @Select("select * from SchoolLife where s_id = #{s_id}")
    SchoolLifeModel getOne(String s_id);

    @UpdateProvider(type = SchoolLifeProvider.class, method = "update")
    void update(SchoolLifeModel schoolLifeModel);

}
