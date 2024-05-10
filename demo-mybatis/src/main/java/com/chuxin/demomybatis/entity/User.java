package com.chuxin.demomybatis.entity;

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
    private String username;
    /**
     * password
     */
    private String password;
}
