package com.chuxin.demotodolist.service.impl;

import com.chuxin.demotodolist.entity.User;
import com.chuxin.demotodolist.mapper.UserMapper;
import com.chuxin.demotodolist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    // 增加
    @Override
    public Integer add(User user) {
        return userMapper.add(user);
    }
    // 删除
    @Override
    public Integer delete(Integer id) {
        // 未来 这里还有很多业务代码需要编写

        // 1.首先校验id是否合法（当然可以借助一些校验工具在 controller 层处理，但是有些复杂些的需要手动处理的 还是会在这里）

        // 2.先查询数据库有没有当前id 如果没有的话 就没有必要在执行 userMapper.delete(id) 操作了

        return userMapper.delete(id);
    }
    // 修改
    @Override
    public Integer edit(User user) {
        return userMapper.edit(user);
    }
    // 查看
    @Override
    public List<User> getList() {
        return userMapper.getList();
    }
}
