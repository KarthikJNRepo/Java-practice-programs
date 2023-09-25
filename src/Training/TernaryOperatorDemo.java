package Training;

import Map.*;

public class TernaryOperatorDemo {
	public static void main(String[] args) {
		int num = 2;
		String result = (num % 2 == 0) ? "even" : "odd";
		System.out.println("result " + result);

		float logintimming = 14;

		String result1 = (logintimming < 4) ? "absemt" : ((logintimming < 8) ? "halfday" : "fullday");
		System.out.println(result1);

	}

}
