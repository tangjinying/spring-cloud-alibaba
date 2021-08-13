package com.tjy.dao;


import com.tjy.pojo.Users;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    Users getUsers(String username);
}