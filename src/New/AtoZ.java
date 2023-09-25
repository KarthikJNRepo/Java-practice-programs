package New;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
class addingList{
	static int add(int num1,int num2) {
		return num1+num2;
	}
}

public class AtoZ {
	public static void main(String[] args) {
		int count = 1;
		int num = 65;
//		List<Integer> index = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> index = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);
		
		//max number in a list.
		Optional<Integer> maxNumber = index.stream().max((i, j) -> i.compareTo(j));
		System.out.println(maxNumber);
		//sum of collection using lambda expression.
		Integer sum=index.stream().reduce(0,addingList::add);
		Integer sum1=index.stream().reduce(0,(num1,num2)->num1+num2);
		Integer sum2=index.stream().collect(Collectors.summingInt(Integer::intValue));
		Integer sum3=index.stream().mapToInt(Integer::intValue).sum();
		double avg=index.stream().collect(Collectors.averagingInt(Integer::intValue));
		System.out.println(sum + " "+sum1+" "+sum2+" "+sum3);
		System.out.println(avg);
		System.out.println("*****************************");
		
		
		
		
		List<String> name = Arrays.asList("karthik","bala","giri","honda" );
		String s=name.stream().collect(Collectors.joining(" "));
		System.out.println(s.length());
		
		
		Map<Integer, Character> alphabet = new HashMap<>();
		while (count <= 26) {
			alphabet.put(count, (char) num++);
			count++;
		}
		alphabet.entrySet().stream().filter(x -> index.contains(x.getKey()))
				.forEach(x -> System.out.println(x.getValue()));
		
		//Achieving thread using lambda expression.
		new Thread(() -> {
			for (int i = 0; i <= 100; i++) {
				System.out.println("t1 " + i);
			}
		}).start();
		new Thread(()-> {
			for (int i = 0; i <= 100; i++) {
				System.out.println("t2 " + i);
			}
		}).start();
	}

}
