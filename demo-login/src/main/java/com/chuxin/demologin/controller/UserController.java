package com.chuxin.demologin.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Tag(name = "用户模块")
public class UserController {
    // 注册
    @PostMapping("/register")
    @Operation(summary = "注册")
    public String register() {
        return "注册成功";
    }

    // 登录
    @GetMapping("/login")
    @Operation(summary = "登录")
    public String login() {
        return "登录成功";
    }
}
