
public class Exam {
	private int eno;
	private String ename;
	private int duration;
	private Question [] ques;
	
	
	public Exam()
	{
		this(0,null,0,null);
	}
	public Exam(int eno, String ename, int duration, Question[] ques) {
	
		this.eno = eno;
		this.ename = ename;
		this.duration = duration;
		this.ques = ques;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Question[] getQues() {
		return ques;
	}
	public void setQues(Question[] ques) {
		this.ques = ques;
	}
	
	public String toString()
	{
		String str="";
				for(Question q:this.ques)
				{
					str+=q.toString();
				}
		return "Eno :"+this.eno+"\nename :"+this.ename+"\nduration :"+this.duration+"\nque:"
				+str;
		
		
	}

}
