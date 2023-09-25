package Generics;

import java.util.ArrayList;

class GMethod {

	void show(ArrayList<? extends Number> l) {
		l.add(null);
		System.out.println(l);
	}

	public void display(ArrayList<Integer> l) {
		l.add(3);
		System.out.println(l + "  .");
	}

	public void see(ArrayList<? super Integer> l) {
		l.add(3);
		System.out.println(l + "  .");
	}
}
