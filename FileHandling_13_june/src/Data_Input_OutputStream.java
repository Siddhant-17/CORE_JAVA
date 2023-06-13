import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Data_Input_OutputStream {

	
	public static void main(String[] args) {
		
		File f=new File("Sid17.txt");
		try {
			if(!f.exists())
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
			DataOutputStream dos=null;
			try {
				dos = new DataOutputStream(new FileOutputStream("Sid17.txt"));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			String str="my name is siddhant";
			try {
				dos.writeUTF(str);
				dos.write(12);
				dos.writeBoolean(true);
				dos.writeChar('d');
				dos.writeFloat(1.5f);
				
			} catch (IOException e) {
				e.printStackTrace();
			}		
	}
}
