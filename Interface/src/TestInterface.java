
public class TestInterface {

	public static void main(String[] args) {
		DemoInterface D1=new DemoInterface();
		D1.m1();  //inherited from I1 and define body in DemoInterface class
		D1.m3(); // Default method in interface inherited from I1 and define body in INterface I1
//		D1.m2(); //error // Static method from I1 not inherited in Demo Class
		System.out.println(D1.A);
		I1.m2();   //static method directly call on interface bcaus static method can't inherited into class 
	}
}
