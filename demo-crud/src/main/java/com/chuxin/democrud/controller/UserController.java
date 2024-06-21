package com.chuxin.democrud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    // 增加
    @PostMapping("/add")
    public String add() {
        return "add";
    }

    // 删除
    @PostMapping("/delete")
    public String delete() {
        return "delete";
    }

    // 修改
    @PostMapping("/edit")
    public String edit() {
        return "edit";
    }

    // 查看
    @GetMapping("/getList")
    public String getList() {
        return "getList";
    }
}
