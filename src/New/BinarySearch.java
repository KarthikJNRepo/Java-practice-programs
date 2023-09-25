package New;

public class BinarySearch {
	public static void main(String[] args) {
		int a[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println(search(a, 5));

	}

	static int search(int[] a, int num) {
		int l = 0, r = a.length - 1, mid = 0;
		while (l <= r) {
			mid = (l + r) / 2;
			System.out.println("l " + l + "      r " + r + "     mid " + mid);
			if (a[mid] == num) {
				return mid;
			}
			if (a[mid] < num) {
				l = mid + 1;
			} else
				r = mid - 1;
		}
		return -1;

	}

}
