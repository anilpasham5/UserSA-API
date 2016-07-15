package com.tss.user.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonRootName;
@JsonRootName("employee")
public class EmployeePojo {

	private String empName;
	private String empEmailId;
	private double empSalary;
	private Date empJoinedDate;
	private AddressPojo empAddress;
	public EmployeePojo() {}
	public EmployeePojo(String empName, String empEmailId, double empSalary, Date empJoinedDate, AddressPojo empAddress) {
		super();
		this.empName = empName;
		this.empEmailId = empEmailId;
		this.empSalary = empSalary;
		this.empJoinedDate = empJoinedDate;
		this.empAddress = empAddress;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmailId() {
		return empEmailId;
	}
	public void setEmpEmailId(String empEmailId) {
		this.empEmailId = empEmailId;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public Date getEmpJoinedDate() {
		return empJoinedDate;
	}
	public void setEmpJoinedDate(Date empJoinedDate) {
		this.empJoinedDate = empJoinedDate;
	}
	public AddressPojo getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(AddressPojo empAddress) {
		this.empAddress = empAddress;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empEmailId=" + empEmailId + ", empSalary=" + empSalary
				+ ", empJoinedDate=" + empJoinedDate + ", empAddress=" + empAddress + "]";
	}
		
	
}
