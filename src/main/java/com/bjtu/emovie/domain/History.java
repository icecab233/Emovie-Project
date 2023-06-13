package com.bjtu.emovie.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Generated;
import lombok.Value;

import java.time.LocalDateTime;
@Data
@TableName("has_history")
public class History {
    @TableId(value="1",type = IdType.AUTO)
    private Integer id;
    private Integer userId;
    private Integer movieId;
    private LocalDateTime time;
}
