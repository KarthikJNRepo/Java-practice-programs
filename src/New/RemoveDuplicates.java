package New;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String[] names = { "naveen", "giri", "go", "naveen", " ", " " };
		int n = names.length;
		removeDuplicate(names, n);

		// Best Solution using stream.
		/*
		 * int[] numbers = {1, 2, 3, 3, 4, 4, 5, 5};
		 * 
		 * // Remove duplicates using the Java Stream API int[] uniqueNumbers =
		 * Arrays.stream(numbers) .distinct() .toArray();
		 * 
		 * // Print the array with duplicates removed for (int number : uniqueNumbers) {
		 * System.out.println(number); }
		 */
	}

	private static void removeDuplicate(String[] names, int n) {
		ArrayList<String> a = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			boolean flag = true;
			for (int j = 0; j < i; j++) {
				if (names[i] == names[j]) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				a.add(names[i]);
			}
		}
		System.out.println(a);
		
	List s= Arrays.asList("876","8","65","6","87");
	System.out.println("**************************");
	s.stream().sorted().forEach(x->System.out.println(x));
	}

}
