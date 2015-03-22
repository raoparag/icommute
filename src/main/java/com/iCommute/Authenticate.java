package com.iCommute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Authenticate {
	@RequestMapping("/authenticate")
	public User authenticate(){
		
		User user = new User();
		return user;
	}
}
