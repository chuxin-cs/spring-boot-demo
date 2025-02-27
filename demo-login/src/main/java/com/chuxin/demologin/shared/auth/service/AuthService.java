package com.chuxin.demologin.shared.auth.service;

import com.chuxin.demologin.shared.auth.model.CaptchaInfo;

/**
 * 认证服务接口
 * @author chuxin
 */
public interface AuthService {
    /**
     * 登录
     * @param username 用户名
     * @param password 密码
     * @return 登录结果
     */
    String login(String username, String password);

    /**
     * 获取验证码
     *
     * @return 验证码
     */
    String getCaptcha();
}
