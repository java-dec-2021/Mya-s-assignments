package com.codingdojo.gettingfamiliarwithroutings.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/coding")
	public String route1() {
		return "Hello Coding Dojo!";
	}
	@RequestMapping("/coding/python")
	public String route2() {
		return "Python/Django was awesome!";
	}
	@RequestMapping("/coding/java")
	public String route3() {
		return "Java/Spring is better!";
	}
	
}
