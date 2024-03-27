package com.chuxin.democurd.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    // 增加
    public String add(){
        return "add";
    }

    // 删除
    public String remove(){
        return "remove";
    }

    // 修改
    public String edit(){
        return "edit";
    }

    // 查看
    public String getList(){
        return "getList";
    }
}
