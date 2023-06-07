package com.demo.service;

import java.util.List;
import com.demo.beans.Employee;

import com.demo.beans.Employee;

public interface EmployeeService {

	void addEmployee();

	List<Employee> displayAll();

	Employee searchById(int id);

	boolean modifySal(int id,double sal);

	List<Employee> searchByName(String nm);

	boolean deleteById(int id);

	List<Employee> sortBySal();
}
