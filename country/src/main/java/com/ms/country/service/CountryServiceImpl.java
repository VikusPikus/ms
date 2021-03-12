package com.ms.country.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ms.country.model.Country;
import com.ms.country.repository.CountryRepository;

@Service
public class CountryServiceImpl implements CountryService{
	
	private final CountryRepository countryRepository;
	
	public CountryServiceImpl(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}

	@Override
	public Country findById(Long id) {
		return countryRepository.findById(id).get();
	}

	@Override
	public Country findByCountryCode(String countryCode) {
		return countryRepository.findByCountryCode(countryCode);
	}

	@Override
	public List<Country> findAll() {
		return countryRepository.findAll();
	}
}
