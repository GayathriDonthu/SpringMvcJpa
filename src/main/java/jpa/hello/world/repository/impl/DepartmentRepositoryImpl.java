package jpa.hello.world.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import jpa.hello.world.model.Department;
import jpa.hello.world.repository.DepartmentRepository;

@Repository("departmentRepository")
public class DepartmentRepositoryImpl implements DepartmentRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public Department save(Department department) {
		entityManager.persist(department);
		return department;
	}
	
}
