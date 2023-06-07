package com.demo.beans;

public class Employee implements Comparable<Employee>{

	private int pid;
	private String pname;
	private String degs;
	private double sal;
	

	public Employee(int pid) {
		this.pid = pid;
		this.pname = null;
		this.degs = null;
		this.sal = 0;
		
		
	}
	public Employee(int pid, String pname, String degs, double sal) {
		this.pid = pid;
		this.pname = pname;
		this.degs = degs;
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


	public String getDegs() {
		return degs;
	}


	public void setDegs(String degs) {
		this.degs = degs;
	}


	public double getSal() {
		return sal;
	}


	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [pid=" + pid + ", pname=" + pname + ", degs=" + degs + ", sal=" + sal + "]";
	}
	
	public boolean equals(Object ob)
	{
		if(this.pid==((Employee)ob).pid)
		return true;
		else 
			return false;
	}
	
	@Override
	public int compareTo(Employee o) {
		if (this.sal<o.sal) {
			return -1;
		}
		else if(this.sal==o.sal) {
			return 0;
		}
		else
			return 1;
	}
	
}
