/*
 * 
 * 2.Observe the class below 

   class Person 
  {
      String personName;
      String emailId;
 //getter setter methods and constructor  
 }

#    Create and store instances of above class in any collection object.Provide the functionality to iterate through objects using 
Method references 
 */

package com.ref;

import java.util.ArrayList;

public class PersonDetails {
	
	public static void printPersonInfo(Person person) {
        System.out.println("Name: " + person.getPersonName() + ", Email: " 
	+ person.getEmailId());

	}

	public static void main(String[] args) {

		ArrayList<Person> personList = new ArrayList<>();

        
        personList.add(new Person("Alice", "alice@example.com"));
        personList.add(new Person("Bob", "bob@example.com"));
        personList.add(new Person("Charlie", "charlie@example.com"));

  
        personList.forEach(PersonDetails::printPersonInfo);
    }

  
    

}
