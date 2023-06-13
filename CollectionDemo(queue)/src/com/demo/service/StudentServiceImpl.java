package com.demo.service;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.demo.bean.Student;
import com.demo.dao.Studentdao;
import com.demo.dao.StudentdaoImpl;

public class StudentServiceImpl implements StudentService{

	
	
	Studentdao sdao=new StudentdaoImpl();
	
	@Override
	public void addStudent() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emp id");
		int id=sc.nextInt();
		System.out.println("Enter emp name");
		String nm=sc.next();
		System.out.println("Enter emp sal");
		double sal=sc.nextDouble();
		
		Student e=new Student(id,nm,sal);
		sdao.addSt(e);
		
	}

	@Override
	public void display() {
		try {
			sdao.getall();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
