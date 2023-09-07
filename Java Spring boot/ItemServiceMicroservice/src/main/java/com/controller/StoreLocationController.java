package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.model.StoreLocation;

import com.service.ItemService;


import java.util.ArrayList;
import java.util.List;

@RestController
public class StoreLocationController {

	@Autowired
	ItemService itemService;
	
	@PostMapping("/storeLocation")
	public ResponseEntity<?> addStoreLocation(@RequestBody StoreLocation storeLocation)
	{
		itemService.addStoreLocation(storeLocation);
		
		return new ResponseEntity("StoreLocation added",HttpStatus.CREATED);
		
		
	}

	@GetMapping("/storeLocation")
	public ResponseEntity<?> getAllStoreLocation()
	{
		List<StoreLocation> userList=itemService.getAllStoreLocation();
		
		
		return new ResponseEntity<List<StoreLocation>>(userList,HttpStatus.OK);
	}
    
    
    
    @Bean
    public RestTemplate getRestTemplate()
    	{
    return new RestTemplate();
    	}


    @GetMapping("/viewitems")
    public ResponseEntity<?> viewItems()
    	 { 
    		 String url="http://localhost:8089/getallitems";
    		 
			RestTemplate restTemplate = null;
			ResponseEntity<List<Object>> response = restTemplate.exchange(
					url,
					HttpMethod.GET,
					null,
					new ParameterizedTypeReference<List<Object>>(){});
    		 List<Object> objects = response.getBody();
    		 return response;
    	 }

}
