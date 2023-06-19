package com.demo.beans;

public class Employee {
	private int id;
	private String ename;
	private int sal;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String ename, int sal) {
		super();
		this.id = id;
		this.ename = ename;
		this.sal = sal;
	}


	
	
	
	
		public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getEname() {
		return ename;
	}




	public void setEname(String ename) {
		this.ename = ename;
	}




	public int getSal() {
		return sal;
	}




	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", sal=" + sal + "]";
	}
	public void setSal(int sal) {
		this.sal = sal;
	}




	





	
}
