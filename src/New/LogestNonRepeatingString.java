package New;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LogestNonRepeatingString {
	public static void main(String[] args) {
		System.out.println(Longest("abcaaabcdkj"));
		System.out.println(Longest1("abcaaabcdkjabcz"));
	}

	private static int Longest1(String s) {
		int maxlenght = 0;
		Queue<Character> q = new LinkedList<Character>();

		for (int i = 0; i < s.length(); i++) {
			if (!q.contains(s.charAt(i))) {
				q.add(s.charAt(i));
				if (q.size() > maxlenght) {
					maxlenght = q.size();
				}
			}
			if(q.poll() != s.charAt(i)) {
				q.add(s.charAt(i));
			}
		}

		return maxlenght;
	}

	private static String Longest(String s) {
		String result = "";
		List<Character> l = new ArrayList<>();
		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			l.clear();
			l.add(s.charAt(i));
			i = j;
			if (j < s.length() - 1) {
				while (!(l.contains(s.charAt(++j)))) {
					if (j == s.length() - 1) {
						j++;
						break;
					}
					l.add(s.charAt(j));
				}
			}
			if (result.length() < s.substring(i, j).length()) {
				result = s.substring(i, j);
			}
		}
		return result;
	}

}
