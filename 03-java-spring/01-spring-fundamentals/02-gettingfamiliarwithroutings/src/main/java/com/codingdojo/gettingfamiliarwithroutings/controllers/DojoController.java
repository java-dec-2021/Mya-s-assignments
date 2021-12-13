package com.codingdojo.gettingfamiliarwithroutings.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class DojoController {
	
	@RequestMapping("/dojo")
	public String dojo() {
		return "The dojo is awesome!";
	}
	@RequestMapping("/dojo/{location}")
	public String location(@PathVariable("location") String location) {
//		if(location == "burbank") {
//			return "Burbank Dojo is located in Southern California.";
//		}
//		else if(location == "san-jose") {
//			return "SJ dojo is the headquarters.";
//		}
//		else {
//			return "Coding Dojo!!";
//		}
		switch(location) {
		case "burbank":
			return "Burbank Dojo is located in Southern California";
		case "san-jose":
			return "SJ dojo is the headquarters";
		default:
			return String.format("%s is pretty sweet!", location);
		}
	}

}
