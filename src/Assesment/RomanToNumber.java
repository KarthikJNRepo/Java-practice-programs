package Assesment;

import java.util.HashMap;
import java.util.Map;

public class RomanToNumber {
	public static void main(String[] args) {
		System.out.println(romanToInt("MCCXXXIV"));

	}

	public static int romanToInt(String s) {
		int num = 0;
		Map<Character, Integer> rom = new HashMap<Character, Integer>();
		rom.put('M', 1000);
		rom.put('D', 500);
		rom.put('C', 100);
		rom.put('L', 50);
		rom.put('X', 10);
		rom.put('V', 5);
		rom.put('I', 1);
		for (int i = 0; i < s.length(); i++) {
			char next = (i < s.length() - 1) ? s.charAt(i + 1) : '0';
			if (next != '0' && rom.get(s.charAt(i)) < rom.get(next)) {
				num -= rom.get(s.charAt(i));
			} else {
				num += rom.get(s.charAt(i));
			}
			System.out.println(num);
		}
		return num;
	}

}
