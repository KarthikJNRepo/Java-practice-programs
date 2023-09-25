package New;

public class demo1111 {
	public static void main(String[] args) {
		/*
		 * System.out.println(add(4)); System.out.println(4+3+2+1);
		 */int s = 5;
		int String = 10;
		System.out.println(String);
		System.out.println();
	}

	private static int add(int i) {
		if (i == 0) {
			return 0;
		}
		return i + add(i - 1);

	}

	private static int factorial(int i) {
		if (i == 0) {
			return 1;
		}
		int j = i;
		return i * factorial(i - 1);
	}

}
