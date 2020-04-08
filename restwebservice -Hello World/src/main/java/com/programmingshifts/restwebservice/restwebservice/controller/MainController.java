package com.programmingshifts.restwebservice.restwebservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programmingshifts.restwebservice.restwebservice.model.Product;

@RestController
public class MainController {

	@GetMapping("/greetings")
	public String GreetingMethod() {
		return "Hello World";
	}
	
	@GetMapping("/products")
	public List<Product> getAllProducts() {
		return Arrays.asList(
				new Product(1l, "Spring Boot Micro-Service Ebook", "Written By Author: Er Heera Babu."));
	}
}
