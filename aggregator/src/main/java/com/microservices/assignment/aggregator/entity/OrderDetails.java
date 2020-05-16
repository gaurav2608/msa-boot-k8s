package com.microservices.assignment.aggregator.entity;

public class OrderDetails {
	private Object userDetails;
	private Object orders;
	public Object getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(Object user) {
		this.userDetails = user;
	}
	public Object getOrders() {
		return orders;
	}
	public OrderDetails(Object userDetails, Object orders) {
		super();
		this.userDetails = userDetails;
		this.orders = orders;
	}
	public void setOrders(Object orders) {
		this.orders = orders;
	}

}
