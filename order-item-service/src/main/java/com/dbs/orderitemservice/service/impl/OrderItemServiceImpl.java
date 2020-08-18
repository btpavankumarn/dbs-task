package com.dbs.orderitemservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.orderitemservice.dto.OrderItem;
import com.dbs.orderitemservice.exception.OrderItemNotFoundException;
import com.dbs.orderitemservice.repository.OrderItemRepository;
import com.dbs.orderitemservice.service.OrderItemService;

@Service
public class OrderItemServiceImpl implements OrderItemService {

	@Autowired
	OrderItemRepository orderItemRepository;

	@Override
	public List<OrderItem> getOrderItems(int orderId) {
		List<OrderItem> orderItems = orderItemRepository.findByOrderId(orderId);
		if (orderItems == null || orderItems.size() == 0) {
			throw new OrderItemNotFoundException("Order Items Not Found");
		}
		return orderItems;
	}

	@Override
	public OrderItem saveOrderItem(OrderItem orderItem) {
		return orderItemRepository.save(orderItem);
	}

}
