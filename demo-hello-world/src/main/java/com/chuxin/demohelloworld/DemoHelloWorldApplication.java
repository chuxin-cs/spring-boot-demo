package com.chuxin.demohelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoHelloWorldApplication {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        SpringApplication.run(DemoHelloWorldApplication.class, args);
    }
}
