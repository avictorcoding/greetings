package com.example.greetingsdemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

	
	//get all employees
	@GetMapping("/welcome")
	String getEmployees() {

		return "hello world";
	}

}