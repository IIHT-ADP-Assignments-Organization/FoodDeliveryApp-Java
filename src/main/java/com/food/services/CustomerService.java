package com.food.services;

import com.food.models.Cart;
import com.food.models.Customer;
import com.food.models.Order;
import com.food.models.Payment;
import com.food.models.Restaurant;

public interface CustomerService {
	
Customer register(Customer customer);
boolean login(String email,String password);
Restaurant searchRestaurant(String restaurantName);
Order viewOrder();
int addToCart(Cart cart);
Cart viewCart();
Order placeOrder(Order order);
Payment makePayment(Payment payment);

}
