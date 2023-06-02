
public class TestExam {

	public static void main(String[] args) {
		
		
	String [] op= {"aa","bb","cc","dd"};
	
	Question q1 =new Question(1,"xxxx",op,"aa",2);
	Question q2 =new Question(2,"yyyy",op,"bb",2);
	Question q3 =new Question(1,"zzzz",op,"cc",2);
	Question q4 =new Question(1,"aaaa",op,"aa",2);
		
	Question Que[]={q1,q2,q3,q4};
		Exam e1=new Exam(1,"ccat",2,Que);
		System.out.println(e1);
	}
}
