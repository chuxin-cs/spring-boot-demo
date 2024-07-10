package com.chuxin.demotodolist.mapper;

import com.chuxin.demotodolist.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    // 增
    @Insert("insert into sys_user (name,password) values (#{name},#{password})")
    Integer add(User user);
    // 删
    @Delete("delete from sys_user where id=#{id}")
    Integer delete(Integer id);
    // 改
    @Update("update sys_user set name=#{name},password=#{password} where id=#{id}")
    Integer edit(User user);
    // 查
    @Select("select * from sys_user")
    List<User> getList();
}
