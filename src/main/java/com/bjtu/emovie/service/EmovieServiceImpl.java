package com.bjtu.emovie.service;

import com.bjtu.emovie.dao.*;
import com.bjtu.emovie.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.ParameterResolutionDelegate;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EmovieServiceImpl implements EmovieService{

    @Autowired
    private MovieDao movieDao;
    @Autowired
    private HistoryDao historyDao;
    @Autowired
    private CommentDao commentDao;
    @Autowired
    private FavoriteDao favoriteDao;
    @Autowired
    private UserDao userDao;

    @Override
    public Movie getMoiveById(int id) {
        return movieDao.selectById(id);
    }

    @Override
    public List<Movie> getMoive() {
        return movieDao.selectList(null);
    }

    @Override
    public void addMoiveByEntry(String imdbId, String title, String overview, String releaseDate, long revenue) {
        Movie movie = new Movie();
        movie.setImdbId(imdbId);
        movie.setTitle(title);
        movie.setOverview(overview);
        movie.setReleaseDate(releaseDate);
        movie.setRevenue((int) revenue);
        movieDao.insert(movie);
    }

    @Override
    public void updateMoive(int id, String imdbId, String title, String overview, String releaseDate, long revenue) {
        Movie movie = new Movie();
        movie.setId(id);
        movie.setImdbId(imdbId);
        movie.setTitle(title);
        movie.setOverview(overview);
        movie.setReleaseDate(releaseDate);
        movie.setRevenue((int) revenue);
        movieDao.updateById(movie);
    }

    @Override
    public void deleteMovieById(int id) {
        movieDao.deleteById(id);
    }

    @Override
    public User getUserById(int id) {
        return userDao.selectById(id);
    }

    @Override
    public List<User> getAllUser() {
        return userDao.selectList(null);
    }
//wenti
    @Override
    public void addUser(String userName, int password, int isManager) {
        User user = new User();
        user.setUserName(userName);
        user.setPassword(String.valueOf(password));
        user.setIsManager(isManager);
        userDao.insert(user);
    }

    @Override
    public void addFavorite(int userId, int movieId) {
        Favorite favorite = new Favorite();
        favorite.setUserId(userId);
        favorite.setMovieId(movieId);
        favoriteDao.insert(favorite);
    }

    @Override
    public void addHistory(int userId, int movieId, String dateTime) {
        History history = new History();
        history.setUserId(userId);
        history.setMovieId(movieId);
        history.setTime(LocalDateTime.parse(dateTime));
        historyDao.insert(history);
    }

    @Override
    public void addComment(int userId, int movieId, double rate) {
        Comment comment = new Comment();
        comment.setUserId(userId);
        comment.setMovieId(movieId);
        comment.setRate((float) rate);
        commentDao.insert(comment);
    }

    @Override
    public List<Comment> getAllComment() {
        return commentDao.selectList(null);
    }

    @Override
    public void updateUser(int id, int password, int isManager) {
        User user = userDao.selectById(id);
        user.setPassword(String.valueOf(password));
        user.setIsManager(isManager);
        userDao.updateById(user);
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteById(id);
    }
}
