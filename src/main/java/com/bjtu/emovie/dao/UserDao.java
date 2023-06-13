package com.bjtu.emovie.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bjtu.emovie.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User> {
}
