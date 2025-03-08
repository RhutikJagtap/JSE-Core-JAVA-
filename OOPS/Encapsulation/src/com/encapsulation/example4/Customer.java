package com.encapsulation.example4;

public class Customer {
	private int cId;
	private String cName;
	private long phoneNumber;

	public void setCId(int cId) {
		this.cId = cId;
	}

	public int getCId() {
		return cId;
	}

	public void setCName(String cName) {
		this.cName = cName;
	}

	public String getCName() {
		return cName;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

}
