package com.rest;
import javax.persistence.*;

@Entity
public class Messenger {
	
	@Id
	@GeneratedValue
    private int messageid;
    private String sender;
    private String receiver;
    private String message;
    private int messagelength;
    private String messageStatus;
	public int getMessageid() {
		return messageid;
	}
	public void setMessageid(int messageid) {
		this.messageid = messageid;
	}
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
	public int getMessagelength() {
		return messagelength;
	}
	public void setMessagelength(int messagelength) {
		this.messagelength = messagelength;
	}
	public String getMessageStatus() {
		return messageStatus;
	}
	public void setMessageStatus(String messageStatus) {
		this.messageStatus = messageStatus;
	}
	public Messenger(int messageid, String sender, String receiver, String message, int messagelength,
			String messageStatus) {
		super();
		this.messageid = messageid;
		this.sender = sender;
		this.receiver = receiver;
		this.message = message;
		this.messagelength = messagelength;
		this.messageStatus = messageStatus;
	}
	@Override
	public String toString() {
		return "Messenger [messageid=" + messageid + ", sender=" + sender + ", receiver=" + receiver + ", message="
				+ message + ", messagelength=" + messagelength + ", messageStatus=" + messageStatus + "]";
	}
	public Messenger() {
		super();
	}
    
    
	
	

}
