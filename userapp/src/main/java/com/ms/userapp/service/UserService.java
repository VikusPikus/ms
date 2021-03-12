package com.ms.userapp.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.ms.userapp.model.CountryDto;

public interface UserService {
	public String helloFromCountry();
	public String helloFromApartament();
	public CountryDto getCountryInfo(String countryCode);
	
	public ResponseEntity<CountryDto> hello2();
	public ResponseEntity<CountryDto> getCountryInfo();
}
