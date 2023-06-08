package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImp;

public class EmployeeServiceImp implements EmployeeService{

	
	
	
	EmployeeDao edao=new EmployeeDaoImp();
	
	
	@Override
	//to accept data from user and create object and call to save method from dao layer
	public void addNewEmp() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emp id");
		int id=sc.nextInt();
		System.out.println("Enter emp name");
		String nm=sc.next();
		System.out.println("Enter emp sal");
		double sal=sc.nextDouble();
		
		Employee e=new Employee(id,nm,sal);
		edao.save(e);
	}


	@Override
	//to display all object
	public List<Employee> displayAll() {
		return edao.getall();
	}


	@Override
	//serach by id
	public Employee serchById(int id) {
		return edao.serchempBYId(id);
	}


	@Override
	//serach by name return list of same name
	public List<Employee> searchByName(String nm) {
		return edao.findByName(nm);
	}


	@Override
	//sort by sal it return list
	public List<Employee> sortBySal() {
		return edao.sortBysalary();
	}


	@Override
	public List<Employee> sorByName() {
		return edao.sortByNm();
	}


	@Override
	public boolean modifysal(int id, double newsal) {
		return edao.updatesalBYId(id,newsal);
	}


	@Override
	public boolean deleteById(int id) {
		Employee e=serchById(id);
		Scanner sc=new Scanner(System.in);
		if(e!=null)
		{
			System.out.println(e.getEmpid()+" ,"+e.getEmpname());
			System.out.println("y to delete");
			String ans=sc.next();
			if(ans.equals("y"))
				return edao.deleteById(id);
		}
		return false;
	}

}
