package com.bjtu.emovie.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Moive {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String imdbId;
    private String originalLanguage;
    private String overview;
    private float popularity;
    private String posterPath;
    private String releaseDate;
    private int revenue;
    private int runtime;
    private String title;
}
