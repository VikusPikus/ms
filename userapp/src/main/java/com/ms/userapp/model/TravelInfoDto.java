package com.ms.userapp.model;

import java.util.List;

public class TravelInfoDto {
	
	private String countryCode;
	
	private String visaRegim;
	private String covidRestriction;
	
	private List<ApartamentDto> apartaments;
	
	public TravelInfoDto() {
	}
	
	public TravelInfoDto(String countryCode, String visaRegim, String covidRestriction, List<ApartamentDto> apartaments) {
		this.countryCode = countryCode;
		this.visaRegim = visaRegim;
		this.covidRestriction = covidRestriction;
		this.apartaments = apartaments;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getVisaRegim() {
		return visaRegim;
	}
	public void setVisaRegim(String visaRegim) {
		this.visaRegim = visaRegim;
	}
	public String getCovidRestriction() {
		return covidRestriction;
	}
	public void setCovidRestriction(String covidRestriction) {
		this.covidRestriction = covidRestriction;
	}

	public List<ApartamentDto> getApartaments() {
		return apartaments;
	}

	public void setApartaments(List<ApartamentDto> apartaments) {
		this.apartaments = apartaments;
	}

}
