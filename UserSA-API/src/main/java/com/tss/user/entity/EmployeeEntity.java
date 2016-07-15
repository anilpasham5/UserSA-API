package com.tss.user.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="employee")
public class EmployeeEntity {

	@Id
	private String empId;
	private String empName;
	@Indexed(unique=true)
	private String empEmailId;
	private double empSalary;
	private Date empJoinedDate;
	//@DBRef 
	//if you use this @DBRef you must need to maintain a id in AddressEntity class 
	private AddressEntity empAddress;
	public EmployeeEntity() {}
	public EmployeeEntity(String empId, String empName, String empEmailId, double empSalary, Date empJoinedDate,
			AddressEntity empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmailId = empEmailId;
		this.empSalary = empSalary;
		this.empJoinedDate = empJoinedDate;
		this.empAddress = empAddress;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
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
	public AddressEntity getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(AddressEntity empAddress) {
		this.empAddress = empAddress;
	}
	@Override
	public String toString() {
		return "EmployeePojo [empId=" + empId + ", empName=" + empName + ", empEmailId=" + empEmailId + ", empSalary="
				+ empSalary + ", empJoinedDate=" + empJoinedDate + ", empAddress=" + empAddress + "]";
	}
	
	
}
