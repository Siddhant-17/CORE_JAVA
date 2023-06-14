package com.demo.Thread;
import com.demo.beans.*;
public class Mythread extends Thread {

	private BankAccount ba;

	
	public Mythread(BankAccount ba) {
		this.ba = ba;
	}
	
	public void run() {
		ba.withdraw();
	}
	
}
