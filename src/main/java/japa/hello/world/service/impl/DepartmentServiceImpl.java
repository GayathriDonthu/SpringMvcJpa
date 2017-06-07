package japa.hello.world.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jpa.hello.world.model.Department;
import jpa.hello.world.repository.DepartmentRepository;
import jpa.hello.world.service.DepartmentService;

@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	@Qualifier("departmentRepository")
	private DepartmentRepository departmentRepository;
	
	@Transactional
	@Override
	public Department save(Department department) {
		return departmentRepository.save(department);
	}
	
}
