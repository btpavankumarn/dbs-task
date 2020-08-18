package com.dbs.orderservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.orderservice.dto.Order;
import com.dbs.orderservice.exception.OrderNotFoundException;
import com.dbs.orderservice.repository.OrderRepository;
import com.dbs.orderservice.service.OrderItemService;
import com.dbs.orderservice.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository orderRepository;

	@Autowired
	OrderItemService orderItemService;

	@Override
	public List<Order> getOrders() {
		List<Order> orders = orderRepository.findAll();
		if (orders == null || orders.size() == 0) {
			throw new OrderNotFoundException("Orders Not Found");
		}
		orders.forEach(order -> {
			order.setOrderItems(orderItemService.getOrderItems(order.getId()));
		});
		return orders;
	}

	@Override
	public Order saveOrder(Order order) {
		orderRepository.save(order);
		order.getOrderItems().forEach(orderItem -> {
			orderItem.setOrderId(order.getId());
			orderItem.setId(orderItemService.postOrderItem(orderItem).getId());
		});
		return order;
	}

}
