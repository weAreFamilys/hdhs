package com.hs.admin.service;

import com.hs.admin.model.User;

import java.util.List;

public interface UserService {

    User checkUser(String account, String password);

    List<User> userList();
}
