package com.sprintboot.demo.MySprintBootApp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	//EXPOSE "/" MAPPING
	@GetMapping("/")
	public String sayHello() {
		return "Hello World! - Time is " + LocalDateTime.now();
	}
	
	// ENDPOINT MAPPING - WORKOUT
	@GetMapping("/workout")
	public String getWorkout() {
		return "Run 5K GOO!";
	}
	
	// ENDPOINT MAPPING - GETLUCKY
	@GetMapping("/getluck")
	public String getLuckyDay() {
		return "Today is for lucky day!!!";
	}
}
