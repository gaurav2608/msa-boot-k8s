package com.microservices.assignment.users.repository;

import com.microservices.assignment.users.entity.User;

public interface UserRepository  {
	
	public User findById(String id);

}
