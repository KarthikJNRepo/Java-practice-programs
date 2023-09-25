package AssesmentSet2;

import java.util.Arrays;

public class A05 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };

		int j = a.length - 1;
		for (int i = 0; i <= a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = temp;
		}
		Arrays.stream(a).forEach(x -> System.out.print(x + " "));
	}

}
