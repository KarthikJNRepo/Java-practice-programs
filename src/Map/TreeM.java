package Map;

import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

public class TreeM {
	public static void main(String[] args) {
		Map tp = new TreeMap<Integer,String>();	
		tp.put(1,tp);
		tp.put(2, tp);
		System.out.println(tp);
		tp.put(3, "f");
		Object a=tp.get(6);
		System.out.println(a);
	}

}
