package com.demo.interfaces;

public interface I1 {

	int i1=23;

	public void m1();
	void m2();
	
	
	public static void methodstatic()
	{
		System.out.println("inside static method of I1");
	}
	
	default int methodDefault(int x)
	{
		System.out.println("inside default method of I1");
		return x;
	}
}
