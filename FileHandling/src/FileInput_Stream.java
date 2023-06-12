import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInput_Stream {

	public static void main(String[] args) throws IOException {
	
		File f=new File("Sid17.txt");  //representing the file not creating file
		if(!f.exists()) {
			f.createNewFile();
		}
		
		//Reading the text from the file using fileInputstream
		
		FileInputStream  fis =new FileInputStream("Sid17.txt");
		
//		System.out.println(fis.read());  //read method return integer 
//		System.out.println((char)fis.read()); //char 
		
		int i=fis.read();
		while(!(i==-1))
		{
			
			System.out.print((char)i);
			i=fis.read();
		}
}
}
