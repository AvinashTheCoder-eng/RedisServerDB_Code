package com.app.repo;

import org.springframework.data.repository.CrudRepository;


import com.app.entity.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer>
{

}
