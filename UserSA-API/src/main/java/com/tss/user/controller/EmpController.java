package com.tss.user.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tss.user.pojo.EmployeePojo;
import com.tss.user.service.EmployeeService;

@RestController
@RequestMapping(value="/emp")
public class EmpController {

	private static final Logger logger = LoggerFactory.getLogger(EmpController.class);
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value="",method=RequestMethod.POST)
	public String addEmployee(@RequestBody EmployeePojo employeePojo){
		logger.info(employeePojo.toString());
		return employeeService.addEmployee(employeePojo);
	}
	@RequestMapping(value="/{empEmailId}",method=RequestMethod.GET,produces="application/json")
	public EmployeePojo getEmployee(@PathVariable("empEmailId") String empEmailId){
		if(!empEmailId.endsWith(".com")) empEmailId=empEmailId+".com";
		return employeeService.getEmployee(empEmailId);
	}
	@RequestMapping(value="/{empEmailId}",method=RequestMethod.DELETE)
	public String deleteEmployee(@PathVariable("empEmailId") String empEmailId){
		if(!empEmailId.endsWith(".com")) empEmailId=empEmailId+".com";
		return employeeService.deleteEmployee(empEmailId);
	}
	@RequestMapping(value="",method=RequestMethod.GET,produces="application/json")
	public List<EmployeePojo> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
}
