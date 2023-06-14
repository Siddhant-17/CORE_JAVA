package com.demo.beans;

import java.util.*;

public class BankAccount extends Person {
	private int accid;
	private String bname;
	private double bal;

	public BankAccount(int id, String pname, int accid, String bname, double bal) {
		super(id, pname);
		this.accid = id;
		this.bname = bname;
		this.bal = bal;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	public int getAccid() {
		return accid;
	}

	public void setAccid(int accid) {
		this.accid = accid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	@Override
	public String toString() {
		return super.toString() + "BankAccount [accid=" + accid + ", bname=" + bname + ", bal=" + bal + "]";
	}

	synchronized public void withdraw() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter amt");
		int amt = sc.nextInt();
		this.bal = (int) (this.bal - amt);
		int balance=(int) this.bal;
		System.out.println(balance);

	}

	private void Synchronized(BankAccount bankAccount) {
		// TODO Auto-generated method stub
		
	}

}
