package com.hs.admin.mapper;

import com.hs.admin.model.UserModel;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    @Select("select * from user")
    List<UserModel> getAll();

    @Select("select * from user where account = #{account}")
    @Results({
        @Result(column = "create_time", property = "createTime"),
            @Result(column = "userid", property = "userId")
    })
    UserModel getUser(String account);

    @Insert("insert into user(userid, account, password, name, memo) values(#{userId},#{account},#{password},#{name},#{memo})")
    void insert(UserModel userModel);

    void update(UserModel userModel);

    @Delete("delete from user where userid = #{userId}")
    void delete(String userId);
}
