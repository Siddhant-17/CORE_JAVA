package com.demo.dao;

import com.demo.beans.Employee;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class EmployeeDaoImp implements EmployeeDao{

	//declare variable of list interface
	private static List<Employee> elist;
	
	static
	{
		//create arraylist object
		elist =new ArrayList<>();
		
		//adding 3 employee in elist
		elist.add(new Employee(1,"sid","er",15000));
		elist.add(new Employee(2,"ABD","Tester",150000));
		elist.add(new Employee(3,"shubham","Gamer",88000));
		elist.add(new Employee(4,"shubham","dancer",88780));
		
	}

	@Override
	//save method to add Employee object in list
	public void save(Employee e) {
		elist.add(e);
		
	}

	@Override
	//method to return list
	public List<Employee> getlist() {
		return elist;
	}

	@Override
	//method to find object in list by id
	public Employee findById(int id) {
		/*
		 * index of method internally calls equals method so we have to override it
		 */
		int pos=elist.indexOf(new Employee(id));
		if(pos!= -1) {
			return elist.get(pos);
		}
		return null;
	}

	@Override
	public boolean updatesalById(int id, double sal) {
		Employee e= findById(id);
		if(e!=null)
		{	
			e.setSal(sal);
			return true;
		}
		return false;
	}

	@Override
	public List<Employee> findByName(String nm) {
		//creating temporary array to add all same name object
		List<Employee> findlist=new ArrayList<>();
		for(Employee ob:elist)
		{
			if(ob.getPname().equals(nm))
			{
				findlist.add(ob);
			}
		}
		if(findlist.size()>0)
		{
			return findlist;
		}
		return null;
	}

	@Override
	public boolean removeById(int id) {
//		Employee e=findById(id);
//		if(e!=null)
//		{
//			elist.remove(e);
//		}
//		return false;
		//remove method internally call equals method
		return elist.remove(new Employee(id));
	}

	@Override
	public List<Employee> sortBySalary() {
		List<Employee> newlist=new ArrayList<>();
		for(Employee e:elist)
		{
			newlist.add(e);
		}
		//sort method internally call compareTo method so we need to override
		newlist.sort(null);
		return newlist;
	}
}
