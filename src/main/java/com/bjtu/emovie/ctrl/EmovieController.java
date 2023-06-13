package com.bjtu.emovie.ctrl;

import com.bjtu.emovie.domain.Movie;
import com.bjtu.emovie.service.EmovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmovieController {
@Autowired
    private EmovieService emovieService;
    @GetMapping("/movie/{id}")
//    public String getMovie(int id){
//        return "get Movie of id " + id;
//    }
    public Movie getMoiveById(@PathVariable int id){
        return emovieService.getMoiveById(id);
    }
}
