package com.demo.Service;

import java.util.List;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImp;

import java.util.Scanner;

public class EmployeeServiceImp implements EmployeeService {

	private EmployeeDao edao;

	//constructor
	public EmployeeServiceImp() {
		super();
		this.edao = new EmployeeDaoImp();
	}

	@Override
	public void addnewEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter empid");
		int empid=sc.nextInt();
		System.out.println("enter ename");
		String nm=sc.next();
		System.out.println("enter designation");
		String desg=sc.next();
		System.out.println("enter Salary");
		double s=sc.nextDouble();
		
		Employee e=new Employee(empid,nm,desg,s);
		edao.save(e);
	}

	@Override
	public List<Employee> displayAll() {
		return edao.getAllEmployee();
	}

	@Override
	public List<Employee> displayById(int id) {
		
		int s=edao.size();
		System.out.println(s);
		
		return null;
	
	}


	
	
}
