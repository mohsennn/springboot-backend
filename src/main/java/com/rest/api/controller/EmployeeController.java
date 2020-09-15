package com.rest.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.api.model.Employee;
import com.rest.api.repository.EmployeeRepository;

@RestController
@CrossOrigin
@RequestMapping("api/v1/")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;

	// get All Employees
	@GetMapping(value="/employees")
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

}
