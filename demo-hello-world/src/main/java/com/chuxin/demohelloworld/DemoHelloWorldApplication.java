package com.chuxin.demohelloworld;

import com.chuxin.demohelloworld.utils.Common;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoHelloWorldApplication {

    public static void main(String[] args) {
        // 打印 hello world
        System.out.println("Hello World!");

        // package 代码演示
        Common common = new Common();
        System.out.println(common.add(1,2));

        // spring boot 启动
        SpringApplication.run(DemoHelloWorldApplication.class, args);
    }
}
