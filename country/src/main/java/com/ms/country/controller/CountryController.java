package com.ms.country.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.country.model.Country;
import com.ms.country.service.CountryService;

@RestController
@RequestMapping("/")
public class CountryController {
	
	private final CountryService countryService;
	private final Environment env;
	
	public CountryController(CountryService countryService, Environment env) {
		this.countryService = countryService;
		this.env = env;
	}

	@GetMapping("/status")
	public String countryStatus() {
		return "country service is up. Port " + env.getProperty("local.server.port");
	}
	
	@GetMapping(value = "/country", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Country> getAll() {
		return countryService.findAll();
	}
	
	@GetMapping(value = "/country/{countryCode}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Country getByCountryCode(@PathVariable String countryCode) {
		Country result = countryService.findByCountryCode(countryCode);
		return result;
	}
}
