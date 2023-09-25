package AssesmentSet2;

import java.util.Arrays;

public class A09 {
	public static void main(String[] args) {
		int[] numbers = new int[100];
		for (int i = 1; i <= 100; i++) {
			numbers[i - 1] = i;
		}

		int indexToRemove = (int) (Math.random() * 100);
		System.out.println("indexToRemove " + indexToRemove);
		System.out.println((int) (Math.random() * 100) + " -> (int) (Math.random() * 100)");
		int[] newNumbers = new int[99];
		int j = 0;
		for (int i = 0; i < 100; i++) {
			if (i != indexToRemove) {
				newNumbers[j] = numbers[i];
				j++;
			} else {
				System.out.println(i + " i");
			}

		}
		int missingNumber = 0;
		for (int i = 0; i < newNumbers.length-2; i++) {
			if (newNumbers[i + 1] - newNumbers[i] > 1) {
				missingNumber = newNumbers[i + 1] - 1;
			}
		}

		System.out.println("\nThe missing number is: " + missingNumber);
	}
}
