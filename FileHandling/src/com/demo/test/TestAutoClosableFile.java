package com.demo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestAutoClosableFile {

	public static void main(String[] args) {
		try(FileInputStream fis=new FileInputStream("abc.txt");
				FileOutputStream fos=new FileOutputStream("abccopy.txt")){
			 int i=fis.read();
			 while(i!=-1)
			 {
				 fos.write(i);
				 i=fis.read();
			 }
			 
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		catch(IOException ie)
		{
			System.out.println(ie);
		}
	}
}
