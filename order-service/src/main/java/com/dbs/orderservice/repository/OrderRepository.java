package com.dbs.orderservice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.dbs.orderservice.dto.Order;

public interface OrderRepository extends CrudRepository<Order, Integer> {

	@Override
	List<Order> findAll();

}
