package com.demo.service;
import java.util.List;
import java.util.Scanner;
import com.demo.beans.*;
import com.demo.dao.*;

public class EmployeeServiceImpl implements EmployeeService{
	
	EmployeeDao edao=new EmployeeDaoImpl();

	@Override
	public void addnewEmployee() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter salary");
		int sal=sc.nextInt();
		Employee e=new Employee(id,nm,sal);
		edao.save(e);
		

		
	}

	@Override
	public List<Employee> displayAll() {
		
		return edao.getAll();
	}

	@Override
	public boolean deleteById(int id) {
	
		return edao.deleteById(id);
	}

	@Override
	public Employee ModifyById(int id,int sal) {
		
		return edao.modifyById(id,sal);
	}

	@Override
	public List<Employee> sortBySal() {
		return edao.sortBySal();
	}

	@Override
	public Employee displayById(int id) {
		
		return edao.displayById(id);
	}

}
