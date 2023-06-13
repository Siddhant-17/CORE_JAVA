package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.bean.Student;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;

public class TestStudent {
	public static void main(String[] args) {

	StudentService St=new StudentServiceImpl();
	int choice=0;
	Scanner sc=new Scanner(System.in);
	
	do {
		System.out.println("1. Add new Employee\n2. Display all\n3. Display by id\n4. Display by name");
		System.out.println("5. sort by sal\n6. sort by name\n7. modify sal\n8. delete by id\n9.exit");
		System.out.println("choice : ");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
				St.addStudent();
				break;
		case 2:
			St.display();
			
			break;
		case 3:
			
		case 4:
			
		case 5:
			
		case 6:
			
		case 7:
			
		default:
		}
		
		}while(choice!=9);

}
}
