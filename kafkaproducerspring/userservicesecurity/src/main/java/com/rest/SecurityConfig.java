package com.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Override
	public void configure(HttpSecurity http) throws Exception
	{	
		//http.authorizeHttpRequests().antMatchers(HttpMethod.POST,"/auth").permitAll();
		
		
	
		http.authorizeHttpRequests((requests)->requests
				.requestMatchers(new AntPathRequestMatcher("/**")).
				permitAll()
				.anyRequest()
				.authenticated());
		
		/*
		
		http.authorizeRequests()
		.antMatchers(HttpMethod.POST,"/home")
		.permitAll()
		.anyRequest()
		.authenticated();
		*/
		
	}
	
	@Override 
	public void configure(AuthenticationManagerBuilder builder) 
	{
	 try {
		builder.inMemoryAuthentication().withUser("admin").password("{noop}password").authorities(new SimpleGrantedAuthority("USER"));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	/*
	@Override
	public void configure(AuthenticationManagerBuilder builder) throws Exception
	{
		builder.inMemoryAuthentication().withUser("admin")
		.password("{noop}password").roles("USER");
	}
	*/
	@Bean
	public AuthenticationManager getAuth() throws Exception
	{
		return super.authenticationManager();
	}

}
