package com.food.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Restaurant")
public class Restaurant {
	
	@Id
	   @Column(name="restaurantId")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
      int restaurantId;
	
	@Column(name="restaurantName")
   String restaurantName;
	
	@Column(name="restaurantAddress")
   String restaurantAddress;
	
	@Column(name="phoneNumber")
   int phoneNumber;
	
	@Column(name="menuId")
   int menuId;
public int getRestaurantId() {
	return restaurantId;
}
public void setRestaurantId(int restaurantId) {
	this.restaurantId = restaurantId;
}
public String getRestaurantName() {
	return restaurantName;
}
public void setRestaurantName(String restaurantName) {
	this.restaurantName = restaurantName;
}
public String getRestaurantAddress() {
	return restaurantAddress;
}
public void setRestaurantAddress(String restaurantAddress) {
	this.restaurantAddress = restaurantAddress;
}
public int getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(int phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public int getMenuId() {
	return menuId;
}
public void setMenuId(int menuId) {
	this.menuId = menuId;
}


}
