package be.busi.springboot.thymeleaf.service;

import java.util.List;

import be.busi.springboot.thymeleaf.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
}
