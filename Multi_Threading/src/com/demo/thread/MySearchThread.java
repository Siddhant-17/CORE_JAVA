package com.demo.thread;

import com.demo.beans.MyFileReader;

public class MySearchThread {

	private MyFileReader mf;
	private String str;
	
	public MySearchThread(MyFileReader mf, String str) {
		super();
		this.mf = mf;
		this.str = str;
	}
	
	public void run() {
		boolean status =mf.searchData("test.txt",str);
		if(status)
			System.out.println("found"+str);
		else
			System.out.println("not found"+str);
	}
	
}
