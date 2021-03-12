package com.ms.userapp.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ms.userapp.model.ApartamentDto;

@FeignClient(name = "apartament-service")
public interface ApartamentServiceFeignClient {

	@GetMapping("/apartament-service/hello")
	public String getHello();

	@GetMapping("/apartament-service/apartament/{countryCode}")
	public ResponseEntity<List<ApartamentDto>> getAllByCountryCode(@PathVariable String countryCode);
}
