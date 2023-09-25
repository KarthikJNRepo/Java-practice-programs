package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileClassDemo {

	public static void main(String[] args) throws IOException {
	 File file = new File("Dirfectory");
	 file.mkdir();
	 
	 File first = new File("Dirfectory","first");
	 first.createNewFile();
	 
	 File second = new File(file,"Second");
	 second.createNewFile();
	 
	System.out.println(file.isDirectory()); 
	System.out.println(first.isFile());
	
	
	String[] files=file.list();
	//printing files in the directory through for-each loop
	for (String fileName : files) {
		System.out.println(fileName);
	}
	
	
	System.out.println(first.length());
	
	System.out.println(first.delete());
	System.out.println(second.delete());
	System.out.println(file.delete());
	
	
	}
	

	
	

}
