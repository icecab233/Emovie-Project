package com.bjtu.emovie.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bjtu.emovie.domain.Moive;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MovieDao extends BaseMapper<Moive> {
}
