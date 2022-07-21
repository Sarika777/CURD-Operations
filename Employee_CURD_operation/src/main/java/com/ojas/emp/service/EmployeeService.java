package com.ojas.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.emp.domain.Employee;
import com.ojas.emp.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	//Add NewEmployee
	public Employee newEmp(Employee emp) {
		return repo.save(emp);
	}
	
	//Get Employee
	
	public List<Employee> getEmp() {
		return repo.findAll();
	}

	public Employee updateName(Employee emp) {
		return repo.save(emp);
	}

	public void delete(int empId) {
		repo.deleteById(empId); ;
	}

	public Employee empfindById(int empId) {
		return repo.findById(empId).get();
	}
}
