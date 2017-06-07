package jpa.hello.world.repository;

import jpa.hello.world.model.Department;

public interface DepartmentRepository {
	public abstract Department save(Department department);
}
