package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImp;
import com.demo.beans.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService es=new EmployeeServiceImp();
		int choice=0;
	
		do {
			System.out.println("1. Add new Employee\n2. Display all\n3. Display by id\n4. Display by name");
			System.out.println("5. sort by sal\n6. sort by name\n7. modify sal\n8. delete by id\n9.exit");
			System.out.println("choice : ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				es.addNewEmp();
				break;
			case 2:
				List<Employee> elist=es.displayAll();
//				for(int i=0;i<elist.size();i++)
//				{
//					System.out.println(elist.get(i));
//				}
				elist.forEach(a->{System.out.println(a);});
				break;
			case 3:
				System.out.println("Enter id");
				int id=sc.nextInt();
				Employee e=es.serchById(id);
				if(e!=null)
					System.out.println(e);
				else
					System.out.println("not found");
				break;
			case 4:
				System.out.println("Enter name");
				String nm=sc.next();
				List<Employee> namelist=es.searchByName(nm);
				if(namelist!=null)
				{
				namelist.forEach(a->{System.out.println(a);});
				}
				else 
					System.out.println("not found");
				break;
			case 5:
				elist=es.sortBySal();
				elist.forEach(a->{System.out.println(a);});
				break;
			case 6:
				elist=es.sorByName();
				elist.forEach(a->{System.out.println(a);});
				break;
			case 7:
				System.out.println("Enter id");
				id=sc.nextInt();
				System.out.println("Enter newSal");
				double newsal=sc.nextDouble();
				boolean status = es.modifysal(id,newsal);
				if(status)
					System.out.println("updated ...");
				else
					System.out.println("not found");
				break;
			case 8:
				System.out.println("Enter id");
				id=sc.nextInt();
				status = es.deleteById(id);
				if(status)
					System.out.println("deleted ...");
				else
					System.out.println("not found");
				break;
			case 9:
				sc.close();
				System.out.println("Thank you");
				break;
			default:
			}
			
			}while(choice!=9);
	
		}
	
}
