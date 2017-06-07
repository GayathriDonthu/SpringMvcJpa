package jpa.hello.world.service;

import java.util.List;

import jpa.hello.world.model.Employee;

public interface EmployeeService {
	
	public abstract List<Employee> getAllEmployees();
	
}
