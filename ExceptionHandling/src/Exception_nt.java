
public class Exception_nt {

	public static void main(String[] args) {
		//outer try block
		try
		{
			//inner try block1
			try {
				System.out.println("going to divide by 0");
				int a=34/0;
			}
			catch(ArithmeticException ae)
			{
				System.out.println(ae);
			}
			
			//inner try block2
			try {
				int arr[]=new int[5];
				arr[5]=34;
			}
			catch(ArrayIndexOutOfBoundsException ao) {
				System.out.println(ao);
			}
			
			
			System.out.println("other statement");
		}
		catch(Exception e)
		{
			System.out.println("handled the exception (outer catch)");  
		}
		 System.out.println("normal flow..");    
	}
}	
