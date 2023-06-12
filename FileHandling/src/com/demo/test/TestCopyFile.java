package com.demo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopyFile {

	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
				try {
					//open the file
					fis=new FileInputStream("Sid17.txt");
					//it will create a new file if not exists
					//it will create a new file if not exists
					fos=new FileOutputStream("Sid17copy.txt",true);
					//reading
					int i=fis.read();
					while(i!=-1)
					{
						fos.write(i);
						i=fis.read();
					}
				
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}catch (IOException e)
				{
					e.printStackTrace();
				}
				finally {
						
						try {
							fis.close();
							fos.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}
	}
}
