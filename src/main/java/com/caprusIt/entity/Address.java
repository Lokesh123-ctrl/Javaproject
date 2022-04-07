package com.caprusIt.entity;

import javax.persistence.Entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private long address_id;
	private String street;
	private String city;
	private String state;
	
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name="STUDENT_ID") private Student student;
	 */


	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	/*
	 * public Student getStudent() { return student; } public void
	 * setStudent(Student student) { this.student = student; }
	 */
	
	public long getAddress_id() {
		return address_id;
	}
	public void setAddress_id(long address_id) {
		this.address_id = address_id;
	}
}