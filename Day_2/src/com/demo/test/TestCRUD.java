package com.demo.test;
import java.util.Scanner;


import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;
import java.util.*;

public class TestCRUD {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		EmployeeService es=new EmployeeServiceImpl();
		do {
		System.out.println("1. add new employee\n2. modify employee\n 3. delete By Id");
		System.out.println("4. display all\n5. display by id \n 6. display in sorted order\n 7. exit\n choice :");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			es.addnewEmployee();
			break;
		case 2:
			
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println("enter sal");
			int sal=sc.nextInt();
			Employee status=es.ModifyById(id,sal);
			if(status != null)
			{
				System.out.println("updated ");
			}
			else
			{
				System.out.println("not found");
			}
			break;
			
		case 3:
			System.out.println("enter id");
			id=sc.nextInt();
			boolean status1=es.deleteById(id);
			if(status1 )
			{
				System.out.println("deleted ");
			}
			else
			{
				System.out.println("not found");
			}
			break;
		case 4:
			List<Employee> lst=es.displayAll();
			lst.forEach(System.out::println);
			System.out.println("***************************");
			break;
			
		case 5:
			System.out.println("enetr id");
			id=sc.nextInt();
			Employee e=es.displayById(id);
			if(e!=null)
				System.out.println(e);
			else {
				System.out.println("not found");
			}
			break;
			
		case 6:
			lst=es.sortBySal();
			lst.forEach(System.out::println);
			
			
		}
		}while(choice!=7);
		
	}

}
		

