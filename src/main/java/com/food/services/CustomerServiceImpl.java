package com.food.services;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.food.models.Cart;
import com.food.models.Customer;
import com.food.models.Order;
import com.food.models.Payment;
import com.food.models.Restaurant;
@Component
public class CustomerServiceImpl implements CustomerService {
	@Transactional
	public Customer register(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean login(String email, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public Restaurant searchRestaurant(String restaurantName) {
		// TODO Auto-generated method stub
		return null;
	}

	public Order viewOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	public int addToCart(Cart cart) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Cart viewCart() {
		// TODO Auto-generated method stub
		return null;
	}

	public Order placeOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	public Payment makePayment(Payment payment) {
		// TODO Auto-generated method stub
		return null;
	}

}
