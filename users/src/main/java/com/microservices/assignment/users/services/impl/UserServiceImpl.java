package com.microservices.assignment.users.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.assignment.users.dao.UserDao;
import com.microservices.assignment.users.entity.User;
import com.microservices.assignment.users.services.UserService;

@Service
public class UserServiceImpl implements UserService{

	
	private UserDao userDao;
    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

	@Override
	public User getUserById(String id) {
		// TODO Auto-generated method stub
		return userDao.findById(Integer.parseInt(id));
	}

}
