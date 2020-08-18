package com.dbs.orderservice.service;

import java.util.List;

import com.dbs.orderservice.dto.Order;

public interface OrderService {

	List<Order> getOrders();

	Order saveOrder(Order order);

}
