package com.mapping;

public class Designation {
	
	private String designation_type;
	
	public void designation_type() {
		
	}

	public String getDesignation_type() {
		return designation_type;
	}

	public void setDesignation_type(String designation_type) {
		this.designation_type = designation_type;
	}

	public Designation(String designation_type) {
		super();
		this.designation_type = designation_type;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Designation [designation_type=");
		builder.append(designation_type);
		builder.append("]");
		return builder.toString();
	}
	
	

}
