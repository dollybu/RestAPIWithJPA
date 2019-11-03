package com.example.testing.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/test")
	public String test() {
		
	   
		return "My name is Dolly";
	}
	
	@RequestMapping("/test/{name}")
	public String test(@PathVariable("name") String nameValue) {
		
	   
		return "My name is ="+nameValue;
	}
}
