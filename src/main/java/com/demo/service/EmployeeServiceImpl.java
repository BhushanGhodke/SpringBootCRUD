package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.model.Employee;
import com.demo.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee saveEmployee(Employee employee) {
	
		return employeeRepository.save(employee);
	}

}
