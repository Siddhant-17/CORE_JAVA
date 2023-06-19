package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {
	
		

		void save(Employee e);

		List<Employee> getAll();

		boolean deleteById(int id);

		Employee modifyById(int id,int sal);

		List<Employee> sortBySal();

		Employee displayById(int id);

		
		
		
	
		
		
}
