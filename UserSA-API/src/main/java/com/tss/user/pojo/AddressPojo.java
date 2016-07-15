package com.tss.user.pojo;

public class AddressPojo {

	private String empStreet;
	private String empCity;
	private String empState;
	private long empPincode;
	public AddressPojo() {}
	public AddressPojo(String empStreet, String empCity, String empState, long empPincode) {
		super();
		this.empStreet = empStreet;
		this.empCity = empCity;
		this.empState = empState;
		this.empPincode = empPincode;
	}
	public String getEmpStreet() {
		return empStreet;
	}
	public void setEmpStreet(String empStreet) {
		this.empStreet = empStreet;
	}
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	public String getEmpState() {
		return empState;
	}
	public void setEmpState(String empState) {
		this.empState = empState;
	}
	public long getEmpPincode() {
		return empPincode;
	}
	public void setEmpPincode(long empPincode) {
		this.empPincode = empPincode;
	}
	@Override
	public String toString() {
		return "Address [empStreet=" + empStreet + ", empCity=" + empCity + ", empState=" + empState + ", empPincode="
				+ empPincode + "]";
	}
	
}
