package com.dbs.orderservice.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dbs.orderservice.dto.OrderItem;

@FeignClient(name = "order-item", url = "${order-item-url}")
public interface OrderItemService {

	@RequestMapping(method = RequestMethod.GET, value = "/getOrderItems/{orderId}")
	List<OrderItem> getOrderItems(@PathVariable("orderId") int orderId);

	@RequestMapping(method = RequestMethod.POST, path = "/postOrderItem")
	OrderItem postOrderItem(OrderItem orderItem);

}