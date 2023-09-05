package com.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.SpanName;
import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.cloud.sleuth.annotation.SpanTag;
import org.springframework.cloud.sleuth.annotation.TagValueResolver;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import brave.baggage.BaggageField;

import java.util.*;
import org.springframework.core.ParameterizedTypeReference;

@RestController
public class MyController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	BaggageField myBaggage;
	 
	 
	@GetMapping("/")
	
	@NewSpan("myspan")
	//@ContinueSpan
	public String home(@SpanTag(key="testtag1",resolver=TagValueResolver.class) String param)
	{
		myBaggage.updateValue("new-value");
		return "rest data accessed";
	}

	@GetMapping("/viewitem")
	 public ResponseEntity<?> viewItems()
	 { 
		 String url="http://localhost:9098/items";
		 
		 
		 ResponseEntity<List<Object>> response = restTemplate.exchange(
		     url,
		     HttpMethod.GET,
		     null,
		     new ParameterizedTypeReference<List<Object>>(){});
		 List<Object> objects = response.getBody();
		return  response;
		
		
		 
		
		 
	
		 
		
	 }
}