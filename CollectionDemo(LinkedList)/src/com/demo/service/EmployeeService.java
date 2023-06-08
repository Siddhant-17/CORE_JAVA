package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	void addNewEmp();

	List<Employee> displayAll();

	Employee serchById(int id);

	List<Employee> searchByName(String nm);

	List<Employee> sortBySal();

	List<Employee> sorByName();

	boolean modifysal(int id, double newsal);

	boolean deleteById(int id);

}
