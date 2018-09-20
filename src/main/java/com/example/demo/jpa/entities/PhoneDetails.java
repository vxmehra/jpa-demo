package com.example.demo.jpa.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class PhoneDetails {

	@Id
	@GeneratedValue
	private int id;
	
	private String areaCode;
	
	@Column(nullable=false)
	private String counrtyCode;
	@Column(nullable=false, unique=true)
	private String phoneNumber;
	
	@CreationTimestamp
	@Column(name="createdTS", nullable=false, updatable=false)
	private LocalDateTime createdTimeStamp;

	@UpdateTimestamp
	@Column(name="updatedTS", nullable=false)
	private LocalDateTime updatedTimeStamp;
	
	public PhoneDetails() {
		super();
	}


	@Version
	protected Integer version;


	public Integer getVersion() {
		return version;
	}


	public void setVersion(Integer version) {
		this.version = version;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAreaCode() {
		return areaCode;
	}


	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}


	public String getCounrtyCode() {
		return counrtyCode;
	}


	public void setCounrtyCode(String counrtyCode) {
		this.counrtyCode = counrtyCode;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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


	@Override
	public String toString() {
		return String.format(
				"PhoneDetails [id=%s, areaCode=%s, counrtyCode=%s, phoneNumber=%s, createdTimeStamp=%s, updatedTimeStamp=%s]",
				id, areaCode, counrtyCode, phoneNumber, createdTimeStamp, updatedTimeStamp);
	}

	
}
