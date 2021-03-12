package com.ms.userapp.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ms.userapp.model.CountryDto;

@FeignClient(name = "country-service")
public interface CountryServiceFeignClient {

	@GetMapping("/country-service/hello")
	public String getHello();

	@GetMapping("/country-service/hello2")
	public ResponseEntity<CountryDto> getHello2();

	@GetMapping("/country-service/countryi")
	public ResponseEntity<CountryDto> getCountryInfo();

	@RequestMapping(method = RequestMethod.GET, value = "/country-service/country/{countryCode}", produces = "application/json")
	public ResponseEntity<CountryDto> getByCountryCode(@PathVariable String countryCode);
}
