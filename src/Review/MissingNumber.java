package Review;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MissingNumber {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 9);
		System.out.println("Using Stream --");
		IntStream.range(1, 10).filter(x->!l.contains(x)).forEach(y->System.out.print(y + " "));
		System.out.println("\nTraditional Method--");
		for (int i = 1; i < l.get(l.size() - 1); i++) {
			if (!l.contains(i)) {
				System.out.print(i + " ");
			}
		}
	}
}
