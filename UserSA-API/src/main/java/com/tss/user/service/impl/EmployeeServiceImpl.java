package com.tss.user.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tss.user.dao.EmployeeDAO;
import com.tss.user.entity.AddressEntity;
import com.tss.user.entity.EmployeeEntity;
import com.tss.user.pojo.AddressPojo;
import com.tss.user.pojo.EmployeePojo;
import com.tss.user.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	@Override
	public String addEmployee(EmployeePojo employeePojo) {
		EmployeeEntity employeeEntity=new EmployeeEntity();
		employeeEntity.setEmpEmailId(employeePojo.getEmpEmailId());
		employeeEntity.setEmpJoinedDate(employeePojo.getEmpJoinedDate());
		employeeEntity.setEmpName(employeePojo.getEmpName());
		employeeEntity.setEmpSalary(employeePojo.getEmpSalary());
		employeeEntity.setEmpAddress(new AddressEntity());
		employeeEntity.getEmpAddress().setEmpCity(employeePojo.getEmpAddress().getEmpCity());
		employeeEntity.getEmpAddress().setEmpPincode(employeePojo.getEmpAddress().getEmpPincode());
		employeeEntity.getEmpAddress().setEmpState(employeePojo.getEmpAddress().getEmpState());
		employeeEntity.getEmpAddress().setEmpStreet(employeePojo.getEmpAddress().getEmpStreet());
		return employeeDAO.addEmployee(employeeEntity);
	}
	@Override
	public EmployeePojo getEmployee(String empEmailId) {
		EmployeeEntity employeeEntity=employeeDAO.getEmployee(empEmailId);
		EmployeePojo employeePojo=new EmployeePojo();
		employeePojo.setEmpEmailId(empEmailId);
		employeePojo.setEmpJoinedDate(employeeEntity.getEmpJoinedDate());
		employeePojo.setEmpName(employeeEntity.getEmpName());
		employeePojo.setEmpSalary(employeeEntity.getEmpSalary());
		employeePojo.setEmpAddress(new AddressPojo());
		employeePojo.getEmpAddress().setEmpCity(employeeEntity.getEmpAddress().getEmpCity());
		employeePojo.getEmpAddress().setEmpPincode(employeeEntity.getEmpAddress().getEmpPincode());
		employeePojo.getEmpAddress().setEmpState(employeeEntity.getEmpAddress().getEmpState());
		employeePojo.getEmpAddress().setEmpStreet(employeeEntity.getEmpAddress().getEmpStreet());
		return employeePojo;
	}
	@Override
	public String deleteEmployee(String empEmailId) {
		return employeeDAO.deleteEmployee(empEmailId);
	}
	@Override
	public List<EmployeePojo> getAllEmployees() {
		List<EmployeeEntity> list=employeeDAO.getAllEmployees();
		List<EmployeePojo> employeePojos=new ArrayList<EmployeePojo>();
		for (Iterator<EmployeeEntity> iterator = list.iterator(); iterator.hasNext();) {
			EmployeeEntity employeeEntity =  iterator.next();
			EmployeePojo employeePojo=new EmployeePojo();
			employeePojo.setEmpEmailId(employeeEntity.getEmpEmailId());
			employeePojo.setEmpJoinedDate(employeeEntity.getEmpJoinedDate());
			employeePojo.setEmpName(employeeEntity.getEmpName());
			employeePojo.setEmpSalary(employeeEntity.getEmpSalary());
			employeePojo.setEmpAddress(new AddressPojo());
			employeePojo.getEmpAddress().setEmpCity(employeeEntity.getEmpAddress().getEmpCity());
			employeePojo.getEmpAddress().setEmpPincode(employeeEntity.getEmpAddress().getEmpPincode());
			employeePojo.getEmpAddress().setEmpState(employeeEntity.getEmpAddress().getEmpState());
			employeePojo.getEmpAddress().setEmpStreet(employeeEntity.getEmpAddress().getEmpStreet());
			employeePojos.add(employeePojo);
		}
		return employeePojos;
	}

}
