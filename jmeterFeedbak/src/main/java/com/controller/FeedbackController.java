package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Feedback;

import com.service.FeedbackService;

@RestController
public class FeedbackController {
	
	@Autowired
	FeedbackService feedbackService;
	
	
	@PostMapping("/feedback")
	public ResponseEntity<?> addUser(@RequestBody Feedback feedback)
	{
		feedbackService.addFeedback(feedback);
		
		return new ResponseEntity("feedback added",HttpStatus.CREATED);
		
		
	}

	@GetMapping("/feedback")
	public ResponseEntity<?> getAllFeedbacks()
	{
		List<Feedback> feedbackList=feedbackService.getAllFeedbacks();
		feedbackList.add(new Feedback(12,"admin","good",3));
		feedbackList.add(new Feedback(22,"John","very good",4));
		
		
		
		return new ResponseEntity<List<Feedback>>(feedbackList,HttpStatus.OK);
	}


	@PatchMapping("/feedback")
	public ResponseEntity<?> updatefeedback(@RequestBody Feedback feedback)
	{

		
		feedbackService.updateFeedback(feedback);
		return new ResponseEntity("Feedbackupdated successfully",HttpStatus.ACCEPTED);
				
	}

	@DeleteMapping("/feedback")
	public ResponseEntity<?> deletefeedback(@RequestBody Feedback feedback)
	{
		feedbackService.deleteFeedback(feedback);
		return new ResponseEntity("Feedback deleted successfully",HttpStatus.OK);
	}

}
