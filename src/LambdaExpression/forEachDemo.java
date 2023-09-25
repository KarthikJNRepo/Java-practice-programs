package LambdaExpression;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class forEachDemo {
	public static void main(String[] args) {
		
		//for collection.
		List< Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		//simple way
		for(Integer i:list)
		{System.out.print(i+" ");}
		System.out.println();
		
		
		//foreach using lamda
		list.forEach(l->System.out.print(l+" "));
		System.out.println();
		
		list.forEach(System.out::print);
		System.out.println();
		
		System.out.println("*************************MAP**********************");
		
		//forEach for Map
		
		Map< Integer, String> map= new HashMap<Integer, String>();
		map.put(1, "karthi");
		map.put(0, null);
		map.put(5, "bala");
		map.put(4, "rani");
		map.forEach((k,v)->System.out.println("key "+k+" value "+v) );
	}
}
