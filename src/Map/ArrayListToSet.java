package Map;

import java.util.HashSet;
import java.util.Set;

public class ArrayListToSet {
	public static void main(String[] args) {
		Set s=new HashSet<>();
		for(int i=0;i<1000;i++) {
			s.add(i);
		}
		System.out.println(s);
		
	}
}
