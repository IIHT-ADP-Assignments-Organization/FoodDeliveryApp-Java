package com.food.services;

import com.food.models.Admin;
import com.food.models.DeliveryPerson;
import com.food.models.FoodItem;
import com.food.models.Menu;
import com.food.models.Order;
import com.food.models.Restaurant;

public interface AdminService {
	
Admin Register(Admin admin);
boolean login(String userName,String password);
int addFoodItem(FoodItem foodItem);
FoodItem updateFoodItem(FoodItem foodItem);
FoodItem getFoodItem(int foodId);
boolean deleteFoodItem(int foodId);
int addRestaurant(Restaurant restaurant);
Restaurant updateRestaurant(Restaurant restaurant);
Restaurant getRestaurant(int restaurantId);
boolean deleteRestaurant(int restaurantId);
int addDeliveryPerson(DeliveryPerson deliveryPerson);
DeliveryPerson updateDeliveryPerson(DeliveryPerson deliveryPerson);
DeliveryPerson getDeliveryPersong(int id);
boolean deleteDeliveryPerson(int id);
int addMenu(Menu menu);
Menu updateMenu(Menu menu );
Menu getMenu(int menuId);
boolean deleteMenu(int menuId);
Order searchOrder(int orderId);
String updateOrderStatus(String status);
Order getOrderStatus(int orderId);
DeliveryPerson assignOrderToDeliveryPerson(int id,int orderId,int customerId);


}
