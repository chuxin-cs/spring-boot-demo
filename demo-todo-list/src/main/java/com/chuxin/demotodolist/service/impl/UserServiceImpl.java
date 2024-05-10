package com.chuxin.demotodolist.service.impl;

import com.chuxin.demotodolist.entity.Todo;
import com.chuxin.demotodolist.mapper.TodoMapper;
import com.chuxin.demotodolist.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements TodoService {

    @Autowired
    private TodoMapper todoMapper;

    @Override
    public List<Todo> findAll() {
        return todoMapper.findAll();
    }
}
