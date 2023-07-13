package com.example.CMR_Project.ripository;

import com.example.CMR_Project.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
