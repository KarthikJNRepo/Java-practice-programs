package New;

import java.util.Arrays;
import java.util.List;

public class Pampa {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 7, 8, 7, 7);
		list.stream().distinct().forEach(x -> System.out.print(x +" "));
	}
}


