package Generics;

import java.util.ArrayList;


public class GenericsMethod {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(2);
		al.add(3);
		al.add(33);
		
		GMethod g = new GMethod();
		//g.show(al);
		//g.display(al);
		g.see(al);
	}

}
