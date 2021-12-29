package com.crojo.consultorio.domain;

import java.util.Date;

public class Patients implements IPerson {
	
	private Long id;
	private String name;
	private String lastName;
	private String surName;
	private Integer age;
	private String gender;
	private String email;
	private String phoneNumber;
	Date crationTime;
	Date modificationTime;
	Long userModifier;
	Long userCreator;
	
	@Override
	public String tostrin() {
		// TODO Auto-generated method stub
		return null;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
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

	public Date getCrationTime() {
		return crationTime;
	}

	public void setCrationTime(Date crationTime) {
		this.crationTime = crationTime;
	}

	public Date getModificationTime() {
		return modificationTime;
	}

	public void setModificationTime(Date modificationTime) {
		this.modificationTime = modificationTime;
	}

	public Long getUserModifier() {
		return userModifier;
	}

	public void setUserModifier(Long userModifier) {
		this.userModifier = userModifier;
	}

	public Long getUserCreator() {
		return userCreator;
	}

	public void setUserCreator(Long userCreator) {
		this.userCreator = userCreator;
	}
	

}
