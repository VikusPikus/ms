package com.ms.userapp.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ms.userapp.model.ApartamentDto;
import com.ms.userapp.model.CountryDto;
import com.ms.userapp.model.TravelInfoDto;

@Service
public class TravelInfoMapperImpl implements TravelInfoMapper{

	@Override
	public TravelInfoDto getTravelInfo(ResponseEntity<List<ApartamentDto>> apartaments,
			ResponseEntity<CountryDto> country) {
		TravelInfoDto travelInfo = new TravelInfoDto();
		travelInfo.setCountryCode(country.getBody().getCountryCode());
		travelInfo.setVisaRegim(country.getBody().getVisaRegim());
		travelInfo.setCovidRestriction(country.getBody().getCovidRestriction());
		travelInfo.setApartaments(apartaments.getBody());
		return travelInfo;
	}

}
