package AssesmentSet2;

public class A10 {
	public static void main(String[] args) {
		Integer[] array = new Integer[] { 1, 2, 3, 4, 2, 3, 5, 6, 3, 7, 8, 5 };
		removeDuplicates(array);

		// Print the new array without duplicates
		for (Integer value : array) {
			if (value != null)
				System.out.print(value + " ");
		}
	}

	public static void removeDuplicates(Integer[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == null) {
					break;
				}
				if (array[i] != null && array[i]==(array[j])) {
					array[j] = null;
				}
			}
		}
	}
}
