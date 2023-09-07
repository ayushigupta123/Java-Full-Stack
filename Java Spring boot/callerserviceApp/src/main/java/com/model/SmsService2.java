package com.model;

public class SmsService2 {
	
	private String sender;
	private String receiver;
	private String message;
	private String encType;
	
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getEncType() {
		return encType;
	}
	public void setEncType(String encType) {
		this.encType = encType;
	}
	public SmsService2(String sender, String receiver, String message, String encType) {
		super();
		this.sender = sender;
		this.receiver = receiver;
		this.message = message;
		this.encType = encType;
	}
	@Override
	public String toString() {
		return "SmsService2 [sender=" + sender + ", receiver=" + receiver + ", message=" + message + ", encType="
				+ encType + "]";
	}
	public SmsService2() {
		super();
	}
	
	

}
