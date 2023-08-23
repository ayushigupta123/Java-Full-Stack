package com.model;

public class SmsService1 {
	
	private String sender;
	private String receiver;
	private String message;
	
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
	public SmsService1(String sender, String receiver, String message) {
		super();
		this.sender = sender;
		this.receiver = receiver;
		this.message = message;
	}
	@Override
	public String toString() {
		return "SmsService1 [sender=" + sender + ", receiver=" + receiver + ", message=" + message + "]";
	}
	public SmsService1() {
		super();
	}
	
	

}
