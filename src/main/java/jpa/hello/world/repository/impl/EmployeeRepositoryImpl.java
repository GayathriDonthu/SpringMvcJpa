package jpa.hello.world.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import jpa.hello.world.model.Employee;
import jpa.hello.world.repository.EmployeeRepository;

@Repository("employeeRepository")
public class EmployeeRepositoryImpl implements EmployeeRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings({ "unchecked" })
	@Override
	public List<Employee> getAllEmployees() {
		
		Query query= entityManager.createQuery("SELECT emp FROM Employee emp");
		List<Employee> employees = query.getResultList();
		return employees;
		
	}
	 
	
	
}
