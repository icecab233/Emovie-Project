package com.bjtu.emovie;

import com.bjtu.emovie.dao.HistoryDao;
import com.bjtu.emovie.dao.UserDao;
import com.bjtu.emovie.domain.History;
import com.bjtu.emovie.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class EmovieApplicationTests {
@Autowired
private UserDao userDao;
@Autowired
private HistoryDao historyDao;

	@Test
	void insertHistory() {
		History history = new History();
		history.setUserId(1);
		history.setMovieId(2);
		historyDao.insert(history);
	}
}
