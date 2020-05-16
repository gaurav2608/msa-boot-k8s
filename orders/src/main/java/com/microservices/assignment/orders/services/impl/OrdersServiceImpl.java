package com.microservices.assignment.orders.services.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.microservices.assignment.orders.entity.Orders;
import com.microservices.assignment.orders.services.OrdersService;
@Service
public class OrdersServiceImpl implements OrdersService{

	org.slf4j.Logger logger=LoggerFactory.getLogger(OrdersServiceImpl.class);
	@Override
	public List<Orders> getOrders(int userId) {
		return getAllProducts();
	}
	
	private List<Orders> getAllProducts() {
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MMM-yyyy");
		List<Orders> orders = new ArrayList<>();
		try {
		orders.add(new Orders(1, 250d,dateFormat.parse("14-Apr-2020")));
		orders.add(new Orders(2, 450d,dateFormat.parse("15-Apr-2020")));
		orders.add(new Orders(3, 450d,dateFormat.parse("16-Apr-2020")));
		orders.add(new Orders(4, 350d,dateFormat.parse("17-Apr-2020")));
		} catch (ParseException e) {
			logger.error("Error while parsing date", e);
		}
		return orders;
	}

}
