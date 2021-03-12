package com.ms.userapp.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.ms.userapp.model.CountryDto;

@FeignClient(name = "country-service")
public interface CountryServiceFeignClient {

	@GetMapping("/country-service/hello")
	public String getHello();

	@GetMapping("/country-service/country/{countryCode}")
	public CountryDto getByCountryCode(String countryCode);

	@GetMapping("/country-service/hello2")
	public ResponseEntity<CountryDto> getHello2();

	@GetMapping("/country-service/countryi")
	public ResponseEntity<CountryDto> getCountryInfo();
}
