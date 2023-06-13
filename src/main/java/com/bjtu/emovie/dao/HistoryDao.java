package com.bjtu.emovie.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bjtu.emovie.domain.History;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HistoryDao extends BaseMapper<History> {
}
