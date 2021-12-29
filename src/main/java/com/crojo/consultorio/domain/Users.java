package com.crojo.consultorio.domain;

import java.util.Date;

public class Users implements IPerson {
	private String name;
	private String lastName;
	private String surName;
	private String email;
	private String role;
	private String userName;
	private String password;
	private Date crationTime;
	private Date modificationTime;
	private Long userModifier;
	private Long userCreator;
	
	
	@Override
	public String tostrin() {
		
		return  name + " " + lastName + " " + surName ;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
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
