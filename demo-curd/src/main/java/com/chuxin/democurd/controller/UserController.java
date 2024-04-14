package com.chuxin.democurd.controller;

import com.chuxin.democurd.entity.User;
import com.chuxin.democurd.mapper.UserMapper;
import com.chuxin.democurd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper userMapper;

    // 自己测试
    @GetMapping("/getUser")
    public HashMap<String, Object> getUser() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("status", 200);
        map.put("message", "hello world!" + userService.add());
        return map;
    }

    // 查询
    @GetMapping("/getList")
    public List<User> getList(){
        return userMapper.findAll();
    }

    //  新增
    @PostMapping("/add")
    public Integer add(@RequestBody User user){
        System.out.println(user);
        System.out.println("===================>");
        return userMapper.addUser(user);
    }

    // 删除
    @GetMapping("/delete")
    public Integer delete(@RequestParam Integer id){
        System.out.println(id);
        return userMapper.deleteUser(id);
    }

    // 修改
    @PostMapping("/edit")
    public Integer edit(@RequestBody User user){
        return userMapper.editUser(user);
    }
}
