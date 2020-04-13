package com.food.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Cart")
public class Cart {
	
	@Id
	   @Column(name="cartId")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
       int cartId;
	
	@Column(name="customerId")
		int customerId;
	
	@Column(name="foodId")
		int foodId;
	
	@Column(name="quantity")
		int quantity;
	
	@Column(name="totalPrice")
		int totalPrice;
	
public int getCartId() {
	return cartId;
}
public void setCartId(int cartId) {
	this.cartId = cartId;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public int getFoodId() {
	return foodId;
}
public void setFoodId(int foodId) {
	this.foodId = foodId;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getTotalPrice() {
	return totalPrice;
}
public void setTotalPrice(int totalPrice) {
	this.totalPrice = totalPrice;
}

}
