package com.hs.admin.mapper.provider;

import com.hs.admin.model.CourseModel;
import org.apache.ibatis.jdbc.SQL;


public class CourseProvider {

    public String get(final CourseModel courseModel) {
        return new SQL() {
            {
                SELECT("id,course_name");
                FROM("Course");
                if (courseModel.getCourse_name() != null) {
                    WHERE("course_name = #{course_name}");
                }
                if (courseModel.getId() != null) {
                    WHERE("id = #{id}");
                }
            }
        }.toString();
    }
}
