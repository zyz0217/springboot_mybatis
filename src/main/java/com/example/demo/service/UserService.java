package com.example.demo.service;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    void insert(User user);

    User login(@Param("username") String username, @Param("password") String password);
}
