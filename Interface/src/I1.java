
public interface I1{

//	by defualt all variables in inteface are public,static,final
	
	int val=34;
	/*
	private int D=89; 
	protected int G=90;
	variables in interface public are only
	*/
//	val=55;    error val is final
	
	public void m1();
	/*
	 * interface method does not have body
	 *  by defualt interface methods public and abstract 
	 *  
	 */
	
	default void m3()
	{
		System.out.println("inside default method in I1");
	}
	public  static void m2() {
		System.out.println("inside static method of interface I1");
	}
	
	
	
}
