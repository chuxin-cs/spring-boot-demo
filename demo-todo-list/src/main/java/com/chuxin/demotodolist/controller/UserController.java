package com.chuxin.demotodolist.controller;

import com.chuxin.demotodolist.entity.User;
import com.chuxin.demotodolist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    // 增加
    @PostMapping("/add")
    private Integer add(@RequestBody User user) {
        return userService.add(user);
    }
    // 删除
    @PostMapping("/delete")
    public Integer delete(@RequestBody User user) {
        return userService.delete(user.getId());
    }
    // 修改
    @PostMapping("/edit")
    public Integer edit(@RequestBody User user) {
        return userService.edit(user);
    }
    // 查看
    @GetMapping("/getList")
    public List<User> getList() {
        return userService.getList();
    }
}
