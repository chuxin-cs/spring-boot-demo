package com.chuxin.democurd.mapper;

import com.chuxin.democurd.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from sys_user")
    List<User> findAll();

    // 新增
    @Insert("INSERT INTO `sys_user` (`userName`, `password`) VALUES (#{userName}, #{password});")
    Integer addUser(User user);

    // 删除用户
    @Delete("delete from sys_user where id=#{id}")
    Integer deleteUser(Integer id);

    @Update("update sys_user set userName=#{userName},password=#{password} where id=#{id}")
    Integer editUser(User user);
}
