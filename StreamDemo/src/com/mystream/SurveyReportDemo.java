/*
 * 
Show Webcams

Active Speaker
NOTE 1
   Observe class below  - 10 mins

   public class SurveyReport
 { 
   private int surveyId;
   private String employeeName;
   private String location ;
   private int total_connection_request;
   private int no_of_days_for_request_completion;
   private int average_request_per_day;
 //getter setter methods 


  }

#perform a max operation to find maximum number of requests received by adding total_connection_request 
#perform a reduce operation on no_of_days_for_request_completion for finding  average time for request completion
#find the total average_request_per_day
#find the location count for location Delhi
 */
package com.mystream;

import java.util.ArrayList;
import java.util.*;

public class SurveyReportDemo {

	public static void main(String[] args) {
		
	    ArrayList<SurveyReport> surveyReports = new ArrayList();
	    surveyReports.add(new SurveyReport(1,"Tom","Pune",6,15,5));
	    surveyReports.add(new SurveyReport(2,"James","Delhi",34,75,15));
	    surveyReports.add(new SurveyReport(3,"Evans","Banglore",3,8,9));
	    surveyReports.add(new SurveyReport(4,"Rahul","Delhi",68,135,51));
	    surveyReports.add(new SurveyReport(5,"Jerry","Lahore",23,15,7));
	    
	    
	    int maxRequests = surveyReports.stream().mapToInt(SurveyReport::getTotal_connection_request).max().orElse(0);
	    System.out.println("Maximum Requests: " + maxRequests);
	    
	    double averageDays = surveyReports.stream().mapToInt(SurveyReport::getNo_of_days_for_request_completion).average().orElse(0.0);
	    System.out.println("Average Days for Completion: " + averageDays);
	    
	    int totalAverage = surveyReports.stream().mapToInt(SurveyReport::getAverage_request_per_day).sum();
	    System.out.println("Total Average Request per Day: " + totalAverage);
        
        int delhiCount = (int) surveyReports.stream().filter(report -> report.getLocation().equals("Delhi")).count();
        System.out.println("Count of Location Delhi: " + delhiCount);

	}

}
