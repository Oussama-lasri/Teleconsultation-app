package com.example.appointment_management.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping(path = "/users")
	public String retrieveAllUsers(){
		return "yooooooooo";
	}

}
