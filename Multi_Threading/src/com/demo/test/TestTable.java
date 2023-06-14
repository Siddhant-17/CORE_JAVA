package com.demo.test;

import com.demo.beans.*;
import com.demo.thread.MyThread;
public class TestTable {

	public static void main(String[] args) {
		MyClass mc=new MyClass();
		MyClass mc1=new MyClass();
		
		MyThread th1=new MyThread(mc);
		MyThread th2=new MyThread(mc1);
		th1.setName("hello");;
		th2.setName("hi");
		
		th1.start();
		th2.start();
	}
}
