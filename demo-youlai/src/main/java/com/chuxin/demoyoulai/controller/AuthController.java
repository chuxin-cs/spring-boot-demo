package com.chuxin.demoyoulai.controller;

import com.chuxin.demoyoulai.common.result.Result;
import com.chuxin.demoyoulai.model.dto.LoginResult;
import com.chuxin.demoyoulai.service.AuthService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "01.认证中心")
@RestController
@RequestMapping("/api/v1/auth")
@Slf4j
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @Operation(summary = "登录")
    @PostMapping("/login")
    public Result<LoginResult> login(@Parameter(description = "用户名", example = "admin") @RequestParam String username, @Parameter(description = "密码", example = "123456") @RequestParam String password) {
        // 调用 service 的登录方法
        LoginResult loginResult = authService.login(username, password);
        // 返回登录结果
        return Result.success(loginResult);
    }
}
