package Review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ArrayListWithoutDuplicate {
	public static void main(String[] args) {
		new ArrayList<>(new HashSet<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6))).stream()
				.forEach(x -> System.out.print(x+" "));
	}

}
