package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.bean.Game;
import com.demo.service.GameService;
import com.demo.service.GameServiceImp;

import java.util.Set;

public class TestGame {

	public static void main(String[] args) {
		
		GameService gm=new GameServiceImp();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do
		{
			System.out.println("1. Add game\n2. displayall\n3. display By Id\n4. display By Name\n5. Sort by Name\n7. Modify level\n8. delete Product\n9. exit");
			System.out.println("enter choice");
			choice=sc.nextInt();
			switch (choice) {
			case 1:
				gm.addnewGame();
				break;
			case 2:
				Set<Game> gset=gm.displayAll();
				gset.forEach(a->{System.out.println(a);});
				break;
			case 3:
				System.out.println("Enter id");
				int id=sc.nextInt();
				Game g=gm.serchById(id);
				if(g!=null)
				System.out.println(g);
				else
					System.out.println("Not found");
				break;
			case 4: 
				System.out.println("Enter name");
				String nm=sc.next();
				g=gm.serchByName(nm);
				if(g!=null)
					System.out.println(g);
					else
						System.out.println("Not found");
					break;
			case 5:
				Set<Game> glist=gm.sortByName();
				glist.forEach(a->{System.out.println(a);});
				break;
			case 7:
				System.out.println("Enter id");
				id=sc.nextInt();
				System.out.println("Enter level");
				int pr=sc.nextInt();
				boolean status=gm.modifylevel(id,pr);
				if(status)
					System.out.println("updated..");
				else
					System.out.println("not found");
				break;
			case 8:
				System.out.println("Enter id");
				id=sc.nextInt();
				status=gm.deleteById(id);
				if(status)
					System.out.println("deleted..");
				else
					System.out.println("not found");
				break;
				
				
			default:
				break;
			}
		}while(choice!=9);
	}
}
