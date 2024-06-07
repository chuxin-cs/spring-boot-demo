package com.chuxin.democurd.controller;

import com.chuxin.democurd.common.result.ApiResultHandler;
import com.chuxin.democurd.entity.ApiResult;
import com.chuxin.democurd.entity.User;
import com.chuxin.democurd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    // 查
    @GetMapping("/page")
    public ApiResult<User> page(@RequestParam int page, @RequestParam int pageSize) {
        return ApiResultHandler.success( userService.page());
    }
    // 增
    @PostMapping("/add")
    public Boolean add(@RequestBody User user) {
        return userService.add(user);
    }

    // 删
    @GetMapping("delete")
    public String delete() {
        return "delete" + userService.delete();
    }

    // 改
    @GetMapping("edit")
    public String edit() {
        return "edit" + userService.edit();
    }


}
