import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutputStreamExample {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos=new FileOutputStream("Sid17.txt");
		BufferedOutputStream bout=new BufferedOutputStream(fos); //ctor outputStream out
		
		String s="Welcome to Sid_17";
		byte b[]=s.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fos.close();
		System.out.println("success");
		
	}
}
