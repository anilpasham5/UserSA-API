package com.tss.user.service;

import java.util.List;

import com.tss.user.pojo.EmployeePojo;

public interface EmployeeService {

	String addEmployee(EmployeePojo employeePojo);
	EmployeePojo getEmployee(String empEmailId);
	String deleteEmployee(String empEmailId);
	List<EmployeePojo> getAllEmployees();
}
