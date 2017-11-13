package com.hs.web.service;

import com.hs.web.Util.UUIDUtil;
import com.hs.web.mapper.UserTeacherMapper;
import com.hs.web.model.UserTeacher;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @user :flyxk
 * date :2017/11/5
 */
@Service
public class UserTeacherService {

    @Autowired
    UserTeacherMapper mapper;

    public void add(UserTeacher userTeacher) {
        userTeacher.setId(UUIDUtil.genUUID());
        userTeacher.setPwd(DigestUtils.md5Hex(userTeacher.getPwd()));
        mapper.insert(userTeacher);
    }

    public UserTeacher getUserByAccount(String account){
        return mapper.getUser(account);
    }


}
