package com.chuxin.demotodolist.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todo")
public class TodoListController {
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

    // 查询所有
    @GetMapping("/list")
    public String getList() {
        return "list";
    }

    // 查询分页
    @GetMapping("/page")
    public String getPage() {
        return "page";
    }
}
