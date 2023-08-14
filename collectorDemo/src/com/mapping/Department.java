package com.mapping;

public class Department {

	private String departmentName;
    private String location ;
    
    public void department() {
    	
    }
    
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Department(String departmentName, String location) {
		super();
		this.departmentName = departmentName;
		this.location = location;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Department [departmentName=");
		builder.append(departmentName);
		builder.append(", location=");
		builder.append(location);
		builder.append("]");
		return builder.toString();
	}
	
	
    
    
}
