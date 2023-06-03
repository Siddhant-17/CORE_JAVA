
public class Faculty extends Person{

	private String skill;
	private String dept;
	
	
	
	public Faculty(int pid,String pname,String mobile,String skill, String dept) {
		super(pid,pname,mobile);
		this.skill = skill;
		this.dept = dept;
	}

	public void setSkill(String skill) {
		skill = skill;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String getSkill() {
		return skill;
	}
	
	public String toString() {
		return super.toString()+"\n[Skill=" + skill + ", Dept=" + dept + "]";
	}
	
}
