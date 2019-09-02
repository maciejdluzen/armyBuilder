package com.luv2code.springboot.thymeleafdemmo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springboot.thymeleafdemmo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	// that's it ... no need to wriate any code LOL!
	
	// add a method to sort by last name
	public List<Employee> findAllByOrderByLastNameAsc();
	
}
