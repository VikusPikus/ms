package com.ms.userapp.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "apartament-service")
public interface ApartamentServiceFeignClient {

	@GetMapping("/apartament-service/hello")
	public String getHello();
}
