package jpa.hello.worl.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jpa.hello.world.model.Department;
import jpa.hello.world.model.Employee;
import jpa.hello.world.service.DepartmentService;
import jpa.hello.world.service.EmployeeService;

@Controller
public class MyController {
	
	
	@Autowired
	@Qualifier(value="employeeService")
	private EmployeeService employeeService;
	
	@Autowired
	@Qualifier("departmentService")
	private DepartmentService departmentService;
	
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public ModelAndView saveEmployeeResults(@ModelAttribute("employeeModel") Employee employee, ModelAndView modelAndView) {
		
		List<Employee> employees = new ArrayList<>();
		employees.add(employee);
		Department department = new Department("Product_Development", employees);
		employee.setDepartment(department);
		
		departmentService.save(department);
		modelAndView.addObject("employee", employee);
		modelAndView.setViewName("saveEmployeeResults");
		
		return modelAndView;
		
	}
	
	@RequestMapping(value="/allEmployees", method = RequestMethod.GET)
	public ModelAndView showAllEmployees(ModelAndView modelAndView){
		
		List<Employee> employees = employeeService.getAllEmployees();
		modelAndView.addObject("employees",employees);
		modelAndView.setViewName("allEMployees");
		
		return modelAndView;
		
	}
	

}
