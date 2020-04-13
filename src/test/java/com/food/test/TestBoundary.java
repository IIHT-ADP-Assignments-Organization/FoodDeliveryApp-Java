package com.food.test;

import static org.junit.Assert.assertEquals;

import java.util.regex.Pattern;

import org.junit.Test;

import com.food.models.Admin;
import com.food.models.Customer;
import com.food.models.DeliveryPerson;



public class TestBoundary {
	 @Test
	 public void validCustomerEmail()
	 {
		 Customer customer=new Customer();
		 customer.setCustomerId(123);
		 customer.setEmail("james@gmail.com");
	     String emailRegex = "[a-zA-Z0-9_.]+@[a-zA-Z0-9]+.[a-zA-Z]{2,3}[.] {0,1}[a-zA-Z]+";
	     boolean check=Pattern.matches(emailRegex,customer.getEmail());
	     assertEquals(true,check);
	 }
	 
	 @Test
	    public void validPhoneNumber()
	    {
		 Customer customer=new Customer();
		 customer.setPhoneNumber(1234567890);
		 
		 DeliveryPerson dp=new DeliveryPerson();
		 dp.setPhoneNumber(1234556789);
		 

	        int phoneNumberLength=10;
	        
	        int getLengthOfNumber=(Integer.toString(customer.getPhoneNumber()).length());
	        int getNumber=(Integer.toString(dp.getPhoneNumber()).length());
	        
	assertEquals( phoneNumberLength, getLengthOfNumber);
	assertEquals(phoneNumberLength,getNumber);
	    }
	 
	 @Test
	 public void validUserName()
	 {
		Admin admin=new Admin();
		admin.setUserName("marryjohn");
	     String userNameRegex =  "^[a-z0-9_-]{3,15}$";
	     boolean check=Pattern.matches(userNameRegex,admin.getUserName());
	     assertEquals(true,check);
	 }
	 
	 @Test
	 public void validUserNameLength()
	 {
		 Admin admin=new Admin();
			admin.setUserName("marryjohn");
	     int min=2;
	      boolean namelengthfromdb=admin.getUserName().length()>min;
	     assertEquals(true,namelengthfromdb);
	 }
	 
	 public void validPasswordLength()
	 {
		Customer customer=new Customer();
		customer.setPassword("hello1234");
		
		Admin admin=new Admin();
		admin.setPassword("hello1234");
	     int passwordLength=10;
	    boolean Length=customer.getPassword().length()>passwordLength;
	    boolean l1=admin.getPassword().length()>passwordLength;
	     assertEquals(true,Length);
	     assertEquals(true,l1);
	 }
	

}
