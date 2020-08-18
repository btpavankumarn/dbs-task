package com.dbs.orderitemservice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.orderitemservice.dto.OrderItem;
import com.dbs.orderitemservice.service.OrderItemService;

@RestController
public class OrderItemController {

	@Autowired
	private OrderItemService orderItemService;

	@GetMapping(value = "/getOrderItems/{orderId}")
	List<OrderItem> getOrders(@PathVariable("orderId") int orderId) {
		return orderItemService.getOrderItems(orderId);
	}

	@PostMapping(value = "/postOrderItem")
	OrderItem postOrderItem(@Valid @RequestBody OrderItem orderItem) {
		return orderItemService.saveOrderItem(orderItem);
	}
}
