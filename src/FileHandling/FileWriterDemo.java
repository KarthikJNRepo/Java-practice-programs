package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		//creates a file with name karthi.txt./
		FileWriter fw= new FileWriter("karthi.txt",false);
	
		fw.write(87675);
		fw.write("\n");
		fw.write("karthi");
		fw.write("\n");
		char[] c= {'a','g','s'};
		fw.write(c);
		fw.close();
		System.out.println("噻");
	
	}

}
