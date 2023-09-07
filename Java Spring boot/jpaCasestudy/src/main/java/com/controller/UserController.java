package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.model.User;
import com.restapi.APIClient;
import com.restapi.ItemDTO;
import com.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	/*
	@Autowired
	RestTemplate restTemplate;
	*/
	@Autowired
	APIClient apiclient;
	
	
	@PostMapping("/user")
	public ResponseEntity<?> addUser(@RequestBody User user)
	{
		userService.addUser(user);
		
		return new ResponseEntity("User added",HttpStatus.CREATED);
		
		
	}

	@GetMapping("/user")
	public ResponseEntity<?> getAllUsers()
	{
		List<User> userList=userService.getAllUsers();
		
		
		return new ResponseEntity<List<User>>(userList,HttpStatus.OK);
	}


	@PatchMapping("/user")
	public ResponseEntity<?> updateUser(@RequestBody User user)
	{

		
		userService.updateUser(user);
		return new ResponseEntity("User updated successfully",HttpStatus.ACCEPTED);
				
	}

	@DeleteMapping("/user")
	public ResponseEntity<?> deleteUser(@RequestBody User user)
	{
		userService.deleteUser(user);
		return new ResponseEntity("User deleted successfully",HttpStatus.OK);
	}


	@GetMapping("/user/{id}")
	public ResponseEntity<?> getUserById(@PathVariable int id)
	{
		User user=userService.getUserById(id);
				return new ResponseEntity<>(user,HttpStatus.FOUND);
	}
	
	@GetMapping("/viewitems")
	 public ResponseEntity<?> viewItems()
	 { 
		 /*String url="http://localhost:9097/getallitems";
		 
		 
		 ResponseEntity<List<Object>> response = restTemplate.exchange(
		     url,
		     HttpMethod.GET,
		     null,
		     new ParameterizedTypeReference<List<Object>>(){});
		 List<Object> objects = response.getBody();
		return  response;*/
		 
		
		List<ItemDTO> itemlist=apiclient.getAllItems();
		 
		 return new ResponseEntity<>(itemlist,HttpStatus.CREATED);
		 
		
	 }


	
	

}
