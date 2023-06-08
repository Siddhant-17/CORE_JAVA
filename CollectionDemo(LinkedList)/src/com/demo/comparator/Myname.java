package com.demo.comparator;

import java.util.Comparator;

import com.demo.beans.Employee;

public class Myname implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		System.out.println("inside Copare method of Myname Class "+" "+o1.getEmpname()+" "+o2.getEmpname());
		//here compareTo method is Sring class method 
		//which will return 1 ,-1,0
		return o1.getEmpname().compareTo(o2.getEmpname());
	}

	
	//campare to method to campare on name
	

}
