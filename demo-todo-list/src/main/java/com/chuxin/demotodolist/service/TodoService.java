package com.chuxin.demotodolist.service;

import com.chuxin.demotodolist.entity.Todo;

import java.util.List;

public interface TodoService {
    List<Todo> findAll();
}
