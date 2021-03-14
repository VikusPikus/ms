package com.ms.userapp.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ms.userapp.model.ApartamentDto;
import com.ms.userapp.model.CountryDto;
import com.ms.userapp.model.TravelInfoDto;

@Service
public class UserServiceImpl implements UserService {
	
	private final CountryServiceFeignClient countryServiceFeignClient;
	private final ApartamentServiceFeignClient apartamentServiceFeignClient;
	private final TravelInfoMapper travelInfoMapper;
	
	public UserServiceImpl(CountryServiceFeignClient countryServiceFeignClient,
			ApartamentServiceFeignClient apartamentServiceFeignClient,
			TravelInfoMapper travelInfoMapper) {
		this.countryServiceFeignClient = countryServiceFeignClient;
		this.apartamentServiceFeignClient = apartamentServiceFeignClient;
		this.travelInfoMapper = travelInfoMapper;
	}

	@Override
	public String helloFromCountry() {
		String result = countryServiceFeignClient.getHello();
		return result;
	}

	@Override
	public String helloFromApartament() {
		String result = apartamentServiceFeignClient.getHello();
		return result;
	}

	@Override
	public ResponseEntity<CountryDto> getCountryInfo(String countryCode) {
		ResponseEntity<CountryDto> result = countryServiceFeignClient.getByCountryCode(countryCode);
		return result;
	}

	@Override
	public ResponseEntity<List<ApartamentDto>> getApartamentFromCountryInfo(String countryCode) {
		ResponseEntity<List<ApartamentDto>> result = apartamentServiceFeignClient.getAllByCountryCode(countryCode);
		return result;
	}

	@Override
	public TravelInfoDto getTravelInfo(String countryCode) {
		ResponseEntity<List<ApartamentDto>> apartaments = getApartamentFromCountryInfo(countryCode);
		ResponseEntity<CountryDto> country = getCountryInfo(countryCode);
		
		TravelInfoDto result = travelInfoMapper.getTravelInfo(apartaments, country);
		return result;
	}
	
}
