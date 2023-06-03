package com.demo.service;

import org.springframework.stereotype.Service;

import com.demo.model.Employee;

@Service
public interface EmployeeService {

	public Employee saveEmployee(Employee employee);
}
