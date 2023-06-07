package com.demo.service;

import java.util.List;
import java.util.Scanner;
import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImp;

public class EmpolyeeServiceImp implements EmployeeService {

	EmployeeDao edao=new EmployeeDaoImp();
	@Override
	//method to addEmployee 
	public void addEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter pid");
		int id=sc.nextInt();
		System.out.println("Enter name ");
		String name=sc.next();
		System.out.println("Enter des ");
		String des=sc.next();
		System.out.println("Enter sal ");
		double sal=sc.nextDouble();
		
		//create employee object by ctor
		Employee e=new Employee(id,name,des,sal);
		edao.save(e);
	}
	
	//method to display 
	@Override
	public List<Employee> displayAll() {
		return edao.getlist();
	}

	@Override
	public Employee searchById(int id) {
		return edao.findById(id);
	}

	@Override
	//method to update salary
	public boolean modifySal(int id,double sal) {
		return edao.updatesalById(id,sal);
		
	}

	@Override
	public List<Employee> searchByName(String nm) {
		return edao.findByName(nm);
	}

	@Override
	public boolean deleteById(int id) {
		//first find object and check with user whether to delete
		Employee ob=searchById(id);
		Scanner sc=new Scanner(System.in);
		if(ob!=null)
		{
			System.out.println(ob.getPid()+" , "+ob.getPname());
			System.out.println("Enter y to delete");
			String ans=sc.next();
			if(ans.equals("y"))
			return edao.removeById(id);
		}
		return false;
	}

	@Override
	public List<Employee> sortBySal() {
		return edao.sortBySalary();
	}





}
