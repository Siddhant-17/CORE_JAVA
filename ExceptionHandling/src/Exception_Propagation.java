import java.io.IOException;

public class Exception_Propagation {

	public void m() {
		int data=50/0;
//		throw new IOException();   By default, Checked Exceptions are not forwarded in calling chain (propagated).
	}
	public void n()
	{
		m();
	}
	
	public void p()
	{
		try {
		n();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmatic Exce"+ae);
		}
	}
	
	public static void main(String[] args) {
	
		Exception_Propagation ep=new Exception_Propagation();
		ep.p();
		System.out.println("normal flow...");
	}
}
