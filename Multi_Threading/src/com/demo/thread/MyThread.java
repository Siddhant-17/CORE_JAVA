package com.demo.thread;

import com.demo.beans.MyClass;

public class MyThread extends Thread {

	private MyClass mc;

	public MyThread(MyClass mc) {
		super();
		this.mc = mc;
	}
	
	public void run()
	{
		mc.printtable();
	}
}
