package edu.hubu.learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hubu.learn.dao.UserDao;
import edu.hubu.learn.entity.Student;
import edu.hubu.learn.entity.User;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getUser(Long id) {
        return userDao.findById(id).get();
    }

	public Student getStudent(long l) {
		return null;
	}
}