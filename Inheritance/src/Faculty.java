
public class Faculty extends Person{

	private String subject;
	private float salary;
	
	public Faculty()
	{
		
		System.out.println(" default ctor of Faculty");
	}
	
	public Faculty(int pid,String pname,String mob,String sub,float salary)
	{
//		to call Parent parameterized constructor
		super(pid,pname,mob);
		System.out.println("parameterized ctor of Faculty");
		this.subject=sub;
		this.salary=salary;
		
	}
	public String toString()
	{
		return super.toString()+"\nSubject : "+this.subject+"\nSalary : "+this.salary;
	}
}
