package com.example.demo.jpa.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@NamedQuery(name="getAllPersons", query="select p from Person p")
public class Person {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(nullable=false)
	private String name;
	
	private String address;
	
	@Column(name="dob",nullable=false)
	private LocalDate dateOfBirth;
	
	@CreationTimestamp
	@Column(name="createdTS", nullable=false, updatable=false)
	private LocalDateTime createdTimeStamp;

	@UpdateTimestamp
	@Column(name="updatedTS", nullable=false)
	private LocalDateTime updatedTimeStamp;

	@OneToOne(cascade=CascadeType.PERSIST,fetch=FetchType.LAZY)
	private PhoneDetails phoneDetails;
	
	public Person() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDateTime getCreatedTimeStamp() {
		return createdTimeStamp;
	}

	public void setCreatedTimeStamp(LocalDateTime createdTimeStamp) {
		this.createdTimeStamp = createdTimeStamp;
	}

	public LocalDateTime getUpdatedTimeStamp() {
		return updatedTimeStamp;
	}

	public void setUpdatedTimeStamp(LocalDateTime updatedTimeStamp) {
		this.updatedTimeStamp = updatedTimeStamp;
	}
	


	public PhoneDetails getPhoneDetails() {
		return phoneDetails;
	}

	public void setPhoneDetails(PhoneDetails phoneDetails) {
		this.phoneDetails = phoneDetails;
	}

	@Override
	public String toString() {
		return String.format(
				"Person [id=%s, name=%s, address=%s, dateOfBirth=%s, createdTimeStamp=%s, updatedTimeStamp=%s, phoneDetails=%s]",
				id, name, address, dateOfBirth, createdTimeStamp, updatedTimeStamp, phoneDetails);
	}

}
