import java.io.File;
import java.io.FileNotFoundException;

//checked Exception
public class throws_checked_excep extends Exception {

		public static void file_() throws  FileNotFoundException
	{
		File f= new File("abc.txt");
		if(f.exists())
		{
			throw new FileNotFoundException("file not fond exception");
		}
	}

	public static void main(String[] args) {
		
		try {
			file_();
			System.out.println("after function call in try block");
		}
		catch(FileNotFoundException fn)
		{
			System.out.println("inside catch block file_no_found");
			fn.printStackTrace();
		}
	}
}
