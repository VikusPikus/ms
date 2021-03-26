package com.ms.userapp.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ms.userapp.model.CountryDto;

@FeignClient(name = "country-service")
public interface CountryServiceFeignClient {

	@RequestMapping(method = RequestMethod.GET, value = "/country/{countryCode}", produces = "application/json")
	public ResponseEntity<CountryDto> getByCountryCode(@PathVariable String countryCode);
}
