package com.chuxin.demomybatisplus.mapper;

import com.chuxin.demomybatisplus.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    // 查询用户列表
    @Select("select  * from sys_user")
    List<User> getList();
    
}
