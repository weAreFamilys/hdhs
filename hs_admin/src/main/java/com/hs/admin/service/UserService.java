package com.hs.admin.service;

import com.hs.admin.model.User;

public interface UserService {

    User checkUser(String account, String password);
}
