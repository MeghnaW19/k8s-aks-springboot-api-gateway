package com.stackroute.sbserviceone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
Annotate this class with the following annotations:
1. @SpringBootApplication - enables Spring Boot auto config and component scanning.
*/

@SpringBootApplication
public class SbServiceOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbServiceOneApplication.class, args);
	}

}
