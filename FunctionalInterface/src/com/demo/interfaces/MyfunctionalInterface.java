package com.demo.interfaces;

@FunctionalInterface
public interface MyfunctionalInterface {

	/*
	 * FunctionalInterface is interface having only one Abstract method
	 * not considering default and static methods
	 */
	
	void m1();
//	void m2();  if add another abstract method then it will give error
//	Invalid '@FunctionalInterface' annotation; MyfunctionalInterface is not a functional interface



//but we can add no of static and default methods in functional interface
	
	public static void m11()
	{
		System.out.println("inside static method m11");
	}
	public static void m22()
	{
		System.out.println("inside static method m22");
	}
	public static void m33()
	{
		System.out.println("inside static method m33");
	}
	default void m12()
	{
		System.out.println("inside default method m12");
	}



}
