package com.chuxin.demologin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CorsConfig {

    @Bean
    public String filterRegistrationBean() {
        String name = "初心";
        System.out.println(name);
        return name;
    }
}
