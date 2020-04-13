package com.food.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Menu")
public class Menu {
	
	@Id
	   @Column(name="menuId")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	int menuId;
	
	@Column(name="foodId")
	int foodId;
	
	@Column(name="price")
	int price;
	
	@Column(name="startDate")
	Date startDate;
	
	@Column(name="endDate")
	Date endDate;
	
public int getMenuId() {
	return menuId;
}
public void setMenuId(int menuId) {
	this.menuId = menuId;
}
public int getFoodId() {
	return foodId;
}
public void setFoodId(int foodId) {
	this.foodId = foodId;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public Date getStartDate() {
	return startDate;
}
public void setStartDate(Date startDate) {
	this.startDate = startDate;
}
public Date getEndDate() {
	return endDate;
}
public void setEndDate(Date endDate) {
	this.endDate = endDate;
}


}
