package com.chuxin.demoyoulai.service;

import com.chuxin.demoyoulai.model.dto.CaptchaResult;
import com.chuxin.demoyoulai.model.dto.LoginResult;

public interface AuthService {
    /**
     * 登录
     *
     * @param username 用户名
     * @param password 密码
     * @return 登录结果
     */
    LoginResult login(String username, String password);

    /**
     * 登出
     */
    void logout();

    /**
     * 获取验证码
     *
     * @return 验证码
     */
    CaptchaResult getCaptcha();

}
