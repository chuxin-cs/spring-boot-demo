package com.chuxin.democurd.controller;

import com.chuxin.democurd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getUser")
    public HashMap<String, Object> getUser() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("status", 200);
        map.put("message", "hello world!" + userService.add());
        return map;
    }
}
