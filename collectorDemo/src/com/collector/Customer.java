package com.collector;

public class Customer {
	
	private String firstName;
	private String lastName;
	private String emailId;
    private Location location;
    
    
    public void Customer() {
    	
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Customer(String firstName, String lastName, String emailId, Location location) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.location = location;
	}
	


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", emailId=");
		builder.append(emailId);
		builder.append("]");
		return builder.toString();
	}
    
    

}

