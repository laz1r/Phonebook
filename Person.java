package com.phonebook;

import java.math.BigInteger;

// Person object- first name, last name, full name(Person object)
//					telephone number, LinkedList address object

public class Person  {

	private String firstName;
	private String lastName;
	private String fullName;
	private Long telephone;
	private Address address; 
	
	public Person() {
		super();
	}
	
	public Person(String first, String last, String fullName, Long telephone, Address address) {
		this.firstName = first;
		this.lastName = last;
		this.fullName = fullName;
		this.telephone = telephone;
		this.address = address;
	}

	public String getFullName() {
		return fullName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Long getTelephone() {
		return telephone;
	}

	public Address getAddress() {
		return address;
	}
}
