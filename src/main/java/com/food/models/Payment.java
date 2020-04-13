package com.food.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Payment")
public class Payment {
	
	@Id
	   @Column(name="paymentId")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
     int paymentId;
	
	@Column(name="customerId")
	int customerId;
	
	@Column(name="orderId")
	int orderId;
	
	@Column(name="paymentDate")
	Date paymentDate;
	
	@Column(name="amount")
	int amount;
	
	@Column(name="paymentMode")
	String paymentMode;
	
public int getPaymentId() {
	return paymentId;
}
public void setPaymentId(int paymentId) {
	this.paymentId = paymentId;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public Date getPaymentDate() {
	return paymentDate;
}
public void setPaymentDate(Date paymentDate) {
	this.paymentDate = paymentDate;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public String getPaymentMode() {
	return paymentMode;
}
public void setPaymentMode(String paymentMode) {
	this.paymentMode = paymentMode;
}

}
