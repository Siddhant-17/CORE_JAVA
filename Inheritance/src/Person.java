
public class Person {

	private int pid;
	private String pname;
	private String mobile;
	
	
//	default ctor of Person 
	public Person()
	{
		this(0,null,null);
		System.out.println("enter into default ctor of person");
	}
//	parameterized ctor of Person
	public Person(int pid,String pname,String mobile)
	{
		System.out.println("parameterized ctor of Person");
		this.pid=pid;
		this.pname=pname;
		this.mobile=mobile;
		
	}
	public void setPid(int pid)
	{
		this.pid=pid;
	}
	public void setPname(String pname)
	{
		this.pname=pname;
	}
	public void setMobile(String Mobile)
	{
		this.mobile=mobile;
	}
	public int getPid()
	{
		return this.pid;
	}
	public String getPname()
	{
		return this.pname;
	}
	public String getmobile()
	{
		return this.mobile;
	}
	
	public int m1()
	{
		return 30;
	}
	
//	toString method of Person
	public String toString()
	{
		return "Pid : "+this.pid+"\nPname : "+this.pname+"\nPmobile : "+this.mobile;
	}
}
