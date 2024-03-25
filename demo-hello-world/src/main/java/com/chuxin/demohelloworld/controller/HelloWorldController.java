package com.chuxin.demohelloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class HelloWorldController {

    @GetMapping("/list")
    public String getList() {
        return "hello world!";
    }
}
