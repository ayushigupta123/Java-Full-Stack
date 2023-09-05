package com.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.util.AntPathMatcher;

@SpringBootApplication
@EnableWebSecurity
public class UserservicesecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserservicesecurityApplication.class, args);
	}
	
	/*
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
	{	
		//ask for authentication
		http.authorizeHttpRequests()
				.antMatchers(HttpMethod.GET,"/home/**").hasRole("USER")
				.antMatchers(HttpMethod.GET,"/home/user/**").hasRole("USER")
				.antMatchers(HttpMethod.POST,"/adduser").hasRole("USER")
				.anyRequest()
				.authenticated()
				.and()
				.httpBasic();
		
		/*
		//Only http get method is permitted
		http.authorizeHttpRequests((request)->request.
				antMatchers(HttpMethod.GET,"/home/**")
				.permitAll().anyRequest().authenticated());
				*/
		/* 
		//permits /** url
		http.authorizeHttpRequests((request)->request.
				requestMatchers(new AntPathRequestMatcher("/**")));
		*/
		/*
		http.authorizeHttpRequests((request)->request.
				requestMatchers(new AntPathRequestMatcher("/home")).permitAll().anyRequest().authenticated());
				
			
		return http.build();
	}
	*/
	/*
	
	@Bean
	public UserDetailsService getUserDetails()
	{
		UserDetails user1 = User.builder().username("user").password("{noop}password123").roles("USER").build();
		UserDetails user2 = User.builder().username("admin").password("{noop}admin123").roles("ADMIN").build();
		return new InMemoryUserDetailsManager(user1, user2);
		
	}
	
	*/

}
