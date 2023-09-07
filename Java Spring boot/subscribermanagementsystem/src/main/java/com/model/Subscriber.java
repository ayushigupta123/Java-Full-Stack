package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subscriber {
	
	@Id
	private long id;
	
    private String phoneNumber;
    
    private String name;
    
    private String plan;
    
    private double balance;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Subscriber(long id, String phoneNumber, String name, String plan, double balance) {
		super();
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.plan = plan;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Subscriber [id=" + id + ", phoneNumber=" + phoneNumber + ", name=" + name + ", plan=" + plan
				+ ", balance=" + balance + "]";
	}

	public Subscriber() {
		super();
	}

    

    

}
