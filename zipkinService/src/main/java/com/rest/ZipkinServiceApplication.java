package com.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.annotation.TagValueResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import brave.baggage.BaggageField;

@SpringBootApplication
public class ZipkinServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinServiceApplication.class, args);
	}
	
	@Bean
	public RestTemplate getRest()
	{
		return new RestTemplate();
	}
	
	@Bean
	TagValueResolver getResolver()
	{
		return parameter->"time taken: "+ new java.util.Date().getTime();
	}
	
	@Bean 
	BaggageField getBaggage()	
	{
		return BaggageField.create("mybaggage");
	}

} 
