package com.dbs.orderitemservice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.dbs.orderitemservice.dto.OrderItem;

public interface OrderItemRepository extends CrudRepository<OrderItem, Integer> {

	List<OrderItem> findByOrderId(int orderId);

}
