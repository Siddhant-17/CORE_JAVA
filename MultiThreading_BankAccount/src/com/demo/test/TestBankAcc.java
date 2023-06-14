package com.demo.test;

import com.demo.Thread.Mythread;
import com.demo.beans.BankAccount;

public class TestBankAcc {

	public static void main(String[] args) {
		
		BankAccount b1=new BankAccount(1,"sid",45,"ICICI",4500);
//		BankAccount b2=new BankAccount(2,"sham",45,"ICICI",400);
		
		Mythread mth1=new Mythread(b1);
		Mythread mth2=new Mythread(b1);
		mth1.start();
		mth2.start();
		
		try {
			mth1.join(500);
			mth2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
