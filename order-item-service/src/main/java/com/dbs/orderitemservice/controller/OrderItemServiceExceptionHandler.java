package com.dbs.orderitemservice.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dbs.orderitemservice.dto.ErrorResponse;
import com.dbs.orderitemservice.exception.OrderItemNotFoundException;

@ControllerAdvice
public class OrderItemServiceExceptionHandler {

	@ResponseBody
	@ExceptionHandler(value = { OrderItemNotFoundException.class })
	public ResponseEntity<ErrorResponse> handleOrderNotFoundException(HttpServletRequest request,
			OrderItemNotFoundException orderNotFoundException) {
		ErrorResponse errorResponse = new ErrorResponse("Internal Server Error", orderNotFoundException.getMessage());
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
	}

	@ResponseBody
	@ExceptionHandler(value = { MethodArgumentNotValidException.class })
	public ResponseEntity<List<ErrorResponse>> handleValidationException(
			MethodArgumentNotValidException methodArgumentNotValidException) {
		List<ErrorResponse> errors = new ArrayList<>();
		methodArgumentNotValidException.getBindingResult().getAllErrors().forEach((error) -> {
			ErrorResponse errorResponse = new ErrorResponse(((FieldError) error).getField(), error.getDefaultMessage());
			errors.add(errorResponse);
		});
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors);
	}

}
