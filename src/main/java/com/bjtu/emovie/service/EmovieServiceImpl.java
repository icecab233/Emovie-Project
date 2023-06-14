package com.bjtu.emovie.service;

import com.bjtu.emovie.dao.MovieDao;
import com.bjtu.emovie.dao.UserDao;
import com.bjtu.emovie.domain.Movie;
import com.bjtu.emovie.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmovieServiceImpl implements EmovieService{

    @Autowired
    private MovieDao movieDao;

    @Autowired
    private UserDao userDao;

    @Override
    public Movie getMoiveById(int id) {
        return movieDao.selectById(id);
    }
}
