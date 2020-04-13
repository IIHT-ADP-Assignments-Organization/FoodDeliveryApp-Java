package com.food.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Order")
public class Order {
	
	@Id
	   @Column(name="orderId")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	int orderId;
	
	@Column(name="orderDate")
	Date orderDate;
	
	@Column(name="quantity")
	int quantity;
	
	@Column(name="pickupDate")
	Date pickupDate;
	
	@Column(name="status")
	String status;
	
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public Date getOrderDate() {
	return orderDate;
}
public void setOrderDate(Date orderDate) {
	this.orderDate = orderDate;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public Date getPickupDate() {
	return pickupDate;
}
public void setPickupDate(Date pickupDate) {
	this.pickupDate = pickupDate;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}

}
