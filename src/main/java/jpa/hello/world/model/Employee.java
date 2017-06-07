package jpa.hello.world.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

	private Long id;
	private String firstName;
	private String lastName;
	private Double salary;
	private Department department;

	public Employee() {
	}

	public Employee(String firstName, String lastName, Double salary, Department department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.department = department;
	}

	@ManyToOne
	public Department getDepartment() {
		return department;
	}
	
	
	@Column(name="FIRST_NAME")
	public String getFirstName() {
		return firstName;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employeeSequence")
	@SequenceGenerator(name = "employeeSequence", sequenceName = "EMPLOYEE_SEQUENCE", allocationSize = 1)
	@Column(name = "EMPLOYEE_ID")
	public Long getId() {
		return id;
	}

	@Column(name="LAST_NAME")
	public String getLastName() {
		return lastName;
	}
	
	@Column(name="SALARY")
	public Double getSalary() {
		return salary;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + "]";
	}
	
	

}
