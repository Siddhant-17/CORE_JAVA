package com.demo.beans;

public class MyClass {

	public void printTable(int num) {
	for(int i=1;i<=10;i++) {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(num+"*"+i+"="+num*i);
	}
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
