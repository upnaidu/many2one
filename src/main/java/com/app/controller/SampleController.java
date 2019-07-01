package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.AddresService;
import com.app.service.EmployeeService;

@RestController
public class SampleController {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private AddresService addresService;

	@PostMapping("/saveEmployee/{empName}/{empAddr}")
	public int saveAccount(@PathVariable(value = "empName") String empName,
			@PathVariable(value = "empAddr") String empAddr) {

		System.out.println("empName ::" + empName);
		System.out.println("empAddr ::" + empAddr);
		return employeeService.saveEmployeeDetails(empName, empAddr);
	}

}
