package com.ms.apartament.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.apartament.model.Apartament;

public interface ApartamentRepository extends JpaRepository<Apartament, Long> {
	
}
