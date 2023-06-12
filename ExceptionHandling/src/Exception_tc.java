
public class Exception_tc {
public static void main(String[] args) {
	try {
		int a=22/0;
		System.out.println(a);
		
	}
	catch(ArithmeticException ae)
	{
		System.out.println(ae);
	}
	System.out.println("hello");
}
}

