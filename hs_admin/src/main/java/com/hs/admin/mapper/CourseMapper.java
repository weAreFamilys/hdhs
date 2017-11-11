package com.hs.admin.mapper;

import com.hs.admin.mapper.provider.CourseProvider;
import com.hs.admin.model.CourseModel;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface CourseMapper {

    @Select("select * from Course order by course_name desc")
    List<CourseModel> getAll();

    @Insert("insert into Course(id,course_name) values(#{id}, #{course_name})")
    void insert(CourseModel courseModel);

    @Delete("delete from Course where id = #{id}")
    void delete(String id);

    @SelectProvider(type = CourseProvider.class, method = "get")
    CourseModel getOne(CourseModel courseModel);

    @Update("update Course set course_name = #{course_name}")
    void update(CourseModel courseModel);
}
