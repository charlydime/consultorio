package com.crojo.consultorio.domain;

import java.util.Date;

public class Users implements IPerson {
	String name;
	String lastName;
	String surName;
	String email;
	String role;
	String userName;
	String password;
	Date crationTime;
	Date modificationTime;
	Long userModifier;
	Long userCreator;
	
	
	@Override
	public String tostrin() {
		
		return  name + " " + lastName + " " + surName ;
	}

}
