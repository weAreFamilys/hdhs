package com.hs.admin.mapper;

import com.hs.admin.model.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select * from user")
    List<User> getAll();

    @Select("select * from user where account = #{account}")
    @Results({
        @Result(column = "create_time", property = "createTime"),
            @Result(column = "userid", property = "userId")
    })
    User getUser(String account);

    void insert(User user);

    void update(User user);

    void delete(Long id);
}
