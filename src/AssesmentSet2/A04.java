package AssesmentSet2;

import java.util.Arrays;
import java.util.stream.Stream;

public class A04 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 5, 6, 8, 4 };
		for (int i = 0; i < array.length - 1; i += 2) {
			int temp = array[i];
			array[i] = array[i + 1];
			array[i + 1] = temp;
		}
		Arrays.stream(array).forEach(x -> System.out.print(x + " "));
	}
}
