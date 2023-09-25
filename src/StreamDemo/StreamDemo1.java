package StreamDemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {
	public static void main(String[] args) {
		List<Employe> emp = new ArrayList<Employe>();
		emp.add(new Employe("Bangalore", "karthi", 23));
		emp.add(new Employe("hyderabad", "karthi", 22));
		emp.add(new Employe("Bangalore", "bala", 23));
		emp.add(new Employe("hyderabad", "john", 23));
		emp.add(new Employe("Bangalore", "peter", 23));
		emp.add(new Employe("Delhi", "giri", 26));

		Map<String, List<Employe>> EmpCity = new HashMap<>();

		// Legecy code for grouping.
		for (Employe e : emp) {
			if (!EmpCity.containsKey(e.getPlace())) {
				EmpCity.put(e.getPlace(), new ArrayList<Employe>());
			}
			EmpCity.get(e.getPlace()).add(e);
		}

		// EmpCity.get("Bangalore").add(new Employe("Bangalore", "govind", 23));
		// System.out.println(EmpCity);

		System.out.println("using stream");
		// Collectors.groupingBy returns( key and list[] pairs);
		/*
		 * System.out.println(emp.stream().collect(Collectors.groupingBy(Employe::
		 * getPlace))); System.out.println("**********************");
		 */

		emp.stream().collect(Collectors.groupingBy(Employe::getPlace)).entrySet().stream().forEach(x -> {
			System.out.println(x.getKey() + ":-");
			System.out.println(x.getValue());
			System.out.println();
		});
		System.out.println("count "+emp.stream().collect(Collectors.groupingBy(Employe::getPlace,Collectors.counting())));
		System.out.println(emp.stream().collect(Collectors.groupingBy(Employe::getPlace,Collectors.groupingBy(Employe::getAge))));
		
		//taking max value.
		Optional<Integer> maxAge=emp.stream().map(x->x.getAge()).max(Comparator.naturalOrder());
		if(maxAge.isPresent()) {
			System.out.println(maxAge.get());
		}else {
			System.out.println("no entry");
		}
		emp.stream().map(x->x.getAge()).forEach(y->System.out.print(y+" "));
	}


}
