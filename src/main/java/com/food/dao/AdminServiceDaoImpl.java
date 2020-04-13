package com.food.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.food.models.Admin;
import com.food.models.DeliveryPerson;
import com.food.models.FoodItem;
import com.food.models.Menu;
import com.food.models.Order;
import com.food.models.Restaurant;
@Component
public class AdminServiceDaoImpl implements adminServiceDao {
	@Autowired
	SessionFactory sessionfactory;

	
	public Admin Register(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean login(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public int addFoodItem(FoodItem foodItem) {
		// TODO Auto-generated method stub
		return 0;
	}

	public FoodItem updateFoodItem(FoodItem foodItem) {
		// TODO Auto-generated method stub
		return null;
	}

	public FoodItem getFoodItem(int foodId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteFoodItem(int foodId) {
		// TODO Auto-generated method stub
		return false;
	}

	public int addRestaurant(Restaurant restaurant) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Restaurant updateRestaurant(Restaurant restaurant) {
		// TODO Auto-generated method stub
		return null;
	}

	public Restaurant getRestaurant(int restaurantId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteRestaurant(int restaurantId) {
		// TODO Auto-generated method stub
		return false;
	}

	public int addDeliveryPerson(DeliveryPerson deliveryPerson) {
		// TODO Auto-generated method stub
		return 0;
	}

	public DeliveryPerson updateDeliveryPerson(DeliveryPerson deliveryPerson) {
		// TODO Auto-generated method stub
		return null;
	}

	public DeliveryPerson getDeliveryPersong(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteDeliveryPerson(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public int addMenu(Menu menu) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Menu updateMenu(Menu menu) {
		// TODO Auto-generated method stub
		return null;
	}

	public Menu getMenu(int menuId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteMenu(int menuId) {
		// TODO Auto-generated method stub
		return false;
	}

	public Order searchOrder(int orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	public String updateOrderStatus(String status) {
		// TODO Auto-generated method stub
		return null;
	}

	public Order getOrderStatus(int orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	public DeliveryPerson assignOrderToDeliveryPerson(int id, int orderId, int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
