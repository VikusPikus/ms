package com.ms.country.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ms.country.model.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {
	public Country findByCountryCode(String countryCode);
}
