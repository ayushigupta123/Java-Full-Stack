package com.mybean;

public class Location {
	
	private String locationName;

	public Location() {
		super();
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public Location(String locationName) {
		super();
		this.locationName = locationName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Location [locationName=");
		builder.append(locationName);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
