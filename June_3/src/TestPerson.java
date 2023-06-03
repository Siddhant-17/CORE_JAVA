import java.util.Scanner;
public class TestPerson {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("1. ADD \n2. Display \n3. calculateGrade \n4. Exit");
			choice=sc.nextInt();
			
			switch (choice) {
			case 1: 
					System.out.println("1. PHDStudent \n2. MasterStudent \n3. Faculty");
					int no=sc.nextInt();
					PersonService.addNewData(no);
					break;
			case 2:
					PersonService.displayAll();
					break;
			case 3:
					System.out.println("Enter id ");
					int id=sc.nextInt();
					int per=PersonService.findPercentage(id);
					if(per!=-1)
					{
						System.out.println(per);
					}
					else
					{
						System.out.println("not calculate");
					}
			default:
				System.out.println("invalid Choice");
				break;
			}
			
			
			
			
			
		}while(choice!=3);
	}
}
