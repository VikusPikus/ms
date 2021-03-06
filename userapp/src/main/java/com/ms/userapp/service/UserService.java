package com.ms.userapp.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.ms.userapp.model.ApartamentDto;
import com.ms.userapp.model.CountryDto;
import com.ms.userapp.model.TravelInfoDto;

public interface UserService {
	public ResponseEntity<CountryDto> getCountryInfo(String countryCode);
	
	public ResponseEntity<List<ApartamentDto>> getApartamentFromCountryInfo(String countryCode);
	
	public TravelInfoDto getTravelInfo(String countryCode);
	
}
