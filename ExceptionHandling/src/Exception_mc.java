
public class Exception_mc {

	public static void main(String[] args) {
		
		try {
			int arr[]=new int[5];
			arr[10]=30/0;
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		catch(ArrayIndexOutOfBoundsException ao)
		{
			System.out.println(ao);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("outside catch block");
	}
}
