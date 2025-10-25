package com.example.hellospring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	Student s1 = new Student("Γιαννης", "Ιωαννου", 24);
	
	@GetMapping("/student")

	public String getStudent() {
		
		return s1.toString();
		
	}	
}