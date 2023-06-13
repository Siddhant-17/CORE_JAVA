package com.demo.dao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import com.demo.bean.Student;

public class StudentdaoImpl implements Studentdao {

	
	private static Queue<Student> que;
	
	static {
		que=new PriorityQueue<>();
	
		
	}

	@Override
	public Object addSt(Student e) {
		File f=new File("Studet.txt");
		if(!f.exists())
			try {
				f.createNewFile();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		
	try(FileOutputStream fos=new FileOutputStream("Studet.txt",true);
			ObjectOutputStream oos=new ObjectOutputStream(fos)){
		oos.writeObject(e);
		
	}
	catch(FileNotFoundException fe)
	{
		System.out.println(fe);
	} catch (IOException e1) {
		
		e1.printStackTrace();
	}
	
	return que.offer(e);
}

	
	@Override
	public void getall() throws IOException {
		System.out.println("in read file");
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("Studet.txt"))){
			while(true)
			{
				Student s=(Student) ois.readObject();
				System.out.println(s);
			}
		} catch (EOFException ef) {
			// TODO Auto-generated catch block
			System.out.println("Exit");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		
	}

	
}
