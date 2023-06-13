package com.bjtu.emovie.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.models.auth.In;
import lombok.Data;

@Data
@TableName("give_comment")
public class Comment {
    @TableId(value = "1",type = IdType.AUTO)
    private Integer id;
    private Integer UserId;
    private Integer MovieId;
    private Float rate;
    private String comment;
}
