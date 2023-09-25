package Collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableInterface {
	public static void main(String[] args) {
		NavigableSet ns = new TreeSet();
		ns.add(1);
		ns.add(3);
		ns.add(8);
		ns.add(9);
		
		System.out.println(ns.tailSet(3, false));
		System.out.println(ns);
		System.out.println(ns.headSet(3, false));
		System.out.println(ns.size());
		
	}

}
