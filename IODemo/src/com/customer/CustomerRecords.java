package com.customer;
import java.io.*;

public class CustomerRecords {
	
	public void saveCustomer(Customer customer) {
		try
		{
		FileOutputStream fileout = new FileOutputStream(customer.getCustomerName()+" .dat");
		ObjectOutputStream objectout= new ObjectOutputStream(fileout);
		objectout.writeObject(customer);
		objectout.flush();
		objectout.close();
		}
		catch(FileNotFoundException e) {
			System.out.print(e);
		}
		catch(IOException e) {
			System.out.print(e);
		}
	}
	
	public void displayCustomer(String name) {
		try {
			FileInputStream filein = new FileInputStream(name+" .dat");
			ObjectInputStream objectin = new ObjectInputStream(filein);
			Customer customer = (Customer)objectin.readObject();
			
			System.out.println("Customer name "+customer.getCustomerName());
			System.out.println("Customer address "+customer.getAddress());
			
		}
		catch(FileNotFoundException e) {
			System.out.print(e);
		}
		catch(IOException e) {
			System.out.print(e);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.print(e);
		}
	}
	
	public static void main(String[] args) {
		
		Customer obj1 = new Customer("Peter", "23 long street");
		CustomerRecords records = new CustomerRecords();
		
		records.saveCustomer(obj1);

		records.displayCustomer(obj1.getCustomerName());
		
	}

}
