import java.io.FileWriter;
import java.io.IOException;

public class File_Writer {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("abc.txt",true); //if file not exist create file
													//true so data append every time 
													//otherwise override every time
		fw.write(98);
		fw.write("Siddhant");
		fw.write('\n');
		char ch[]= {'s','f','g','h'};
		fw.write(ch);
		fw.flush(); // home gehu example
		fw.close();
	}
}
