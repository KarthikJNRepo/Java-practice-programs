package New;

public class Sanjeeth {
	public static void main(String[] args) {
		System.out.println(repeat("i love java more than i love python or i love any other language-love"));
	}

	private static int repeat(String string) {
		String s = "love";
		int count = 0;

		for (int i = 0; i < string.length() - s.length(); i++) {

			if (string.charAt(i) == s.charAt(0) && string.charAt(i + 1) == s.charAt(1)
					&& string.charAt(i + 2) == s.charAt(2) && string.charAt(i + 3) == s.charAt(3)) {
				count++;
			}

		}

		return count;
	}

}
