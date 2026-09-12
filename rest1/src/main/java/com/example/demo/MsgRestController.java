package com.example.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.User;
import com.example.demo.repo.UserRepo;

//import com.cybrom.dto.User;
//import com.cybrom.repo.UserRepo;

@RestController
public class MsgRestController {
	@Autowired
	UserRepo repo;

	@GetMapping(value = "/welcome", produces = "text/plain")
	public String WelcomeMsg() {

		return "Welcome to web services in Spring Boot";

	}

	@GetMapping(value = "/get", produces = "text/plain")
	public ResponseEntity<String> Greet() {
		String msg = "Hello welcome";
		return new ResponseEntity<>(msg, HttpStatus.ACCEPTED);
	}

	
	@GetMapping("/greet")
	public ResponseEntity<List<User>> Greeting() {
		List<User> all = repo.findAll();
		return ResponseEntity.status(200).body(all);

	}

}

 



 
