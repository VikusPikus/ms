package com.ms.country.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="countries")
public class Country {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "country_code")
	private String countryCode;
	
	@Column(name = "visa_regim")
	private String visaRegim;
	
	@Column(name = "covid_restriction")
	private String covidRestriction;
	
	public Country() {
	}

	public Country(String countryCode, String visaRegim, String covidRestriction) {
		this.countryCode = countryCode;
		this.visaRegim = visaRegim;
		this.covidRestriction = covidRestriction;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", countryCode=" + countryCode + ", visaRegim=" + visaRegim + ", covidRestriction="
				+ covidRestriction + "]";
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
