/*
 *   view the class below 

 public class CallQualityFeedBack
 { 
   int customerId;
   String phoneNo;
   String feedBackDescription;
   int rating ;
 } 

//create a function evaluateFeedBack that accepts CallQualityFeedBack object and prints customerId and feedBackDescription .
 Use Consumer to describe operation when calling upon evaluateFeedBack
 * 
 */

package com.callQuality;

public class CallQualityFeedback {
	
	private int customerId;
	private String phoneno;
	private String feedBackDescription;
	private int rating ;
	
	public void CallQualityFeedback() {
		
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getFeedBackDescription() {
		return feedBackDescription;
	}

	public void setFeedBackDescription(String feedBackDescription) {
		this.feedBackDescription = feedBackDescription;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public CallQualityFeedback(int customerId, String phoneno, String feedBackDescription, int rating) {
		super();
		this.customerId = customerId;
		this.phoneno = phoneno;
		this.feedBackDescription = feedBackDescription;
		this.rating = rating;
	}

	
}
