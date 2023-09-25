package StreamDemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		
		  List<Integer> list= Arrays.asList(1,2,4,3,5,6,7,9,8,12,10);
		  list.stream().filter(num->num%2==0).sorted().forEach(e->System.out.print(
		  e+" ")); System.out.println();
		  list.stream().filter(num->num%2==0).sorted().map(n->n*2).forEach(e->System.
		  out.print(e+" ")); List<Integer>
		  list1=list.stream().filter(num->num%2==0).sorted().map(n->n*2).collect(
		  Collectors.toList()); System.out.println(list1);
		 

		List<Integer> indexes = Arrays.asList(1, 3,4,5, 9, 15, 21);
		//max value in integer.
		Integer maxvalue=indexes.stream().max((Comparator.naturalOrder())).get();
		System.out.println(maxvalue);

		Map<Integer, Character> alphabetMap = new HashMap<>();
		int i = 0;
		while (i < 26) {
			int c = 97 + i;
			alphabetMap.put(i + 1, (char) c);
			i++;
		}

		// System.out.println(alphabetMap.values());
		// only Vowels

		alphabetMap.entrySet().stream().map(x -> x.getKey()).collect(Collectors.toList()).stream()
				.filter(g -> indexes.contains(g)).filter(DivededByto->DivededByto%2!=0).forEach(key -> System.out.println(alphabetMap.get(key)));

		// forEach(k -> System.out.println(alphabetMap.get(k)));

		// Stream.of(alphabetMap).collect(Collectors.toList()).forEach(x->);;

		// .collect(Collectors.toList())
		// .stream().filter(c->c.equals(1)).forEach(v->System.out.println(v)); //
		// filter(y-> y.equals(1)).count();

		// System.out.println(a);
	}

}
