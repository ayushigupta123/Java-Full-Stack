package com.model;

public class CallQualityDetailsV2 {
	
	private String callType;
	   private String minimumDropRate;
	   private String maximumDropRate;
	   private String callDuration;
	   private String sourcelocation ;
	   private String destinationlocation;
	   
	public String getCallType() {
		return callType;
	}
	public void setCallType(String callType) {
		this.callType = callType;
	}
	public String getMinimumDropRate() {
		return minimumDropRate;
	}
	public void setMinimumDropRate(String minimumDropRate) {
		this.minimumDropRate = minimumDropRate;
	}
	public String getMaximumDropRate() {
		return maximumDropRate;
	}
	public void setMaximumDropRate(String maximumDropRate) {
		this.maximumDropRate = maximumDropRate;
	}
	public String getCallDuration() {
		return callDuration;
	}
	public void setCallDuration(String callDuration) {
		this.callDuration = callDuration;
	}
	public String getSourcelocation() {
		return sourcelocation;
	}
	public void setSourcelocation(String sourcelocation) {
		this.sourcelocation = sourcelocation;
	}
	public String getDestinationlocation() {
		return destinationlocation;
	}
	public void setDestinationlocation(String destinationlocation) {
		this.destinationlocation = destinationlocation;
	}
	public CallQualityDetailsV2(String callType, String minimumDropRate, String maximumDropRate, String callDuration,
			String sourcelocation, String destinationlocation) {
		super();
		this.callType = callType;
		this.minimumDropRate = minimumDropRate;
		this.maximumDropRate = maximumDropRate;
		this.callDuration = callDuration;
		this.sourcelocation = sourcelocation;
		this.destinationlocation = destinationlocation;
	}
	@Override
	public String toString() {
		return "CallQualityDetailsV2 [callType=" + callType + ", minimumDropRate=" + minimumDropRate
				+ ", maximumDropRate=" + maximumDropRate + ", callDuration=" + callDuration + ", sourcelocation="
				+ sourcelocation + ", destinationlocation=" + destinationlocation + "]";
	}
	public CallQualityDetailsV2() {
		super();
	}
	   
	   
	   
	   

}
