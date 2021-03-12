package com.ms.userapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.userapp.service.UserService;

@RestController
@RequestMapping("/userservice")
public class UserController {
	
	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/status")
	public String status() {
		return "userservice is up";
	}
	
	@RequestMapping(path = "/hello-from-country")
    public String getHelloFromCountry() {
        String result = userService.helloFrom();
        return result;
    }

}
