package com.ahmetsenocak.cruddemo.dao;

import com.ahmetsenocak.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

//// Entity type = Employee | Primary key = Integer
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
