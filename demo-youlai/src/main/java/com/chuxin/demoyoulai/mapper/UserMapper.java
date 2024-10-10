package com.chuxin.demoyoulai.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chuxin.demoyoulai.model.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
