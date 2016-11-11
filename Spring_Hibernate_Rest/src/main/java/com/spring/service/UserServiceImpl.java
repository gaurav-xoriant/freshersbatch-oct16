package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring.dao.UserDAO;
import com.spring.entity.User;

public class UserServiceImpl implements UserService {
	@Autowired 
	private UserDAO userDao;

	public User create(User user) {
		return userDao.create(user);
	}

}
