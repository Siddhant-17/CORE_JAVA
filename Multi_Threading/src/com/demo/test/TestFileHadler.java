package com.demo.test;

import java.io.IOException;
import com.demo.beans.*;
import com.demo.thread.FileHandleThread;
public class TestFileHadler {

	public static void main(String[] args) {
		FileHandle f=new FileHandle();
		FileHandle f2=new FileHandle();
		
		FileHandleThread th1=new FileHandleThread(f);
		FileHandleThread th2=new FileHandleThread(f2);
		
		th1.setName("read");
		th2.setName("write");
		
		th1.start();
		th2.start();
		
}
}