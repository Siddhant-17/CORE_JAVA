
public class MasterStudent extends Student{

	private int m4,m5;
	private int sp_Course_Mks;
	
	public MasterStudent(int pid,String pname,String mobile,int m1,int m2,int m3,int m4, int m5, int sp_Course_Mks) {
		super(pid,pname,mobile,m1,m2,m3);
		this.m4 = m4;
		this.m5 = m5;
		this.sp_Course_Mks = sp_Course_Mks;
	}

	public int getM4() {
		return m4;
	}

	public void setM4(int m4) {
		this.m4 = m4;
	}

	public int getM5() {
		return m5;
	}

	public void setM5(int m5) {
		this.m5 = m5;
	}
	public int getSp_Course_Mks() {
		return sp_Course_Mks;
	}
	public void setSp_Course_Mks(int sp_Course_Mks) {
		this.sp_Course_Mks = sp_Course_Mks;
	}
	
	public String toString() {
		return super.toString()+"\n[m4=" + m4 + ", m5=" + m5 +"] " + "\nsp_Course_Mks=" + sp_Course_Mks;
	}

	
	public int calculateGrade() {
		int per=((this.getM1()+this.getM2()+m3+m4+m5+sp_Course_Mks)/6);
		return per;
	}
	
	
}
