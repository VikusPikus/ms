package com.ms.userapp.model;


public class ApartamentDto {
	private Long id;
	private String countryCode;
	private String city;
	private Integer guestNumber;
	private String phone;
	private String contactPerson;
	private Integer price;
	private String available;
	
	public ApartamentDto() {
		
	}
	
	public ApartamentDto(Long id, String countryCode, String city, Integer guestNumber, String phone,
			String contactPerson, Integer price, String available) {
		this.id = id;
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
