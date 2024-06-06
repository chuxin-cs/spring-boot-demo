package com.chuxin.demohelloworld.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @GetMapping("/getList")
    public String getList() {
        return "Hello World";
    }
}
