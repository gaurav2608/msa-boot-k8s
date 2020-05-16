package com.microservices.assignment.orders.services;

import java.util.List;

import com.microservices.assignment.orders.entity.Orders;

public interface OrdersService {
public List<Orders> getOrders(int userId);
}
