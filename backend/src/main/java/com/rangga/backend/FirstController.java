package com.rangga.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@Autowired
	private PersonService personService;
	
	
	@GetMapping("/login")
	public String login(@RequestParam String email, @RequestParam String password) {
		return "Login Success";
	}
	
	@PostMapping("/register")
	public PersonModel createPerson(@RequestBody PersonModel personModel) {
		return personService.createPerson(personModel); 	
	}
	
}
