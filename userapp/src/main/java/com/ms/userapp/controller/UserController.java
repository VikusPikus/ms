package com.ms.userapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.userapp.service.UserService;

@RestController
@RequestMapping("/user-service")
public class UserController {
	
	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/status")
	public String status() {
		return "user service is up";
	}
	
	@RequestMapping(path = "/hello-from-country")
    public String getHelloFromCountry() {
        String result = userService.helloFromCountry();
        return result;
    }
	
	@RequestMapping(path = "/hello-from-apartament")
    public String getHelloFromApartament() {
        String result = userService.helloFromApartament();
        return result;
    }

}
