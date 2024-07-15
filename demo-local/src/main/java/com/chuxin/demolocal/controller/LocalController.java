package com.chuxin.demolocal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/local")
public class LocalController {

    @GetMapping("/test")
    public String test() {
        return "项目现在的环境是:" + "dev";
    }

}
