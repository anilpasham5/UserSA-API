package com.tss.user.dao;

import java.util.List;

import com.tss.user.entity.EmployeeEntity;

public interface EmployeeDAO {

	String addEmployee(EmployeeEntity employeeEntity);
	EmployeeEntity getEmployee(String empEmailId);
	String deleteEmployee(String empEmailId);
	List<EmployeeEntity> getAllEmployees();
}
