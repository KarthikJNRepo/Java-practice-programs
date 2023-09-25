package New;

public class ToRoman {
	public static void main(String[] args) {
		System.out.println(toRoman(843));
	}

	private static String toRoman(int i) {
		String result = "";
		while (i > 0) {
			if (i >= 1000) {
				result += "M";
				i -= 1000;
			} else if (i >= 900) {
				result += "CM";
				i -= 900;
			} else if (i >= 500) {
				result += "D";
				i -= 500;
			} else if (i >= 400) {
				result += "CD";
				i -= 400;
			} else if (i >= 100) {
				result += "C";
				i -= 100;
			} else if (i >= 90) {
				result += "XC";
				i -= 90;
			} else if (i >= 50) {
				result += "L";
				i -= 50;
			} else if (i >= 40) {
				result += "XL";
				i -= 40;
			} else if (i >= 10) {
				result += "X";
				i -= 10;
			} else if (i >= 9) {
				result += "IX";
				i -= 9;
			} else if (i >= 5) {
				result += "V";
				i -= 5;
			} else if (i >= 4) {
				result += "IV";
				i -= 4;
			} else if (i >= 1) {
				result += "I";
				i -= 1;
			}
		}

		return result;
	}

}
