package com.personal.pms.entity;
/*
 * Author: Venkatesh Pai 
 * Date: 01-11-2024
 */

import java.sql.Date;
import java.util.*;
public class Employee {
	
	private int employeeId;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String gender;
	private String email;
	private String phoneNumber;
	private String Address;
	private String Position;
	private Date joiningDate;
	private Date terminationDate;
	
	public Employee() {
		super();
	}

	public Employee(int employeeId, String firstName, String lastName, Date dateOfBirth, String gender, String email,
			String phoneNumber, String address, String position, Date joiningDate, Date terminationDate) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.Address = address;
		this.Position = position;
		this.joiningDate = joiningDate;
		this.terminationDate = terminationDate;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date string) {
		this.dateOfBirth = string;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPosition() {
		return Position;
	}

	public void setPosition(String position) {
		Position = position;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(java.sql.Date string) {
		this.joiningDate = string;
	}

	public Date getTerminationDate() {
		return terminationDate;
	}

	public void setTerminationDate(Date terminationDate) {
		this.terminationDate = terminationDate;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", Address=" + Address + ", Position=" + Position + ", joiningDate=" + joiningDate
				+ ", terminationDate=" + terminationDate + "]";
	}

	
	
	
	
}