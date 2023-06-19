package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	void addnewEmployee();

	List<Employee> displayAll();

 boolean deleteById(int id);

	Employee ModifyById(int id, int sal);

	List<Employee> sortBySal();

	Employee displayById(int id);

}
