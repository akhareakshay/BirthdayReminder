package com.codewithakshay.birthdayreminder.postgres.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codewithakshay.birthdayreminder.postgres.model.Login;

@RestController
@RequestMapping("/login")
public class LoginController {

	@PostMapping(value = "/user")
	public ResponseEntity<Object> loginUser(@RequestBody Login login) {
		try {
			
		} catch (Exception er) {

		}
	}

}
