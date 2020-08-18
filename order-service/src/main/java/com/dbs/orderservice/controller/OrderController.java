package com.dbs.orderservice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.orderservice.dto.Order;
import com.dbs.orderservice.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	@GetMapping(value = "/getOrders")
	List<Order> getOrders() {
		return orderService.getOrders();
	}

	@PostMapping(value = "/postOrder")
	Order postOrder(@Valid @RequestBody Order order) {
		return orderService.saveOrder(order);
	}

}
