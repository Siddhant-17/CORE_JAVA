package com.demo.beans;

public class Employee {

	private int pid;
	private String pname;
	private String desg;
	private double sal;
	

	public Employee() {
		super();
	}

	public Employee(int pid, String pname, String desg, double sal) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.desg = desg;
		this.sal = sal;
	}
		
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}
	
	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getDesg() {
		return desg;
	}
	
	public void setDesg(String desg) {
		this.desg = desg;
	}
	
	public double getSal() {
		return sal;
	}
	
	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [pid=" + pid + ", pname=" + pname + ", desg=" + desg + ", sal=" + sal + "]";
	}
	

}
