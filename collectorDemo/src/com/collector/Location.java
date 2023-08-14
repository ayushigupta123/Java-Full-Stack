package com.collector;

public class Location {
	
	private String locationName;
    private String state;
    
    public void Location() {
    	
    }
    
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Location [locationName=");
		builder.append(locationName);
		builder.append(", state=");
		builder.append(state);
		builder.append("]");
		return builder.toString();
	}
	public Location(String locationName, String state) {
		super();
		this.locationName = locationName;
		this.state = state;
	}
	
	
    
    

}
