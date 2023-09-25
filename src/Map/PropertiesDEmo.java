package Map;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDEmo {
	public static void main(String[] args) throws IOException{
		
		FileReader reader = new FileReader("src//Map//db.properties");
		
		Properties p = new Properties();
		
		p.load(reader);
		
		System.out.println(p.getProperty("name"));
		
		
		p.setProperty("name", "nari");
		System.out.println(p.getProperty("Name"));
		p.getProperty("name", "karthik");
		System.out.println(p.getProperty("name"));
		System.out.println(".");
		 
		
	}
	

}

