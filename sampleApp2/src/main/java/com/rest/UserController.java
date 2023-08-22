package com.rest;

import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.model.ResourseNotFoundException;
import com.model.User;
import java.util.*;

@RestController
public class UserController {
	
	@GetMapping("/users/{id}")
	public ResponseEntity<User> getUser(@PathVariable int id) throws ResourseNotFoundException
	{
		Map<Integer,User> map=new HashMap<>();
		map.put(1, new User(1,"Peter"));
		map.put(2, new User(2,"James"));
		map.put(3, new User(3,"Tom"));
		
		if(!map.containsKey(id))
		{
			throw new ResourseNotFoundException("Resourse not found for userid "+id);
		}
		else
		{
			return ResponseEntity.ok(map.get(id));
		}
	}

	
}
