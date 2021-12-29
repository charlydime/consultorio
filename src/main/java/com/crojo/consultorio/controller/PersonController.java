package com.crojo.consultorio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crojo.consultorio.domain.Doctors;
import com.crojo.consultorio.domain.IPerson;
import com.crojo.consultorio.domain.Patients;
import com.crojo.consultorio.domain.PersonFactory;
import com.crojo.consultorio.domain.Users;

@RestController
public class PersonController {
	
	@Autowired
	PersonFactory perFac;
	
	IPerson doc;
	IPerson pat;
	IPerson usr;
	
	@GetMapping("/person")
	public void testFactory(){
		
		doc = perFac.getPerson("doctor");
		System.out.println( "instancia de doctores ?");
		System.out.println( doc instanceof Doctors);
		
		pat = perFac.getPerson("patient");
		System.out.println( "instancia de pacientes ?");
		System.out.println( pat instanceof Patients);
		
		usr = perFac.getPerson("user");
		System.out.println( "instancia de usuarios ?");
		System.out.println( usr instanceof Users);
		
	}
	

}
