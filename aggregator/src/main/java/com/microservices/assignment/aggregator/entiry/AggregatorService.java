package com.microservices.assignment.aggregator.entiry;

import com.microservices.assignment.aggregator.entity.OrderDetails;

public interface AggregatorService {
	
	public OrderDetails getOrderDetails(int userId) ;

}
