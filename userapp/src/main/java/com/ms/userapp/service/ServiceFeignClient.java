package com.ms.userapp.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "country-service")
public interface ServiceFeignClient {

	@GetMapping("/country-service/hello")
	public String getHello();
}
