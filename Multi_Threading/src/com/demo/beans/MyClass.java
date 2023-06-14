package com.demo.beans;

public class MyClass {

	public void printtable() {
		
		
		for(int i=1;i<=10;i++)
		{
			if((Thread.currentThread().getName()).equals("hello"))
			{
				
				if(i%2==0) {
					System.out.println("inside thread 1 hello");
				System.out.println(i);
				}
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			else if((Thread.currentThread().getName()).equals("hi"))
			{
				
				if(i%2!=0) {
					System.out.println("Inside thread 2 hi");
				System.out.println(i);
				}
				
			}
			
			
		}
	}
}
