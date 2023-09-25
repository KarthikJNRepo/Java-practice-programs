package New;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

class Account {

	private int accNo;
	private String accType;
	private String accStatus;

	public Account(int accountNo, String accountType, String accountStatus) {
		accNo = accountNo;
		accType = accountType;
		accStatus = accountStatus;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public String getAccStatus() {
		return accStatus + " " + accType;
	}

	public void setAccStatus(String accStatus) {
		this.accStatus = accStatus;
	}
}

public class Test {
	public static void main(String[] args) {
		// collection to array
		Collection<Integer> l = new ArrayList<>();
		l.toArray();

		// String replacement
		String s = "(123)-456-7891";
		s = s.replaceAll("[a-zA-Z0-9]", "");
		System.out.println(s);
		Boolean flag = s.substring(0, 1).matches("[0-9]");
		System.out.println("flag " + flag);

		String string = null;
		// System.out.println(string.equals(null));

		List<Account> li = new ArrayList<Account>();

		Account ac1 = new Account(100, "Savings", "Open");
		Account ac2 = new Account(101, "Checking", "Closed");

		li.add(ac1);
		li.add(ac2);

		// Before Java 8
		Map<Integer, String> beforeJava8 = new HashMap<>();
		for (Account acc : li) {
			beforeJava8.put(acc.getAccNo(), acc.getAccStatus());
		}
		System.out.println("Before Java 8 " + beforeJava8);

		// Java 8 Using Lambda expression and Stream API
		Map<Integer, String> map = li.stream().collect(Collectors.toMap(x -> x.getAccNo(), x -> x.getAccStatus()));
		System.out.println("Java 8 " + map);
		int[] array = { 1, 2, 5, 3, 7, 8 };
		int[] array1 = { 1, 2, 5, 3, 7, 8, 3 };

		Arrays.fill(array, 2);
		int counter = 0;
		// Stream.of(array).forEach(x->System.out.println(x+" "+counter+1));
		// Arrays.stream(array).forEach(x->System.out.println(x));
		System.out.println("*******************");
		System.out.println(Arrays.equals(array, array1));
		String s1 = Arrays.toString(array);
		System.out.println(s1 + " s1");
		TreeSet tree = new TreeSet<>();
		System.out.println(tree);

		int[] arrays, array2[][] = { { { 1, 2 }, {6,6,8,0}, {} }, { {}, { 1, 3 }, {} } };
		System.out.println("*****************");
		System.out.println("3 ->" + array2[0][1][2]);
		System.out.println(li);

	}
}
