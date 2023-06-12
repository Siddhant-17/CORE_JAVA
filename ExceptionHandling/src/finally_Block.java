
public class finally_Block {

	public static void main(String[] args) {
		try {
			int a=23/0;
			System.out.println(a);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		finally
		{
			System.out.println("Finally block always executed");
		}
		System.out.println("rest of the code");
	}
}
