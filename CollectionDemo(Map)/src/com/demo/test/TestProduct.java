package com.demo.test;

import com.demo.servise.ProductService;
import com.demo.beans.Product;
import com.demo.servise.PrductServiceImp;
import java.util.*;
import java.util.Map.Entry;
public class TestProduct {

	public static void main(String[] args) {
		
		ProductService ps=new PrductServiceImp();
		int choice=0;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1. Add Prod\n2. displayall\n3. display By Id\n4. display By Name\n5. Sort by Id\n6. Sort by Name\n7. Modify price\n8. delete Product\n9. exit");
			System.out.println("enter choice");
			choice=sc.nextInt();
			
			switch (choice) {
			case 1:
				ps.addNewProd();
				break;
//			case 2:
//				Map<Integer,Product> map=ps.displayAll();
//				map.forEach(a->{System.out.println(a);});
//				break;
//			case 3:
//				System.out.println("Enter id");
//				int id=sc.nextInt();
//				Product p=ps.serchById(id);
//				if(p!=null)
//				System.out.println(p);
//				else
//					System.out.println("Not found");
//				break;
//			case 4:
//				System.out.println("Enter name");
//				String nm=sc.next();
//				p=ps.serchByName(nm);
//				if(p!=null)
//					System.out.println(p);
//					else
//						System.out.println("Not found");
//					break;
//			case 5:
//				List<Product> plist=ps.sortById();
//				plist.forEach(a->{System.out.println(a);});
//				break;
//			case 6:
//				pset=ps.sortByName();
//				pset.forEach(a->{System.out.println(a);});
//				break;
//			case 7:
//				System.out.println("Enter id");
//				id=sc.nextInt();
//				System.out.println("Enter newPr");
//				double pr=sc.nextDouble();
//				boolean status=ps.modifyprice(id,pr);
//				if(status)
//					System.out.println("updated..");
//				else
//					System.out.println("not found");
//				break;
//			case 8:
//				System.out.println("Enter id");
//				id=sc.nextInt();
//				status=ps.deleteById(id);
//				if(status)
//					System.out.println("Deleted...");
//				else
//					System.out.println("not found");
//				break;
//				
			}
			
		}while(choice!=9);
	}
}
