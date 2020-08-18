package com.dbs.orderitemservice.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity(name = "ORDER_ITEM")
public class OrderItem {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "order_id")
	@NotNull(message = "Order Id is Mandatory")
	private Integer orderId;

	@Column(name = "product_code")
	@NotBlank(message = "Order Item Product Code is Mandatory")
	private String productCode;

	@Column(name = "product_name")
	@NotBlank(message = "Order Item Product Name is Mandatory")
	private String productName;

	@Column(name = "product_quantity")
	@NotNull(message = "Product Quantity is Mandatory")
	private Integer quantity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
