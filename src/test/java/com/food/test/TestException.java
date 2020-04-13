package com.food.test;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.food.common.InvalidCredentials;
import com.food.common.UserAlreadyExistException;
import com.food.common.UserDoesNotExistException;
import com.food.models.Admin;
import com.food.models.Customer;
import com.food.services.AdminService;
import com.food.services.CustomerService;

import junit.framework.Assert;

public class TestException {
	@Test
    public void testForUserRegistration() throws UserAlreadyExistException 
    {
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
	Customer customer=new Customer();
	customer.setCustomerId(12);
	customer.setEmail("james@gmail.com");
	customer.setFirstName("james");
	customer.setLastName("john");
	customer.setPassword("hello1234");
	customer.setPhoneNumber(1234567890);
        
     Admin admin =new Admin();
     admin.setAdminId(12);
     admin.setPassword("hello@123");
     admin.setUserName("example");
    
	 
	 CustomerService customerservice = (CustomerService) context.getBean("CustomerService");
	 customerservice.register(customer);
	 
	 AdminService adminservice = (AdminService) context.getBean("AdminService");
	 adminservice.Register(admin);
	 
Assert.assertEquals(UserAlreadyExistException.message," user already exists !..please login");
    }
	
	@Test
    public void testForUserLogin() throws UserDoesNotExistException  
    {
		
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
	 Customer customer=new Customer();
		customer.setCustomerId(12);
		customer.setEmail("james@gmail.com");
		customer.setFirstName("james");
		customer.setLastName("john");
		customer.setPassword("hello1234");
		customer.setPhoneNumber(1234567890);
	        
	     Admin admin =new Admin();
	     admin.setAdminId(12);
	     admin.setPassword("hello@123");
	     admin.setUserName("example");
     
	     CustomerService customerservice = (CustomerService) context.getBean("CustomerService");
	     customerservice.login(customer.getEmail(),customer.getPassword());
     
     AdminService adminservice = (AdminService) context.getBean("AdminService");
     adminservice.login(admin.getUserName(),admin.getPassword()); 
Assert.assertEquals(UserDoesNotExistException.message," user does not exists !..please register");
     }
	
	@Test
    public void testForvalidpassword() throws InvalidCredentials  
    {
		
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
	 Customer customer=new Customer();
		customer.setCustomerId(12);
		customer.setEmail("james@gmail.com");
		customer.setFirstName("james");
		customer.setLastName("john");
		customer.setPassword("hello1234");
		customer.setPhoneNumber(1234567890);
     CustomerService customerservice = (CustomerService) context.getBean("CustomerService");
     customerservice.login(customer.getEmail(),customer.getPassword());
Assert.assertEquals(InvalidCredentials.message,"please enter valid email and password");
     }
	@Test
    public void testForvalidname() throws InvalidCredentials  
    {
		
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
	 Admin admin=new Admin();
	 
	 admin.setAdminId(12);
     admin.setPassword("hello@123");
     admin.setUserName("example");
     AdminService adminservice = (AdminService) context.getBean("AdminService");
     adminservice.login(admin.getUserName(),admin.getPassword());
     
Assert.assertEquals(InvalidCredentials.message,"please enter valid email and password");
     }
}
