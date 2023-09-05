package com.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder.Builder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Servicegateway2Application {

	public static void main(String[] args) {
		SpringApplication.run(Servicegateway2Application.class, args);
	}
	
	
	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder)
		{
			Builder routebuilder=builder.routes();
	routebuilder.route("route1",r->r.path("/callQualities/**").uri("http://localhost:9097/callQualities"));
	routebuilder.route("route1",r->r.path("/messengers/**").uri("http://localhost:9098/messengers"));
	return routebuilder.build();
		}
		
		

}
