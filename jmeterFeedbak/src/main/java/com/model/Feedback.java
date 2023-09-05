package com.model;

import javax.persistence.*;

@Entity
public class Feedback {
	
	@Id
	private int feedBackId;
	private String userName;
	private String feedBack;
	private int rating;
	public int getFeedBackId() {
		return feedBackId;
	}
	public void setFeedBackId(int feedBackId) {
		this.feedBackId = feedBackId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFeedBack() {
		return feedBack;
	}
	public void setFeedBack(String feedBack) {
		this.feedBack = feedBack;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Feedback(int feedBackId, String userName, String feedBack, int rating) {
		super();
		this.feedBackId = feedBackId;
		this.userName = userName;
		this.feedBack = feedBack;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Feedback [feedBackId=" + feedBackId + ", userName=" + userName + ", feedBack=" + feedBack + ", rating="
				+ rating + "]";
	}
	public Feedback() {
		super();
	}
	
	
	
	

}
