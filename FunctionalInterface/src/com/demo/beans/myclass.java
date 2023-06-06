package com.demo.beans;

import com.demo.interfaces.I1;
import com.demo.interfaces.I2;

public class myclass implements I1,I2 {

	@Override
	public void m21() {
		System.out.println("in method m21 of interface I2");
	}

	@Override
	public void m22() {
		System.out.println("in method m22 of interface I2");
		
	}

	@Override
	public void m1() {
		System.out.println("in method m1 of interface I1");
	}

	@Override
	public void m2() {
		System.out.println("in method m2 of interface I1");
	}

	@Override
	public int methodDefault(int x) {
		System.out.println("inside Class override method from default");
		int ans1= I1.super.methodDefault(x);
		int ans2=I2.super.methodDefault(x);
		return ans1+ans2;
		/* 
		 * here we are overriding default method having same name in I1,I2 i.e methodDefault()
		 * and I1.super.memethodDefault(x) will call method from I1
		 * and I2.super.memethodDefault(x) will call method from I2
		 */
	}

}
