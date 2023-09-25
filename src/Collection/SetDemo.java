package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		HashSet s = new HashSet();
		
		s.add(5);
		s.add(4);
		s.add(332);
		s.add(32);
		s.add(3);
		//System.out.println(s);
		
		
		LinkedHashSet lhs = new LinkedHashSet<>();
		lhs.add(2);
		lhs.add("karthi");
		lhs.add("naveen");
		lhs.add("rama");
		lhs.add("ravi");
		lhs.add(8);
		//System.out.println(lhs);
		
		
		SortedSet ss = new TreeSet<>(); //won't allow duplicate.
		ss.add(9);
		ss.add(34);
		ss.add(32);
		ss.add(3);
		ss.add(5);
		ss.add(1);
		
		//System.out.println(ss.comparator()); 
		System.out.println(ss.headSet(32)); //return before elements except given element.
		System.out.println(ss.tailSet(9));  //return after elements include that element.
		System.out.println(ss.subSet(1, 32)); //return exclude last, include first given element.
		
		System.out.println(ss);
		
	}

}
