package com.hs.admin.service;

import com.hs.admin.model.UserModel;

import java.util.List;

public interface UserService {

    UserModel checkUser(String account, String password);

    List<UserModel> userList();

    void addUser(UserModel userModel);

    UserModel getUserByAccount(String account);

    void delUser(String userId);
}
