package be.busi.springboot.thymeleaf.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import be.busi.springboot.thymeleaf.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// that's it ... no need to write any code LOL!
	
	//add a method to sort by lastName
	public List<Employee> findAllByOrderByLastNameAsc();
	
}