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

@SpringBootApplication
@EnableWebSecurity
public class ItemSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemSecurityApplication.class, args);
	}
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
	{
		http.authorizeHttpRequests().
				antMatchers(HttpMethod.GET,"/item/list").hasRole("ADMIN")
				.antMatchers(HttpMethod.GET,"/hello").hasRole("USER")
				.anyRequest()
				.authenticated()
				.and()
				.httpBasic();
		return http.build();
	}
	
	@Bean
	public UserDetailsService getUserDetails()
	{
		UserDetails user1 = User.builder().username("erric").
				password("{noop}erricsam").roles("ADMIN").build();
		return new InMemoryUserDetailsManager(user1);
		
	}

}
