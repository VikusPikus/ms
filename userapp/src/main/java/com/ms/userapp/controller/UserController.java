package com.ms.userapp.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.userapp.model.ApartamentDto;
import com.ms.userapp.model.CountryDto;
import com.ms.userapp.model.TravelInfoDto;
import com.ms.userapp.service.UserService;

@RestController
@RequestMapping("/user-service")
public class UserController {
	
	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/status")
	public String status() {
		return "user service is up";
	}
	
	@RequestMapping(path = "/hello-from-country")
    public String getHelloFromCountry() {
        String result = userService.helloFromCountry();
        return result;
    }
	
	@RequestMapping(path = "/country-info/{countryCode}")
    public ResponseEntity<CountryDto> getCountryInfo(@PathVariable String countryCode) {
		ResponseEntity<CountryDto> result = userService.getCountryInfo(countryCode);
        return result;
    }
	
	@RequestMapping(path = "/hello-from-apartament")
    public String getHelloFromApartament() {
        String result = userService.helloFromApartament();
        return result;
    }
	
	@RequestMapping(path = "/apartament-info/{countryCode}")
    public ResponseEntity<List<ApartamentDto>> getApartamentFromCountryInfo(@PathVariable String countryCode) {
		ResponseEntity<List<ApartamentDto>> result = userService.getApartamentFromCountryInfo(countryCode);
        return result;
    }
	
	@RequestMapping(path = "/travel-info/{countryCode}")
    public TravelInfoDto getTravelInfoByCountryInfo(@PathVariable String countryCode) {
		TravelInfoDto result = userService.getTravelInfo(countryCode);
        return result;
    }
	
}
