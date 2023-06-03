
public abstract class Student extends Person {

	private int m1,m2;
	protected int m3;  // to give access for child class we make this variable protected // parents Student to Child MasterStudent 
	
	public Student()
	{
		System.out.println("in the defualt ctor of Student");
	}
	
	public Student(int pid,String pname,String mobile,int m1,int m2,int m3)
	{
		super(pid,pname,mobile);
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}

	public int getM1() {
		return m1;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public int getM3() {
		return m3;
	}

	public void setM3(int m3) {
		this.m3 = m3;
	}

	public abstract  int calculateGrade();
	public String toString() {
		return super.toString()+"\n[ m1=" + m1 + ",m2=" + m2 + ", m3=" + m3 +"]";
	}


}
