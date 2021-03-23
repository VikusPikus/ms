package com.ms.country.service;

import java.util.List;

import com.ms.country.model.Country;

public interface CountryService {
	
	public Country findById(Long id);
	
	public Country findByCountryCode(String countryCode);
	
	public List<Country> findAll();
}
