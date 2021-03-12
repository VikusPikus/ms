package com.ms.userapp.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ms.userapp.model.CountryDto;

@Service
public class UserServiceImpl implements UserService {
	
	private final CountryServiceFeignClient countryServiceFeignClient;
	private final ApartamentServiceFeignClient apartamentServiceFeignClient;
	
	public UserServiceImpl(CountryServiceFeignClient countryServiceFeignClient,
			ApartamentServiceFeignClient apartamentServiceFeignClient) {
		this.countryServiceFeignClient = countryServiceFeignClient;
		this.apartamentServiceFeignClient = apartamentServiceFeignClient;
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
	public CountryDto getCountryInfo(String countryCode) {
		CountryDto result = countryServiceFeignClient.getByCountryCode(countryCode);
		return result;
	}

	@Override
	public ResponseEntity<CountryDto> hello2() {
		ResponseEntity<CountryDto> result = countryServiceFeignClient.getHello2();
		return result;
	}

	@Override
	public ResponseEntity<CountryDto> getCountryInfo() {
		ResponseEntity<CountryDto> result = countryServiceFeignClient.getCountryInfo();
		return result;
	}
	
}
