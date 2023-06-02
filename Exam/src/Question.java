import java.util.Arrays;

public class Question {

	private int qno;
	private String que;
	private String [] option;
	private String ans;
	private int marks;
	
	
	public Question()
	{
		this(0,null,null,null,0);
	}
	public Question(int qno,String que,String [] op,String ans,int marks)
	{
		this.qno=qno;
		this.que=que;
		this.option=op;
		this.ans=ans;
		this.marks=marks;
	}
	public int getQno() {
		return qno;
	}
	public void setQno(int qno) {
		this.qno = qno;
	}
	public String getQue() {
		return que;
	}
	public void setQue(String que) {
		this.que = que;
	}
	public String[] getOption() {
		return option;
	}
	public void setOption(String[] option) {
		this.option = option;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String toString() {
		String str="";
		for(int i=0;i<option.length;i++)
		{
			str+=(i+1)+"."+option[i]+"\n";
		}
		return "\nqno=" + qno + "\nque=" + que + "\noption=" + str +"marks=" + marks+"\n" ;
	}
	
}
