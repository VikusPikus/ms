package com.ms.userapp.model;

public class CountryDto {
	private Long id;
	private String countryCode;
	private String visaRegim;
	private String covidRestriction;

	public CountryDto() {
	}
	
	public CountryDto(Long id, String countryCode, String visaRegim, String covidRestriction) {
		this.id = id;
		this.countryCode = countryCode;
		this.visaRegim = visaRegim;
		this.covidRestriction = covidRestriction;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	
	
}
