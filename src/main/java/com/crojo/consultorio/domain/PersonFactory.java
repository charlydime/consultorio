package com.crojo.consultorio.domain;

import org.springframework.stereotype.Component;

@Component
public class PersonFactory {
	
	public IPerson getPerson(String tipoPersona ) {
		
		if( tipoPersona.equalsIgnoreCase("doctor"))
			return new Doctors();
		
		if( tipoPersona.equalsIgnoreCase("patient"))
			return new Patients();
		
		if( tipoPersona.equalsIgnoreCase("user"))
			return new Users();
		
		
		return null;
		
		
	}
	

}
