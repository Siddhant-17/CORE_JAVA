package com.demo.thread;

import com.demo.beans.MyClass;

public class MyThread extends Thread{
	
	private MyClass mc;
	private int n;
	
	
	public MyThread(MyClass mc, int n) {
		this.mc = mc;
		this.n = n;
	}
	
	public void run(){
		mc.printTable(n);
	}
	
		

	
}
