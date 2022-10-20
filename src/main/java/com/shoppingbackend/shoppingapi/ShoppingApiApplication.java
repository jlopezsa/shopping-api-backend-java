package com.shoppingbackend.shoppingapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShoppingApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingApiApplication.class, args);
		System.out.println("Api running in port:8080");
	}

}
