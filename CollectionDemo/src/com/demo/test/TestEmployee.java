package com.demo.test;

import java.util.List;
import java.util.Scanner;
import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmpolyeeServiceImp;
import com.demo.beans.Employee;


public class TestEmployee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService em= new EmpolyeeServiceImp();
		int choice=0;
		do {
		System.out.println("1. Add new Employee\n2. Display all\n3. Display by id\n4. Display by name");
		System.out.println("5. sort by sal\n6. sort by name\n7. modify sal\n8. delete by id\n9.exit");
		System.out.println("choice : ");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			em.addEmployee();
			break;
		case 2:
			List<Employee> list=em.displayAll();
			for(int i=0;i<list.size();i++)
			{
				System.out.println(list.get(i));
			}
			break;
		case 3:
			System.out.println("enter id");
			int id=sc.nextInt();
			Employee e=em.searchById(id);
			if(e!=null)
				System.out.println(e);
			else {
				System.out.println("not found");
			}
			break;
		case 4:
			System.out.println("Enter name");
			String nm=sc.next();
			List<Employee> elist=em.searchByName(nm);
			if(elist!=null)
			{
				elist.forEach(a->{System.out.println(a);});
			}
			break;
		case 5:
			List<Employee> sallist=em.sortBySal();
			sallist.forEach(a->{System.out.println(a);});
			break;
		case 7:
			System.out.println("Enter id");
			id=sc.nextInt();
			System.out.println("Enter salary");
			double sal=sc.nextDouble();
			boolean status=em.modifySal(id,sal);
			if(status)
			System.out.println("salary updated...");
			else
				System.out.println("not found");
			break;
		case 8:
			System.out.println("Enter id");
			id=sc.nextInt();
			status =em.deleteById(id);
			if(status)
				System.out.println("Deleted..");
				else
					System.out.println("not found");
				break;
		}
			
		}while(choice!=9);
		
		

	}

}