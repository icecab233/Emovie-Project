package com.bjtu.emovie.ctrl;

import com.bjtu.emovie.domain.Comment;
import com.bjtu.emovie.domain.Movie;
import com.bjtu.emovie.domain.User;
import com.bjtu.emovie.service.EmovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmovieController {
    @Autowired
    private EmovieService emovieService;

    // movie相关

    @GetMapping("/movie/{id}")
    public Movie getMovieById(@PathVariable int id){
        return emovieService.getMoiveById(id);
    }

    @GetMapping("/movie")
    public List<Movie> getAllMovie(){
        return emovieService.getMoive();
    }

    @PostMapping("/movie")
    public void addMoive(String imdbId, String title, String overview, String releaseDate, long revenue){
        emovieService.addMoiveByEntry(imdbId, title, overview, releaseDate, revenue);
    }

    @PostMapping("/movie/{id}")
    public void updateMoive(int id, String imdbId, String title, String overview, String releaseDate, long revenue){
        emovieService.updateMoive(id, imdbId, title, overview, releaseDate, revenue);
    }

    @DeleteMapping("/movie/{id}")
    public void deleteMovieById(@PathVariable int id){
        emovieService.deleteMovieById(id);
    }

    // user相关
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable int id){
        return emovieService.getUserById(id);
    }

    @GetMapping("/user")
    public List<User> getAllUser(){
        return emovieService.getAllUser();
    }

    @PostMapping("/user")
    public void addUser(String userName, int password, boolean isManager){
        emovieService.addUser(userName, password, isManager);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(int id){
        emovieService.deleteUser(id);
    }

    @PostMapping("/user/{id}")
    public void updateUser(int id, int password, boolean isManager){
        // 修改id用户的密码和isManager
        emovieService.updateUser(id, password, isManager);
    }

    // give_comment 相关
    @GetMapping("/comment")
    public List<Comment> getAllComment(){
        return emovieService.getAllComment();
    }
//1
    @PostMapping("/comment")
    public void addComment(int userId, int movieId, double rate){
        emovieService.addComment(userId, movieId, rate);
    }

    // has_history相关
    @PostMapping("/history")
    public void addHistory(int userId, int movieId){
        // 用下面这个dateTime作为表里的时间
        SimpleDateFormat tempDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = tempDate.format(new java.util.Date());
        emovieService.addHistory(userId, movieId, dateTime);
    }

    // add_favorite
    @PostMapping("/favorite")
    public void addFavorite(int userId, int movieId){
        emovieService.addFavorite(userId, movieId);
    }
}
