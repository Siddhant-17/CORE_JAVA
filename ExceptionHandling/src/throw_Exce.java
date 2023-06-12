
public class throw_Exce {

	public static void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Person age is not eligible to vote");
		}
		else {
			System.out.println("Person is eligible to vote");
		}
	}
	
	public static void main(String[] args) {
	
		
		validate(17);
		System.out.println("hello");
		
		System.out.println("rest of the code");
	}
}
