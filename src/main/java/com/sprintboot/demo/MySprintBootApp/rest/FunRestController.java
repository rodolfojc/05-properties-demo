package com.sprintboot.demo.MySprintBootApp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	//INJECT PROPERTIES
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamName;
	
	
	//EXPOSE "/" MAPPING
	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		return "Coach: " + coachName + " Team: " + teamName;
	}
	
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
	@GetMapping("/fortune")
	public String getLuckyDay() {
		return "Today is for lucky day!!!";
	}
}
