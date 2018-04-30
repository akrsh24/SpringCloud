package com.mock.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mock.model.Employee;

@RestController
public class TestController {

	@RequestMapping(value="/employee", method= RequestMethod.GET)
	public Employee firstPage() {
		
		Employee employee=new Employee();
		employee.setEmpId("1");
		employee.setName("emp1");
		employee.setDesignation("manager");
		employee.setSalary(3000);
		
		return employee;
	}
}
