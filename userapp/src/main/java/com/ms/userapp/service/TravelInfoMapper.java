package com.ms.userapp.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.ms.userapp.model.ApartamentDto;
import com.ms.userapp.model.CountryDto;
import com.ms.userapp.model.TravelInfoDto;

public interface TravelInfoMapper {
	public TravelInfoDto getTravelInfo(ResponseEntity<List<ApartamentDto>> apartaments,
			ResponseEntity<CountryDto> country);
}
