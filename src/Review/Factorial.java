package Review;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find factorial of that number: ");
		int num = sc.nextInt();
		int result = 1;
		for (int i = 1; i <= num; i++) {
			result *= i;
		}
		System.out.println("Factorial of a given number is :"+result);
	}

}
