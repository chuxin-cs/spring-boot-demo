package com.chuxin.demomybatisplus;

import com.chuxin.demomybatisplus.entity.User;
import com.chuxin.demomybatisplus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoMybatisPlusApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private UserMapper userMapper;

    @Test
    public void getList() {
        List<User> users = userMapper.getList();
        for (User user : users) {
            System.out.println("name: ===> " + user.getName());
        }
    }
}
