package com.ojas.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.emp.domain.Employee;
import com.ojas.emp.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@PostMapping("/newemp")
	public Employee newEmp(@RequestBody Employee emp) {
		return service.newEmp(emp);
	}
	
	@GetMapping("/allemp")
	public List<Employee> getEmp() {
		return service.getEmp();
	}
	
	@PutMapping("/empupdate")
	public Employee updateEmpName(@RequestBody Employee emp) {
		return service.updateName(emp);
	}
	
	@DeleteMapping("/delete/{empId}")
	public void deleteEmp(@PathVariable("empId") int empId) {
		service.delete(empId);
	}
	
	@GetMapping("/findbyid/{empId}")
	public Employee findById(@PathVariable("empId") int empId) {
		return service.empfindById(empId);
	}
	
}
