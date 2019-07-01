package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Address;
import com.app.entity.Employee;
import com.app.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	public int saveEmployeeDetails(String empName, String empAddr) {

		Employee e1 = new Employee();
		e1.setName(empName);
		e1.setEmail("abc@gmail.com");

		Employee e2 = new Employee();
		e2.setName(empName);
		e2.setEmail("bcd@gmail.com");

		Address address1 = new Address();
		address1.setAddressLine1("Line-1");
		address1.setCity(empAddr);
		address1.setState("AP");
		address1.setCountry("India");
		address1.setPincode(123456);

		e1.setAddress(address1);
		e2.setAddress(address1);
		employeeRepo.save(e1);
		employeeRepo.save(e2);
		System.out.println("Saved Successfully");
		return 0;
	}

}
