package Logical_Assesment;

public class StringRepeat {
	public static void main(String[] args) {
		String s = "aaabgeruuubddd";
		int len = s.length();
		for (int i = 0; i < len; i++) {
			char c = s.charAt(i);
			int count = 1;
			for (int j = i; j < len - 1; j++) {
				if (c == s.charAt(j + 1)) {
					count++;
					i++;
				}
				if (c != s.charAt(j + 1)) {
					break;
				}

			}
			if (count == 1) {
				System.out.print(s.charAt(i));
			} else {
				System.out.print(count+""+ s.charAt(i));
			}
		}
	}

}
