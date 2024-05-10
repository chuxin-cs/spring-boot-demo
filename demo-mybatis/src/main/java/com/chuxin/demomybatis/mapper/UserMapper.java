package com.chuxin.demomybatis.mapper;

import com.chuxin.demomybatis.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from sys_user")
    List<User> findAll();
}
