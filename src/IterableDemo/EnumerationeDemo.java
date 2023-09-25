package IterableDemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationeDemo {
	public static void main(String[] args) {
		Vector v = new Vector<>();
		v.add(1);
		v.add(4);
		v.add(6);
		v.add(2);
		
		Enumeration e = v.elements();
		
		while (e.hasMoreElements()) {
			Object object = (Object) e.nextElement();
			
			System.out.println(object);
			
		}
		
		}

}
