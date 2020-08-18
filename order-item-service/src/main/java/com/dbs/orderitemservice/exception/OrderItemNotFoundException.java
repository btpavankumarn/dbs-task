package com.dbs.orderitemservice.exception;

public class OrderItemNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7738487152113880382L;

	public OrderItemNotFoundException(String message) {
		super(message);
	}
}
