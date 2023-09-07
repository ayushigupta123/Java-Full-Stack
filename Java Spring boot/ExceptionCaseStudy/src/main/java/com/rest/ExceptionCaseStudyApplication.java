package com.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.controller","com.model"})
public class ExceptionCaseStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExceptionCaseStudyApplication.class, args);
	}

}
