package com.chuxin.demolocal.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/local")
public class LocalController {

    @Value("${spring.profiles.active}")
    private String name;

    @GetMapping("/test")
    public String test() {
        return "项目环境: " + name;
    }

}
