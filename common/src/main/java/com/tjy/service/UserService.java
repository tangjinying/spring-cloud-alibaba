package com.tjy.service;

import com.tjy.pojo.User;
import com.tjy.pojo.Users;

public interface UserService {
    User userInfo();

    Users userInfo(String username);
}
