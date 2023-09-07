package com.rest;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@Autowired
	AuthenticationManager manager;
	
	/*
	@PostMapping("/auth")
	public String getHome(@RequestBody User user)
	{
		
		System.out.println(user);
		SimpleGrantedAuthority auth=new SimpleGrantedAuthority(user.getRole());
		ArrayList<GrantedAuthority> authlist=new ArrayList();
		UsernamePasswordAuthenticationToken token=new UsernamePasswordAuthenticationToken(user.getUserName(),user.getPassword(),authlist);
		
				
	 
		Authentication authentication=manager.authenticate(token);
		
		org.springframework.security.core.userdetails.User userdetails=
				(org.springframework.security.core.userdetails.User)
				authentication.getPrincipal();
		
		
		
		
		return "authenticated";
	
	}
	*/
	
	@GetMapping("/home")
	public ResponseEntity<?> getHome(@RequestBody User user)
	{
		UsernamePasswordAuthenticationToken token =new UsernamePasswordAuthenticationToken
				(user.getUserName(),user.getPassword());
		if(!token.isAuthenticated())
		{
			System.out.println("return bad username and password");
			
		}
		Authentication authentication = manager.authenticate(token);
		org.springframework.security.core.userdetails.User userdetails=
				(org.springframework.security.core.userdetails.User)authentication
				.getPrincipal();
		
		
		return new ResponseEntity<>("authenticated "+ userdetails.getUsername(),HttpStatus.ACCEPTED);
				
	}
	
	/*
	@PostMapping("/home") 
	public ResponseEntity<?> setHome(@RequestBody User user)
	{
		UsernamePasswordAuthenticationToken token =new UsernamePasswordAuthenticationToken
				(user.getUserName(),user.getPassword());
		if(!token.isAuthenticated())
		{
			System.out.println("return bad username and password");
			
		}
		Authentication authentication = manager.authenticate(token);
		
		return new ResponseEntity<>("authenticated",HttpStatus.ACCEPTED);
				
	}
	
	*/
	
	
	/*
	@GetMapping("/home")
	public String getHome()
	{
		return "Hello Home!";
	} 
	 
	@GetMapping("/home/user")
	public String getHomeUser()
	{
		return "Hello Home!";
	}
	
	@GetMapping("/user")
	public String getUsers()
	{
		return "Hello user!";
	}
	
	@PostMapping("/adduser")
	public String addUser()
	{
		return "User added";
	}
	*/
	
	

}
