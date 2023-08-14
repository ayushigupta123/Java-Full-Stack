/*
 * view class beloww
 * 
  public class Customer 
 { 
   private String customerName;
   private String location;
   private String planType;
   private int planRange;
   private float amount;
//getter setter methods 
 } 

 #filter those customers whose planRange is above 3 months 
 #filter those customer whose plant amount is above 500 
 #calculate a discount of 20% over amount and add to amount to diplay for all customer of location Mumbai
 #Return object of customer based on below requirement 
           run an allMatch to check if all customer planRange is above 300
           run an anyMatch to check any customer with planRange above 600
 * 
 */

package com.mystream;
import java.util.*;
import java.util.stream.*;

public class CustomerDemo {

	public static void main(String[] args) {

		ArrayList<Customer> list = new ArrayList();
		list.add(new Customer("tom", "Singapur","3 months",1000,86090));
		list.add(new Customer("Peter", "Dubai","2 months",700,67090));
		list.add(new Customer("Riya","Mumbai","4 months",500,50000));
		list.add(new Customer("Rahul","Pune","3 months",300,9876));
		
		
		
		List<Customer> filteredCustomers = list.stream()
			    .filter(customer -> customer.getPlanRange() > 3)
			    .filter(customer -> customer.getAmount() > 500)
			    .collect(Collectors.toList());
		filteredCustomers.forEach(System.out::println);


			List<Customer> updatedCustomers = list.stream()
			    .filter(customer -> "Mumbai".equals(customer.getLocation()))
			    .peek(customer -> { 
			    	float discount = customer.getAmount() * 0.20f;
			        customer.setAmount(customer.getAmount() + discount);
			    }).collect(Collectors.toList());
			updatedCustomers.forEach(System.out::println);
			

			boolean allAbove300 = list.stream().allMatch(customer -> customer.getPlanRange() > 300);
			System.out.println(allAbove300);
			boolean anyAbove600 = list.stream().anyMatch(customer -> customer.getPlanRange() > 600);
			System.out.println(anyAbove600);
			
			
	}

}
