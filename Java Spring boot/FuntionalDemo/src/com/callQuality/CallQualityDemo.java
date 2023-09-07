/*
 * 
 * Exercise 

  view the class below 

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
import java.util.function.Consumer;
import java.util.function.Predicate;


public class CallQualityDemo {
	
	public static void evaluateFeedback(CallQualityFeedback feedback, Consumer<CallQualityFeedback> operation) {
        operation.accept(feedback);
    }

	
	public static void main(String[] args) {
	CallQualityFeedback feedback = new CallQualityFeedback(123, "9876543212", "Good call quality", 4);

	       
	 Consumer<CallQualityFeedback> printFeedBackInfo = (fb) -> {
		 System.out.println("Customer ID: " + fb.getCustomerId());
	     System.out.println("FeedBack Description: " + fb.getFeedBackDescription());
	   };

	
	  evaluateFeedback(feedback, printFeedBackInfo);
	  
	  Predicate<CallQualityFeedback> predictQuality = (fb) -> fb.getRating() > 3;

      if (predictQuality.test(feedback)) {
          System.out.println("Call quality is good.");
      } else {
          System.out.println("Call quality is bad.");
      }
	    }

	}

/*
 * By Ayushi Gupta
 * 
 */


