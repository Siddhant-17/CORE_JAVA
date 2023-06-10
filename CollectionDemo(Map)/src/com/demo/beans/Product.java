package com.demo.beans;

public class Product implements Comparable<Product> {

	private int pid;
	private String pname;
	private double price;
	

	public Product() {
		super();
	}

	public Product(int pid, String pname, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}

	public Product(int pid) {
		super();
		this.pid = pid;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return this.pid;
	}

	@Override
	public boolean equals(Object obj) {
		return this.pid==(((Product)obj).pid);
	}

	@Override
	public int compareTo(Product o) {
		return this.pid-o.pid;
	}
	
}
