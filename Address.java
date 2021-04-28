package com.phonebook;

public class Address {
	
	// Address object - Address, City, State, Zip Code
	
	private String street;
	private String city;
	private String state;
	private Long zip;
	
	public Address() {
		super();
	}
	
	public Address(String street, String city, String state, Long zip) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public Long getZip() {
		return zip;
	}

}