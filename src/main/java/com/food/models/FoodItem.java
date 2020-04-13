package com.food.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FoodItem")
public class FoodItem {
	
	@Id
	   @Column(name="foodId")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
      int foodId;
	
	@Column(name="name")
	String name;
	
	@Column(name="quantity")
	int quantity;
	
	@Column(name="cost")
	int cost;
	
	@Column(name="itemCategory")
	String itemCategory;
	
public int getFoodId() {
	return foodId;
}
public void setFoodId(int foodId) {
	this.foodId = foodId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
public String getItemCategory() {
	return itemCategory;
}
public void setItemCategory(String itemCategory) {
	this.itemCategory = itemCategory;
}


}
