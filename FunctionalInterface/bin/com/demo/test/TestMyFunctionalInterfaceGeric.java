package com.demo.test;
import com.demo.interfaces.*;

public class TestMyFunctionalInterfaceGeric {

	public static void main(String[] args) {
		
		MyFunctionalInterfaceGeneric<String> Stringface=(x,y)->{
			return x.length()>y.length()?x:y;
		};
		/*
		 * here we creating reference of MyFunctionalInterfaceGeneric interface 
		 * and by using lambda function definition of add functions 
		 */
		
		String s = Stringface.add("hello","welcome"); //on reference we call add function from interface
		System.out.println(s);
		
		MyFunctionalInterfaceGeneric<Integer> Intface=(x,y)->{
			return x>y?x:y;
		};
		int a=Intface.add(4,5);
		System.out.println(a);

	}

}
