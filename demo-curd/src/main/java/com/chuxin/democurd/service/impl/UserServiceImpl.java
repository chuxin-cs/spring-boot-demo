package com.chuxin.democurd.service.impl;

import com.chuxin.democurd.entity.User;
import com.chuxin.democurd.mapper.UserMapper;
import com.chuxin.democurd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> page() {
        return userMapper.page();
    }

    @Override
    public Boolean delete() {
        return true;
    }

    @Override
    public Boolean edit() {
        return true;
    }

    @Override
    public Boolean add(User user) {
        return userMapper.add(user);
    }
}
