package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class serialize implements Serializable{
	 transient final int n=10;
	int m=20;
	
}

public class SerializableDEmo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		serialize s= new serialize();
		FileOutputStream fos= new FileOutputStream("bala.txt");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(s);
		
		FileInputStream fis= new FileInputStream("bala.txt");
		ObjectInputStream ois= new ObjectInputStream(fis);
		serialize s1= (serialize) ois.readObject();
		
		System.out.println(s1.n+"  -------  "+s1.m);
		System.out.println("direct ->"+  s.n);
		System.out.println(s1);
	}
	
}
