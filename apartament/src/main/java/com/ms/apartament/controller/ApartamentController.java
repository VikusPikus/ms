package com.ms.apartament.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.apartament.model.Apartament;
import com.ms.apartament.service.ApartamentService;

@RestController
@RequestMapping("/apartament-service")
public class ApartamentController {
	
	@Autowired
	private ApartamentService apartamentService;
		
	@GetMapping("/status")
	public String serviceStatus() {
		return "apartament service is up";
	}
	
	@GetMapping(value = "/apartament", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Apartament> getAll() {
		return apartamentService.findAll();
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "hello from apartament service";
	}

}
