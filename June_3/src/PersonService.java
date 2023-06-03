import java.util.Scanner;
public class PersonService {

	private static Person [] perarr;
	private static int cnt;
	static
	{
		perarr=new Person[10];
		cnt=0;
	}
	
	public static void addNewData(int no) {
//	for Add new Data	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Person ID");
		int pid=sc.nextInt();
		System.out.println("Enter Person Name");
		String pname=sc.next();
		System.out.println("Enter Person Mobile");
		String mobile=sc.next();
		
		if(no<3)
		{
//			if no is less than 3 then the student data is common for PHDstudent and MasterStudent Object
			System.out.println("Enter M1 marks");
			int m1=sc.nextInt();
			System.out.println("Enter M2 marks");
			int m2=sc.nextInt();
			System.out.println("Enter M3 marks");
			int m3=sc.nextInt();
		
			if(no==1)
			{
//				if no==1 then PHDStudent Object is Created
				System.out.println("Enter Sp_sub_mks");
				int sp_sub_mks=sc.nextInt();
				System.out.println("Enter thesis name");
				String thesis=sc.next();
				perarr[cnt++]=new PHDStudent(pid,pname,mobile,m1,m2,m3,sp_sub_mks,thesis);
			}
			if(no==2)
			{
//				if no==2 then MasterStudent Object is Created
				System.out.println("Enter M4 marks");
				int m4=sc.nextInt();
				System.out.println("Enter M5 marks");
				int m5=sc.nextInt();
				System.out.println("Enter Sp_Course_Mks");
				int sp_Course_Mks=sc.nextInt();
				perarr[cnt++]=new MasterStudent(pid,pname,mobile,m1,m2,m3,m4,m5,sp_Course_Mks);
				
			}
		}
		if(no==3)
		{
			System.out.println("Enter Skill");
			String skill=sc.next();
			System.out.println("Enter department");
			String dept=sc.next();
			perarr[cnt++]=new Faculty(pid,pname,mobile,skill,dept);
		}
	}
	
	
	public static void displayAll()
	{
		for(int i=0;i<cnt;i++)
		{
			System.out.println(perarr[i]);
		}
	}


	public static int findPercentage(int id) {
		
		Student ob=serchById(id);
		if(ob!=null)
		{
			return ob.calculateGrade();
		}
		return -1;
		
	}
	
	private static Student serchById(int id)
	{
		for(int i=0;i<cnt;i++)
		{
			if(perarr[i].getPid()==id)
				if(perarr[i] instanceof Student)
					return (Student)perarr[i];
		}
		
		
		
		return null;
		
	}
}