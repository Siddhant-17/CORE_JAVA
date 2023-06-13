import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataOutputStream_Example {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			FileInputStream fis=new FileInputStream("Sid17.txt");
			DataInputStream dos =new DataInputStream(fis);
		
			System.out.println(dos.readUTF());
			System.out.println(dos.read());
			System.out.println(dos.readBoolean());
			System.out.println(dos.readChar());
			System.out.println(dos.readFloat());
			
		
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}

