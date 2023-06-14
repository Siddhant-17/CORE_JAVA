package com.demo.thread;

import com.demo.beans.FileHandle;

public class FileHandleThread extends Thread{

	
	private FileHandle fh;

	public FileHandleThread(FileHandle fh) {
		super();
		this.fh = fh;
	}
	
	public void run()
	{
		
		if(Thread.currentThread().getName().equals("read"))
		fh.readFile();
		if(Thread.currentThread().getName().equals("write"))
			fh.writeFile();
	}
}
