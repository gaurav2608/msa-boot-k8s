package com.microservices.assignment.users.controller;

import javax.annotation.Resource;

//import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.assignment.users.entity.User;
import com.microservices.assignment.users.services.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Resource
	UserService UserService;
	
	@GetMapping(value = "/{userId}")
	User getUserDetails(@PathVariable(name = "userId") String id) {
		return UserService.getUserById(id);
	}

}
