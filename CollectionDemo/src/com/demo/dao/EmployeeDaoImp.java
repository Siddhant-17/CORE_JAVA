package com.demo.dao;

import com.demo.beans.Employee;
import java.util.List;
import java.util.ArrayList;


public class EmployeeDaoImp implements EmployeeDao {
	private static List<Employee> elist; //declare List of Employee type
	static {
		elist=new ArrayList<>();            //creating object of ArrayList<>()

		// create 2 object of employee class and add them into elist (arraylist)
		elist.add(new Employee(1,"Sid","Owner",150000));
		elist.add(new Employee(2,"ram","gaurd",120000));
		elist.add(new Employee(3,"Rajan","Analyst",7777));
	}
	@Override
	//save method to add employee
	public void save(Employee e) {
		elist.add(e);
	}
	@Override
	//display employee
	public List<Employee> getAllEmployee() {
		return elist;
	}
	

		
	@Override
	public int size() {
	
		return elist.size();
		
	}
	@Override
	public Employee serchById(Employee e) {
		return e;
	}

}
