package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	boolean save(Employee e);

	List<Employee> getall();

	Employee serchempBYId(int id);

	List<Employee> findByName(String nm);

	List<Employee> sortBysalary();

	List<Employee> sortByNm();

	boolean updatesalBYId(int id, double newsal);

	boolean deleteById(int id);

	

}
