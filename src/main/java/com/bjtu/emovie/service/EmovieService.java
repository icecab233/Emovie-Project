package com.bjtu.emovie.service;

import com.bjtu.emovie.domain.Comment;
import com.bjtu.emovie.domain.Movie;
import com.bjtu.emovie.domain.User;

import java.util.List;


/**
 * @author jerry
 */
public interface EmovieService {

    Movie getMoiveById(int id);

    List<Movie> getMoive();

    void addMoiveByEntry(String imdbId, String title, String overview, String releaseDate, long revenue);

    void updateMoive(int id, String imdbId, String title, String overview, String releaseDate, long revenue);

    void deleteMovieById(int id);

    User getUserById(int id);

    List<User> getAllUser();

    void addUser(String userName, int password, int isManager);

    void addFavorite(int userId, int movieId);

    void addHistory(int userId, int movieId, String dateTime);

    void addComment(int userId, int movieId, double rate);

    List<Comment> getAllComment();

    void updateUser(int id, int password, int isManager);

    void deleteUser(int id);
}
