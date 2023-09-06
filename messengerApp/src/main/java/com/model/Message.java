package com.model;

import javax.persistence.*;

@Entity
public class Message {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long messageId;
    private String sender;
    private String receiver;
    private String messageText;
	public Long getMessageId() {
		return messageId;
	}
	public void setMessageId(Long messageId) {
		this.messageId = messageId;
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
	public String getMessageText() {
		return messageText;
	}
	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}
	@Override
	public String toString() {
		return "Messenger [messageId=" + messageId + ", sender=" + sender + ", receiver=" + receiver + ", messageText="
				+ messageText + "]";
	}
	public Message(Long messageId, String sender, String receiver, String messageText) {
		super();
		this.messageId = messageId;
		this.sender = sender;
		this.receiver = receiver;
		this.messageText = messageText;
	}
	public Message() {
		super();
	}
    
    

}
