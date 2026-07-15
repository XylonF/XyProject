package com.example.xyproject.dao;

import com.example.xyproject.pojo.User;

import java.util.List;

public interface UserDao {
    List<User> getUserList();
    User getUserById(int id);
}
