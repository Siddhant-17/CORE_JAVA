import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File_Class {

	public static void main(String[] args) throws IOException {
		
		File f=new File("Sid123");
		f.mkdir();
		File f1=new File("Sid123","abc.txt");
		f1.createNewFile();
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite
				());
	
	}
}
