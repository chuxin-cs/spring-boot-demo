package com.chuxin.democurd.service;

import com.chuxin.democurd.entity.User;

import java.util.List;

public interface UserService {
    List<User> page();

    Boolean delete(User user);

    Boolean edit();

    Boolean add(User user);
}
