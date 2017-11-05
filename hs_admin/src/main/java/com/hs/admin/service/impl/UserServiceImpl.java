package com.hs.admin.service.impl;

import com.hs.admin.mapper.UserMapper;
import com.hs.admin.model.UserModel;
import com.hs.admin.service.UserService;
import com.hs.admin.util.UUIDUtil;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @user :flyxk
 * date :2017/10/28
 */
@Service
public class UserServiceImpl implements UserService {

    private final static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    private static final String DEFAULT_PWD = "123456";

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserModel checkUser(String account, String password) {
        if (StringUtils.isBlank(account) || StringUtils.isBlank(password)) {
            throw new IllegalArgumentException("用户名或密码为空");
        }
        UserModel userModel = userMapper.getUser(account);
        if (null == userModel) {
            return null;
        }
        if (DigestUtils.md5Hex(password).equals(userModel.getPassword())) {
            return userModel;
        }
        return null;
    }

    @Override
    public List<UserModel> userList() {
        return userMapper.getAll();
    }

    @Override
    public void addUser(UserModel userModel) {
        userModel.setUserId(UUIDUtil.genUUID());
        userModel.setPassword(DigestUtils.md5Hex(DEFAULT_PWD));
        userMapper.insert(userModel);
    }

    @Override
    public UserModel getUserByAccount(String account) {
        return userMapper.getUser(account);
    }

    @Override
    public void delUser(String userId) {
        userMapper.delete(userId);
    }
}
