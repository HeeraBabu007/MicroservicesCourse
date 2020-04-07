package com.programmingshifts.restwebservice.restwebservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/greetings")
	public String GreetingMethod() {
		return "Hello World";

	}
}
