package com.microservices.assignment.users.dao;

import com.microservices.assignment.users.entity.User;

public interface UserDao {
	User findById(int id);
}
