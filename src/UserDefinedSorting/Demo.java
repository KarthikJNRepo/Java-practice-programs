package UserDefinedSorting;

import java.util.Arrays;
import java.util.Comparator;

public class Demo {

	public static void main(String[] args) {
		int[] a = { 20, 22, 23, 11, 8, 9 };
		System.out.println(largestNumber(a));

	}

	static public String largestNumber(int[] num) {
		if (num == null || num.length == 0)
			return "";

		String[] s_num = new String[num.length];
		for (int i = 0; i < num.length; i++)
			s_num[i] = String.valueOf(num[i]);

		Comparator<String> comp = new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				return str2.compareTo(str1);
			}
		};

		Arrays.sort(s_num, comp);
		StringBuilder sb = new StringBuilder();
		for (String s : s_num)
			sb.append(s);

		return sb.toString();

	}

}
