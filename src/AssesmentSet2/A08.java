package AssesmentSet2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A08 {
	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 3, 4, 5, 6, 7 };
		List<Integer> l = new ArrayList<Integer>();
		for (int i : arr1) {
			if (Arrays.binarySearch(arr2, i) < 0) {
				l.add(i);
			}
		}
		l.stream().forEach(x -> System.out.print(x + " "));
	
	}

}
