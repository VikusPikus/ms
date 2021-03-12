package com.ms.userapp.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	private final ServiceFeignClient serviceFeignClient;
	
	public UserServiceImpl(ServiceFeignClient serviceFeignClient) {
		this.serviceFeignClient = serviceFeignClient;
	}

	public String helloFrom() {
		String result = serviceFeignClient.getHello();
		return result;
	}
	
}
