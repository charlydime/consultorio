package com.crojo.consultorio.domain;

import java.util.Date;

public class Patients implements IPerson {
	
	Long id;
	String name;
	String lastName;
	String surName;
	Integer age;
	String gender;
	String email;
	String phoneNumber;
	Date crationTime;
	Date modificationTime;
	Long userModifier;
	Long userCreator;
	
	@Override
	public String tostrin() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
