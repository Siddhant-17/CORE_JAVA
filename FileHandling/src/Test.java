
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Test {

	public static void main(String[] args) {
		try {
			FileReader fis=new FileReader("suuu.txt");
			int i=fis.read();
			String str="";
//			while(i!=-1)
//			{
				while(i!=10) {
//				System.out.print((char)i);
				str+=(char)i;
				System.out.println(str);
				i=fis.read();
				
				}	
				System.out.println(str);
				if(str.equals("joy"
						+ "")) {
					System.out.println("true");
			
				}
				else
					System.out.println("not");
				i=fis.read();
//			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
