package com.demo.beans;

public class Employee implements Comparable<Employee> {

	private int empid;
	private String empname;
	private double sal;
		
	public Employee() {
		super();
	}
	

	public Employee(int empid) {
		super();
		this.empid = empid;
		this.empname=null;
		this.sal=0;
	}


	public Employee(int empid, String empname, double sal) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.sal = sal;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	
	
	public boolean equals(Object ob) {
		
		System.out.println("inside equals method"+"this.obj "+this.empid+" "+"inside list obj "+(((Employee)ob).empid));
		return this.empid==(((Employee)ob).empid);
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", sal=" + sal + "]";
	}


	@Override
	//default sorting we override compareTo method return type int
	public int compareTo(Employee arg) {
		if(this.sal<arg.sal)
			return -1;
		else if(this.sal==arg.sal)
			return 0;
		else 
			return 1;
		
	}
	
	
	
	
}
