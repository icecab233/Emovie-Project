package com.bjtu.emovie.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bjtu.emovie.domain.Comment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentDao extends BaseMapper<Comment> {
}
