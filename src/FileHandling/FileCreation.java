package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileCreation {
	public static void main(String[] args) {
		/*
		 * go to directory copy the actual address and paste here to create file or
		 * directory in different derectory
		 */
		File f = new File("C:\\Users\\006747\\OneDrive - wisseninfotech.com\\Documents\\karthi.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(f.exists());
	}
}
