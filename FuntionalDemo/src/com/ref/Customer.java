/*
 * case study 

 view the below class 

class Customer 
 { 
  String customerName;
  String planType;
  String location ;
  float planAmount;
 //getter setter methods 
 } 

    #create and store instances of above class in any collection type and sort and display values 
    #Use functional interface and Method references where ever possible 
    #Remove those Customer's whose planAmount is less then 200
   
 * 
 */

package com.ref;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Customer {

	private String customerName;
	private String planType;
	private String location ;
	private float planAmount;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPlanType() {
		return planType;
	}
	public void setPlanType(String planType) {
		this.planType = planType;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public float getPlanAmount() {
		return planAmount;
	}
	public void setPlanAmount(float planAmount) {
		this.planAmount = planAmount;
	}
	public Customer(String customerName, String planType, String location, float planAmount) {
		super();
		this.customerName = customerName;
		this.planType = planType;
		this.location = location;
		this.planAmount = planAmount;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [customerName=");
		builder.append(customerName);
		builder.append(", planType=");
		builder.append(planType);
		builder.append(", location=");
		builder.append(location);
		builder.append(", planAmount=");
		builder.append(planAmount);
		builder.append("]");
		return builder.toString();
	}
	
	public static void main(String[] args) {
		
		List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("John", "Basic", "New York", 150));
        customers.add(new Customer("Jane", "Premium", "Los Angeles", 250));
        customers.add(new Customer("Bob", "Standard", "Chicago", 180));
        customers.add(new Customer("Alice", "Basic", "San Francisco", 100));

        System.out.println("Before sorting and filtering:");
        customers.forEach(System.out::println);

       
        customers.sort(Comparator.comparing(Customer::getPlanAmount));

        
        Predicate<Customer> planAmountPredicate = customer -> customer.getPlanAmount() >= 200;
        customers.removeIf(planAmountPredicate.negate());

        System.out.println("\nAfter sorting and filtering:");
        customers.forEach(System.out::println);
		
	}
	
	
}
