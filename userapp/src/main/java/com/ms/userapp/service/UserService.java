package com.ms.userapp.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.ms.userapp.model.ApartamentDto;
import com.ms.userapp.model.CountryDto;

public interface UserService {
	public String helloFromCountry();
	public String helloFromApartament();
	
	public ResponseEntity<CountryDto> getCountryInfo(String countryCode);
	
	public ResponseEntity<List<ApartamentDto>> getApartamentFromCountryInfo(String countryCode);
	
}
