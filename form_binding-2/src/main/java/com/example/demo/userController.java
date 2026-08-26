package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class userController {
	@GetMapping("/")
	public String loadUser(Model model) {
		model.addAttribute( "user",new userDTO());
		return "index";
	}
	
	@PostMapping("/save-data")
	public String handleform(userDTO user,Model model) {
		System.out.print(user);
		return "sucess";
	}

}
