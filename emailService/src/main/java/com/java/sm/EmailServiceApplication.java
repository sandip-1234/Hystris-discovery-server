package com.java.sm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * 
 * @author Sandeep Matolia
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class EmailServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailServiceApplication.class, args);
	}
}
