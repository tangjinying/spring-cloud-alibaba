package com.tjy.service.impl;

import com.tjy.dao.UserDao;
import com.tjy.pojo.User;
import com.tjy.pojo.Users;
import com.tjy.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User userInfo() {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123456");
        return user;
    }

    @Override
    public Users userInfo(String username) {
        return userDao.getUsers(username);
    }
}