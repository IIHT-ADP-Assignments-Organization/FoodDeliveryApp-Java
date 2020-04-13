package com.food.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class Admin {
	
	@Id
	   @Column(name="adminId")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
         int adminId;
	
	@Column(name="firstName")
		String firstName;
	
	@Column(name="lastName")
		String lastName;
	
	@Column(name="userName")
		String userName;
	
	@Column(name="password")
		String password;
	
	@Column(name="menuId")
		int menuId;
	
	@Column(name="restaurantId")
		int restaurantId;
	
public int getAdminId() {
	return adminId;
}
public void setAdminId(int adminId) {
	this.adminId = adminId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getMenuId() {
	return menuId;
}
public void setMenuId(int menuId) {
	this.menuId = menuId;
}
public int getRestaurantId() {
	return restaurantId;
}
public void setRestaurantId(int restaurantId) {
	this.restaurantId = restaurantId;
}
}
