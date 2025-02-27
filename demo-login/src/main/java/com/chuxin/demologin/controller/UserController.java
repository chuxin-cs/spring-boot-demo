package com.chuxin.demologin.controller;

import com.chuxin.demologin.shared.auth.service.AuthService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Tag(name = "用户模块")
@Slf4j
public class UserController {

    @Autowired
    private AuthService authService;

    // 注册
    @PostMapping("/register")
    @Operation(summary = "注册")
    public String register() {
        return "注册成功";
    }

    // 登录
    @PostMapping("/login")
    @Operation(summary = "登录")
    public String login(
            @Parameter(description = "用户名", example = "admin") @RequestParam String username,
            @Parameter(description = "密码", example = "123456") @RequestParam String password
    ) {
        return authService.login(username, password);
    }
}
