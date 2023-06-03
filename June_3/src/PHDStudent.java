
public class PHDStudent extends Student {

	private int sp_Sub_Mks;
	private String thesis;
	
	
	public PHDStudent() {
		
	}

	public PHDStudent(int pid,String pname,String mobile,int m1,int m2,int m3,int sp_Sub_Mks, String thesis) {
		super(pid,pname,mobile,m1,m2,m3);
		this.sp_Sub_Mks = sp_Sub_Mks;
		this.thesis = thesis;
	}

	public int getSp_Sub_Mks() {
		return sp_Sub_Mks;
	}

	public void setSp_Sub_Mks(int sp_Sub_Mks) {
		this.sp_Sub_Mks = sp_Sub_Mks;
	}

	public String getThesis() {
		return thesis;
	}

	public void setThesis(String thesis) {
		this.thesis = thesis;
	}

	
	public String toString() {
		return super.toString()+"sp_Sub_Mks=" + this.sp_Sub_Mks + ", thesis=" + this.thesis ;
	}

	@Override
	public int calculateGrade() {
		int per=(this.getM1()+this.getM2()+this.getM3()+this.getSp_Sub_Mks())/4;
		return per;
	}
	
	
	
	
	
}
