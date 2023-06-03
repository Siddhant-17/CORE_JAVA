
public class Person {

	private int pid;
	private String pname;
	private String mobile;
	
	public Person()
	{
		this(0,null,null);
	}
	public Person(int pid,String pname,String mobile)
	{
		
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
	public void setPmobile(String mob)
	{
		this.mobile=mob;
	}
	public int getPid()
	{
		return this.pid;
	}
	public String getPname()
	{
		return this.pname;
	}
	public String getMobile()
	{
		return this.mobile;
	}
	
	public String toString()
	{
		return "Pid :"+this.pid+"\nPname :"+this.pname+"\nMobile :"+this.mobile;
		
	}
}
