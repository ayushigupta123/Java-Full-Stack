package com.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@Autowired
	HelloWorldBean helloWorldBean;
	
	@GetMapping("/helloworld")
	public String getHelloWorldBean() {
		return helloWorldBean.getMessage();
	}

}
