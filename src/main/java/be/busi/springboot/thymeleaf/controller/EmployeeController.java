package be.busi.springboot.thymeleaf.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import be.busi.springboot.thymeleaf.entity.Employee;
import be.busi.springboot.thymeleaf.service.EmployeeService;


@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	@Autowired
	public EmployeeController(EmployeeService theEmployeeService) {
		employeeService = theEmployeeService;
	}
	
	// add mapping for "/list"

	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		
		// get employees from db
		List<Employee> employees = employeeService.findAll();
		
		// add to the spring model
		theModel.addAttribute("employees", employees);
		
		return "list-employees";
	}
}









