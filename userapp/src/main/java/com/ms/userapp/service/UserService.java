package com.ms.userapp.service;

import org.springframework.http.ResponseEntity;

import com.ms.userapp.model.CountryDto;

public interface UserService {
	public String helloFromCountry();
	public String helloFromApartament();
	
	public ResponseEntity<CountryDto> getCountryInfo(String countryCode);
	
}
