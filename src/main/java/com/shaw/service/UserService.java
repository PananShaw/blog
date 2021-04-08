package com.shaw.service;

import com.shaw.po.User;


/**
 * @author Shaw
 */
public interface UserService {

    User checkUser(String username, String password);
}
