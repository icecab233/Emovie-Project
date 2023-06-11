package com.bjtu.emovie.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmovieController {

    @GetMapping("/movie")
    public String getMovie(int id){
        return "get Movie of id " + id;
    }
}
