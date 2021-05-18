package com.shaw.dao;

import com.shaw.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author shaw
 * @date 2017/10/15
 */
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsernameAndPassword(String username, String password);
}
