package com.tss.user.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tss.user.dao.EmployeeDAO;
import com.tss.user.entity.EmployeeEntity;
import com.tss.user.repository.EmployeeRepository;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public String addEmployee(EmployeeEntity employeeEntity) {
		return employeeRepository.save(employeeEntity).toString()+" Added";
	}
	@Override
	public EmployeeEntity getEmployee(String empEmailId) {
		return employeeRepository.getEmployee(empEmailId);
	}
	@Override
	public String deleteEmployee(String empEmailId) {
		 employeeRepository.deleteEmployee(empEmailId);
		 return empEmailId+" DELETED";
	}
	@Override
	public List<EmployeeEntity> getAllEmployees() {
		return employeeRepository.findAll();
	}

}
