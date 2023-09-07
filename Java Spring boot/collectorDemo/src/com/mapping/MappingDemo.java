/*
 *  Exercise for Collector functions 
 
 
   Observe class below 
   
     public class Employee 
      { 
         private String firstName ;
         private String lastName;
         private Department department;
         private Designation designation ;
       } 
       
       
       public class Department 
        { 
          private String departmentName;
          private String location ;
         } 
         
         public class Designation 
          { 
            private String designation_type;
           } 
         
         
         
         #create instances of Employee and store in a list 
         
         #filter the list based on criteria where department="Sales" and designation="Manager"  and collect result into seperate list 
         #filter the list based on criterial where department location is Mumbai and collect result into seperate list 
         #display the with employee first and last name combined using a mapping operation and collect result in separate list 
 */
package com.mapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MappingDemo {
    public static void main(String[] args) {
        
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", "Doe", new Department("Sales", "New York"), new Designation("Manager")));
        employees.add(new Employee("Jane", "Smith", new Department("IT", "San Francisco"), new Designation("Developer")));
        employees.add(new Employee("Mike", "Johnson", new Department("Sales", "Mumbai"), new Designation("Manager")));
        employees.add(new Employee("Emily", "Williams", new Department("HR", "London"), new Designation("Coordinator")));
        
        List<Employee> salesManagers = employees.stream().filter(employee -> employee.getDepartment().getDepartmentName().equals("Sales")).filter(employee -> employee.getDesignation().getDesignation_type().equals("Manager")).collect(Collectors.toList());
    
        List<Employee> mumbaiEmployees = employees.stream().filter(employee -> employee.getDepartment().getLocation().equals("Mumbai")).collect(Collectors.toList());

        List<String> employeeNames = employees.stream().collect(Collectors.mapping(employee -> employee.getFirstName() + " " + employee.getLastName(), Collectors.toList()));

        System.out.println("Sales Managers:");
        salesManagers.forEach(employee -> System.out.println(employee.getFirstName() + " " + employee.getLastName()));

        System.out.println("\nMumbai Employees:");
        mumbaiEmployees.forEach(employee -> System.out.println(employee.getFirstName() + " " + employee.getLastName()));

        System.out.println("\nEmployee Names:");
        employeeNames.forEach(System.out::println);
    }
}