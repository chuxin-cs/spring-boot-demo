package com.chuxin.democurd.entity;

import lombok.Data;

@Data
public class User {
    /**
     * 用户id
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
}
