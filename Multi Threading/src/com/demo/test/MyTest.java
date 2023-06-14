package com.demo.test;
import com.demo.beans.*;
import com.demo.thread.*;


public class MyTest {
public static void main(String[] args) {
	
	MyClass mc=new MyClass();
	MyClass mc1=new MyClass();
	
	MyThread th1=new MyThread(mc,5);
	MyThread th2=new MyThread(mc1,8);
//	mc.printTable(th1,5);
//	mc.printTable(t,7);
	th1.start();
	th2.start();
	try {
		th1.join(500);
		th2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("end main");
	System.out.println("XXX");
}
}
