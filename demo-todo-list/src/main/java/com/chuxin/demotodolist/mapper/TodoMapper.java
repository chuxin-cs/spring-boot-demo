package com.chuxin.demotodolist.mapper;

import com.chuxin.demotodolist.entity.Todo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TodoMapper {
    @Select("select * from sys_user")
    List<Todo> findAll();
}
