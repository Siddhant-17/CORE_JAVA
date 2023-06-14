package com.demo.beans;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class MyFileReader {

	public boolean searchData(String fn,String name)
	{
		try(BufferedReader bf=new BufferedReader(new FileReader(fn))){
			String s=null;
			do {
				 s=bf.readLine();
				 try {
					 Thread.sleep(0);
				 }
				 catch(InterruptedException  e)
				 {
					 e.printStackTrace();
				 }
				 if(name.equals(s)) 
				 {
					 return true;}
			}while(s!=null);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
