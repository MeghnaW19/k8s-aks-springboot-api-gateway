package com.stackroute.apigatewayservice;

import com.stackroute.apigatewayservice.filters.ErrorFilter;
import com.stackroute.apigatewayservice.filters.PostFilter;
import com.stackroute.apigatewayservice.filters.PreFilter;
import com.stackroute.apigatewayservice.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/*
Annotate this class with the following annotations:
1. @SpringBootApplication - enables Spring Boot auto config and component scanning.
2. @EnableZuulProxy - enables this application to act as API Gateway
*/

@SpringBootApplication
@EnableZuulProxy
public class ZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulGatewayApplication.class, args);
	}
//	creating beans for all the filters
	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
}
