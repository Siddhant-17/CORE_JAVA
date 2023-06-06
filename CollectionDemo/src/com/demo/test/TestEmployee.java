package com.demo.test;

import java.util.List;
import java.util.Scanner;
import com.demo.Service.EmployeeServiceImp;
import com.demo.beans.Employee;
public class TestEmployee {

	public static void main(String[] args) {
		EmployeeServiceImp em = new EmployeeServiceImp(); 
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
		System.out.println("1. Add new Employee\n2. Display all\n3. Disaly by id\n4. Display by name");
		System.out.println("5. sort by sal\n6. sort by name\n7. modify sal\n8. delete by id\n9.exit");
		System.out.println("choice : ");
		choice=sc.nextInt();
		
		switch(choice) {
		
		case 1:
			em.addnewEmployee();
			break;
		case 2:List<Employee> list=em.displayAll();
		//java 5 
		/*for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i)); //get() Returns the element at the specified position in this list.
		}*/
		//java 7
		/*for(Employee ob:list)
		{
			System.out.println(ob);
		}*/
		//java 8
		list.forEach(ob->{System.out.println(ob);});
		break;
		case 3:List<Employee> idlist=em.displayById(1);
			System.out.println(idlist);
			break;
		case 9:
			sc.close();
			System.out.println("Thank you");
			break;
		default :
			System.out.println("Invalid choice");
		}
		}while(choice!=9);
	}
}
