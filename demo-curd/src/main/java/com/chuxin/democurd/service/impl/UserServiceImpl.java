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
    public Boolean delete(User user) {

        // 1.这里还需要判断当前前端传入的参数是否合法(没传)

        // 2.这里需要先到数据库里面查询一下看是否有当前用户
        //   2.1 用户存在  删除  (也可以使用假删) 这里做演示就真删了
        //   2.2 用户不存在 则

        userMapper.delete(user);
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
