package com.rest;
import javax.persistence.*;

import javax.persistence.Entity;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue
	private int customerId;
	private String firstName;
	private String lastName;
	private String location;
	private float amount;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public Customer(int customerId, String firstName, String lastName, String location, float amount) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.location = location;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", location=" + location + ", amount=" + amount + "]";
	}
	public Customer() {
		super();
	}
	
	
	
	
	

}
