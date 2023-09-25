package Assesment;

public class Assesment35 {
	public static void main(String[] args) {
		System.out.println(evenlyspaced(1,3,2));
	}

	static boolean evenlyspaced(int a, int b, int c) {
		return((a+b == c*2) || (b+c == a*2) || (a+c == b*2));
	}

}
