package com.chuxin.demoyoulai.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "02.用户接口")
@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {
}
