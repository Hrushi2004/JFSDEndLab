package com.klef.jfsd.exam.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;


@Entity
public class Customer {

    @Id
    private Long customerId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String phoneNumber;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String dateOfBirth; 

    public Long getCustomerId() {
        return customerId;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
}

//
//INSERT INTO Customer (customerId, name, email, phoneNumber, address, dateOfBirth)
//VALUES
//(1, 'Hrushi', 'hrushi@example.com', '1234567890', 'Vijayawada', '07-10-2004'),
//(2, 'Ramu', 'ramu@example.com', '0987654321', 'Guntur', '07-12-2005'),
//(3, 'JSK', 'jsk@example.com', '1122334455', 'Vizag', '08-02-1999');

