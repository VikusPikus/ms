package com.ms.country.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

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
		try {
			return countryService.findAll();
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, ">>> DB or Table doesn't found", e);
		}
	}

	@GetMapping(value = "/country/{countryCode}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Country getByCountryCode(@PathVariable String countryCode) {
		try {
			return countryService.findByCountryCode(countryCode);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, ">>> DB or Table doesn't found", e);
		}

	}
}
