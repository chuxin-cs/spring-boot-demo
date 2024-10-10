package com.chuxin.demoyoulai.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chuxin.demoyoulai.mapper.UserMapper;
import com.chuxin.demoyoulai.model.entity.User;
import com.chuxin.demoyoulai.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
