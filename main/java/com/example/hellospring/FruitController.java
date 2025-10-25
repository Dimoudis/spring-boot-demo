package com.example.hellospring;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FruitController {
	
	@GetMapping("/fruits")
	public ArrayList<String> getFruits() {
		ArrayList<String> fruits = new ArrayList<String>();
		 fruits.add("Μήλο");
		 fruits.add("Πορτοκάλι");
		 fruits.add("Μπανάνα");		
		 return fruits;
	}
	
	@GetMapping("/askFruit/{name}")
	public String askFruit(@PathVariable(value="name")String name) {
		
		return "Αγαπημενο φρουτο: "+name;
	}
}