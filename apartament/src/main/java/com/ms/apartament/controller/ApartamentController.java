package com.ms.apartament.controller;

import java.util.List;

import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping(value = "/apartament/{countryCode}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Apartament> getAll(@PathVariable String countryCode) {
		return apartamentService.findAllByCountryCode(countryCode);
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "hello from apartament service";
	}

}
