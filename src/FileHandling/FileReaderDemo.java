package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		File f= new File("karthi.txt");
		FileReader fr = new FileReader("karthi.txt");
		//System.out.println(fr.read());
		
		char[] c=new char[(int) f.length()];
		fr.read(c);
		fr.close();
		
		FileWriter frr= new FileWriter("bala.txt",true);
		for(char ch:c) {
			frr.write(ch);
		}
		frr.close();
	}

}
