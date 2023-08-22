package com.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.rest","com.model"})
public class SampleApp2Application {

	public static void main(String[] args) {
		SpringApplication.run(SampleApp2Application.class, args);
	}

}
