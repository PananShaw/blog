package com.shaw.service;

import com.shaw.po.User;

/**
 * @author shaw
 * @date 2017/10/16
 */
public interface UserService {
    User checkUser(String username, String password);
}
