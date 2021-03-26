package com.ms.apartament.controller;

import java.util.List;

import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.ms.apartament.model.Apartament;
import com.ms.apartament.service.ApartamentService;

@RestController
@RequestMapping("/")
public class ApartamentController {

	private final ApartamentService apartamentService;
	private final Environment env;

	public ApartamentController(ApartamentService apartamentService, Environment env) {
		this.apartamentService = apartamentService;
		this.env = env;
	}

	@GetMapping("/status")
	public String serviceStatus() {
		return "apartament service is up. Port " + env.getProperty("local.server.port");
	}

	@GetMapping(value = "/apartament", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Apartament> getAll() {
		try {
			return apartamentService.findAll();
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, ">>> DB or Table doesn't found", e);
		}
	}

	@GetMapping(value = "/apartament/{countryCode}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Apartament> getAllByCountryCode(@PathVariable String countryCode) {
		try {
			return apartamentService.findAllByCountryCode(countryCode);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, ">>> DB or Table doesn't found", e);
		}
	}
}
