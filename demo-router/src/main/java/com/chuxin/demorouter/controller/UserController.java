package com.chuxin.demorouter.controller;

import com.chuxin.demorouter.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    // 增加
    @PostMapping("/add")
    public String add(@RequestBody User user) {
        return "add" + user.getName() + user.getId() + user.getPassword();
    }

    // 修改
    @PostMapping("/edit")
    public String edit(@ModelAttribute User user) {
        return "add" + user.getName()  + user.getPassword();
    }

    // 查找
    @GetMapping("/getList")
    public String getList(@RequestParam int page, @RequestParam int pageSize) {
        return "add: page: " + page + " pageSize: " + pageSize;
    }

    @GetMapping("/getPage/{page}/{pageSize}")
    public String getPage(@PathVariable String page, @PathVariable String pageSize) {
        return "add: page: " + page + " pageSize: " + pageSize;
    }

}
