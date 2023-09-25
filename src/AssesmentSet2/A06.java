package AssesmentSet2;

import java.util.Arrays;
import java.util.Comparator;

public class A06 {
	public static void main(String[] args) {
		Integer[] array = { 1, 4, 3, 2, 6, 7, 8, 4, 5};
		Arrays.sort(array, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				if (o1 % 2 == 0 && o2 % 2 == 1) {
					return -1;
				}
				if (o1 % 2 == 1 && o2 % 2 == 0) {
					return 1;
				}
				return o1.compareTo(o2);
				
			}
		});
		Arrays.stream(array).forEach(x -> System.out.print(x + " "));
	}
}
