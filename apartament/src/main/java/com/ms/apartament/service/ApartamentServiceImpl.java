package com.ms.apartament.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import com.ms.apartament.model.Apartament;

import com.ms.apartament.repository.ApartamentRepository;

@Service
public class ApartamentServiceImpl implements ApartamentService {

	private final ApartamentRepository apartamentRepository;
	
	public ApartamentServiceImpl(ApartamentRepository apartamentRepository) {
		this.apartamentRepository = apartamentRepository;
	}

	@Override
	public Apartament findById(Long id) {
		return apartamentRepository.findById(id).get();
	}

	@Override
	public List<Apartament> findAll() {
		return apartamentRepository.findAll();
	}

}
