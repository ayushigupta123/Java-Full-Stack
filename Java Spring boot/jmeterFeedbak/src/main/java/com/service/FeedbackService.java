package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Feedback;
import com.repository.FeedbackRepository;

@Service
public class FeedbackService {
	
	@Autowired
	FeedbackRepository feedbackRepository;
	
	public void addFeedback(Feedback feedback)
	  {
		feedbackRepository.save(feedback);
	  }
	
	public void updateFeedback(Feedback feedback)
	  {
		feedbackRepository.save(feedback);
	  }
	
	public void deleteFeedback(Feedback feedback)
	  {
		feedbackRepository.delete(feedback);
	  }
	
	public List<Feedback> getAllFeedbacks()
	  {
		
		  ArrayList<Feedback> itemlist=new ArrayList();
		  return   feedbackRepository.findAll();
		  
		  
	  }
	  
	  public Feedback getFeedbackById(int id)
	  {
		return feedbackRepository.findById(id).get();  
	  } 

}
