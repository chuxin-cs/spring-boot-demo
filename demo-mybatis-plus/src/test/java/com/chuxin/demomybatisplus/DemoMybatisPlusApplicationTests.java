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

    // 使用 Mybatis Plus 进行查询
    @Test
    public void getList() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }
}
