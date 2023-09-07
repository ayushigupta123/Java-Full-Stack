package com.ref;

public class Person {

	private String personName;
    private String emailId;
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Person(String personName, String emailId) {
		super();
		this.personName = personName;
		this.emailId = emailId;
	}
    
    
}
