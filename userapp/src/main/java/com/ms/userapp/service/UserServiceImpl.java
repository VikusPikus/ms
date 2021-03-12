package com.ms.userapp.service;

import org.springframework.stereotype.Service;

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
	
}
