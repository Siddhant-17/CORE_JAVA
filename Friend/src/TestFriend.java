

import java.util.Scanner;

public class TestFriend {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do{
		System.out.println("1.ADD\n2.display\n3.serchByCity\n4.serchByName\n5.exit");
		choice=sc.nextInt();
		
		switch (choice) {
		case 1:
			FriendsService.insertData();
			break;
		case 2:
			FriendsService.display();
			break;
		case 4:
			System.out.println("Enter Name");
			String name =sc.next();
			String mob=FriendsService.serchByName(name);
			if(mob!=null)
			{
				System.out.println("mob : "+mob);
			}
			else
				System.out.println("not fount");
			break;

		default:
			break;
		}
		}while(choice!=5);
		

	}

}
