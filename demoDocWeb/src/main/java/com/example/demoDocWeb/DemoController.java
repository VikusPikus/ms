package com.example.demoDocWeb;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo-service")
public class DemoController {
	
	@GetMapping("/status")
	public String status() {
		return "demo service is up";
	}
	
	@GetMapping("/mood")
	public String getMood() {
		//read mood from file-volumes
		return "demo service is up";
	}
}
