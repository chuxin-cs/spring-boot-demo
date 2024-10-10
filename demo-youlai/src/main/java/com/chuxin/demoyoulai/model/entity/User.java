package com.chuxin.demoyoulai.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.chuxin.demoyoulai.common.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@TableName("sys_user")
@Getter
@Setter
public class User extends BaseEntity {
    /**
     * 用户名
     */
    private String username;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 性别((1-男 2-女 0-保密)
     */

    private Integer gender;

    /**
     * 密码
     */
    private String password;

    /**
     * 部门ID
     */
    private Long deptId;

    /**
     * 用户头像
     */
    private String avatar;

    /**
     * 联系方式
     */
    private String mobile;

    /**
     * 状态((1-正常 0-禁用)
     */
    private Integer status;

    /**
     * 用户邮箱
     */
    private String email;
}
