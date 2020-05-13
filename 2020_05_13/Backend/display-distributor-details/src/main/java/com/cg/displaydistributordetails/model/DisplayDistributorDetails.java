package com.cg.displaydistributordetails.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "distributors_tbl")
public class DisplayDistributorDetails {
	
	private int supplierId;
	private String name;
	private String location;
	private int phoneNumber;

	public DisplayDistributorDetails() {

	}

	public DisplayDistributorDetails(int supplierId, String name, String location, int phoneNumber) {
		super();
		this.supplierId = supplierId;
		this.name = name;
		this.location = location;
		this.phoneNumber = phoneNumber;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	@Column(name = "name", length = 20, nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "location", length = 40, nullable = false)
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Column(name = "phone_number", length = 15, nullable = false)
	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "DisplayDistributorDetails [supplierId=" + supplierId + ", name=" + name + ", location=" + location
				+ ", phoneNumber=" + phoneNumber + "]";
	}

}
