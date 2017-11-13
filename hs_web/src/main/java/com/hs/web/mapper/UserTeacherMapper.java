package com.hs.web.mapper;

import com.hs.web.model.SchoolLifeModel;
import com.hs.web.model.UserTeacher;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserTeacherMapper {

    @Insert("insert into UserTeacher(id,name,pwd,account,idcard_no,create_time,type,is_auth,is_del) values(" +
            "#{id},#{name},#{pwd},#{account},#{idcard_no},#{create_time},#{type},#{is_auth},#{is_del})")
    void insert(UserTeacher userTeacher);

    @Select("select * from UserTeacher where account = #{account}")
    UserTeacher getUser(String account);

}
