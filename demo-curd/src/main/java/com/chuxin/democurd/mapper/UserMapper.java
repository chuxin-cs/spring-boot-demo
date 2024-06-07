package com.chuxin.democurd.mapper;

import com.chuxin.democurd.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from sys_user")
    List<User> page();

    String delete();
    String edit();

    @Insert("insert into sys_user (username,password) values (#{username},#{password})")
    Boolean add(User user);
}
