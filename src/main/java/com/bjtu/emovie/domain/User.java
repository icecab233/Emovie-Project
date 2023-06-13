package com.bjtu.emovie.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class User {
    @TableId(value = "1",type = IdType.AUTO)
    private Integer userId;

    private String userName;

    private String password;
}
