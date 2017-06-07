package jpa.hello.world.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="DEPT")
public class Department {
	
	private Long deptId;
	private String deptName;
	private List<Employee> employees;
	
	public Department() {
	}
	
	public Department(String deptName, List<Employee> employees) {
		super();
		this.deptName = deptName;
		this.employees = employees;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEPT_SEQUENCE")
	@SequenceGenerator(name = "DEPT_SEQUENCE", sequenceName = "DEPT_SEQUENCE", allocationSize = 1)
	@Column(name = "DEPT_ID")
	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}
	
	@Column(name="DEPT_NAME")
	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", employees=" + employees + "]";
	}
	
	

}
