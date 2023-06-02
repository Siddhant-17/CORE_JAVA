import java.util.Arrays;

public class Student extends Person {

	private int m1,m2,m3;
	private Person [] prr;
	
//	default ctor of Student 
	public Student()
	{
		System.out.println(" default ctor of Student");
	}
	
//	parameterised ctor of Student
	public Student(int pid,String pname,String mobile,int m1,int m2,int m3)
	{
//		to call Parent parameterized constructor
		super(pid,pname,mobile);
		System.out.println("parameterized ctor of Student");
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	
	
//	protected int  m1()
//	{
//	// fuction overiding
//		// but if parents class m1() is public and child class m1() protected  then error
		// parents m1() is protected and child m1() public possible
		// public public possible
//		return 20;
//	}
	
//	to string method of Student
	public String toString() {
		return super.toString()+"\nStudent [m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + "]";
	}
	
}
