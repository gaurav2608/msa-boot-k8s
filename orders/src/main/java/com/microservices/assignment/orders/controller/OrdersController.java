package com.microservices.assignment.orders.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.assignment.orders.entity.Orders;
import com.microservices.assignment.orders.services.OrdersService;

@RestController
@RequestMapping(value = "/orders")
public class OrdersController {

@Resource
OrdersService orderService;

@GetMapping(value = "/{userId}")
List<Orders> getUserDetails(@PathVariable(name = "userId") String id) {
	return orderService.getOrders(Integer.parseInt(id));
}
}
