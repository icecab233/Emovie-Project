package com.bjtu.emovie.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("add_favorite")
public class Favorite {
    @TableId(value = "1",type = IdType.AUTO)
    private Integer id;
    private Integer userId;
    private Integer movieId;
}
