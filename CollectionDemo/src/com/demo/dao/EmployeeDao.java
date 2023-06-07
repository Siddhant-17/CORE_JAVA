package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	void save(Employee e);

	List<Employee> getlist();

	Employee findById(int id);

	boolean updatesalById(int id, double sal);

	List<Employee> findByName(String nm);

	boolean removeById(int id);

	List<Employee> sortBySalary();
}
