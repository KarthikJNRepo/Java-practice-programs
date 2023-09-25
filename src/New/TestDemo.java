package New;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestDemo {
	public static void main(String[] args) {
		List<Integer> l= Arrays.asList(1,2,3,4,5,7,6);
		int sum=l.stream().reduce(0,
                (element1, element2) -> element1 + element2);
		System.out.println(sum);
	}

}
