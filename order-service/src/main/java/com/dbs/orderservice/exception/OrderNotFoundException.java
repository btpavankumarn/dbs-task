package com.dbs.orderservice.exception;

public class OrderNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1376283587692308041L;

	public OrderNotFoundException(String string) {
		super(string);
	}

}
