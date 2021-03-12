package com.ms.apartament.service;

import java.util.List;

import com.ms.apartament.model.Apartament;

public interface ApartamentService {
	
	public Apartament findById(Long id);
	
	public List<Apartament> findAll();

	public List<Apartament> findAllByCountryCode(String countryCode);

}
