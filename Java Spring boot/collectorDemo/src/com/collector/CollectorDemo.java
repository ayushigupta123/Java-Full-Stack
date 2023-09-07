/*
 * 
 * observe class below
 
 public class Customer 
  { 
      private String firstName;  
      private String lastName;
      private String emailId;
      private Location location;
      
   }
   
   public class Location 
    { 
     private String locationName;
     private String state;
     }  
 
 
 #Create the object of customer class  and store in list 
 #use stream to get the list of customer first ,lastname and location as list of seperate strings
 * 
 */
package com.collector;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorDemo {

	
	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList<>();

		
		customers.add(new Customer("John", "Doe", "john@example.com", new Location("Pune", "Maharastra")));
		customers.add(new Customer("Jane", "Smith", "jane@example.com", new Location("Patna", "Bihar")));
		customers.add(new Customer("Alice", "Johnson", "alice@example.com", new Location("Bhopal", "MP")));

		List<String> firstNames=customers.stream().map((e)->e.getFirstName()).collect(Collectors.toList());
		List<String> lastNames=customers.stream().map((e)->e.getLastName()).collect(Collectors.toList());
		List<Location> locations=customers.stream().map((e)->e.getLocation()).collect(Collectors.toList());
		List<String> customerlist=customers.stream().map((e)->e.getFirstName()+" "+e.getLastName()+" "+e.getLocation()).collect(Collectors.toList());
		
		System.out.println(customerlist);
		System.out.println("First Names: " + firstNames);
		System.out.println("Last Names: " + lastNames);
		System.out.println("Locations: " + locations);
	
	}

	}

