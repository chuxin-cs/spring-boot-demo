package com.chuxin.demologin.shared.auth.service.impl;

import com.chuxin.demologin.shared.auth.service.AuthService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class AuthServiceImpl implements AuthService {

    @Override
    public String login(String username, String password) {
        return "login";
    }

    @Override
    public String getCaptcha() {
        return "1";
    }
}
