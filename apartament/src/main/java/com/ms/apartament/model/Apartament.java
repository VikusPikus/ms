package com.ms.apartament.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="apartaments")
public class Apartament {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "country_code")
	private String countryCode;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "guests_number")
	private Integer guestNumber;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "contact_person")
	private String contactPerson;
	
	@Column(name = "price")
	private Integer price;
	
	@Column(name = "available")
	private String available;
	
	public Apartament() {
	}

	public Apartament(String countryCode, String city, Integer guestNumber, String phone, String contactPerson,
			Integer price, String available) {
		this.countryCode = countryCode;
		this.city = city;
		this.guestNumber = guestNumber;
		this.phone = phone;
		this.contactPerson = contactPerson;
		this.price = price;
		this.available = available;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getGuestNumber() {
		return guestNumber;
	}

	public void setGuestNumber(Integer guestNumber) {
		this.guestNumber = guestNumber;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getAvailable() {
		return available;
	}

	public void setAvailable(String available) {
		this.available = available;
	}

}
