package com.mystream;

public class Customer {
	
	private String customerName;
	private String location;
	private String planType;
	private int planRange;
	private float amount;
	
	public void customer() {
		
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPlanType() {
		return planType;
	}

	public void setPlanType(String planType) {
		this.planType = planType;
	}

	public int getPlanRange() {
		return planRange;
	}

	public void setPlanRange(int planRange) {
		this.planRange = planRange;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public Customer(String customerName, String location, String planType, int planRange, float amount) {
		super();
		this.customerName = customerName;
		this.location = location;
		this.planType = planType;
		this.planRange = planRange;
		this.amount = amount;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [customerName=");
		builder.append(customerName);
		builder.append(", location=");
		builder.append(location);
		builder.append(", planType=");
		builder.append(planType);
		builder.append(", planRange=");
		builder.append(planRange);
		builder.append(", amount=");
		builder.append(amount);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
