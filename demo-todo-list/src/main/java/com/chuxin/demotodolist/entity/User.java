package com.chuxin.demotodolist.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Schema(description = "用户id")
    private int id;
    @Schema(description = "用户名称")
    private String name;
    @Schema(description = "用户密码")
    private String password;
}
