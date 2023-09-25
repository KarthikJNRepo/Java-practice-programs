package LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	static int i=8;

	public static void main(String[] args) {
		
		Consumer< Integer> display=a->System.out.println(a);
		display.accept(6);
		
		List<Integer> l=Arrays.asList(1,3,4);
		
		Consumer<List<Integer>> doubleTheList=list->{
			for(int i=0;i<list.size();i++) {
				list.set(i, list.get(i)*2);
			}
		};
		doubleTheList.accept(l);
		System.out.println(l);
		
		//:: reference variable by using we can call that properties 
		Consumer<Integer> add= ConsumerDemo::disply;
		add.accept(8);
		
		/*
		 * Runnable r=ConsumerDemo::disply; r.run();
		 */
		
	}
	 static void disply(int n) {
		System.out.println(8*8);
		
		
		//ForEach example.
		/*
		 * List<Integer> l= Arrays.asList(1,3,4,67,8,6);
		 * l.forEach(name->System.out.print(name));
		 */
	}
}
