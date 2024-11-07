package com.app.rest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Employee;
import com.app.repo.EmployeeRepo;

@RestController
public class EmployeeRestController 
{
	  @Autowired
      private EmployeeRepo employeeRepo;
	  
	  @GetMapping("/emps")
	  public Iterable<Employee> getAllEmployee()
	  {
		  return employeeRepo.findAll();
	  }
	  @PostMapping("/emp")
	  public String addStudent(@RequestBody Employee employee)
	  {
		  employeeRepo.save(employee);
		  return "Employee Saved";
		  
	  }
}
