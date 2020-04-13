package com.food.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.hibernate.usertype.UserType;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.food.models.Admin;
import com.food.models.Cart;
import com.food.models.Customer;
import com.food.models.DeliveryPerson;
import com.food.models.FoodItem;
import com.food.models.Menu;
import com.food.models.Order;
import com.food.models.Payment;
import com.food.models.Restaurant;
import com.food.services.AdminService;
import com.food.services.CustomerService;




public class TestFunctional {
	
		@Test
		public void testvalidAdminRegistration() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
		 Admin admin=new Admin();
		 admin.setAdminId(12);
		 admin.setFirstName("james");
		 admin.setMenuId(1);
		 admin.setPassword("hello2123");
		 admin.setUserName("james");
	String isRegistered=(admin.getUserName());
	
	AdminService adminservice=(AdminService) context.getBean("AdminService");
	Admin registration =adminservice.Register(admin);
	assertEquals(isRegistered,registration);
}
		@Test
		public void tesForValidAdminLogin() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
		Admin admin=new Admin();
		 admin.setAdminId(12);
		 admin.setFirstName("james");
		 admin.setMenuId(1);
		 admin.setPassword("hello2123");
		 admin.setUserName("james");
		 AdminService adminservice=(AdminService) context.getBean("AdminService");
		boolean userdetailsfromdb=adminservice.login(admin.getUserName(),admin.getPassword());
		assertEquals(true,userdetailsfromdb);
	}
		@Test
		public void tesForAddFoodItem() {
			FoodItem fd=new FoodItem();
			fd.setCost(150);
			fd.setFoodId(2);
			fd.setItemCategory("soup");
			fd.setName("palak soup");
			fd.setQuantity(1);
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
				 AdminService adminservice=(AdminService) context.getBean("AdminService");
		int userdetailsfromdb=adminservice.addFoodItem(fd);
		assertNotNull(userdetailsfromdb);
	}
		@Test
		public void tesForUpdateFoodItem() {
			FoodItem fd=new FoodItem();
			fd.setCost(150);
			fd.setFoodId(2);
			fd.setItemCategory("soup");
			fd.setName("palak soup");
			fd.setQuantity(1);
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
				 AdminService adminservice=(AdminService) context.getBean("AdminService");
		FoodItem detailsfromdb=adminservice.updateFoodItem(fd);
		assertNotNull(detailsfromdb);
	}
		@Test
		public void tesForDeleteFoodItem() {
			FoodItem fd=new FoodItem();
			fd.setCost(150);
			fd.setFoodId(2);
			fd.setItemCategory("soup");
			fd.setName("palak soup");
			fd.setQuantity(1);
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
				 AdminService adminservice=(AdminService) context.getBean("AdminService");
		boolean detailsfromdb=adminservice.deleteFoodItem(fd.getFoodId());
		assertEquals(true,detailsfromdb);
	}
		
		@Test
		public void tesForAddRestaurant() {
			Restaurant rs=new Restaurant();
			rs.setMenuId(25);
			rs.setPhoneNumber(812345678);
			rs.setRestaurantAddress("tumkur");
			rs.setRestaurantId(20);
			rs.setRestaurantName("villasi");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
				 AdminService adminservice=(AdminService) context.getBean("AdminService");
		int detailsfromdb=adminservice.addRestaurant(rs);
		assertNotNull(detailsfromdb);
	}
		@Test
		public void tesForUpdateRestaurant() {
			Restaurant rs=new Restaurant();
			rs.setMenuId(25);
			rs.setPhoneNumber(812345678);
			rs.setRestaurantAddress("tumkur");
			rs.setRestaurantId(20);
			rs.setRestaurantName("villasi");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
				 AdminService adminservice=(AdminService) context.getBean("AdminService");
		Restaurant detailsfromdb=adminservice.updateRestaurant(rs);
		assertNotNull(detailsfromdb);
	}
		@Test
		public void tesForDeleteRestaurant() {
			Restaurant rs=new Restaurant();
			rs.setMenuId(25);
			rs.setPhoneNumber(812345678);
			rs.setRestaurantAddress("tumkur");
			rs.setRestaurantId(20);
			rs.setRestaurantName("villasi");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
				 AdminService adminservice=(AdminService) context.getBean("AdminService");
		boolean detailsfromdb=adminservice.deleteRestaurant(rs.getRestaurantId());
		assertNotNull(detailsfromdb);
	}
		@Test
		public void tesForAddDeliveryPerson() {
			DeliveryPerson dp=new DeliveryPerson();
			dp.setAddress("3rd stage");
			dp.setId(4);
			dp.setName("raju");
			dp.setPhoneNumber(1234567890);
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
				 AdminService adminservice=(AdminService) context.getBean("AdminService");
		int detailsfromdb=adminservice.addDeliveryPerson(dp);
		assertNotNull(detailsfromdb);
	}
		@Test
		public void tesForUpdateDeliveryPerson() {
			DeliveryPerson dp=new DeliveryPerson();
			dp.setAddress("3rd stage");
			dp.setId(4);
			dp.setName("raju");
			dp.setPhoneNumber(1234567890);
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
				 AdminService adminservice=(AdminService) context.getBean("AdminService");
		DeliveryPerson detailsfromdb=adminservice.updateDeliveryPerson(dp);
		assertNotNull(detailsfromdb);
	}
		@Test
		public void tesForDeleteDeliveryPerson() {
			DeliveryPerson dp=new DeliveryPerson();
			dp.setAddress("3rd stage");
			dp.setId(4);
			dp.setName("raju");
			dp.setPhoneNumber(1234567890);
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
				 AdminService adminservice=(AdminService) context.getBean("AdminService");
		boolean detailsfromdb=adminservice.deleteDeliveryPerson(dp.getId());
		assertNotNull(detailsfromdb);
	}
		@Test
		public void tesForAddMenu() {
			Menu menu=new Menu();
			menu.setMenuId(4);
			menu.setFoodId(12);
			menu.setPrice(250);
			
			
			ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
				 AdminService adminservice=(AdminService) context.getBean("AdminService");
		int detailsfromdb=adminservice.addMenu(menu);
		assertNotNull(detailsfromdb);
	}
		@Test
		public void tesForUpdateMenu() {
			Menu menu=new Menu();
			menu.setMenuId(4);
			menu.setFoodId(12);
			menu.setPrice(250);
			
			
			ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
				 AdminService adminservice=(AdminService) context.getBean("AdminService");
		Menu detailsfromdb=adminservice.updateMenu(menu);
		assertNotNull(detailsfromdb);
	}
		@Test
		public void tesForDeleteMenu() {
			Menu menu=new Menu();
			menu.setMenuId(4);
			menu.setFoodId(12);
			menu.setPrice(250);
			
			
			ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
				 AdminService adminservice=(AdminService) context.getBean("AdminService");
		boolean detailsfromdb=adminservice.deleteMenu(menu.getMenuId());
		assertNotNull(detailsfromdb);
	}
		@Test
		public void tesForSearchOrder() {
			Order order=new Order();
			order.setOrderId(4);
			order.setQuantity(4);
			order.setStatus("order successfull");
			
			ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
				 AdminService adminservice=(AdminService) context.getBean("AdminService");
		Order detailsfromdb=adminservice.searchOrder(order.getOrderId());
		assertNotNull(detailsfromdb);
	}
		
		@Test
		public void tesForUpdateOrderStatus() {
			Order order=new Order();
			order.setOrderId(4);
			order.setQuantity(4);
			order.setStatus("order successfull");
			
			ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
				 AdminService adminservice=(AdminService) context.getBean("AdminService");
		String detailsfromdb=adminservice.updateOrderStatus(order.getStatus());
		assertNotNull(detailsfromdb);
	}	
		@Test
		public void testvalidCustomerRegistration() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
		 Customer customer=new Customer();
		 customer.setCustomerId(12);
		 customer.setEmail("james@gmail.com");
		 customer.setPassword("hello123");
		 customer.setPaymentId(12);
		 customer.setPhoneNumber(1234567890);
	String isRegistered=(customer.getEmail());
	
	CustomerService customerservice=(CustomerService) context.getBean("CustomerService");
	Customer registration =customerservice.register(customer);
	assertEquals(isRegistered,registration);
}
		@Test
		public void tesForValidCustomerLogin() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
		Customer customer=new Customer();
		 customer.setCustomerId(12);
		 customer.setEmail("james@gmail.com");
		 customer.setPassword("hello123");
		 customer.setPaymentId(12);
		 customer.setPhoneNumber(1234567890);
		 CustomerService customerservice=(CustomerService) context.getBean("CustomerService");
		boolean userdetailsfromdb=customerservice.login(customer.getEmail(),customer.getPassword());
		assertEquals(true,userdetailsfromdb);
	}
		@Test
		public void TestForSearchRestaurant() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
		Restaurant rs=new Restaurant();
		rs.setMenuId(25);
		rs.setPhoneNumber(812345678);
		rs.setRestaurantAddress("tumkur");
		rs.setRestaurantId(20);
		rs.setRestaurantName("villasi");

		 CustomerService customerservice=(CustomerService) context.getBean("CustomerService");
		Restaurant detailsfromdb=customerservice.searchRestaurant(rs.getRestaurantName());
		assertNotNull(detailsfromdb);
	}
		@Test
		public void TestForViewOrder() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
		Order order=new Order();
		order.setOrderId(4);
		order.setQuantity(4);
		order.setStatus("order successfull");
		 CustomerService customerservice=(CustomerService) context.getBean("CustomerService");
		Order detailsfromdb=customerservice.viewOrder();
		assertNotNull(detailsfromdb);
	}
		@Test
		public void TestForViewCart() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
		Order order=new Order();
		order.setOrderId(4);
		order.setQuantity(4);
		order.setStatus("order successfull");
		 CustomerService customerservice=(CustomerService) context.getBean("CustomerService");
		Cart detailsfromdb=customerservice.viewCart();
		assertNotNull(detailsfromdb);
	}	
		@Test
		public void TestForPlaceOrder() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
		Order order=new Order();
		order.setOrderId(4);
		order.setQuantity(4);
		order.setStatus("order successfull");
		 CustomerService customerservice=(CustomerService) context.getBean("CustomerService");
		Order detailsfromdb=customerservice.placeOrder(order);
		assertNotNull(detailsfromdb);
		}	
		
		@Test
		public void TestForAddToCart() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
		Cart cart=new Cart();
		cart.setCartId(4);
		cart.setCustomerId(13);
		cart.setFoodId(12);
		cart.setQuantity(2);
		cart.setTotalPrice(400);
		 CustomerService customerservice=(CustomerService) context.getBean("CustomerService");
		int detailsfromdb=customerservice.addToCart(cart);
		assertNotNull(detailsfromdb);
		}	
		@Test
		public void TestForPayment() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
		Payment payment=new Payment();
		payment.setAmount(123);
		payment.setCustomerId(1);
		payment.setOrderId(5);
		payment.setPaymentId(12);
		payment.setPaymentMode("cash");
		 CustomerService customerservice=(CustomerService) context.getBean("CustomerService");
		Payment detailsfromdb=customerservice.makePayment(payment);
		assertNotNull(detailsfromdb);
		}	
		
		
}
