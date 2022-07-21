package com.ojas.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ojas.emp.domain.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
