package com.chuxin.democrud.controller;

import com.chuxin.democrud.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    // 增加
    @GetMapping("/add")
    public String add() {
        String result = "add";
        return result + "接口";
    }

    // 删除
    @PostMapping("/delete")
    public String delete() {
        return "delete";
    }

    // 修改
    @PostMapping("/edit")
    public String edit(@RequestBody User user) {
        return "add" + user.getUserName()  + user.getPassword();
    }

    @PostMapping("/edit1")
    public String edit1(@ModelAttribute User user) {
        return "add:" + user.getUserName() + user.getId() + user.getPassword();
    }

    // 查看
    @GetMapping("/getList")
    public String getList(@RequestParam int page, @RequestParam int pageSize) {
        return "getList：" + page + " " + pageSize;
    }
    // 查看
    @GetMapping("/getList1/{page}/{pageSize}")
    public String getList1(@PathVariable String page, @PathVariable String pageSize) {
        return "getList：" + page + " " + pageSize;
    }
}
