/*
 *  observe class below 

  public class Product 
 { 
   private String productName;
   private float price;
   private int quantity;
   private boolean in_stock;
   private String store_name;
  //getter and setters 

} 

 public class Customer 
 { 
    private int customer_id;
    private Product product;
    private float amount_paid;
    private float payment_type;
    private String location;
   //getter and setter methods 
 } 






Create and store instances of customer in a list  and perform operations to get below reports 

 List of customer as per location 
 List of customer as per product 
 List of customer as per payment_type(cash,card)
 average amount_paid by Customer
 Sum of total amount collected in list as per product
 

List of products as per store_name 
Average price of products as per Store_name
 */
package com.groupby;

import java.util.*;
import java.util.stream.Collectors;

public class Operations {
	
	public static void main(String[] args) {
		
		
		Product product1 = new Product();
		product1.setProductName("Product A");
		product1.setPrice(10.0f);
		product1.setQuantity(5);
		 product1.setIn_stock(true);
		product1.setStore_name("Store X");

		Product product2 = new Product();
		product2.setProductName("Product B");
		product2.setPrice(15.0f);
		product2.setQuantity(3);
		product2.setIn_stock(true);
		product2.setStore_name("Store Y");

		Customer customer1 = new Customer();
		customer1.setCustomer_id(1);
		customer1.setProduct(product1);
		customer1.setAmount_paid(50.0f);
		customer1.setPayment_type("Card");
		customer1.setLocation("Location 1");

		Customer customer2 = new Customer();
		customer2.setCustomer_id(2);
	    customer2.setProduct(product2);
		customer2.setAmount_paid(45.0f);
		customer2.setPayment_type("Cash");
		customer2.setLocation("Location 2");

		Customer customer3 = new Customer();
		customer3.setCustomer_id(3);
		customer3.setProduct(product1);
		customer3.setAmount_paid(30.0f);
		customer3.setPayment_type("Card");
		customer3.setLocation("Location 2");

		List<Customer> customers = Arrays.asList(customer1, customer2, customer3);

		Map<String, List<Customer>> customersByLocation = customers.stream().collect(Collectors.groupingBy(Customer::getLocation));

		Map<Product, List<Customer>> customersByProduct = customers.stream().collect(Collectors.groupingBy(Customer::getProduct));

		Map<String, List<Customer>> customersByPaymentType = customers.stream().collect(Collectors.groupingBy(Customer::getPayment_type));

		Double averageAmountPaid = customers.stream().mapToDouble(Customer::getAmount_paid).average().orElse(0.0);

		Map<Product, Double> sumAmountPaidByProduct = customers.stream().collect(Collectors.groupingBy(Customer::getProduct, Collectors.summingDouble(Customer::getAmount_paid)));

		Map<String, List<Product>> productsByStoreName = customers.stream().map(Customer::getProduct).collect(Collectors.groupingBy(Product::getStore_name));

		Map<String, Double> averagePriceByStoreName = customers.stream().map(Customer::getProduct).collect(Collectors.groupingBy(Product::getStore_name, Collectors.averagingDouble(Product::getPrice)));

		System.out.println("Customers by Location: " + customersByLocation);
		System.out.println("Customers by Product: " + customersByProduct);
		System.out.println("Customers by Payment Type: " + customersByPaymentType);
		System.out.println("Average Amount Paid by Customer: " + averageAmountPaid);
		System.out.println("Sum of Amount Paid by Product: " + sumAmountPaidByProduct);
		System.out.println("Products by Store Name: " + productsByStoreName);
		System.out.println("Average Price by Store Name: " + averagePriceByStoreName);
		
	}

}
