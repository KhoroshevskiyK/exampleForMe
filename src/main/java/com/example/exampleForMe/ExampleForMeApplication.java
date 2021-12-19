package com.example.exampleForMe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages = {"com.example.exampleForMe"})
public class ExampleForMeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleForMeApplication.class, args);
	}

}
