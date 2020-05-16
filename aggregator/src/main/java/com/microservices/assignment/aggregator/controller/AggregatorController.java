package com.microservices.assignment.aggregator.controller;

import javax.annotation.Resource;

//import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.assignment.aggregator.entiry.AggregatorService;
import com.microservices.assignment.aggregator.entity.OrderDetails;

@RestController
@RequestMapping(value = "/orderdetails")
public class AggregatorController {
	@Resource
	AggregatorService aggregatorService;

	@GetMapping(value = "/{userId}")
	OrderDetails getOrderDetails(@PathVariable(name = "userId") String id) {
		return aggregatorService.getOrderDetails(Integer.parseInt(id));
	}
}
