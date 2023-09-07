package com.CallQuality;

import java.io.Serializable;


public class CallQuality implements Serializable {
	
	private int callId;
	private int callDuration;
	private String callQualityRate;
	private String customerName;
	
	public CallQuality() {
		
	}
	
	

	public CallQuality(int callId, int callDuration, String callQualityRate, String customerName) {
		super();
		this.callId = callId;
		this.callDuration = callDuration;
		this.callQualityRate = callQualityRate;
		this.customerName = customerName;
	}



	public int getCallId() {
		return callId;
	}

	public void setCallId(int callId) {
		this.callId = callId;
	}

	public int getCallDuration() {
		return callDuration;
	}

	public void setCallDuration(int callDuration) {
		this.callDuration = callDuration;
	}

	public String getCallQualityRate() {
		return callQualityRate;
	}

	public void setCallQualityRate(String callQualityRate) {
		this.callQualityRate = callQualityRate;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	

}
