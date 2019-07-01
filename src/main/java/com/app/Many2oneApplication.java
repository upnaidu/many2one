package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.app.entity.Employee;

@SpringBootApplication(scanBasePackages = " com.app.*")
public class Many2oneApplication {

	public static void main(String[] args) {
		SpringApplication.run(Many2oneApplication.class, args);
		saveEmployee();
	}

	private static void saveEmployee() {

		final String uri = "http://localhost:8090/many2one/saveEmployee/Dave/Tes";

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> result = restTemplate.postForEntity(uri, Employee.class, String.class);

		System.out.println(result);
	}

}
