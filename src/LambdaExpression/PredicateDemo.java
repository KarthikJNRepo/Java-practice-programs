package LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {

		List<String> l = new ArrayList<String>(Arrays.asList("india", "america", "indonesia", "china", "agumbe"));
		Predicate<String> start=name->name.endsWith("a");
		Predicate<String> end=name->name.endsWith("a");
		l.forEach((country)-> {if(start.or(end).test(country)) {System.out.println(country);}});

		
		
		Predicate<Integer> greaterThan = x -> x > 10;
		Predicate<Integer> lesserThan = x -> x < 20;
		System.out.println(greaterThan.and(lesserThan).negate().test(26));

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		eval(list, t -> t % 2 == 0);
	}

	private static void eval(List<Integer> list, Predicate<Integer> predicate) {
		for (Integer i : list) {
			if (predicate.test(i)) {
				// System.out.println(i);
			}
		}
	}
}
