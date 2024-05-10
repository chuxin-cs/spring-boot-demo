package com.chuxin.demomybatis.controller;

import com.chuxin.demomybatis.entity.User;
import com.chuxin.demomybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;


    @GetMapping("/list")
    public List<User> list() {
        return userMapper.findAll();
    }
}
