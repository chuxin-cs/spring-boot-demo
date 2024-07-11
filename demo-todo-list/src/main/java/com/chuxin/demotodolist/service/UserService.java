package com.chuxin.demotodolist.service;

import com.chuxin.demotodolist.common.result.Result;
import com.chuxin.demotodolist.entity.User;

import java.util.List;

public interface UserService {

    // 增加
    Integer add(User user);

    // 删除
    Integer delete(Integer id);

    // 修改
    Integer edit(User user);

    // 查看
    Result<List<User>> getList(int page, int pageSize);
}
