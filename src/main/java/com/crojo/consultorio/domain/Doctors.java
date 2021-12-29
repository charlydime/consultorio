package com.crojo.consultorio.domain;

import java.util.Date;

public class Doctors implements IPerson{
	
	private Long id;
	private float fee ;
	private Long specialtyID ;
	private Long userID;
	private Long shiftID;
	private Integer  status;
	private Date crationTime;
	private Date modificationTime;
	private Long userModifier;
	private Long userCreator;
	
	@Override
	public String tostrin() {
		// TODO Auto-generated method stub
		return  null  ;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public float getFee() {
		return fee;
	}

	public void setFee(float fee) {
		this.fee = fee;
	}

	public Long getSpecialtyID() {
		return specialtyID;
	}

	public void setSpecialtyID(Long specialtyID) {
		this.specialtyID = specialtyID;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public Long getShiftID() {
		return shiftID;
	}

	public void setShiftID(Long shiftID) {
		this.shiftID = shiftID;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
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
