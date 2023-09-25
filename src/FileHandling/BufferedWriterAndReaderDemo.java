package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
//file to write even and odd number in two different file.
public class BufferedWriterAndReaderDemo {
	public static void main(String[] args) throws IOException {
		File f= new File("karthi.txt");
		File f1= new File("odd.txt");
		File f2= new File("newone.txt");
		if(!(f2.exists())) {
			f2.createNewFile();
		}else {
			//System.out.println("file created already");
		}
		
		FileWriter fw= new FileWriter(f2);
		fw.write("karthik J N");
		fw.write("\n");
		fw.write("karthik");
		fw.write("\n");
		fw.write("karthi");
		fw.write("\n");
		fw.close();
		
	
		FileReader fr= new FileReader(f2);
		BufferedReader br= new BufferedReader(fr);
		String FileLine= br.readLine();
		
		while(FileLine!=null) {
			System.out.println(FileLine);
			FileLine=br.readLine();
		}
		
		
		br.close();
		if(!(f.exists())) {
			f.createNewFile();
		}
		if(!(f1.exists())) {
			f1.createNewFile();
		}
		
		PrintWriter prEven= new PrintWriter(f);
		PrintWriter prOdd= new PrintWriter(f1);
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				prEven.println(i);
				
			}else {
				prOdd.println(i);
			}
		}
		prOdd.close();
		prEven.close();
	}
}
