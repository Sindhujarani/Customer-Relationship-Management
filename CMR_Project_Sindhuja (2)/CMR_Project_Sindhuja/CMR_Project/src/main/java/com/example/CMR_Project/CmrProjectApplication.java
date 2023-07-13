package com.example.CMR_Project;

import com.example.CMR_Project.entity.Employee;
import com.example.CMR_Project.ripository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CmrProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CmrProjectApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
//		Employee employee1 = new Employee("Ramesh","ramesh@gmail.com","Employee","pune");
//		Employee employee2 = new Employee("Hashim","hashim@gmail.com","Employee","Hyderabad");
//		Employee employee3 = new Employee("Sahil","sahil@gmail.com","Employee","Bhubaneswar");
	}
}
