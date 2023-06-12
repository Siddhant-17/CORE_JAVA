import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput_Stream {

	public static void main(String[] args) throws IOException {
		File f=new File("Sid17.txt");  //representing the file not creating file
		if(!f.exists()) {
			f.createNewFile();
		}
		
		//Writing the text into the above created file using FileOutputstream
		
		FileOutputStream fos=new FileOutputStream("Sid17.txt");
		String textTobeWritten="My name is siddhant Sid_17";
		fos.write(textTobeWritten.getBytes());
		fos.flush();
		fos.close();
	}
}
