package com.demo.test;

import com.demo.beans.MyClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TestReflection {
	public static void main(String[] args) {
		MyClass ob=new MyClass(1,"sid");
	
		Class cls=ob.getClass();
		
		Method[] marr=cls.getMethods();
	
		for(Method m:marr) {
			System.out.println(m.getName());
		}
		
		try {
			Constructor ctor=cls.getConstructor();
			System.out.println(ctor);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
