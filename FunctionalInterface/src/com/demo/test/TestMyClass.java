package com.demo.test;

import com.demo.beans.myclass;
import com.demo.interfaces.*;


public class TestMyClass {
	
	public static void main(String[] args) {
		myclass m1=new myclass();
		
//		m1.m21();
//		m1.m22();
//		m1.m1();
//		m1.m2();
//		m1.methodDefault(8);
		System.out.println(m1.methodDefault(7));
		
		
		I1 ob=new myclass();   //creating object of myclass reference to interface ob
//		ob.m1();
//	((myclass)ob).methodDefault(5);
//		I1.methodstatic();
//		ob.methodDefault(5);
//		System.out.println(I1.i1); // variable inside interface I1 public,static,final by default;
//		I1.i1=45; //error
		
	
	} 
}
