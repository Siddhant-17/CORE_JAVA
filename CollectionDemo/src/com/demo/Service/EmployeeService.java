package com.demo.Service;

import java.util.List;
import com.demo.beans.Employee;

public interface EmployeeService {

	void addnewEmployee();
	
	List<Employee> displayAll();
	List<Employee> displayById(int id);
}
