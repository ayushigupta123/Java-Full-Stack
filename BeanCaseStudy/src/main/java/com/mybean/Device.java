package com.mybean;

public class Device {
	
	private String deviceName;
    private int daysOnRent;
    private Location location ;
    
	public Device() {
		super();
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public int getDaysOnRent() {
		return daysOnRent;
	}

	public void setDaysOnRent(int daysOnRent) {
		this.daysOnRent = daysOnRent;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Device(String deviceName, int daysOnRent, Location location) {
		super();
		this.deviceName = deviceName;
		this.daysOnRent = daysOnRent;
		this.location = location;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Device [deviceName=");
		builder.append(deviceName);
		builder.append(", daysOnRent=");
		builder.append(daysOnRent);
		builder.append(", location=");
		builder.append(location);
		builder.append("]");
		return builder.toString();
	}
    
    
    
    

}
