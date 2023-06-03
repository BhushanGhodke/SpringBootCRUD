package com.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
// create an API to save the Employee details	
	@PostMapping("\saveEmployee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		
		Employee emp= employeeService.saveEmployee(employee);
		
		return ResponseEntity.ok().body(emp);
	}
	
}
