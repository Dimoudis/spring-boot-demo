package com.example.hellospring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }
	
	@GetMapping("/bye")
	public String sayBye(){
		
		return "Bye";
	
	}
	
}
