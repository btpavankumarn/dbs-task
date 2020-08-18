package com.dbs.orderitemservice.service;

import java.util.List;

import com.dbs.orderitemservice.dto.OrderItem;

public interface OrderItemService {

	public OrderItem saveOrderItem(OrderItem orderItem);

	public List<OrderItem> getOrderItems(int orderId);

}
