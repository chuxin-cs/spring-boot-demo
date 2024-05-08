package com.chuxin.demorouter.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    /**
     * 主键id
     */
    private Integer id;
    /**
     * 用户名
     */
    private String name;
    /**
     * password
     */
    private String password;
}
