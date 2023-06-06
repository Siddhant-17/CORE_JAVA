package com.demo.interfaces;

public interface I2 {

	void m21();
	void m22();

	default int methodDefault(int x)
	{
		System.out.println("inside default method of I2");
		return x;
	}
}