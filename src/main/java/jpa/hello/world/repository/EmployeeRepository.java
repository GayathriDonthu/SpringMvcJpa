package jpa.hello.world.repository;

import java.util.List;

import jpa.hello.world.model.Employee;

public interface EmployeeRepository {
	
	public abstract List<Employee> getAllEmployees();
	
}
