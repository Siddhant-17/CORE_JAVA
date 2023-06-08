package com.demo.dao;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import com.demo.beans.Employee;
import com.demo.comparator.Myname;


public class EmployeeDaoImp implements EmployeeDao{

	private static List<Employee> elist;
	static {
		elist=new LinkedList();
		elist.add(new Employee(1,"sid",30000));
		elist.add(new Employee(2,"shubham",24000));
		elist.add(new Employee(3,"Ram",200000));
	}
	
	
	@Override
	//add method to add element
	public boolean save(Employee e) {
		return elist.add(e);	
	}


	@Override
	public List<Employee> getall() {
		return elist;
	}


	@Override
	// here index of internally use equals method so we need to override equals method
	public Employee serchempBYId(int id) {
		int pos=elist.indexOf(new Employee(id));
		if(pos!=-1)
		{
			return elist.get(pos);
		}
		else
			return null;
	}


	@Override
	public List<Employee> findByName(String nm) {
		List<Employee> nmlist=new LinkedList<>();
		for(Employee ob:elist)
		{
			if(ob.getEmpname().equals(nm))
			{
				nmlist.add(ob);
			}
		}
		if(elist.size()>0)
		return nmlist;
		else 
			return null;
	}


	@Override
	public List<Employee> sortBysalary() {
		List<Employee> salList=new ArrayList<>();
		for(Employee e:elist)
		{
			salList.add(e);
		}
		//sort internally call compareTo mathod need to override compareTo im Employee Calss
		salList.sort(null);
		return salList;
	}


	@Override
	public List<Employee> sortByNm() {
		List<Employee> nmlist=new ArrayList<>();
		for(Employee e:elist)
		{
			nmlist.add(e);
		}
		nmlist.sort(new Myname());
		return nmlist;
	}


	@Override
	public boolean updatesalBYId(int id, double newsal) {
		Employee e=serchempBYId(id);
		if(e!=null)
		{
			e.setSal(newsal);
			return true;
		}
		return false;
	}


	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		 return elist.remove(new Employee(id));
	}


	


	
	
}