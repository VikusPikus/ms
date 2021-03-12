package com.ms.apartament.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.apartament.model.Apartament;

public interface ApartamentRepository extends JpaRepository<Apartament, Long> {

	public List<Apartament> findAllByCountryCode(String countryCode);
	
}
